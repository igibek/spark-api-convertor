// Generated from grmr.g4 by ANTLR 4.7.1

  package spark.dataset;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grmrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUMBER=16, 
		IDENTIFIER=17, STRING=18, CHAR=19, SYMBOL=20;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_more = 2, RULE_mod = 3, RULE_func = 4;
	public static final String[] ruleNames = {
		"prog", "start", "more", "mod", "func"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'\n'", "'sc'", "'.range('", "','", "')'", "'.textFile('", 
		"'.map'", "'('", "'.filter'", "'.reduce('", "'.reduceByKey('", "'.sortBy('", 
		"'.collect()'", "'=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NUMBER", "IDENTIFIER", "STRING", "CHAR", "SYMBOL"
	};
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
	public String getGrammarFileName() { return "grmr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grmrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(grmrParser.IDENTIFIER, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode EOF() { return getToken(grmrParser.EOF, 0); }
		public List<MoreContext> more() {
			return getRuleContexts(MoreContext.class);
		}
		public MoreContext more(int i) {
			return getRuleContext(MoreContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmrListener ) ((grmrListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmrListener ) ((grmrListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(IDENTIFIER);
				setState(11);
				match(T__0);
				setState(12);
				start();
				setState(16);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(13);
						match(T__1);
						}
						} 
					}
					setState(18);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(19);
					more();
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(25);
					match(T__1);
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(31);
				match(EOF);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				start();
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(34);
						match(T__1);
						}
						} 
					}
					setState(39);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(40);
					more();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(46);
					match(T__1);
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmrListener ) ((grmrListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmrListener ) ((grmrListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__2);
			setState(57);
			mod();
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					match(T__1);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class MoreContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(grmrParser.IDENTIFIER, 0); }
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public MoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmrListener ) ((grmrListener)listener).enterMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmrListener ) ((grmrListener)listener).exitMore(this);
		}
	}

	public final MoreContext more() throws RecognitionException {
		MoreContext _localctx = new MoreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_more);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IDENTIFIER);
			setState(65);
			mod();
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					match(T__1);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ModContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(grmrParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(grmrParser.NUMBER, i);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public TerminalNode STRING() { return getToken(grmrParser.STRING, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmrListener ) ((grmrListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmrListener ) ((grmrListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mod);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__3);
				setState(73);
				match(NUMBER);
				setState(74);
				match(T__4);
				setState(75);
				match(NUMBER);
				setState(76);
				match(T__5);
				setState(77);
				mod();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__6);
				setState(79);
				match(STRING);
				setState(80);
				match(T__5);
				setState(81);
				mod();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(T__7);
				setState(83);
				match(T__8);
				setState(84);
				func();
				setState(85);
				match(T__5);
				setState(86);
				mod();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(T__9);
				setState(89);
				match(T__8);
				setState(90);
				func();
				setState(91);
				match(T__5);
				setState(92);
				mod();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(T__10);
				setState(95);
				func();
				setState(96);
				match(T__5);
				setState(97);
				mod();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(T__11);
				setState(100);
				func();
				setState(101);
				match(T__5);
				setState(102);
				mod();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				match(T__12);
				setState(105);
				func();
				setState(106);
				match(T__5);
				setState(107);
				mod();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				match(T__13);
				setState(110);
				mod();
				}
				break;
			case EOF:
			case T__1:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 9);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FuncContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(grmrParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(grmrParser.IDENTIFIER, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(grmrParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(grmrParser.SYMBOL, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(grmrParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(grmrParser.NUMBER, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grmrListener ) ((grmrListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grmrListener ) ((grmrListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IDENTIFIER);
			setState(115);
			match(T__14);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << IDENTIFIER) | (1L << SYMBOL))) != 0)) {
				{
				{
				setState(116);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << IDENTIFIER) | (1L << SYMBOL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(121);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\2\7\2\27\n\2\f\2\16\2\32\13\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2"+
		"\3\2\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\5\29\n\2\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A"+
		"\13\3\3\4\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n"+
		"\5\3\6\3\6\3\6\7\6x\n\6\f\6\16\6{\13\6\3\6\2\2\7\2\4\6\b\n\2\3\4\2\22"+
		"\23\26\26\2\u0089\28\3\2\2\2\4:\3\2\2\2\6B\3\2\2\2\br\3\2\2\2\nt\3\2\2"+
		"\2\f\r\7\23\2\2\r\16\7\3\2\2\16\22\5\4\3\2\17\21\7\4\2\2\20\17\3\2\2\2"+
		"\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\30\3\2\2\2\24\22\3\2\2\2"+
		"\25\27\5\6\4\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2"+
		"\31\36\3\2\2\2\32\30\3\2\2\2\33\35\7\4\2\2\34\33\3\2\2\2\35 \3\2\2\2\36"+
		"\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\2\2\3\"9\3\2\2"+
		"\2#\'\5\4\3\2$&\7\4\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(-\3"+
		"\2\2\2)\'\3\2\2\2*,\5\6\4\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63"+
		"\3\2\2\2/-\3\2\2\2\60\62\7\4\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2"+
		"\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\2\2\3\679\3\2\2"+
		"\28\f\3\2\2\28#\3\2\2\29\3\3\2\2\2:;\7\5\2\2;?\5\b\5\2<>\7\4\2\2=<\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BC\7\23\2\2CG\5"+
		"\b\5\2DF\7\4\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IG"+
		"\3\2\2\2JK\7\6\2\2KL\7\22\2\2LM\7\7\2\2MN\7\22\2\2NO\7\b\2\2Os\5\b\5\2"+
		"PQ\7\t\2\2QR\7\24\2\2RS\7\b\2\2Ss\5\b\5\2TU\7\n\2\2UV\7\13\2\2VW\5\n\6"+
		"\2WX\7\b\2\2XY\5\b\5\2Ys\3\2\2\2Z[\7\f\2\2[\\\7\13\2\2\\]\5\n\6\2]^\7"+
		"\b\2\2^_\5\b\5\2_s\3\2\2\2`a\7\r\2\2ab\5\n\6\2bc\7\b\2\2cd\5\b\5\2ds\3"+
		"\2\2\2ef\7\16\2\2fg\5\n\6\2gh\7\b\2\2hi\5\b\5\2is\3\2\2\2jk\7\17\2\2k"+
		"l\5\n\6\2lm\7\b\2\2mn\5\b\5\2ns\3\2\2\2op\7\20\2\2ps\5\b\5\2qs\3\2\2\2"+
		"rJ\3\2\2\2rP\3\2\2\2rT\3\2\2\2rZ\3\2\2\2r`\3\2\2\2re\3\2\2\2rj\3\2\2\2"+
		"ro\3\2\2\2rq\3\2\2\2s\t\3\2\2\2tu\7\23\2\2uy\7\21\2\2vx\t\2\2\2wv\3\2"+
		"\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\13\3\2\2\2{y\3\2\2\2\r\22\30\36\'"+
		"-\638?Gry";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}