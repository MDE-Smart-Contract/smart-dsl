/**
 * generated by Xtext 2.25.0
 */
package lsi.us.es.mis.xtext.contract.impl;

import java.util.Collection;

import lsi.us.es.mis.xtext.contract.Attribute;
import lsi.us.es.mis.xtext.contract.Contract;
import lsi.us.es.mis.xtext.contract.ContractPackage;
import lsi.us.es.mis.xtext.contract.Event;
import lsi.us.es.mis.xtext.contract.Method;
import lsi.us.es.mis.xtext.contract.Modifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lsi.us.es.mis.xtext.contract.impl.ContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.impl.ContractImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.impl.ContractImpl#isHasReceive <em>Has Receive</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.impl.ContractImpl#isOwnership <em>Ownership</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.impl.ContractImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.impl.ContractImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.impl.ContractImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link lsi.us.es.mis.xtext.contract.impl.ContractImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends MinimalEObjectImpl.Container implements Contract
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #isHasReceive() <em>Has Receive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasReceive()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_RECEIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasReceive() <em>Has Receive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasReceive()
   * @generated
   * @ordered
   */
  protected boolean hasReceive = HAS_RECEIVE_EDEFAULT;

  /**
   * The default value of the '{@link #isOwnership() <em>Ownership</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOwnership()
   * @generated
   * @ordered
   */
  protected static final boolean OWNERSHIP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOwnership() <em>Ownership</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOwnership()
   * @generated
   * @ordered
   */
  protected boolean ownership = OWNERSHIP_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<Method> methods;

  /**
   * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers()
   * @generated
   * @ordered
   */
  protected EList<Modifier> modifiers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContractImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ContractPackage.Literals.CONTRACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContractPackage.CONTRACT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContractPackage.CONTRACT__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isHasReceive()
  {
    return hasReceive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHasReceive(boolean newHasReceive)
  {
    boolean oldHasReceive = hasReceive;
    hasReceive = newHasReceive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContractPackage.CONTRACT__HAS_RECEIVE, oldHasReceive, hasReceive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isOwnership()
  {
    return ownership;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOwnership(boolean newOwnership)
  {
    boolean oldOwnership = ownership;
    ownership = newOwnership;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContractPackage.CONTRACT__OWNERSHIP, oldOwnership, ownership));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ContractPackage.CONTRACT__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Event> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Event>(Event.class, this, ContractPackage.CONTRACT__EVENTS);
    }
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Method> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<Method>(Method.class, this, ContractPackage.CONTRACT__METHODS);
    }
    return methods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Modifier> getModifiers()
  {
    if (modifiers == null)
    {
      modifiers = new EObjectContainmentEList<Modifier>(Modifier.class, this, ContractPackage.CONTRACT__MODIFIERS);
    }
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ContractPackage.CONTRACT__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case ContractPackage.CONTRACT__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
      case ContractPackage.CONTRACT__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
      case ContractPackage.CONTRACT__MODIFIERS:
        return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ContractPackage.CONTRACT__NAME:
        return getName();
      case ContractPackage.CONTRACT__VERSION:
        return getVersion();
      case ContractPackage.CONTRACT__HAS_RECEIVE:
        return isHasReceive();
      case ContractPackage.CONTRACT__OWNERSHIP:
        return isOwnership();
      case ContractPackage.CONTRACT__ATTRIBUTES:
        return getAttributes();
      case ContractPackage.CONTRACT__EVENTS:
        return getEvents();
      case ContractPackage.CONTRACT__METHODS:
        return getMethods();
      case ContractPackage.CONTRACT__MODIFIERS:
        return getModifiers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ContractPackage.CONTRACT__NAME:
        setName((String)newValue);
        return;
      case ContractPackage.CONTRACT__VERSION:
        setVersion((String)newValue);
        return;
      case ContractPackage.CONTRACT__HAS_RECEIVE:
        setHasReceive((Boolean)newValue);
        return;
      case ContractPackage.CONTRACT__OWNERSHIP:
        setOwnership((Boolean)newValue);
        return;
      case ContractPackage.CONTRACT__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case ContractPackage.CONTRACT__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case ContractPackage.CONTRACT__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method>)newValue);
        return;
      case ContractPackage.CONTRACT__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends Modifier>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ContractPackage.CONTRACT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ContractPackage.CONTRACT__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case ContractPackage.CONTRACT__HAS_RECEIVE:
        setHasReceive(HAS_RECEIVE_EDEFAULT);
        return;
      case ContractPackage.CONTRACT__OWNERSHIP:
        setOwnership(OWNERSHIP_EDEFAULT);
        return;
      case ContractPackage.CONTRACT__ATTRIBUTES:
        getAttributes().clear();
        return;
      case ContractPackage.CONTRACT__EVENTS:
        getEvents().clear();
        return;
      case ContractPackage.CONTRACT__METHODS:
        getMethods().clear();
        return;
      case ContractPackage.CONTRACT__MODIFIERS:
        getModifiers().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ContractPackage.CONTRACT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ContractPackage.CONTRACT__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case ContractPackage.CONTRACT__HAS_RECEIVE:
        return hasReceive != HAS_RECEIVE_EDEFAULT;
      case ContractPackage.CONTRACT__OWNERSHIP:
        return ownership != OWNERSHIP_EDEFAULT;
      case ContractPackage.CONTRACT__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case ContractPackage.CONTRACT__EVENTS:
        return events != null && !events.isEmpty();
      case ContractPackage.CONTRACT__METHODS:
        return methods != null && !methods.isEmpty();
      case ContractPackage.CONTRACT__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", version: ");
    result.append(version);
    result.append(", hasReceive: ");
    result.append(hasReceive);
    result.append(", ownership: ");
    result.append(ownership);
    result.append(')');
    return result.toString();
  }

} //ContractImpl
