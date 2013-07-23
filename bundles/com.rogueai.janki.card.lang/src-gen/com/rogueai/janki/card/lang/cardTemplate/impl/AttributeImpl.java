/**
 */
package com.rogueai.janki.card.lang.cardTemplate.impl;

import com.rogueai.janki.card.lang.cardTemplate.Attribute;
import com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.impl.AttributeImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.impl.AttributeImpl#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
  /**
   * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeName()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeName()
   * @generated
   * @ordered
   */
  protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeValue()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeValue()
   * @generated
   * @ordered
   */
  protected String attributeValue = ATTRIBUTE_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return CardTemplatePackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttributeName()
  {
    return attributeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeName(String newAttributeName)
  {
    String oldAttributeName = attributeName;
    attributeName = newAttributeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CardTemplatePackage.ATTRIBUTE__ATTRIBUTE_NAME, oldAttributeName, attributeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttributeValue()
  {
    return attributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeValue(String newAttributeValue)
  {
    String oldAttributeValue = attributeValue;
    attributeValue = newAttributeValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CardTemplatePackage.ATTRIBUTE__ATTRIBUTE_VALUE, oldAttributeValue, attributeValue));
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
      case CardTemplatePackage.ATTRIBUTE__ATTRIBUTE_NAME:
        return getAttributeName();
      case CardTemplatePackage.ATTRIBUTE__ATTRIBUTE_VALUE:
        return getAttributeValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CardTemplatePackage.ATTRIBUTE__ATTRIBUTE_NAME:
        setAttributeName((String)newValue);
        return;
      case CardTemplatePackage.ATTRIBUTE__ATTRIBUTE_VALUE:
        setAttributeValue((String)newValue);
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
      case CardTemplatePackage.ATTRIBUTE__ATTRIBUTE_NAME:
        setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
        return;
      case CardTemplatePackage.ATTRIBUTE__ATTRIBUTE_VALUE:
        setAttributeValue(ATTRIBUTE_VALUE_EDEFAULT);
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
      case CardTemplatePackage.ATTRIBUTE__ATTRIBUTE_NAME:
        return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
      case CardTemplatePackage.ATTRIBUTE__ATTRIBUTE_VALUE:
        return ATTRIBUTE_VALUE_EDEFAULT == null ? attributeValue != null : !ATTRIBUTE_VALUE_EDEFAULT.equals(attributeValue);
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
    result.append(" (attributeName: ");
    result.append(attributeName);
    result.append(", attributeValue: ");
    result.append(attributeValue);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
