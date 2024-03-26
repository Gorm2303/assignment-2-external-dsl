package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'let'", "'='", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalMath.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalMath.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            // InternalMath.g:79:3: otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getResultKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getIsKeyword_1());
            		
            // InternalMath.g:87:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMath.g:88:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMath.g:88:4: (lv_exp_2_0= ruleExp )
            // InternalMath.g:89:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:110:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:110:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:111:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:117:1: ruleExp returns [EObject current=null] : ( () ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:123:2: ( ( () ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMath.g:124:2: ( () ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMath.g:124:2: ( () ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMath.g:125:3: () ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {
            // InternalMath.g:125:3: ()
            // InternalMath.g:126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpAccess().getFactorAction_0(),
            					current);
            			

            }

            // InternalMath.g:132:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:133:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:133:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==14) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalMath.g:134:5: (otherlv_1= '+' () )
            	            {
            	            // InternalMath.g:134:5: (otherlv_1= '+' () )
            	            // InternalMath.g:135:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalMath.g:139:6: ()
            	            // InternalMath.g:140:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:148:5: (otherlv_3= '-' () )
            	            {
            	            // InternalMath.g:148:5: (otherlv_3= '-' () )
            	            // InternalMath.g:149:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_5); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalMath.g:153:6: ()
            	            // InternalMath.g:154:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:162:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMath.g:163:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMath.g:163:5: (lv_right_5_0= ruleFactor )
            	    // InternalMath.g:164:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:186:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:186:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:187:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:193:1: ruleFactor returns [EObject current=null] : ( () ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:199:2: ( ( () ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:200:2: ( () ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:200:2: ( () ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:201:3: () ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {
            // InternalMath.g:201:3: ()
            // InternalMath.g:202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFactorAccess().getPrimaryAction_0(),
            					current);
            			

            }

            // InternalMath.g:208:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMath.g:209:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:209:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==15) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==16) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMath.g:210:5: (otherlv_1= '*' () )
            	            {
            	            // InternalMath.g:210:5: (otherlv_1= '*' () )
            	            // InternalMath.g:211:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalMath.g:215:6: ()
            	            // InternalMath.g:216:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:224:5: (otherlv_3= '/' () )
            	            {
            	            // InternalMath.g:224:5: (otherlv_3= '/' () )
            	            // InternalMath.g:225:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,16,FOLLOW_7); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalMath.g:229:6: ()
            	            // InternalMath.g:230:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:238:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:239:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:239:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:240:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:262:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:262:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:263:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:269:1: rulePrimary returns [EObject current=null] : ( () ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_parenthesis_2_0= ruleParenthesis ) ) | ( (lv_variableUse_3_0= ruleVariableUse ) ) | ( (lv_variableBinding_4_0= ruleVariableBinding ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject lv_number_1_0 = null;

        EObject lv_parenthesis_2_0 = null;

        EObject lv_variableUse_3_0 = null;

        EObject lv_variableBinding_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:275:2: ( ( () ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_parenthesis_2_0= ruleParenthesis ) ) | ( (lv_variableUse_3_0= ruleVariableUse ) ) | ( (lv_variableBinding_4_0= ruleVariableBinding ) ) ) ) )
            // InternalMath.g:276:2: ( () ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_parenthesis_2_0= ruleParenthesis ) ) | ( (lv_variableUse_3_0= ruleVariableUse ) ) | ( (lv_variableBinding_4_0= ruleVariableBinding ) ) ) )
            {
            // InternalMath.g:276:2: ( () ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_parenthesis_2_0= ruleParenthesis ) ) | ( (lv_variableUse_3_0= ruleVariableUse ) ) | ( (lv_variableBinding_4_0= ruleVariableBinding ) ) ) )
            // InternalMath.g:277:3: () ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_parenthesis_2_0= ruleParenthesis ) ) | ( (lv_variableUse_3_0= ruleVariableUse ) ) | ( (lv_variableBinding_4_0= ruleVariableBinding ) ) )
            {
            // InternalMath.g:277:3: ()
            // InternalMath.g:278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimaryAccess().getPrimaryAction_0(),
            					current);
            			

            }

            // InternalMath.g:284:3: ( ( (lv_number_1_0= ruleNumber ) ) | ( (lv_parenthesis_2_0= ruleParenthesis ) ) | ( (lv_variableUse_3_0= ruleVariableUse ) ) | ( (lv_variableBinding_4_0= ruleVariableBinding ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMath.g:285:4: ( (lv_number_1_0= ruleNumber ) )
                    {
                    // InternalMath.g:285:4: ( (lv_number_1_0= ruleNumber ) )
                    // InternalMath.g:286:5: (lv_number_1_0= ruleNumber )
                    {
                    // InternalMath.g:286:5: (lv_number_1_0= ruleNumber )
                    // InternalMath.g:287:6: lv_number_1_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getNumberNumberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"number",
                    							lv_number_1_0,
                    							"dk.sdu.mmmi.mdsd.Math.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:305:4: ( (lv_parenthesis_2_0= ruleParenthesis ) )
                    {
                    // InternalMath.g:305:4: ( (lv_parenthesis_2_0= ruleParenthesis ) )
                    // InternalMath.g:306:5: (lv_parenthesis_2_0= ruleParenthesis )
                    {
                    // InternalMath.g:306:5: (lv_parenthesis_2_0= ruleParenthesis )
                    // InternalMath.g:307:6: lv_parenthesis_2_0= ruleParenthesis
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParenthesisParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_parenthesis_2_0=ruleParenthesis();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"parenthesis",
                    							lv_parenthesis_2_0,
                    							"dk.sdu.mmmi.mdsd.Math.Parenthesis");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:325:4: ( (lv_variableUse_3_0= ruleVariableUse ) )
                    {
                    // InternalMath.g:325:4: ( (lv_variableUse_3_0= ruleVariableUse ) )
                    // InternalMath.g:326:5: (lv_variableUse_3_0= ruleVariableUse )
                    {
                    // InternalMath.g:326:5: (lv_variableUse_3_0= ruleVariableUse )
                    // InternalMath.g:327:6: lv_variableUse_3_0= ruleVariableUse
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseVariableUseParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variableUse_3_0=ruleVariableUse();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"variableUse",
                    							lv_variableUse_3_0,
                    							"dk.sdu.mmmi.mdsd.Math.VariableUse");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMath.g:345:4: ( (lv_variableBinding_4_0= ruleVariableBinding ) )
                    {
                    // InternalMath.g:345:4: ( (lv_variableBinding_4_0= ruleVariableBinding ) )
                    // InternalMath.g:346:5: (lv_variableBinding_4_0= ruleVariableBinding )
                    {
                    // InternalMath.g:346:5: (lv_variableBinding_4_0= ruleVariableBinding )
                    // InternalMath.g:347:6: lv_variableBinding_4_0= ruleVariableBinding
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getVariableBindingVariableBindingParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variableBinding_4_0=ruleVariableBinding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"variableBinding",
                    							lv_variableBinding_4_0,
                    							"dk.sdu.mmmi.mdsd.Math.VariableBinding");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:369:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:369:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:370:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:376:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalMath.g:382:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalMath.g:383:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalMath.g:383:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalMath.g:384:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:404:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMath.g:404:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMath.g:405:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:411:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:417:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMath.g:418:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMath.g:418:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMath.g:419:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMath.g:419:3: ()
            // InternalMath.g:420:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalMath.g:426:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMath.g:427:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMath.g:427:4: (lv_value_1_0= RULE_INT )
            // InternalMath.g:428:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:448:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:448:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:449:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:455:1: ruleVariableUse returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:461:2: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalMath.g:462:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalMath.g:462:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            // InternalMath.g:463:3: () ( (lv_id_1_0= RULE_ID ) )
            {
            // InternalMath.g:463:3: ()
            // InternalMath.g:464:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVarAction_0(),
            					current);
            			

            }

            // InternalMath.g:470:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMath.g:471:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMath.g:471:4: (lv_id_1_0= RULE_ID )
            // InternalMath.g:472:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_1_0, grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleVariableBinding"
    // InternalMath.g:492:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // InternalMath.g:492:56: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // InternalMath.g:493:2: iv_ruleVariableBinding= ruleVariableBinding EOF
            {
             newCompositeNode(grammarAccess.getVariableBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableBinding=ruleVariableBinding();

            state._fsp--;

             current =iv_ruleVariableBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableBinding"


    // $ANTLR start "ruleVariableBinding"
    // InternalMath.g:499:1: ruleVariableBinding returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) ;
    public final EObject ruleVariableBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_binding_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:505:2: ( ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) )
            // InternalMath.g:506:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            {
            // InternalMath.g:506:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            // InternalMath.g:507:3: () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end'
            {
            // InternalMath.g:507:3: ()
            // InternalMath.g:508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableBindingAccess().getLetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getLetKeyword_1());
            		
            // InternalMath.g:518:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalMath.g:519:4: (lv_id_2_0= RULE_ID )
            {
            // InternalMath.g:519:4: (lv_id_2_0= RULE_ID )
            // InternalMath.g:520:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_id_2_0, grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3());
            		
            // InternalMath.g:540:3: ( (lv_binding_4_0= ruleExp ) )
            // InternalMath.g:541:4: (lv_binding_4_0= ruleExp )
            {
            // InternalMath.g:541:4: (lv_binding_4_0= ruleExp )
            // InternalMath.g:542:5: lv_binding_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_binding_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_4_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableBindingAccess().getInKeyword_5());
            		
            // InternalMath.g:563:3: ( (lv_body_6_0= ruleExp ) )
            // InternalMath.g:564:4: (lv_body_6_0= ruleExp )
            {
            // InternalMath.g:564:4: (lv_body_6_0= ruleExp )
            // InternalMath.g:565:5: lv_body_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_body_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableBindingAccess().getEndKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableBinding"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A0030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000406000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});

}