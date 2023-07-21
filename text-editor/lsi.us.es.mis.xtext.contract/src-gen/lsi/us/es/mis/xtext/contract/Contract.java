/**
 * generated by Xtext 2.25.0
 */
package lsi.us.es.mis.xtext.contract;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lsi.us.es.mis.xtext.contract.Contract#getName <em>Name</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.Contract#getVersion <em>Version</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.Contract#isHasReceive <em>Has Receive</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.Contract#isOwnership <em>Ownership</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.Contract#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.Contract#getEvents <em>Events</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.Contract#getMethods <em>Methods</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.Contract#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @see lsi.us.es.mis.xtext.contract.ContractPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see lsi.us.es.mis.xtext.contract.ContractPackage#getContract_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link lsi.us.es.mis.xtext.contract.Contract#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see lsi.us.es.mis.xtext.contract.ContractPackage#getContract_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link lsi.us.es.mis.xtext.contract.Contract#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Has Receive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Receive</em>' attribute.
   * @see #setHasReceive(boolean)
   * @see lsi.us.es.mis.xtext.contract.ContractPackage#getContract_HasReceive()
   * @model
   * @generated
   */
  boolean isHasReceive();

  /**
   * Sets the value of the '{@link lsi.us.es.mis.xtext.contract.Contract#isHasReceive <em>Has Receive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Receive</em>' attribute.
   * @see #isHasReceive()
   * @generated
   */
  void setHasReceive(boolean value);

  /**
   * Returns the value of the '<em><b>Ownership</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ownership</em>' attribute.
   * @see #setOwnership(boolean)
   * @see lsi.us.es.mis.xtext.contract.ContractPackage#getContract_Ownership()
   * @model
   * @generated
   */
  boolean isOwnership();

  /**
   * Sets the value of the '{@link lsi.us.es.mis.xtext.contract.Contract#isOwnership <em>Ownership</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ownership</em>' attribute.
   * @see #isOwnership()
   * @generated
   */
  void setOwnership(boolean value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link lsi.us.es.mis.xtext.contract.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see lsi.us.es.mis.xtext.contract.ContractPackage#getContract_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link lsi.us.es.mis.xtext.contract.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see lsi.us.es.mis.xtext.contract.ContractPackage#getContract_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link lsi.us.es.mis.xtext.contract.Method}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see lsi.us.es.mis.xtext.contract.ContractPackage#getContract_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethods();

  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
   * The list contents are of type {@link lsi.us.es.mis.xtext.contract.Modifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' containment reference list.
   * @see lsi.us.es.mis.xtext.contract.ContractPackage#getContract_Modifiers()
   * @model containment="true"
   * @generated
   */
  EList<Modifier> getModifiers();

} // Contract
