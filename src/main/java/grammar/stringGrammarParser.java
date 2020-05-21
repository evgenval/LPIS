// Generated from C:/Users/Acer/Downloads/lpis/StringZhenya/src\stringGrammar.g4 by ANTLR 4.8

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class stringGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, CHAR=3, STRING_TYPE=4, STRING_ARRAY=5, OPAR=6, CPAR=7, 
		OBRACKET=8, CBRACKET=9, SQ_O_BRACKET=10, SQ_C_BRACKET=11, COLON=12, NEGATION=13, 
		EQ=14, NEQ=15, IS=16, PLUS=17, MOD=18, MUL=19, SUB=20, IN=21, PRINT=22, 
		IF=23, ELSE=24, WHILE=25, FOREACH=26, MAIN=27, FUNCTION=28, RETURN=29, 
		ID=30, STRING=31, COMMENT=32, SPACES=33, SYMBOL=34;
	public static final int
		RULE_parse = 0, RULE_main = 1, RULE_start = 2, RULE_instruction = 3, RULE_expr = 4, 
		RULE_create = 5, RULE_create_char = 6, RULE_create_string = 7, RULE_create_stringArray = 8, 
		RULE_name_object_stringArray = 9, RULE_name_object_string = 10, RULE_name_object_char = 11, 
		RULE_if_stat = 12, RULE_condition_block = 13, RULE_stat_block = 14, RULE_while_stat = 15, 
		RULE_foreach_stat = 16, RULE_condition = 17, RULE_condition_for_each = 18, 
		RULE_print = 19, RULE_print_expr = 20, RULE_function_call = 21, RULE_param_call = 22, 
		RULE_arg_call = 23, RULE_function = 24, RULE_stat_block_with_return = 25, 
		RULE_return_id = 26, RULE_param = 27, RULE_arg = 28, RULE_type = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "main", "start", "instruction", "expr", "create", "create_char", 
			"create_string", "create_stringArray", "name_object_stringArray", "name_object_string", 
			"name_object_char", "if_stat", "condition_block", "stat_block", "while_stat", 
			"foreach_stat", "condition", "condition_for_each", "print", "print_expr", 
			"function_call", "param_call", "arg_call", "function", "stat_block_with_return", 
			"return_id", "param", "arg", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'char'", "'string'", "'stringArray'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "':'", "'!'", "'=='", "'!='", "'is'", "'+'", 
			"'/'", "'*'", "'-'", "'in'", "'print'", "'if'", "'else'", "'while'", 
			"'forEach'", "'main'", "'fun'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSIGN", "CHAR", "STRING_TYPE", "STRING_ARRAY", "OPAR", 
			"CPAR", "OBRACKET", "CBRACKET", "SQ_O_BRACKET", "SQ_C_BRACKET", "COLON", 
			"NEGATION", "EQ", "NEQ", "IS", "PLUS", "MOD", "MUL", "SUB", "IN", "PRINT", 
			"IF", "ELSE", "WHILE", "FOREACH", "MAIN", "FUNCTION", "RETURN", "ID", 
			"STRING", "COMMENT", "SPACES", "SYMBOL"
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
	public String getGrammarFileName() { return "stringGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public stringGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(stringGrammarParser.EOF, 0); }
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << STRING_TYPE) | (1L << STRING_ARRAY) | (1L << ID))) != 0)) {
				{
				{
				setState(60);
				create();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(66);
				function();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			main();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(73);
				function();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(EOF);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(stringGrammarParser.MAIN, 0); }
		public TerminalNode OBRACKET() { return getToken(stringGrammarParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(stringGrammarParser.CBRACKET, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(MAIN);
			setState(82);
			match(OBRACKET);
			setState(83);
			start();
			setState(84);
			match(CBRACKET);
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

	public static class StartContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << STRING_TYPE) | (1L << STRING_ARRAY) | (1L << OPAR) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << FOREACH) | (1L << ID))) != 0)) {
				{
				{
				setState(86);
				instruction();
				}
				}
				setState(91);
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

	public static class InstructionContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Foreach_statContext foreach_stat() {
			return getRuleContext(Foreach_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				create();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				if_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				while_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				foreach_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				function_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ModMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(stringGrammarParser.PLUS, 0); }
		public TerminalNode MOD() { return getToken(stringGrammarParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(stringGrammarParser.MUL, 0); }
		public TerminalNode SUB() { return getToken(stringGrammarParser.SUB, 0); }
		public ModMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterModMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitModMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitModMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConversionContext extends ExprContext {
		public Token tp;
		public TerminalNode OPAR() { return getToken(stringGrammarParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(stringGrammarParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING_TYPE() { return getToken(stringGrammarParser.STRING_TYPE, 0); }
		public TypeConversionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitTypeConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(stringGrammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(102);
				match(OPAR);
				setState(103);
				((TypeConversionContext)_localctx).tp = match(STRING_TYPE);
				setState(104);
				match(CPAR);
				setState(105);
				expr(3);
				}
				break;
			case 2:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(ID);
				setState(108);
				match(ASSIGN);
				setState(109);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ModMulDivContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(112);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(113);
					((ModMulDivContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MOD) | (1L << MUL) | (1L << SUB))) != 0)) ) {
						((ModMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(114);
					expr(5);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class CreateContext extends ParserRuleContext {
		public Create_stringContext create_string() {
			return getRuleContext(Create_stringContext.class,0);
		}
		public Create_charContext create_char() {
			return getRuleContext(Create_charContext.class,0);
		}
		public Create_stringArrayContext create_stringArray() {
			return getRuleContext(Create_stringArrayContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				create_string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				create_char();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				create_stringArray();
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

	public static class Create_charContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(stringGrammarParser.ASSIGN, 0); }
		public Name_object_charContext name_object_char() {
			return getRuleContext(Name_object_charContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(stringGrammarParser.CHAR, 0); }
		public Create_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCreate_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCreate_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCreate_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_charContext create_char() throws RecognitionException {
		Create_charContext _localctx = new Create_charContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHAR) {
				{
				setState(125);
				match(CHAR);
				}
			}

			setState(128);
			match(ID);
			setState(129);
			match(ASSIGN);
			setState(130);
			name_object_char();
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

	public static class Create_stringContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(stringGrammarParser.ASSIGN, 0); }
		public Name_object_stringContext name_object_string() {
			return getRuleContext(Name_object_stringContext.class,0);
		}
		public TerminalNode STRING_TYPE() { return getToken(stringGrammarParser.STRING_TYPE, 0); }
		public Create_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCreate_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCreate_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCreate_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_stringContext create_string() throws RecognitionException {
		Create_stringContext _localctx = new Create_stringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_TYPE) {
				{
				setState(132);
				match(STRING_TYPE);
				}
			}

			setState(135);
			match(ID);
			setState(136);
			match(ASSIGN);
			setState(137);
			name_object_string();
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

	public static class Create_stringArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(stringGrammarParser.ASSIGN, 0); }
		public Name_object_stringArrayContext name_object_stringArray() {
			return getRuleContext(Name_object_stringArrayContext.class,0);
		}
		public TerminalNode STRING_ARRAY() { return getToken(stringGrammarParser.STRING_ARRAY, 0); }
		public Create_stringArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_stringArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCreate_stringArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCreate_stringArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCreate_stringArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_stringArrayContext create_stringArray() throws RecognitionException {
		Create_stringArrayContext _localctx = new Create_stringArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_stringArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_ARRAY) {
				{
				setState(139);
				match(STRING_ARRAY);
				}
			}

			setState(142);
			match(ID);
			setState(143);
			match(ASSIGN);
			setState(144);
			name_object_stringArray();
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

	public static class Name_object_stringArrayContext extends ParserRuleContext {
		public Name_object_stringArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_stringArray; }
	 
		public Name_object_stringArrayContext() { }
		public void copyFrom(Name_object_stringArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdArrayContext extends Name_object_stringArrayContext {
		public TerminalNode SQ_O_BRACKET() { return getToken(stringGrammarParser.SQ_O_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(stringGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(stringGrammarParser.ID, i);
		}
		public TerminalNode SQ_C_BRACKET() { return getToken(stringGrammarParser.SQ_C_BRACKET, 0); }
		public IdArrayContext(Name_object_stringArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterIdArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitIdArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitIdArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrArrayContext extends Name_object_stringArrayContext {
		public TerminalNode SQ_O_BRACKET() { return getToken(stringGrammarParser.SQ_O_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(stringGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(stringGrammarParser.STRING, i);
		}
		public TerminalNode SQ_C_BRACKET() { return getToken(stringGrammarParser.SQ_C_BRACKET, 0); }
		public StrArrayContext(Name_object_stringArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterStrArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitStrArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitStrArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallArrayContext extends Name_object_stringArrayContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallArrayContext(Name_object_stringArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterFunctionCallArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitFunctionCallArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitFunctionCallArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyArrayContext extends Name_object_stringArrayContext {
		public TerminalNode SQ_O_BRACKET() { return getToken(stringGrammarParser.SQ_O_BRACKET, 0); }
		public TerminalNode SQ_C_BRACKET() { return getToken(stringGrammarParser.SQ_C_BRACKET, 0); }
		public EmptyArrayContext(Name_object_stringArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterEmptyArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitEmptyArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitEmptyArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_stringArrayContext name_object_stringArray() throws RecognitionException {
		Name_object_stringArrayContext _localctx = new Name_object_stringArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_name_object_stringArray);
		try {
			int _alt;
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new EmptyArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(146);
				match(SQ_O_BRACKET);
				setState(147);
				match(SQ_C_BRACKET);
				}
				}
				break;
			case 2:
				_localctx = new IdArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(148);
				match(SQ_O_BRACKET);
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						match(ID);
						setState(150);
						match(T__0);
						}
						} 
					}
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(156);
				match(ID);
				setState(157);
				match(SQ_C_BRACKET);
				}
				}
				break;
			case 3:
				_localctx = new StrArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(158);
				match(SQ_O_BRACKET);
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(159);
						match(STRING);
						setState(160);
						match(T__0);
						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(166);
				match(STRING);
				setState(167);
				match(SQ_C_BRACKET);
				}
				}
				break;
			case 4:
				_localctx = new FunctionCallArrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				function_call();
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

	public static class Name_object_stringContext extends ParserRuleContext {
		public Name_object_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_string; }
	 
		public Name_object_stringContext() { }
		public void copyFrom(Name_object_stringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectStringContext extends Name_object_stringContext {
		public TerminalNode STRING() { return getToken(stringGrammarParser.STRING, 0); }
		public NameObjectStringContext(Name_object_stringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterNameObjectString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitNameObjectString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitNameObjectString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallStringContext extends Name_object_stringContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallStringContext(Name_object_stringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterFunctionCallString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitFunctionCallString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitFunctionCallString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringContext extends Name_object_stringContext {
		public Token op;
		public TerminalNode SQ_O_BRACKET() { return getToken(stringGrammarParser.SQ_O_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(stringGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(stringGrammarParser.STRING, i);
		}
		public TerminalNode SQ_C_BRACKET() { return getToken(stringGrammarParser.SQ_C_BRACKET, 0); }
		public TerminalNode PLUS() { return getToken(stringGrammarParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(stringGrammarParser.SUB, 0); }
		public TerminalNode MOD() { return getToken(stringGrammarParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(stringGrammarParser.MUL, 0); }
		public ExprStringContext(Name_object_stringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdStringContext extends Name_object_stringContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public IdStringContext(Name_object_stringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterIdString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitIdString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitIdString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdContext extends Name_object_stringContext {
		public Token op;
		public TerminalNode SQ_O_BRACKET() { return getToken(stringGrammarParser.SQ_O_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(stringGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(stringGrammarParser.ID, i);
		}
		public TerminalNode SQ_C_BRACKET() { return getToken(stringGrammarParser.SQ_C_BRACKET, 0); }
		public TerminalNode PLUS() { return getToken(stringGrammarParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(stringGrammarParser.SUB, 0); }
		public TerminalNode MOD() { return getToken(stringGrammarParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(stringGrammarParser.MUL, 0); }
		public ExprIdContext(Name_object_stringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterExprId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitExprId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitExprId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_stringContext name_object_string() throws RecognitionException {
		Name_object_stringContext _localctx = new Name_object_stringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name_object_string);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new NameObjectStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new FunctionCallStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				function_call();
				}
				break;
			case 3:
				_localctx = new ExprIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(SQ_O_BRACKET);
				setState(174);
				match(ID);
				setState(175);
				((ExprIdContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MOD) | (1L << MUL) | (1L << SUB))) != 0)) ) {
					((ExprIdContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				match(ID);
				setState(177);
				match(SQ_C_BRACKET);
				}
				break;
			case 4:
				_localctx = new ExprStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(SQ_O_BRACKET);
				setState(179);
				match(STRING);
				setState(180);
				((ExprStringContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MOD) | (1L << MUL) | (1L << SUB))) != 0)) ) {
					((ExprStringContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				match(STRING);
				setState(182);
				match(SQ_C_BRACKET);
				}
				break;
			case 5:
				_localctx = new IdStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(ID);
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

	public static class Name_object_charContext extends ParserRuleContext {
		public Name_object_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_char; }
	 
		public Name_object_charContext() { }
		public void copyFrom(Name_object_charContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectCharContext extends Name_object_charContext {
		public TerminalNode SYMBOL() { return getToken(stringGrammarParser.SYMBOL, 0); }
		public NameObjectCharContext(Name_object_charContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterNameObjectChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitNameObjectChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitNameObjectChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallCharContext extends Name_object_charContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallCharContext(Name_object_charContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterFunctionCallChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitFunctionCallChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitFunctionCallChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdCharContext extends Name_object_charContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public IdCharContext(Name_object_charContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterIdChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitIdChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitIdChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_charContext name_object_char() throws RecognitionException {
		Name_object_charContext _localctx = new Name_object_charContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name_object_char);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new NameObjectCharContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(SYMBOL);
				}
				break;
			case 2:
				_localctx = new FunctionCallCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				function_call();
				}
				break;
			case 3:
				_localctx = new IdCharContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(ID);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(stringGrammarParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(stringGrammarParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(stringGrammarParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(stringGrammarParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IF);
			setState(192);
			condition_block();
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					match(ELSE);
					setState(194);
					match(IF);
					setState(195);
					condition_block();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(201);
				match(ELSE);
				setState(202);
				stat_block();
				}
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(stringGrammarParser.OPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(stringGrammarParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(stringGrammarParser.NEGATION, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(OPAR);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(206);
				match(NEGATION);
				}
			}

			setState(209);
			condition();
			setState(210);
			match(CPAR);
			setState(211);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(stringGrammarParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(stringGrammarParser.CBRACKET, 0); }
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(OBRACKET);
			setState(214);
			start();
			setState(215);
			match(CBRACKET);
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(stringGrammarParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(WHILE);
			setState(218);
			condition_block();
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

	public static class Foreach_statContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(stringGrammarParser.FOREACH, 0); }
		public TerminalNode OPAR() { return getToken(stringGrammarParser.OPAR, 0); }
		public Condition_for_eachContext condition_for_each() {
			return getRuleContext(Condition_for_eachContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(stringGrammarParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Foreach_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterForeach_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitForeach_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitForeach_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_statContext foreach_stat() throws RecognitionException {
		Foreach_statContext _localctx = new Foreach_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_foreach_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(FOREACH);
			setState(221);
			match(OPAR);
			setState(222);
			condition_for_each();
			setState(223);
			match(CPAR);
			setState(224);
			stat_block();
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityExprContext extends ConditionContext {
		public Token op;
		public List<TerminalNode> ID() { return getTokens(stringGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(stringGrammarParser.ID, i);
		}
		public TerminalNode EQ() { return getToken(stringGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(stringGrammarParser.NEQ, 0); }
		public EqualityExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		int _la;
		try {
			_localctx = new EqualityExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			setState(227);
			((EqualityExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NEQ) ) {
				((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(228);
			match(ID);
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

	public static class Condition_for_eachContext extends ParserRuleContext {
		public Condition_for_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_for_each; }
	 
		public Condition_for_eachContext() { }
		public void copyFrom(Condition_for_eachContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForEachElementContext extends Condition_for_eachContext {
		public Token op;
		public List<TerminalNode> ID() { return getTokens(stringGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(stringGrammarParser.ID, i);
		}
		public TerminalNode IN() { return getToken(stringGrammarParser.IN, 0); }
		public TerminalNode STRING_TYPE() { return getToken(stringGrammarParser.STRING_TYPE, 0); }
		public TerminalNode CHAR() { return getToken(stringGrammarParser.CHAR, 0); }
		public ForEachElementContext(Condition_for_eachContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterForEachElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitForEachElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitForEachElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_for_eachContext condition_for_each() throws RecognitionException {
		Condition_for_eachContext _localctx = new Condition_for_eachContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition_for_each);
		int _la;
		try {
			_localctx = new ForEachElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((ForEachElementContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==STRING_TYPE) ) {
				((ForEachElementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(231);
			match(ID);
			setState(232);
			match(IN);
			setState(233);
			match(ID);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(stringGrammarParser.PRINT, 0); }
		public Print_exprContext print_expr() {
			return getRuleContext(Print_exprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(PRINT);
			setState(236);
			print_expr(0);
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

	public static class Print_exprContext extends ParserRuleContext {
		public Print_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expr; }
	 
		public Print_exprContext() { }
		public void copyFrom(Print_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcatStringContext extends Print_exprContext {
		public List<Print_exprContext> print_expr() {
			return getRuleContexts(Print_exprContext.class);
		}
		public Print_exprContext print_expr(int i) {
			return getRuleContext(Print_exprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(stringGrammarParser.PLUS, 0); }
		public ConcatStringContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterConcatString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitConcatString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitConcatString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIdContext extends Print_exprContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public PrintIdContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterPrintId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitPrintId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStringContext extends Print_exprContext {
		public TerminalNode STRING() { return getToken(stringGrammarParser.STRING, 0); }
		public PrintStringContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterPrintString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitPrintString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitPrintString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_exprContext print_expr() throws RecognitionException {
		return print_expr(0);
	}

	private Print_exprContext print_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Print_exprContext _localctx = new Print_exprContext(_ctx, _parentState);
		Print_exprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_print_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new PrintIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(239);
				match(ID);
				}
				break;
			case STRING:
				{
				_localctx = new PrintStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatStringContext(new Print_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_print_expr);
					setState(243);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(244);
					match(PLUS);
					setState(245);
					print_expr(4);
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ID);
			setState(252);
			param_call();
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

	public static class Param_callContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(stringGrammarParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(stringGrammarParser.CPAR, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParam_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParam_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_param_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(OPAR);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(255);
				arg_call();
				}
			}

			setState(258);
			match(CPAR);
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

	public static class Arg_callContext extends ParserRuleContext {
		public Arg_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_call; }
	 
		public Arg_callContext() { }
		public void copyFrom(Arg_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamCallArgsContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public ParamCallArgsContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParamCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParamCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParamCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamCallArgContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public ParamCallArgContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParamCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParamCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParamCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_callContext arg_call() throws RecognitionException {
		Arg_callContext _localctx = new Arg_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arg_call);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ParamCallArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamCallArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(ID);
				setState(262);
				match(T__0);
				setState(263);
				arg_call();
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(stringGrammarParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_block_with_returnContext stat_block_with_return() {
			return getRuleContext(Stat_block_with_returnContext.class,0);
		}
		public ReturnFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterReturnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitReturnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(stringGrammarParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public VoidFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(FUNCTION);
				setState(267);
				match(ID);
				setState(268);
				param();
				setState(269);
				stat_block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(FUNCTION);
				setState(272);
				type();
				setState(273);
				match(ID);
				setState(274);
				param();
				setState(275);
				stat_block_with_return();
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

	public static class Stat_block_with_returnContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(stringGrammarParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Return_idContext return_id() {
			return getRuleContext(Return_idContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(stringGrammarParser.CBRACKET, 0); }
		public Stat_block_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterStat_block_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitStat_block_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitStat_block_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_block_with_returnContext stat_block_with_return() throws RecognitionException {
		Stat_block_with_returnContext _localctx = new Stat_block_with_returnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stat_block_with_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(OBRACKET);
			setState(280);
			start();
			setState(281);
			return_id();
			setState(282);
			match(CBRACKET);
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

	public static class Return_idContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(stringGrammarParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public Return_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterReturn_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitReturn_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitReturn_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_idContext return_id() throws RecognitionException {
		Return_idContext _localctx = new Return_idContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(RETURN);
			setState(285);
			match(ID);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(stringGrammarParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(stringGrammarParser.CPAR, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(OPAR);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << STRING_TYPE) | (1L << STRING_ARRAY))) != 0)) {
				{
				setState(288);
				arg();
				}
			}

			setState(291);
			match(CPAR);
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

	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamArgsContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamArgsContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParamArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParamArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParamArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamArgContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(stringGrammarParser.ID, 0); }
		public ParamArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterParamArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitParamArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitParamArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arg);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ParamArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				type();
				setState(294);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				type();
				setState(297);
				match(ID);
				setState(298);
				match(T__0);
				setState(299);
				arg();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(stringGrammarParser.STRING_TYPE, 0); }
		public TerminalNode CHAR() { return getToken(stringGrammarParser.CHAR, 0); }
		public TerminalNode STRING_ARRAY() { return getToken(stringGrammarParser.STRING_ARRAY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof stringGrammarListener ) ((stringGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof stringGrammarVisitor ) return ((stringGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << STRING_TYPE) | (1L << STRING_ARRAY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 20:
			return print_expr_sempred((Print_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean print_expr_sempred(Print_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0134\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\7\2M\n\2\f\2\16"+
		"\2P\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6q\n\6\3\6\3\6\3\6\7\6v\n\6\f\6\16\6y\13\6\3\7\3\7\3\7\5\7~\n\7\3\b\5"+
		"\b\u0081\n\b\3\b\3\b\3\b\3\b\3\t\5\t\u0088\n\t\3\t\3\t\3\t\3\t\3\n\5\n"+
		"\u008f\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u009a\n\13\f"+
		"\13\16\13\u009d\13\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a4\n\13\f\13\16"+
		"\13\u00a7\13\13\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bb\n\f\3\r\3\r\3\r\5\r\u00c0\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u00c7\n\16\f\16\16\16\u00ca\13\16\3\16\3"+
		"\16\5\16\u00ce\n\16\3\17\3\17\5\17\u00d2\n\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\5\26"+
		"\u00f4\n\26\3\26\3\26\3\26\7\26\u00f9\n\26\f\26\16\26\u00fc\13\26\3\27"+
		"\3\27\3\27\3\30\3\30\5\30\u0103\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31"+
		"\u010b\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0118\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\5\35\u0124"+
		"\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0130\n\36"+
		"\3\37\3\37\3\37\2\4\n* \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<\2\6\3\2\23\26\3\2\20\21\3\2\5\6\3\2\5\7\2\u013c\2A\3"+
		"\2\2\2\4S\3\2\2\2\6[\3\2\2\2\be\3\2\2\2\np\3\2\2\2\f}\3\2\2\2\16\u0080"+
		"\3\2\2\2\20\u0087\3\2\2\2\22\u008e\3\2\2\2\24\u00ab\3\2\2\2\26\u00ba\3"+
		"\2\2\2\30\u00bf\3\2\2\2\32\u00c1\3\2\2\2\34\u00cf\3\2\2\2\36\u00d7\3\2"+
		"\2\2 \u00db\3\2\2\2\"\u00de\3\2\2\2$\u00e4\3\2\2\2&\u00e8\3\2\2\2(\u00ed"+
		"\3\2\2\2*\u00f3\3\2\2\2,\u00fd\3\2\2\2.\u0100\3\2\2\2\60\u010a\3\2\2\2"+
		"\62\u0117\3\2\2\2\64\u0119\3\2\2\2\66\u011e\3\2\2\28\u0121\3\2\2\2:\u012f"+
		"\3\2\2\2<\u0131\3\2\2\2>@\5\f\7\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2BG\3\2\2\2CA\3\2\2\2DF\5\62\32\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3"+
		"\2\2\2HJ\3\2\2\2IG\3\2\2\2JN\5\4\3\2KM\5\62\32\2LK\3\2\2\2MP\3\2\2\2N"+
		"L\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\2\2\3R\3\3\2\2\2ST\7\35\2"+
		"\2TU\7\n\2\2UV\5\6\4\2VW\7\13\2\2W\5\3\2\2\2XZ\5\b\5\2YX\3\2\2\2Z]\3\2"+
		"\2\2[Y\3\2\2\2[\\\3\2\2\2\\\7\3\2\2\2][\3\2\2\2^f\5\f\7\2_f\5(\25\2`f"+
		"\5\32\16\2af\5 \21\2bf\5\"\22\2cf\5,\27\2df\5\n\6\2e^\3\2\2\2e_\3\2\2"+
		"\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\t\3\2\2\2gh\b\6"+
		"\1\2hi\7\b\2\2ij\7\6\2\2jk\7\t\2\2kq\5\n\6\5lq\7 \2\2mn\7 \2\2no\7\4\2"+
		"\2oq\5\n\6\3pg\3\2\2\2pl\3\2\2\2pm\3\2\2\2qw\3\2\2\2rs\f\6\2\2st\t\2\2"+
		"\2tv\5\n\6\7ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\13\3\2\2\2yw\3\2"+
		"\2\2z~\5\20\t\2{~\5\16\b\2|~\5\22\n\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\r"+
		"\3\2\2\2\177\u0081\7\5\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7 \2\2\u0083\u0084\7\4\2\2\u0084\u0085\5\30"+
		"\r\2\u0085\17\3\2\2\2\u0086\u0088\7\6\2\2\u0087\u0086\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7 \2\2\u008a\u008b\7\4\2\2\u008b"+
		"\u008c\5\26\f\2\u008c\21\3\2\2\2\u008d\u008f\7\7\2\2\u008e\u008d\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7 \2\2\u0091\u0092"+
		"\7\4\2\2\u0092\u0093\5\24\13\2\u0093\23\3\2\2\2\u0094\u0095\7\f\2\2\u0095"+
		"\u00ac\7\r\2\2\u0096\u009b\7\f\2\2\u0097\u0098\7 \2\2\u0098\u009a\7\3"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7 "+
		"\2\2\u009f\u00ac\7\r\2\2\u00a0\u00a5\7\f\2\2\u00a1\u00a2\7!\2\2\u00a2"+
		"\u00a4\7\3\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7!\2\2\u00a9\u00ac\7\r\2\2\u00aa\u00ac\5,\27\2\u00ab\u0094\3\2"+
		"\2\2\u00ab\u0096\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\25\3\2\2\2\u00ad\u00bb\7!\2\2\u00ae\u00bb\5,\27\2\u00af\u00b0\7\f\2\2"+
		"\u00b0\u00b1\7 \2\2\u00b1\u00b2\t\2\2\2\u00b2\u00b3\7 \2\2\u00b3\u00bb"+
		"\7\r\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\7!\2\2\u00b6\u00b7\t\2\2\2\u00b7"+
		"\u00b8\7!\2\2\u00b8\u00bb\7\r\2\2\u00b9\u00bb\7 \2\2\u00ba\u00ad\3\2\2"+
		"\2\u00ba\u00ae\3\2\2\2\u00ba\u00af\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00c0\7$\2\2\u00bd\u00c0\5,\27\2\u00be"+
		"\u00c0\7 \2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\31\3\2\2\2\u00c1\u00c2\7\31\2\2\u00c2\u00c8\5\34\17\2\u00c3"+
		"\u00c4\7\32\2\2\u00c4\u00c5\7\31\2\2\u00c5\u00c7\5\34\17\2\u00c6\u00c3"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cd\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\32\2\2\u00cc\u00ce\5"+
		"\36\20\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\33\3\2\2\2\u00cf"+
		"\u00d1\7\b\2\2\u00d0\u00d2\7\17\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\5$\23\2\u00d4\u00d5\7\t\2\2\u00d5"+
		"\u00d6\5\36\20\2\u00d6\35\3\2\2\2\u00d7\u00d8\7\n\2\2\u00d8\u00d9\5\6"+
		"\4\2\u00d9\u00da\7\13\2\2\u00da\37\3\2\2\2\u00db\u00dc\7\33\2\2\u00dc"+
		"\u00dd\5\34\17\2\u00dd!\3\2\2\2\u00de\u00df\7\34\2\2\u00df\u00e0\7\b\2"+
		"\2\u00e0\u00e1\5&\24\2\u00e1\u00e2\7\t\2\2\u00e2\u00e3\5\36\20\2\u00e3"+
		"#\3\2\2\2\u00e4\u00e5\7 \2\2\u00e5\u00e6\t\3\2\2\u00e6\u00e7\7 \2\2\u00e7"+
		"%\3\2\2\2\u00e8\u00e9\t\4\2\2\u00e9\u00ea\7 \2\2\u00ea\u00eb\7\27\2\2"+
		"\u00eb\u00ec\7 \2\2\u00ec\'\3\2\2\2\u00ed\u00ee\7\30\2\2\u00ee\u00ef\5"+
		"*\26\2\u00ef)\3\2\2\2\u00f0\u00f1\b\26\1\2\u00f1\u00f4\7 \2\2\u00f2\u00f4"+
		"\7!\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00fa\3\2\2\2\u00f5"+
		"\u00f6\f\5\2\2\u00f6\u00f7\7\23\2\2\u00f7\u00f9\5*\26\6\u00f8\u00f5\3"+
		"\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"+\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7 \2\2\u00fe\u00ff\5.\30\2\u00ff"+
		"-\3\2\2\2\u0100\u0102\7\b\2\2\u0101\u0103\5\60\31\2\u0102\u0101\3\2\2"+
		"\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\t\2\2\u0105/"+
		"\3\2\2\2\u0106\u010b\7 \2\2\u0107\u0108\7 \2\2\u0108\u0109\7\3\2\2\u0109"+
		"\u010b\5\60\31\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2\2\2\u010b\61\3\2"+
		"\2\2\u010c\u010d\7\36\2\2\u010d\u010e\7 \2\2\u010e\u010f\58\35\2\u010f"+
		"\u0110\5\36\20\2\u0110\u0118\3\2\2\2\u0111\u0112\7\36\2\2\u0112\u0113"+
		"\5<\37\2\u0113\u0114\7 \2\2\u0114\u0115\58\35\2\u0115\u0116\5\64\33\2"+
		"\u0116\u0118\3\2\2\2\u0117\u010c\3\2\2\2\u0117\u0111\3\2\2\2\u0118\63"+
		"\3\2\2\2\u0119\u011a\7\n\2\2\u011a\u011b\5\6\4\2\u011b\u011c\5\66\34\2"+
		"\u011c\u011d\7\13\2\2\u011d\65\3\2\2\2\u011e\u011f\7\37\2\2\u011f\u0120"+
		"\7 \2\2\u0120\67\3\2\2\2\u0121\u0123\7\b\2\2\u0122\u0124\5:\36\2\u0123"+
		"\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\t"+
		"\2\2\u01269\3\2\2\2\u0127\u0128\5<\37\2\u0128\u0129\7 \2\2\u0129\u0130"+
		"\3\2\2\2\u012a\u012b\5<\37\2\u012b\u012c\7 \2\2\u012c\u012d\7\3\2\2\u012d"+
		"\u012e\5:\36\2\u012e\u0130\3\2\2\2\u012f\u0127\3\2\2\2\u012f\u012a\3\2"+
		"\2\2\u0130;\3\2\2\2\u0131\u0132\t\5\2\2\u0132=\3\2\2\2\34AGN[epw}\u0080"+
		"\u0087\u008e\u009b\u00a5\u00ab\u00ba\u00bf\u00c8\u00cd\u00d1\u00f3\u00fa"+
		"\u0102\u010a\u0117\u0123\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}