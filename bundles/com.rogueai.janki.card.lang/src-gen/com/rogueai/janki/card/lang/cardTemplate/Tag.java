/**
 */
package com.rogueai.janki.card.lang.cardTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.Tag#getStartTagName <em>Start Tag Name</em>}</li>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.Tag#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.Tag#getChildren <em>Children</em>}</li>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.Tag#getEndTagName <em>End Tag Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject
{
  /**
   * Returns the value of the '<em><b>Start Tag Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Tag Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Tag Name</em>' attribute.
   * @see #setStartTagName(String)
   * @see com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage#getTag_StartTagName()
   * @model
   * @generated
   */
  String getStartTagName();

  /**
   * Sets the value of the '{@link com.rogueai.janki.card.lang.cardTemplate.Tag#getStartTagName <em>Start Tag Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Tag Name</em>' attribute.
   * @see #getStartTagName()
   * @generated
   */
  void setStartTagName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link com.rogueai.janki.card.lang.cardTemplate.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage#getTag_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link com.rogueai.janki.card.lang.cardTemplate.Tag}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage#getTag_Children()
   * @model containment="true"
   * @generated
   */
  EList<Tag> getChildren();

  /**
   * Returns the value of the '<em><b>End Tag Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Tag Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Tag Name</em>' attribute.
   * @see #setEndTagName(String)
   * @see com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage#getTag_EndTagName()
   * @model
   * @generated
   */
  String getEndTagName();

  /**
   * Sets the value of the '{@link com.rogueai.janki.card.lang.cardTemplate.Tag#getEndTagName <em>End Tag Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Tag Name</em>' attribute.
   * @see #getEndTagName()
   * @generated
   */
  void setEndTagName(String value);

} // Tag
