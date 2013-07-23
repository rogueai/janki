/**
 */
package com.rogueai.janki.card.lang.cardTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Html</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rogueai.janki.card.lang.cardTemplate.Html#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage#getHtml()
 * @model
 * @generated
 */
public interface Html extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference list.
   * The list contents are of type {@link com.rogueai.janki.card.lang.cardTemplate.Tag}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference list.
   * @see com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage#getHtml_Content()
   * @model containment="true"
   * @generated
   */
  EList<Tag> getContent();

} // Html
