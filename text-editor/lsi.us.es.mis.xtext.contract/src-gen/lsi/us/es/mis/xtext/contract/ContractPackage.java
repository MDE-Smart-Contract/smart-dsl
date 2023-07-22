/**
 * generated by Xtext 2.25.0
 */
package lsi.us.es.mis.xtext.contract;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lsi.us.es.mis.xtext.contract.ContractFactory
 * @model kind="package"
 * @generated
 */
public interface ContractPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "contract";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.us.lsi/es/mis/xtext/Contract";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "contract";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ContractPackage eINSTANCE = lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl.init();

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.contract.impl.ContractImpl <em>Contract</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.contract.impl.ContractImpl
   * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getContract()
   * @generated
   */
  int CONTRACT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT__NAME = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT__VERSION = 1;

  /**
   * The feature id for the '<em><b>Has Receive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT__HAS_RECEIVE = 2;

  /**
   * The feature id for the '<em><b>Ownership</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT__OWNERSHIP = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT__ATTRIBUTES = 4;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT__EVENTS = 5;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT__METHODS = 6;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT__MODIFIERS = 7;

  /**
   * The number of structural features of the '<em>Contract</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.contract.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.contract.impl.AttributeImpl
   * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Modifiable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MODIFIABLE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.contract.impl.ModifierImpl <em>Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.contract.impl.ModifierImpl
   * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getModifier()
   * @generated
   */
  int MODIFIER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__MESSAGE = 2;

  /**
   * The feature id for the '<em><b>Validation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER__VALIDATION = 3;

  /**
   * The number of structural features of the '<em>Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFIER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.contract.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.contract.impl.MethodImpl
   * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Statemutability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__STATEMUTABILITY = 2;

  /**
   * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__OUTPUTS = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Modifiers Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__MODIFIERS_KEYWORD = 5;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__MODIFIERS = 6;

  /**
   * The feature id for the '<em><b>Events Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__EVENTS_KEYWORD = 7;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__EVENTS = 8;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.contract.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.contract.impl.EventImpl
   * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.contract.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.contract.impl.ParamImpl
   * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getParam()
   * @generated
   */
  int PARAM = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__TYPE = 1;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.contract.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.contract.impl.OutputImpl
   * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__TYPE = 1;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link lsi.us.es.mis.xtext.contract.DataType <em>Data Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lsi.us.es.mis.xtext.contract.DataType
   * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 7;


  /**
   * Returns the meta object for class '{@link lsi.us.es.mis.xtext.contract.Contract <em>Contract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contract</em>'.
   * @see lsi.us.es.mis.xtext.contract.Contract
   * @generated
   */
  EClass getContract();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Contract#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lsi.us.es.mis.xtext.contract.Contract#getName()
   * @see #getContract()
   * @generated
   */
  EAttribute getContract_Name();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Contract#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see lsi.us.es.mis.xtext.contract.Contract#getVersion()
   * @see #getContract()
   * @generated
   */
  EAttribute getContract_Version();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Contract#isHasReceive <em>Has Receive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Receive</em>'.
   * @see lsi.us.es.mis.xtext.contract.Contract#isHasReceive()
   * @see #getContract()
   * @generated
   */
  EAttribute getContract_HasReceive();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Contract#isOwnership <em>Ownership</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ownership</em>'.
   * @see lsi.us.es.mis.xtext.contract.Contract#isOwnership()
   * @see #getContract()
   * @generated
   */
  EAttribute getContract_Ownership();

  /**
   * Returns the meta object for the containment reference list '{@link lsi.us.es.mis.xtext.contract.Contract#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see lsi.us.es.mis.xtext.contract.Contract#getAttributes()
   * @see #getContract()
   * @generated
   */
  EReference getContract_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link lsi.us.es.mis.xtext.contract.Contract#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see lsi.us.es.mis.xtext.contract.Contract#getEvents()
   * @see #getContract()
   * @generated
   */
  EReference getContract_Events();

  /**
   * Returns the meta object for the containment reference list '{@link lsi.us.es.mis.xtext.contract.Contract#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see lsi.us.es.mis.xtext.contract.Contract#getMethods()
   * @see #getContract()
   * @generated
   */
  EReference getContract_Methods();

  /**
   * Returns the meta object for the containment reference list '{@link lsi.us.es.mis.xtext.contract.Contract#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers</em>'.
   * @see lsi.us.es.mis.xtext.contract.Contract#getModifiers()
   * @see #getContract()
   * @generated
   */
  EReference getContract_Modifiers();

  /**
   * Returns the meta object for class '{@link lsi.us.es.mis.xtext.contract.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see lsi.us.es.mis.xtext.contract.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Attribute#isModifiable <em>Modifiable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifiable</em>'.
   * @see lsi.us.es.mis.xtext.contract.Attribute#isModifiable()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Modifiable();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lsi.us.es.mis.xtext.contract.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see lsi.us.es.mis.xtext.contract.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for class '{@link lsi.us.es.mis.xtext.contract.Modifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modifier</em>'.
   * @see lsi.us.es.mis.xtext.contract.Modifier
   * @generated
   */
  EClass getModifier();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Modifier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lsi.us.es.mis.xtext.contract.Modifier#getName()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Name();

  /**
   * Returns the meta object for the containment reference list '{@link lsi.us.es.mis.xtext.contract.Modifier#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see lsi.us.es.mis.xtext.contract.Modifier#getParams()
   * @see #getModifier()
   * @generated
   */
  EReference getModifier_Params();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Modifier#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see lsi.us.es.mis.xtext.contract.Modifier#getMessage()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Message();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Modifier#getValidation <em>Validation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Validation</em>'.
   * @see lsi.us.es.mis.xtext.contract.Modifier#getValidation()
   * @see #getModifier()
   * @generated
   */
  EAttribute getModifier_Validation();

  /**
   * Returns the meta object for class '{@link lsi.us.es.mis.xtext.contract.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see lsi.us.es.mis.xtext.contract.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lsi.us.es.mis.xtext.contract.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link lsi.us.es.mis.xtext.contract.Method#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see lsi.us.es.mis.xtext.contract.Method#getParams()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Params();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Method#getStatemutability <em>Statemutability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Statemutability</em>'.
   * @see lsi.us.es.mis.xtext.contract.Method#getStatemutability()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Statemutability();

  /**
   * Returns the meta object for the containment reference list '{@link lsi.us.es.mis.xtext.contract.Method#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputs</em>'.
   * @see lsi.us.es.mis.xtext.contract.Method#getOutputs()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Outputs();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Method#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see lsi.us.es.mis.xtext.contract.Method#getDescription()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Description();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Method#getModifiersKeyword <em>Modifiers Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifiers Keyword</em>'.
   * @see lsi.us.es.mis.xtext.contract.Method#getModifiersKeyword()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_ModifiersKeyword();

  /**
   * Returns the meta object for the reference list '{@link lsi.us.es.mis.xtext.contract.Method#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Modifiers</em>'.
   * @see lsi.us.es.mis.xtext.contract.Method#getModifiers()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Modifiers();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Method#getEventsKeyword <em>Events Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Events Keyword</em>'.
   * @see lsi.us.es.mis.xtext.contract.Method#getEventsKeyword()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_EventsKeyword();

  /**
   * Returns the meta object for the reference list '{@link lsi.us.es.mis.xtext.contract.Method#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Events</em>'.
   * @see lsi.us.es.mis.xtext.contract.Method#getEvents()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Events();

  /**
   * Returns the meta object for class '{@link lsi.us.es.mis.xtext.contract.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see lsi.us.es.mis.xtext.contract.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lsi.us.es.mis.xtext.contract.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link lsi.us.es.mis.xtext.contract.Event#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see lsi.us.es.mis.xtext.contract.Event#getParams()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Params();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Event#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see lsi.us.es.mis.xtext.contract.Event#getDescription()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Description();

  /**
   * Returns the meta object for class '{@link lsi.us.es.mis.xtext.contract.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see lsi.us.es.mis.xtext.contract.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lsi.us.es.mis.xtext.contract.Param#getName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Name();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Param#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see lsi.us.es.mis.xtext.contract.Param#getType()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Type();

  /**
   * Returns the meta object for class '{@link lsi.us.es.mis.xtext.contract.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see lsi.us.es.mis.xtext.contract.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Output#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lsi.us.es.mis.xtext.contract.Output#getName()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Name();

  /**
   * Returns the meta object for the attribute '{@link lsi.us.es.mis.xtext.contract.Output#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see lsi.us.es.mis.xtext.contract.Output#getType()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Type();

  /**
   * Returns the meta object for enum '{@link lsi.us.es.mis.xtext.contract.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Type</em>'.
   * @see lsi.us.es.mis.xtext.contract.DataType
   * @generated
   */
  EEnum getDataType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ContractFactory getContractFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.contract.impl.ContractImpl <em>Contract</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.contract.impl.ContractImpl
     * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getContract()
     * @generated
     */
    EClass CONTRACT = eINSTANCE.getContract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACT__NAME = eINSTANCE.getContract_Name();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACT__VERSION = eINSTANCE.getContract_Version();

    /**
     * The meta object literal for the '<em><b>Has Receive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACT__HAS_RECEIVE = eINSTANCE.getContract_HasReceive();

    /**
     * The meta object literal for the '<em><b>Ownership</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACT__OWNERSHIP = eINSTANCE.getContract_Ownership();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT__ATTRIBUTES = eINSTANCE.getContract_Attributes();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT__EVENTS = eINSTANCE.getContract_Events();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT__METHODS = eINSTANCE.getContract_Methods();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACT__MODIFIERS = eINSTANCE.getContract_Modifiers();

    /**
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.contract.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.contract.impl.AttributeImpl
     * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Modifiable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MODIFIABLE = eINSTANCE.getAttribute_Modifiable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.contract.impl.ModifierImpl <em>Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.contract.impl.ModifierImpl
     * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getModifier()
     * @generated
     */
    EClass MODIFIER = eINSTANCE.getModifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__NAME = eINSTANCE.getModifier_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODIFIER__PARAMS = eINSTANCE.getModifier_Params();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__MESSAGE = eINSTANCE.getModifier_Message();

    /**
     * The meta object literal for the '<em><b>Validation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFIER__VALIDATION = eINSTANCE.getModifier_Validation();

    /**
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.contract.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.contract.impl.MethodImpl
     * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMS = eINSTANCE.getMethod_Params();

    /**
     * The meta object literal for the '<em><b>Statemutability</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__STATEMUTABILITY = eINSTANCE.getMethod_Statemutability();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__OUTPUTS = eINSTANCE.getMethod_Outputs();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__DESCRIPTION = eINSTANCE.getMethod_Description();

    /**
     * The meta object literal for the '<em><b>Modifiers Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__MODIFIERS_KEYWORD = eINSTANCE.getMethod_ModifiersKeyword();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__MODIFIERS = eINSTANCE.getMethod_Modifiers();

    /**
     * The meta object literal for the '<em><b>Events Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__EVENTS_KEYWORD = eINSTANCE.getMethod_EventsKeyword();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__EVENTS = eINSTANCE.getMethod_Events();

    /**
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.contract.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.contract.impl.EventImpl
     * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__PARAMS = eINSTANCE.getEvent_Params();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

    /**
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.contract.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.contract.impl.ParamImpl
     * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__TYPE = eINSTANCE.getParam_Type();

    /**
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.contract.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.contract.impl.OutputImpl
     * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__TYPE = eINSTANCE.getOutput_Type();

    /**
     * The meta object literal for the '{@link lsi.us.es.mis.xtext.contract.DataType <em>Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lsi.us.es.mis.xtext.contract.DataType
     * @see lsi.us.es.mis.xtext.contract.impl.ContractPackageImpl#getDataType()
     * @generated
     */
    EEnum DATA_TYPE = eINSTANCE.getDataType();

  }

} //ContractPackage
