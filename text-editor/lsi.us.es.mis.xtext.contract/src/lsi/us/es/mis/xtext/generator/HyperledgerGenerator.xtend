/*
 * generated by Xtext 2.25.0
 */
package lsi.us.es.mis.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import lsi.us.es.mis.xtext.contract.Contract

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class HyperledgerGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var contract = resource.contents.head as Contract
		
		fsa.generateFile(contract.name + ".go", toHyperledger(contract))
	}
	
	def toHyperledger(Contract contract) {
	    val code = new StringBuilder
	   
	    appendHeader(contract, code)

	    appendAttributes(contract, code)

	    appendMethods(contract, code)
	    
	    appendConstructor(contract, code)
	    
	    appendMain(contract, code)
	    
	    return code.toString
	}
	
	def appendHeader(Contract contract, StringBuilder code) {
		code.append("package main\n\n")
	    code.append("import (\n")
	    code.append("\t\"fmt\"\n")
	    code.append("\n")
	    code.append("\t\"github.com/hyperledger/fabric-contract-api-go/contractapi\"\n")
	    code.append(")\n\n")
	}
		
	def appendConstructor(Contract contract, StringBuilder code) {
		code.append("func (sc *" + contract.name + ") InitLedger(ctx contractapi.TransactionContextInterface) error {\n")
	    code.append("\t// Inicializa los valores de los atributos\n")
	    
	    // Genera la inicialización de los atributos en el constructor
	    for (attribute : contract.attributes) {
	        val attributeName = attribute.name
	        val defaultValue = getDefaultInitialValue(attribute.type.toString)
	        
	        code.append("\tsc." + capitalizeFirstLetter(attributeName) + " = " + defaultValue + "\n")
	    }
	    
	    code.append("\treturn nil\n")
	    code.append("}\n\n")
	}
	
	def appendAttributes(Contract contract, StringBuilder code) {
		code.append("type " + contract.name + " struct {\n")
	    code.append("\tcontractapi.Contract\n")
	    
	    if (contract.ownership) {
	    	code.append("\tOwner string\n")
	    }
	     
	    for (map: contract.dataStores) {
	    	code.append("\t" + map.name + " map["+getCorrectType(map.fromType.toString)+"]" + getCorrectType(map.toType.toString) + "\n")
	    }
	    
	    
	    for (attribute : contract.attributes) {
	        val attributeName = attribute.name
	        val attributeType = getCorrectType(attribute.type.toString)
	        
	        code.append("\t" + capitalizeFirstLetter(attributeName) + " " + attributeType + "\n")
	    }
	    
	    code.append("}\n\n")
	}
	
	def appendMethods(Contract contract, StringBuilder code) {
		for (attribute : contract.attributes) {
	        val attributeName = attribute.name
	        val capitalizeAttributeName = capitalizeFirstLetter(attributeName)
	        val attributeType = getCorrectType(attribute.type.toString)
	        
	        if (attribute.modifiable) {
		        code.append("func (sc *" + contract.name + ") Set" + capitalizeAttributeName + "(ctx contractapi.TransactionContextInterface, value " + attributeType + ") error {\n")
		        code.append("\tsc." + capitalizeFirstLetter(attributeName) + " = value\n")
		        code.append("\treturn nil\n")
		        code.append("}\n\n")
	        }
	        
	        code.append("func (sc *" + contract.name + ") Get" + capitalizeAttributeName + "(ctx contractapi.TransactionContextInterface) (" + attributeType + ", error) {\n")
	        code.append("\treturn sc." + capitalizeFirstLetter(attributeName) + ", nil\n")
	        code.append("}\n\n")
	    }
	}
	
	def appendMain(Contract contract, StringBuilder code){
		code.append("func main() {\n")
	    code.append("\tchaincode, err := contractapi.NewChaincode(&" + contract.name + "{})\n")
	    code.append("\tif err != nil {\n")
	    code.append("\t\tfmt.Printf(\"Error creating " + contract.name + " chaincode: %s\", err.Error())\n")
	    code.append("\t\treturn\n")
	    code.append("\t}\n\n")
	    code.append("\tif err := chaincode.Start(); err != nil {\n")
	    code.append("\t\tfmt.Printf(\"Error starting " + contract.name + " chaincode: %s\", err.Error())\n")
	    code.append("\t}\n")
	    code.append("}\n")
	} 
	
	def String getDefaultInitialValue(String dataType) {
	    switch (dataType) {
	        case "integer":
	            return "0"
	        case "string":
	            return "\"\""
	        case "boolean":
	            return "false"
	        case "address":
	            return "\"\""
	        case "array":
	            return "[]uint64{}"
	        default:
	            return "uint64"
	    }
	}
	
	def String getCorrectType(String dataType) {
	    switch (dataType) {
	        case "integer":
	            return "uint64"
	        case "string":
	            return "string"
	        case "boolean":
	            return "bool"
	        case "address":
	            return "string"
	        case "array":
	            return "uint64[]"
	        default:
	            return "uint64"
	    }
	}

	def String capitalizeFirstLetter(String str) {
	    return str.substring(0, 1).toUpperCase() + str.substring(1)
	}
}
