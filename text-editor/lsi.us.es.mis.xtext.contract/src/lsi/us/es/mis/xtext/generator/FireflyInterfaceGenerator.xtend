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
class FireflyInterfaceGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var contract = resource.contents.head as Contract
		
		fsa.generateFile(contract.name + ".json", toFireflyInterface(contract))
	}
	
	def String toFireflyInterface(Contract contract) {
	    val name = contract.name
	    val version = contract.version
	    
	    var methods = defineMethods(contract)
	    var events = defineEvents(contract)

	    val interfaceCode = '''
	    {
	        "name": "�name�",
	        "version":  "�version�",
	        "methods": [
	            �methods�
	        ],
	    �IF events.empty�
	    	"events": []
        �ELSE�
	    	"events": [
            	�events�
	    	]
        �ENDIF�
	    }
	    '''
	    
	    return interfaceCode
	}
	
	def String defineEvents(Contract contract) {
		return ""
	}
	
	def String defineMethods(Contract contract) {
		var count = 0
	    var max = contract.attributes.length()
	    var methods = ""
	    
	    for (attribute : contract.attributes) {
	    	
	    	count++
	        val attributeName = attribute.name
	        val attributeType = attribute.type.toString()
	        
	        // Set Method
	        if (attribute.modifiable) {
		        val param = '''
			        {
			            "name": "_value",
			            �getParamTypeForSolidity(attributeType)�
			        }
			      '''
			      
			     val methodCode = '''
			        {
			            "name": "set�capitalizeFirstLetter(attributeName)�",
			            "description": "",
			            "params": [
			                �param�
			            ],
			            "returns": {}
			        },
			        '''
				 methods += methodCode
	        }
	        
	        // Get Method
	        val methodCode = '''
	        {
	            "name": "get�capitalizeFirstLetter(attributeName)�",
	            "description": "",
	            "params": [],
	            "returns": {
	                �getReturnTypeForSolidity(attributeType)�
	            },
	            "details": {
	                "stateMutability": "viewable"
	            }
	            
	        }�IF count < max�,�ENDIF�
	        '''
	        
	        methods += methodCode
	    }
	    
	    return methods		
	}
	
	
	def String getReturnTypeForSolidity(String dataType) {
		switch (dataType) {
	        case "integer":
	            return '''
                "name": "output",
                "schema": {
                    "type": "integer",
                    "details": {
                        "type": "uint256",
                        "internalType": "uint256"
                    }
                }
	            '''
	        case "string":
	            return '''
                "name": "output",
                "schema": {
                    "type": "string"
                }
	            '''
	        case "boolean":
	            return '''
                "name": "output",
                "schema": {
                    "type": "boolean"
                }
	            '''
	        case "address":
	            return '''
                "name": "output",
                "schema": {
                    "type": "address",
                    "details": {
                        "type": "address",
                        "internalType": "address",
                        "indexed": false
                    }
                }
            	'''
	        case "array":
	            return '''
                "name": "output",
                "schema": {
                    "type": "array",
                    "details": {
                        "type": "uint256[]",
                        "internalType": "uint256[]"
                    }
                }
	            '''
	        default:
	            return '''
                "name": "output",
                "schema": {
                    "type": "integer",
                    "details": {
                        "type": "uint256",
                        "internalType": "uint256"
                    }
                }
	            '''
	    }
	}
	
	
	def String getParamTypeForSolidity(String dataType) {
		switch (dataType) {
	        case "integer":
	            return '''
                "schema": {
                    "type": "integer",
                    "details": {
                        "type": "uint256",
                        "internalType": "uint256"
                    }
                }
	            '''
	        case "string":
	            return '''
                "schema": {
                    "type": "string",
                    "details": {
                        "type": "string memory",
                        "internalType": "string memory"
                    }
                }
	            '''
	        case "boolean":
	            return '''
                "schema": {
                    "type": "boolean"
                }
	            '''
	        case "address":
	            return '''
                "schema": {
                    "type": "address",
                    "details": {
                        "type": "address",
                        "internalType": "address",
                        "indexed": false
                    }
                }
            	'''
	        case "array":
	            return '''
                "schema": {
                    "type": "array",
                    "details": {
                        "type": "uint256[]",
                        "internalType": "uint256[]"
                    }
                }
	            '''
	        default:
	            return '''
                "schema": {
                    "type": "integer",
                    "details": {
                        "type": "uint256",
                        "internalType": "uint256"
                    }
                }
	            '''
	    }
	}

	
	def String capitalizeFirstLetter(String str) {
	    return str.substring(0, 1).toUpperCase() + str.substring(1)
	}
	
	
}
