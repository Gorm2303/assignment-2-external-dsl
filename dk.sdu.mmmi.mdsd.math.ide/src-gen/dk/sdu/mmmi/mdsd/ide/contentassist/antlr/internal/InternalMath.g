/*
 * generated by Xtext 2.33.0
 */
grammar InternalMath;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;

}
@parser::members {
	private MathGrammarAccess grammarAccess;

	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleMathExp
entryRuleMathExp
:
{ before(grammarAccess.getMathExpRule()); }
	 ruleMathExp
{ after(grammarAccess.getMathExpRule()); } 
	 EOF 
;

// Rule MathExp
ruleMathExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMathExpAccess().getGroup()); }
		(rule__MathExp__Group__0)
		{ after(grammarAccess.getMathExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExp
entryRuleExp
:
{ before(grammarAccess.getExpRule()); }
	 ruleExp
{ after(grammarAccess.getExpRule()); } 
	 EOF 
;

// Rule Exp
ruleExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpAccess().getGroup()); }
		(rule__Exp__Group__0)
		{ after(grammarAccess.getExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFactor
entryRuleFactor
:
{ before(grammarAccess.getFactorRule()); }
	 ruleFactor
{ after(grammarAccess.getFactorRule()); } 
	 EOF 
;

// Rule Factor
ruleFactor 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFactorAccess().getGroup()); }
		(rule__Factor__Group__0)
		{ after(grammarAccess.getFactorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary
entryRulePrimary
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryAccess().getAlternatives()); }
		(rule__Primary__Alternatives)
		{ after(grammarAccess.getPrimaryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParenthesis
entryRuleParenthesis
:
{ before(grammarAccess.getParenthesisRule()); }
	 ruleParenthesis
{ after(grammarAccess.getParenthesisRule()); } 
	 EOF 
;

// Rule Parenthesis
ruleParenthesis 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParenthesisAccess().getGroup()); }
		(rule__Parenthesis__Group__0)
		{ after(grammarAccess.getParenthesisAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumber
entryRuleNumber
:
{ before(grammarAccess.getNumberRule()); }
	 ruleNumber
{ after(grammarAccess.getNumberRule()); } 
	 EOF 
;

// Rule Number
ruleNumber 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumberAccess().getGroup()); }
		(rule__Number__Group__0)
		{ after(grammarAccess.getNumberAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariableUse
entryRuleVariableUse
:
{ before(grammarAccess.getVariableUseRule()); }
	 ruleVariableUse
{ after(grammarAccess.getVariableUseRule()); } 
	 EOF 
;

// Rule VariableUse
ruleVariableUse 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableUseAccess().getGroup()); }
		(rule__VariableUse__Group__0)
		{ after(grammarAccess.getVariableUseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariableBinding
entryRuleVariableBinding
:
{ before(grammarAccess.getVariableBindingRule()); }
	 ruleVariableBinding
{ after(grammarAccess.getVariableBindingRule()); } 
	 EOF 
;

// Rule VariableBinding
ruleVariableBinding 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableBindingAccess().getGroup()); }
		(rule__VariableBinding__Group__0)
		{ after(grammarAccess.getVariableBindingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getGroup_1_0_0()); }
		(rule__Exp__Group_1_0_0__0)
		{ after(grammarAccess.getExpAccess().getGroup_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpAccess().getGroup_1_0_1()); }
		(rule__Exp__Group_1_0_1__0)
		{ after(grammarAccess.getExpAccess().getGroup_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFactorAccess().getGroup_1_0_0()); }
		(rule__Factor__Group_1_0_0__0)
		{ after(grammarAccess.getFactorAccess().getGroup_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getFactorAccess().getGroup_1_0_1()); }
		(rule__Factor__Group_1_0_1__0)
		{ after(grammarAccess.getFactorAccess().getGroup_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); }
		ruleNumber
		{ after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); }
		ruleParenthesis
		{ after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2()); }
		ruleVariableUse
		{ after(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_3()); }
		ruleVariableBinding
		{ after(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__0__Impl
	rule__MathExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getResultKeyword_0()); }
	'result'
	{ after(grammarAccess.getMathExpAccess().getResultKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__1__Impl
	rule__MathExp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getIsKeyword_1()); }
	'is'
	{ after(grammarAccess.getMathExpAccess().getIsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getExpAssignment_2()); }
	(rule__MathExp__ExpAssignment_2)
	{ after(grammarAccess.getMathExpAccess().getExpAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group__0__Impl
	rule__Exp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getFactorAction_0()); }
	()
	{ after(grammarAccess.getExpAccess().getFactorAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getGroup_1()); }
	(rule__Exp__Group_1__0)*
	{ after(grammarAccess.getExpAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1__0__Impl
	rule__Exp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getAlternatives_1_0()); }
	(rule__Exp__Alternatives_1_0)
	{ after(grammarAccess.getExpAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getRightAssignment_1_1()); }
	(rule__Exp__RightAssignment_1_1)
	{ after(grammarAccess.getExpAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1_0_0__0__Impl
	rule__Exp__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0()); }
	'+'
	{ after(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1()); }
	()
	{ after(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1_0_1__0__Impl
	rule__Exp__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0()); }
	'-'
	{ after(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1()); }
	()
	{ after(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Factor__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Factor__Group__0__Impl
	rule__Factor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFactorAccess().getPrimaryAction_0()); }
	()
	{ after(grammarAccess.getFactorAccess().getPrimaryAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Factor__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFactorAccess().getGroup_1()); }
	(rule__Factor__Group_1__0)*
	{ after(grammarAccess.getFactorAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Factor__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Factor__Group_1__0__Impl
	rule__Factor__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFactorAccess().getAlternatives_1_0()); }
	(rule__Factor__Alternatives_1_0)
	{ after(grammarAccess.getFactorAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Factor__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); }
	(rule__Factor__RightAssignment_1_1)
	{ after(grammarAccess.getFactorAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Factor__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Factor__Group_1_0_0__0__Impl
	rule__Factor__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0()); }
	'*'
	{ after(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Factor__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1()); }
	()
	{ after(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Factor__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Factor__Group_1_0_1__0__Impl
	rule__Factor__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0()); }
	'/'
	{ after(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Factor__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1()); }
	()
	{ after(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parenthesis__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__0__Impl
	rule__Parenthesis__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__1__Impl
	rule__Parenthesis__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1()); }
	ruleExp
	{ after(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Number__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Number__Group__0__Impl
	rule__Number__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Number__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumberAccess().getNumAction_0()); }
	()
	{ after(grammarAccess.getNumberAccess().getNumAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Number__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Number__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Number__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumberAccess().getValueAssignment_1()); }
	(rule__Number__ValueAssignment_1)
	{ after(grammarAccess.getNumberAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VariableUse__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableUse__Group__0__Impl
	rule__VariableUse__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableUse__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableUseAccess().getVarAction_0()); }
	()
	{ after(grammarAccess.getVariableUseAccess().getVarAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableUse__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableUse__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableUse__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableUseAccess().getIdAssignment_1()); }
	(rule__VariableUse__IdAssignment_1)
	{ after(grammarAccess.getVariableUseAccess().getIdAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VariableBinding__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableBinding__Group__0__Impl
	rule__VariableBinding__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableBindingAccess().getLetAction_0()); }
	()
	{ after(grammarAccess.getVariableBindingAccess().getLetAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableBinding__Group__1__Impl
	rule__VariableBinding__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableBindingAccess().getLetKeyword_1()); }
	'let'
	{ after(grammarAccess.getVariableBindingAccess().getLetKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableBinding__Group__2__Impl
	rule__VariableBinding__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableBindingAccess().getIdAssignment_2()); }
	(rule__VariableBinding__IdAssignment_2)
	{ after(grammarAccess.getVariableBindingAccess().getIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableBinding__Group__3__Impl
	rule__VariableBinding__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3()); }
	'='
	{ after(grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableBinding__Group__4__Impl
	rule__VariableBinding__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableBindingAccess().getBindingAssignment_4()); }
	(rule__VariableBinding__BindingAssignment_4)
	{ after(grammarAccess.getVariableBindingAccess().getBindingAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableBinding__Group__5__Impl
	rule__VariableBinding__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableBindingAccess().getInKeyword_5()); }
	'in'
	{ after(grammarAccess.getVariableBindingAccess().getInKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableBinding__Group__6__Impl
	rule__VariableBinding__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableBindingAccess().getBodyAssignment_6()); }
	(rule__VariableBinding__BodyAssignment_6)
	{ after(grammarAccess.getVariableBindingAccess().getBodyAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableBinding__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableBindingAccess().getEndKeyword_7()); }
	'end'
	{ after(grammarAccess.getVariableBindingAccess().getEndKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MathExp__ExpAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); }
		ruleExp
		{ after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0()); }
		ruleFactor
		{ after(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Factor__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0()); }
		rulePrimary
		{ after(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Number__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableUse__IdAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__IdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__BindingAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0()); }
		ruleExp
		{ after(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableBinding__BodyAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0()); }
		ruleExp
		{ after(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
