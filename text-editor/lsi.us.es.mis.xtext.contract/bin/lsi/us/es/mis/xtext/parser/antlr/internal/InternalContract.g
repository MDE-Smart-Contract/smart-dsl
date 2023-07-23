/*
 * generated by Xtext 2.25.0
 */
grammar InternalContract;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package lsi.us.es.mis.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package lsi.us.es.mis.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lsi.us.es.mis.xtext.services.ContractGrammarAccess;

}

@parser::members {

 	private ContractGrammarAccess grammarAccess;

    public InternalContractParser(TokenStream input, ContractGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Contract";
   	}

   	@Override
   	protected ContractGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleContract
entryRuleContract returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContractRule()); }
	iv_ruleContract=ruleContract
	{ $current=$iv_ruleContract.current; }
	EOF;

// Rule Contract
ruleContract returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Contract'
		{
			newLeafNode(otherlv_0, grammarAccess.getContractAccess().getContractKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getContractAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContractRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getContractAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='version:'
		{
			newLeafNode(otherlv_3, grammarAccess.getContractAccess().getVersionKeyword_3());
		}
		(
			(
				lv_version_4_0=RULE_STRING
				{
					newLeafNode(lv_version_4_0, grammarAccess.getContractAccess().getVersionSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContractRule());
					}
					setWithLastConsumed(
						$current,
						"version",
						lv_version_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_hasReceive_5_0='hasReceive'
				{
					newLeafNode(lv_hasReceive_5_0, grammarAccess.getContractAccess().getHasReceiveHasReceiveKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContractRule());
					}
					setWithLastConsumed($current, "hasReceive", lv_hasReceive_5_0 != null, "hasReceive");
				}
			)
		)?
		(
			(
				lv_ownership_6_0='ownership'
				{
					newLeafNode(lv_ownership_6_0, grammarAccess.getContractAccess().getOwnershipOwnershipKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContractRule());
					}
					setWithLastConsumed($current, "ownership", lv_ownership_6_0 != null, "ownership");
				}
			)
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getContractAccess().getAttributesAttributeParserRuleCall_7_0_0());
					}
					lv_attributes_7_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContractRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_7_0,
							"lsi.us.es.mis.xtext.Contract.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getContractAccess().getEventsEventParserRuleCall_7_1_0());
					}
					lv_events_8_0=ruleEvent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContractRule());
						}
						add(
							$current,
							"events",
							lv_events_8_0,
							"lsi.us.es.mis.xtext.Contract.Event");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getContractAccess().getMethodsMethodParserRuleCall_7_2_0());
					}
					lv_methods_9_0=ruleMethod
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContractRule());
						}
						add(
							$current,
							"methods",
							lv_methods_9_0,
							"lsi.us.es.mis.xtext.Contract.Method");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getContractAccess().getModifiersModifierParserRuleCall_7_3_0());
					}
					lv_modifiers_10_0=ruleModifier
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContractRule());
						}
						add(
							$current,
							"modifiers",
							lv_modifiers_10_0,
							"lsi.us.es.mis.xtext.Contract.Modifier");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getContractAccess().getMappingsMappingDeclarationParserRuleCall_7_4_0());
					}
					lv_mappings_11_0=ruleMappingDeclaration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContractRule());
						}
						add(
							$current,
							"mappings",
							lv_mappings_11_0,
							"lsi.us.es.mis.xtext.Contract.MappingDeclaration");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getContractAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_modifiable_0_0='modifiable'
				{
					newLeafNode(lv_modifiable_0_0, grammarAccess.getAttributeAccess().getModifiableModifiableKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed($current, "modifiable", lv_modifiable_0_0 != null, "modifiable");
				}
			)
		)?
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_2_0());
				}
				lv_type_2_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"lsi.us.es.mis.xtext.Contract.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleModifier
entryRuleModifier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModifierRule()); }
	iv_ruleModifier=ruleModifier
	{ $current=$iv_ruleModifier.current; }
	EOF;

// Rule Modifier
ruleModifier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Modifier'
		{
			newLeafNode(otherlv_0, grammarAccess.getModifierAccess().getModifierKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getModifierAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModifierRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getModifierAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getModifierAccess().getParamsParamParserRuleCall_3_0_0());
					}
					lv_params_3_0=ruleParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModifierRule());
						}
						add(
							$current,
							"params",
							lv_params_3_0,
							"lsi.us.es.mis.xtext.Contract.Param");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getModifierAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getModifierAccess().getParamsParamParserRuleCall_3_1_1_0());
						}
						lv_params_5_0=ruleParam
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModifierRule());
							}
							add(
								$current,
								"params",
								lv_params_5_0,
								"lsi.us.es.mis.xtext.Contract.Param");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getModifierAccess().getRightParenthesisKeyword_4());
		}
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getModifierAccess().getLeftCurlyBracketKeyword_5());
		}
		otherlv_8='message:'
		{
			newLeafNode(otherlv_8, grammarAccess.getModifierAccess().getMessageKeyword_6());
		}
		(
			(
				lv_message_9_0=RULE_STRING
				{
					newLeafNode(lv_message_9_0, grammarAccess.getModifierAccess().getMessageSTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModifierRule());
					}
					setWithLastConsumed(
						$current,
						"message",
						lv_message_9_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_10='validation:'
		{
			newLeafNode(otherlv_10, grammarAccess.getModifierAccess().getValidationKeyword_8());
		}
		(
			(
				lv_validation_11_0=RULE_STRING
				{
					newLeafNode(lv_validation_11_0, grammarAccess.getModifierAccess().getValidationSTRINGTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModifierRule());
					}
					setWithLastConsumed(
						$current,
						"validation",
						lv_validation_11_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getModifierAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleMethod
entryRuleMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodRule()); }
	iv_ruleMethod=ruleMethod
	{ $current=$iv_ruleMethod.current; }
	EOF;

// Rule Method
ruleMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='method'
		{
			newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getMethodKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethodRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodAccess().getParamsParamParserRuleCall_3_0_0());
					}
					lv_params_3_0=ruleParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodRule());
						}
						add(
							$current,
							"params",
							lv_params_3_0,
							"lsi.us.es.mis.xtext.Contract.Param");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethodAccess().getParamsParamParserRuleCall_3_1_1_0());
						}
						lv_params_5_0=ruleParam
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethodRule());
							}
							add(
								$current,
								"params",
								lv_params_5_0,
								"lsi.us.es.mis.xtext.Contract.Param");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
		}
		(
			otherlv_7='stateMutability:'
			{
				newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getStateMutabilityKeyword_5_0());
			}
			(
				(
					lv_statemutability_8_0=RULE_STRING
					{
						newLeafNode(lv_statemutability_8_0, grammarAccess.getMethodAccess().getStatemutabilitySTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMethodRule());
						}
						setWithLastConsumed(
							$current,
							"statemutability",
							lv_statemutability_8_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_9='->'
		{
			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_6());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMethodAccess().getOutputsOutputParserRuleCall_7_0_0());
					}
					lv_outputs_10_0=ruleOutput
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethodRule());
						}
						add(
							$current,
							"outputs",
							lv_outputs_10_0,
							"lsi.us.es.mis.xtext.Contract.Output");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getCommaKeyword_7_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethodAccess().getOutputsOutputParserRuleCall_7_1_1_0());
						}
						lv_outputs_12_0=ruleOutput
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethodRule());
							}
							add(
								$current,
								"outputs",
								lv_outputs_12_0,
								"lsi.us.es.mis.xtext.Contract.Output");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_13='{'
		{
			newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getLeftCurlyBracketKeyword_8());
		}
		(
			otherlv_14='description:'
			{
				newLeafNode(otherlv_14, grammarAccess.getMethodAccess().getDescriptionKeyword_9_0());
			}
			(
				(
					lv_description_15_0=RULE_STRING
					{
						newLeafNode(lv_description_15_0, grammarAccess.getMethodAccess().getDescriptionSTRINGTerminalRuleCall_9_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMethodRule());
						}
						setWithLastConsumed(
							$current,
							"description",
							lv_description_15_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			(
				(
					lv_modifiersKeyword_16_0='modifiers:'
					{
						newLeafNode(lv_modifiersKeyword_16_0, grammarAccess.getMethodAccess().getModifiersKeywordModifiersKeyword_10_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMethodRule());
						}
						setWithLastConsumed($current, "modifiersKeyword", lv_modifiersKeyword_16_0, "modifiers:");
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMethodRule());
						}
					}
					otherlv_17=RULE_ID
					{
						newLeafNode(otherlv_17, grammarAccess.getMethodAccess().getModifiersModifierCrossReference_10_1_0());
					}
				)
			)
			(
				otherlv_18=','
				{
					newLeafNode(otherlv_18, grammarAccess.getMethodAccess().getCommaKeyword_10_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMethodRule());
							}
						}
						otherlv_19=RULE_ID
						{
							newLeafNode(otherlv_19, grammarAccess.getMethodAccess().getModifiersModifierCrossReference_10_2_1_0());
						}
					)
				)
			)*
		)?
		(
			(
				(
					lv_eventsKeyword_20_0='events:'
					{
						newLeafNode(lv_eventsKeyword_20_0, grammarAccess.getMethodAccess().getEventsKeywordEventsKeyword_11_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMethodRule());
						}
						setWithLastConsumed($current, "eventsKeyword", lv_eventsKeyword_20_0, "events:");
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMethodRule());
						}
					}
					otherlv_21=RULE_ID
					{
						newLeafNode(otherlv_21, grammarAccess.getMethodAccess().getEventsEventCrossReference_11_1_0());
					}
				)
			)
			(
				otherlv_22=','
				{
					newLeafNode(otherlv_22, grammarAccess.getMethodAccess().getCommaKeyword_11_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMethodRule());
							}
						}
						otherlv_23=RULE_ID
						{
							newLeafNode(otherlv_23, grammarAccess.getMethodAccess().getEventsEventCrossReference_11_2_1_0());
						}
					)
				)
			)*
		)?
		otherlv_24='}'
		{
			newLeafNode(otherlv_24, grammarAccess.getMethodAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	iv_ruleEvent=ruleEvent
	{ $current=$iv_ruleEvent.current; }
	EOF;

// Rule Event
ruleEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='event'
		{
			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getEventAccess().getParamsParamParserRuleCall_3_0_0());
					}
					lv_params_3_0=ruleParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEventRule());
						}
						add(
							$current,
							"params",
							lv_params_3_0,
							"lsi.us.es.mis.xtext.Contract.Param");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getEventAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEventAccess().getParamsParamParserRuleCall_3_1_1_0());
						}
						lv_params_5_0=ruleParam
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEventRule());
							}
							add(
								$current,
								"params",
								lv_params_5_0,
								"lsi.us.es.mis.xtext.Contract.Param");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getEventAccess().getRightParenthesisKeyword_4());
		}
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_5());
		}
		otherlv_8='description:'
		{
			newLeafNode(otherlv_8, grammarAccess.getEventAccess().getDescriptionKeyword_6());
		}
		(
			(
				lv_description_9_0=RULE_STRING
				{
					newLeafNode(lv_description_9_0, grammarAccess.getEventAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_9_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleParam
entryRuleParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParamRule()); }
	iv_ruleParam=ruleParam
	{ $current=$iv_ruleParam.current; }
	EOF;

// Rule Param
ruleParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParamRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getParamAccess().getTypeDataTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParamRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"lsi.us.es.mis.xtext.Contract.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleOutput
entryRuleOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current; }
	EOF;

// Rule Output
ruleOutput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getOutputAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getOutputAccess().getTypeDataTypeEnumRuleCall_1_0());
				}
				lv_type_1_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutputRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"lsi.us.es.mis.xtext.Contract.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMappingDeclaration
entryRuleMappingDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMappingDeclarationRule()); }
	iv_ruleMappingDeclaration=ruleMappingDeclaration
	{ $current=$iv_ruleMappingDeclaration.current; }
	EOF;

// Rule MappingDeclaration
ruleMappingDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='mapping'
		{
			newLeafNode(otherlv_0, grammarAccess.getMappingDeclarationAccess().getMappingKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMappingDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMappingDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='fromType'
		{
			newLeafNode(otherlv_2, grammarAccess.getMappingDeclarationAccess().getFromTypeKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMappingDeclarationAccess().getFromTypeDataTypeEnumRuleCall_3_0());
				}
				lv_fromType_3_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMappingDeclarationRule());
					}
					set(
						$current,
						"fromType",
						lv_fromType_3_0,
						"lsi.us.es.mis.xtext.Contract.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='toType'
		{
			newLeafNode(otherlv_4, grammarAccess.getMappingDeclarationAccess().getToTypeKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMappingDeclarationAccess().getToTypeDataTypeEnumRuleCall_5_0());
				}
				lv_toType_5_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMappingDeclarationRule());
					}
					set(
						$current,
						"toType",
						lv_toType_5_0,
						"lsi.us.es.mis.xtext.Contract.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule DataType
ruleDataType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='integer'
			{
				$current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='string'
			{
				$current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='boolean'
			{
				$current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='address'
			{
				$current = grammarAccess.getDataTypeAccess().getADDRESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getADDRESSEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='array'
			{
				$current = grammarAccess.getDataTypeAccess().getArrayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getArrayEnumLiteralDeclaration_4());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
