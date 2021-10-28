// Generated from D:/JB/IDEA/UNI_LAB1_V1/src/main/antlr4/uni/makarov/parser\Grammar.g4 by ANTLR 4.9.1
package parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMBER=2, EXP=3, MULTIPLY=4, DIVIDE=5, SUB=6, ADD=7, MOD=8, DIV=9, 
		MMAX=10, MMIN=11, WORD=12, CELL_COL=13, CELL_ROW=14, ID=15, LPAREN=16, 
		RPAREN=17, WS=18, ANY=19;
	public static final int
		RULE_parse = 0, RULE_string = 1, RULE_number = 2, RULE_id = 3, RULE_argumentsNum = 4, 
		RULE_argumentsID = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "string", "number", "id", "argumentsNum", "argumentsID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'^'", "'*'", "'/'", "'-'", "'+'", "'mod'", "'div'", 
			"'mmax'", "'mmin'", null, null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUMBER", "EXP", "MULTIPLY", "DIVIDE", "SUB", "ADD", "MOD", 
			"DIV", "MMAX", "MMIN", "WORD", "CELL_COL", "CELL_ROW", "ID", "LPAREN", 
			"RPAREN", "WS", "ANY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			setState(15);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				number(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				id(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(GrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(GrammarParser.WORD, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				match(WORD);
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericExprContext extends NumberContext {
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public NumericExprContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumericExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumericExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumericExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpExprContext extends NumberContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode EXP() { return getToken(GrammarParser.EXP, 0); }
		public ExpExprContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExprContext extends NumberContext {
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public ParenthesisExprContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParenthesisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParenthesisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExprContext extends NumberContext {
		public Token operatorToker;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(GrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(GrammarParser.DIVIDE, 0); }
		public MulDivExprContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSumExprContext extends NumberContext {
		public Token operatorToker;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public AddSumExprContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddSumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddSumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAddSumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends NumberContext {
		public Token operatorToker;
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode MMIN() { return getToken(GrammarParser.MMIN, 0); }
		public TerminalNode MMAX() { return getToken(GrammarParser.MMAX, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public FunctionExprContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModDivExprContext extends NumberContext {
		public Token operatorToker;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode MOD() { return getToken(GrammarParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public ModDivExprContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterModDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitModDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitModDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		return number(0);
	}

	private NumberContext number(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumberContext _localctx = new NumberContext(_ctx, _parentState);
		NumberContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_number, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23);
				match(LPAREN);
				setState(24);
				number(0);
				setState(25);
				match(RPAREN);
				}
				break;
			case MMAX:
			case MMIN:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				((FunctionExprContext)_localctx).operatorToker = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MMAX || _la==MMIN) ) {
					((FunctionExprContext)_localctx).operatorToker = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(28);
				match(LPAREN);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << MMAX) | (1L << MMIN) | (1L << LPAREN))) != 0)) {
					{
					setState(29);
					number(0);
					setState(30);
					match(T__0);
					setState(31);
					number(0);
					}
				}

				setState(35);
				match(RPAREN);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumericExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new NumberContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_number);
						setState(39);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(40);
						((MulDivExprContext)_localctx).operatorToker = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
							((MulDivExprContext)_localctx).operatorToker = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(41);
						number(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSumExprContext(new NumberContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_number);
						setState(42);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(43);
						((AddSumExprContext)_localctx).operatorToker = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUB || _la==ADD) ) {
							((AddSumExprContext)_localctx).operatorToker = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(44);
						number(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpExprContext(new NumberContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_number);
						setState(45);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(46);
						match(EXP);
						setState(47);
						number(4);
						}
						break;
					case 4:
						{
						_localctx = new ModDivExprContext(new NumberContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_number);
						setState(48);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(49);
						((ModDivExprContext)_localctx).operatorToker = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MOD || _la==DIV) ) {
							((ModDivExprContext)_localctx).operatorToker = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(50);
						number(4);
						}
						break;
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	 
		public IdContext() { }
		public void copyFrom(IdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCellExprContext extends IdContext {
		public Token operatorToker;
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public TerminalNode MMIN() { return getToken(GrammarParser.MMIN, 0); }
		public TerminalNode MMAX() { return getToken(GrammarParser.MMAX, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public FunctionCellExprContext(IdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionCellExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionCellExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionCellExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CellIDExprContext extends IdContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public CellIDExprContext(IdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCellIDExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCellIDExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCellIDExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSumCellExprContext extends IdContext {
		public Token operatorToker;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public AddSumCellExprContext(IdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddSumCellExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddSumCellExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAddSumCellExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModDivCellExprContext extends IdContext {
		public Token operatorToker;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode MOD() { return getToken(GrammarParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public ModDivCellExprContext(IdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterModDivCellExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitModDivCellExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitModDivCellExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisCellExprContext extends IdContext {
		public TerminalNode LPAREN() { return getToken(GrammarParser.LPAREN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GrammarParser.RPAREN, 0); }
		public ParenthesisCellExprContext(IdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParenthesisCellExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParenthesisCellExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParenthesisCellExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivCellExprContext extends IdContext {
		public Token operatorToker;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(GrammarParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(GrammarParser.DIVIDE, 0); }
		public MulDivCellExprContext(IdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMulDivCellExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMulDivCellExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMulDivCellExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpCellExprContext extends IdContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode EXP() { return getToken(GrammarParser.EXP, 0); }
		public ExpCellExprContext(IdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpCellExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpCellExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpCellExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		return id(0);
	}

	private IdContext id(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdContext _localctx = new IdContext(_ctx, _parentState);
		IdContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_id, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenthesisCellExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(57);
				match(LPAREN);
				setState(58);
				id(0);
				setState(59);
				match(RPAREN);
				}
				break;
			case MMAX:
			case MMIN:
				{
				_localctx = new FunctionCellExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				((FunctionCellExprContext)_localctx).operatorToker = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MMAX || _la==MMIN) ) {
					((FunctionCellExprContext)_localctx).operatorToker = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(62);
				match(LPAREN);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MMAX) | (1L << MMIN) | (1L << ID) | (1L << LPAREN))) != 0)) {
					{
					setState(63);
					id(0);
					setState(64);
					match(T__0);
					setState(65);
					id(0);
					}
				}

				setState(69);
				match(RPAREN);
				}
				break;
			case ID:
				{
				_localctx = new CellIDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivCellExprContext(new IdContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_id);
						setState(73);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(74);
						((MulDivCellExprContext)_localctx).operatorToker = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
							((MulDivCellExprContext)_localctx).operatorToker = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(75);
						id(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSumCellExprContext(new IdContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_id);
						setState(76);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(77);
						((AddSumCellExprContext)_localctx).operatorToker = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUB || _la==ADD) ) {
							((AddSumCellExprContext)_localctx).operatorToker = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(78);
						id(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpCellExprContext(new IdContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_id);
						setState(79);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(80);
						match(EXP);
						setState(81);
						id(4);
						}
						break;
					case 4:
						{
						_localctx = new ModDivCellExprContext(new IdContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_id);
						setState(82);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(83);
						((ModDivCellExprContext)_localctx).operatorToker = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MOD || _la==DIV) ) {
							((ModDivCellExprContext)_localctx).operatorToker = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						id(4);
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentsNumContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ArgumentsNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgumentsNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgumentsNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgumentsNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsNumContext argumentsNum() throws RecognitionException {
		ArgumentsNumContext _localctx = new ArgumentsNumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumentsNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			number(0);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(91);
				match(T__0);
				setState(92);
				number(0);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsIDContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ArgumentsIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgumentsID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgumentsID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgumentsID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsIDContext argumentsID() throws RecognitionException {
		ArgumentsIDContext _localctx = new ArgumentsIDContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argumentsID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			id(0);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(99);
				match(T__0);
				setState(100);
				id(0);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return number_sempred((NumberContext)_localctx, predIndex);
		case 3:
			return id_sempred((IdContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean id_sempred(IdContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\5\2\22\n\2\3\3\6\3\25\n"+
		"\3\r\3\16\3\26\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4$\n\4\3"+
		"\4\3\4\5\4(\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\66"+
		"\n\4\f\4\16\49\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5F\n"+
		"\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5X\n\5\f\5\16\5[\13\5\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3\7\3\7\3\7"+
		"\7\7h\n\7\f\7\16\7k\13\7\3\7\2\4\6\b\b\2\4\6\b\n\f\2\6\3\2\f\r\3\2\6\7"+
		"\3\2\b\t\3\2\n\13\2y\2\21\3\2\2\2\4\24\3\2\2\2\6\'\3\2\2\2\bI\3\2\2\2"+
		"\n\\\3\2\2\2\fd\3\2\2\2\16\22\5\4\3\2\17\22\5\6\4\2\20\22\5\b\5\2\21\16"+
		"\3\2\2\2\21\17\3\2\2\2\21\20\3\2\2\2\22\3\3\2\2\2\23\25\7\16\2\2\24\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\5\3\2\2\2\30\31"+
		"\b\4\1\2\31\32\7\22\2\2\32\33\5\6\4\2\33\34\7\23\2\2\34(\3\2\2\2\35\36"+
		"\t\2\2\2\36#\7\22\2\2\37 \5\6\4\2 !\7\3\2\2!\"\5\6\4\2\"$\3\2\2\2#\37"+
		"\3\2\2\2#$\3\2\2\2$%\3\2\2\2%(\7\23\2\2&(\7\4\2\2\'\30\3\2\2\2\'\35\3"+
		"\2\2\2\'&\3\2\2\2(\67\3\2\2\2)*\f\b\2\2*+\t\3\2\2+\66\5\6\4\t,-\f\7\2"+
		"\2-.\t\4\2\2.\66\5\6\4\b/\60\f\6\2\2\60\61\7\5\2\2\61\66\5\6\4\6\62\63"+
		"\f\5\2\2\63\64\t\5\2\2\64\66\5\6\4\6\65)\3\2\2\2\65,\3\2\2\2\65/\3\2\2"+
		"\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29\67"+
		"\3\2\2\2:;\b\5\1\2;<\7\22\2\2<=\5\b\5\2=>\7\23\2\2>J\3\2\2\2?@\t\2\2\2"+
		"@E\7\22\2\2AB\5\b\5\2BC\7\3\2\2CD\5\b\5\2DF\3\2\2\2EA\3\2\2\2EF\3\2\2"+
		"\2FG\3\2\2\2GJ\7\23\2\2HJ\7\21\2\2I:\3\2\2\2I?\3\2\2\2IH\3\2\2\2JY\3\2"+
		"\2\2KL\f\b\2\2LM\t\3\2\2MX\5\b\5\tNO\f\7\2\2OP\t\4\2\2PX\5\b\5\bQR\f\6"+
		"\2\2RS\7\5\2\2SX\5\b\5\6TU\f\5\2\2UV\t\5\2\2VX\5\b\5\6WK\3\2\2\2WN\3\2"+
		"\2\2WQ\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[Y\3"+
		"\2\2\2\\a\5\6\4\2]^\7\3\2\2^`\5\6\4\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab"+
		"\3\2\2\2b\13\3\2\2\2ca\3\2\2\2di\5\b\5\2ef\7\3\2\2fh\5\b\5\2ge\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki\3\2\2\2\16\21\26#\'\65\67"+
		"EIWYai";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}