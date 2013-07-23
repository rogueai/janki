/**
 */
package com.rogueai.janki.card.lang.cardTemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.rogueai.janki.card.lang.cardTemplate.CardTemplateFactory
 * @model kind="package"
 * @generated
 */
public interface CardTemplatePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cardTemplate";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.rogueai.com/janki/card/lang/CardTemplate";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cardTemplate";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CardTemplatePackage eINSTANCE = com.rogueai.janki.card.lang.cardTemplate.impl.CardTemplatePackageImpl.init();

  /**
   * The meta object id for the '{@link com.rogueai.janki.card.lang.cardTemplate.impl.HtmlImpl <em>Html</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.rogueai.janki.card.lang.cardTemplate.impl.HtmlImpl
   * @see com.rogueai.janki.card.lang.cardTemplate.impl.CardTemplatePackageImpl#getHtml()
   * @generated
   */
  int HTML = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Html</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.rogueai.janki.card.lang.cardTemplate.impl.TagImpl <em>Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.rogueai.janki.card.lang.cardTemplate.impl.TagImpl
   * @see com.rogueai.janki.card.lang.cardTemplate.impl.CardTemplatePackageImpl#getTag()
   * @generated
   */
  int TAG = 1;

  /**
   * The feature id for the '<em><b>Start Tag Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__START_TAG_NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__CHILDREN = 2;

  /**
   * The feature id for the '<em><b>End Tag Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__END_TAG_NAME = 3;

  /**
   * The number of structural features of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.rogueai.janki.card.lang.cardTemplate.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.rogueai.janki.card.lang.cardTemplate.impl.AttributeImpl
   * @see com.rogueai.janki.card.lang.cardTemplate.impl.CardTemplatePackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTE_NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTE_VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.rogueai.janki.card.lang.cardTemplate.Html <em>Html</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Html</em>'.
   * @see com.rogueai.janki.card.lang.cardTemplate.Html
   * @generated
   */
  EClass getHtml();

  /**
   * Returns the meta object for the containment reference list '{@link com.rogueai.janki.card.lang.cardTemplate.Html#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see com.rogueai.janki.card.lang.cardTemplate.Html#getContent()
   * @see #getHtml()
   * @generated
   */
  EReference getHtml_Content();

  /**
   * Returns the meta object for class '{@link com.rogueai.janki.card.lang.cardTemplate.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag</em>'.
   * @see com.rogueai.janki.card.lang.cardTemplate.Tag
   * @generated
   */
  EClass getTag();

  /**
   * Returns the meta object for the attribute '{@link com.rogueai.janki.card.lang.cardTemplate.Tag#getStartTagName <em>Start Tag Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Tag Name</em>'.
   * @see com.rogueai.janki.card.lang.cardTemplate.Tag#getStartTagName()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_StartTagName();

  /**
   * Returns the meta object for the containment reference list '{@link com.rogueai.janki.card.lang.cardTemplate.Tag#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.rogueai.janki.card.lang.cardTemplate.Tag#getAttributes()
   * @see #getTag()
   * @generated
   */
  EReference getTag_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link com.rogueai.janki.card.lang.cardTemplate.Tag#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see com.rogueai.janki.card.lang.cardTemplate.Tag#getChildren()
   * @see #getTag()
   * @generated
   */
  EReference getTag_Children();

  /**
   * Returns the meta object for the attribute '{@link com.rogueai.janki.card.lang.cardTemplate.Tag#getEndTagName <em>End Tag Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Tag Name</em>'.
   * @see com.rogueai.janki.card.lang.cardTemplate.Tag#getEndTagName()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_EndTagName();

  /**
   * Returns the meta object for class '{@link com.rogueai.janki.card.lang.cardTemplate.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see com.rogueai.janki.card.lang.cardTemplate.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.rogueai.janki.card.lang.cardTemplate.Attribute#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see com.rogueai.janki.card.lang.cardTemplate.Attribute#getAttributeName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AttributeName();

  /**
   * Returns the meta object for the attribute '{@link com.rogueai.janki.card.lang.cardTemplate.Attribute#getAttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Value</em>'.
   * @see com.rogueai.janki.card.lang.cardTemplate.Attribute#getAttributeValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AttributeValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CardTemplateFactory getCardTemplateFactory();

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
     * The meta object literal for the '{@link com.rogueai.janki.card.lang.cardTemplate.impl.HtmlImpl <em>Html</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.rogueai.janki.card.lang.cardTemplate.impl.HtmlImpl
     * @see com.rogueai.janki.card.lang.cardTemplate.impl.CardTemplatePackageImpl#getHtml()
     * @generated
     */
    EClass HTML = eINSTANCE.getHtml();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTML__CONTENT = eINSTANCE.getHtml_Content();

    /**
     * The meta object literal for the '{@link com.rogueai.janki.card.lang.cardTemplate.impl.TagImpl <em>Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.rogueai.janki.card.lang.cardTemplate.impl.TagImpl
     * @see com.rogueai.janki.card.lang.cardTemplate.impl.CardTemplatePackageImpl#getTag()
     * @generated
     */
    EClass TAG = eINSTANCE.getTag();

    /**
     * The meta object literal for the '<em><b>Start Tag Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__START_TAG_NAME = eINSTANCE.getTag_StartTagName();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__ATTRIBUTES = eINSTANCE.getTag_Attributes();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__CHILDREN = eINSTANCE.getTag_Children();

    /**
     * The meta object literal for the '<em><b>End Tag Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__END_TAG_NAME = eINSTANCE.getTag_EndTagName();

    /**
     * The meta object literal for the '{@link com.rogueai.janki.card.lang.cardTemplate.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.rogueai.janki.card.lang.cardTemplate.impl.AttributeImpl
     * @see com.rogueai.janki.card.lang.cardTemplate.impl.CardTemplatePackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getAttribute_AttributeName();

    /**
     * The meta object literal for the '<em><b>Attribute Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATTRIBUTE_VALUE = eINSTANCE.getAttribute_AttributeValue();

  }

} //CardTemplatePackage
