package com.rogueai.janki.card.lang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.rogueai.janki.card.lang.cardTemplate.Attribute;
import com.rogueai.janki.card.lang.cardTemplate.CardTemplatePackage;
import com.rogueai.janki.card.lang.cardTemplate.Html;
import com.rogueai.janki.card.lang.cardTemplate.Tag;
import com.rogueai.janki.card.lang.services.CardTemplateGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CardTemplateSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CardTemplateGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CardTemplatePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CardTemplatePackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case CardTemplatePackage.HTML:
				if(context == grammarAccess.getHtmlRule()) {
					sequence_Html(context, (Html) semanticObject); 
					return; 
				}
				else break;
			case CardTemplatePackage.TAG:
				if(context == grammarAccess.getTagRule()) {
					sequence_Tag(context, (Tag) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (attributeName=ID attributeValue=STRING)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CardTemplatePackage.Literals.ATTRIBUTE__ATTRIBUTE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CardTemplatePackage.Literals.ATTRIBUTE__ATTRIBUTE_NAME));
			if(transientValues.isValueTransient(semanticObject, CardTemplatePackage.Literals.ATTRIBUTE__ATTRIBUTE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CardTemplatePackage.Literals.ATTRIBUTE__ATTRIBUTE_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getAttributeNameIDTerminalRuleCall_0_0(), semanticObject.getAttributeName());
		feeder.accept(grammarAccess.getAttributeAccess().getAttributeValueSTRINGTerminalRuleCall_2_0(), semanticObject.getAttributeValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     content+=Tag*
	 */
	protected void sequence_Html(EObject context, Html semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((startTagName=Type attributes+=Attribute* children+=Tag* endTagName=Type) | (startTagName=Type attributes+=Attribute* endTagName=''))
	 */
	protected void sequence_Tag(EObject context, Tag semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
