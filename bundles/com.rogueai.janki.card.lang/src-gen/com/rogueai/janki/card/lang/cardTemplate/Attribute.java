/**
 */
package com.rogueai.janki.card.lang.cardTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.Attribute#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.Attribute#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Name</em>' attribute.
   * @see #setAttributeName(String)
   * @see com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage#getAttribute_AttributeName()
   * @model
   * @generated
   */
  String getAttributeName();

  /**
   * Sets the value of the '{@link com.rogueai.janki.card.lang.cardTemplate.Attribute#getAttributeName <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Name</em>' attribute.
   * @see #getAttributeName()
   * @generated
   */
  void setAttributeName(String value);

  /**
   * Returns the value of the '<em><b>Attribute Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Value</em>' attribute.
   * @see #setAttributeValue(String)
   * @see com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage#getAttribute_AttributeValue()
   * @model
   * @generated
   */
  String getAttributeValue();

  /**
   * Sets the value of the '{@link com.rogueai.janki.card.lang.cardTemplate.Attribute#getAttributeValue <em>Attribute Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Value</em>' attribute.
   * @see #getAttributeValue()
   * @generated
   */
  void setAttributeValue(String value);

} // Attribute
