/**
 */
package com.rogueai.janki.card.lang.cardTemplate.impl;

import com.rogueai.janki.card.lang.cardTemplate.Attribute;
import com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage;
import com.rogueai.janki.card.lang.cardTemplate.Tag;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.impl.TagImpl#getStartTagName <em>Start Tag Name</em>}</li>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.impl.TagImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.impl.TagImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.impl.TagImpl#getEndTagName <em>End Tag Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TagImpl extends MinimalEObjectImpl.Container implements Tag
{
  /**
   * The default value of the '{@link #getStartTagName() <em>Start Tag Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartTagName()
   * @generated
   * @ordered
   */
  protected static final String START_TAG_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStartTagName() <em>Start Tag Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartTagName()
   * @generated
   * @ordered
   */
  protected String startTagName = START_TAG_NAME_EDEFAULT;

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
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<Tag> children;

  /**
   * The default value of the '{@link #getEndTagName() <em>End Tag Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndTagName()
   * @generated
   * @ordered
   */
  protected static final String END_TAG_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndTagName() <em>End Tag Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndTagName()
   * @generated
   * @ordered
   */
  protected String endTagName = END_TAG_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TagImpl()
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
    return CardTemplatePackage.Literals.TAG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStartTagName()
  {
    return startTagName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartTagName(String newStartTagName)
  {
    String oldStartTagName = startTagName;
    startTagName = newStartTagName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CardTemplatePackage.TAG__START_TAG_NAME, oldStartTagName, startTagName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, CardTemplatePackage.TAG__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tag> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList<Tag>(Tag.class, this, CardTemplatePackage.TAG__CHILDREN);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndTagName()
  {
    return endTagName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndTagName(String newEndTagName)
  {
    String oldEndTagName = endTagName;
    endTagName = newEndTagName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CardTemplatePackage.TAG__END_TAG_NAME, oldEndTagName, endTagName));
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
      case CardTemplatePackage.TAG__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case CardTemplatePackage.TAG__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
      case CardTemplatePackage.TAG__START_TAG_NAME:
        return getStartTagName();
      case CardTemplatePackage.TAG__ATTRIBUTES:
        return getAttributes();
      case CardTemplatePackage.TAG__CHILDREN:
        return getChildren();
      case CardTemplatePackage.TAG__END_TAG_NAME:
        return getEndTagName();
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
      case CardTemplatePackage.TAG__START_TAG_NAME:
        setStartTagName((String)newValue);
        return;
      case CardTemplatePackage.TAG__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case CardTemplatePackage.TAG__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends Tag>)newValue);
        return;
      case CardTemplatePackage.TAG__END_TAG_NAME:
        setEndTagName((String)newValue);
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
      case CardTemplatePackage.TAG__START_TAG_NAME:
        setStartTagName(START_TAG_NAME_EDEFAULT);
        return;
      case CardTemplatePackage.TAG__ATTRIBUTES:
        getAttributes().clear();
        return;
      case CardTemplatePackage.TAG__CHILDREN:
        getChildren().clear();
        return;
      case CardTemplatePackage.TAG__END_TAG_NAME:
        setEndTagName(END_TAG_NAME_EDEFAULT);
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
      case CardTemplatePackage.TAG__START_TAG_NAME:
        return START_TAG_NAME_EDEFAULT == null ? startTagName != null : !START_TAG_NAME_EDEFAULT.equals(startTagName);
      case CardTemplatePackage.TAG__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case CardTemplatePackage.TAG__CHILDREN:
        return children != null && !children.isEmpty();
      case CardTemplatePackage.TAG__END_TAG_NAME:
        return END_TAG_NAME_EDEFAULT == null ? endTagName != null : !END_TAG_NAME_EDEFAULT.equals(endTagName);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (startTagName: ");
    result.append(startTagName);
    result.append(", endTagName: ");
    result.append(endTagName);
    result.append(')');
    return result.toString();
  }

} //TagImpl
