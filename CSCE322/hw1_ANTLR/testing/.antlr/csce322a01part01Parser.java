// Generated from c:\Users\Nasi\Desktop\FALL2019\CSCE322\homeworks\hw1\testing\csce322a01part01.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322a01part01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTIONBEGIN=1, SECTIONEND=2, SECTIONTITLE=3, ASSIGNVALUE=4, MOVES=5, 
		MAZE=6, NUM=7, UNDERSCORE=8, ROWEND=9, MAZEBEGIN=10, MAZEEND=11, LISTBEGIN=12, 
		LISTEND=13, WS=14, ANYTHING=15;
	public static final int
		RULE_mazeGame = 0, RULE_moves = 1, RULE_maze = 2, RULE_moveSymbol = 3, 
		RULE_mazeSymbol = 4, RULE_sectionTitle = 5, RULE_sectionBegin = 6, RULE_sectionEnd = 7, 
		RULE_listBegin = 8, RULE_listEnd = 9, RULE_mazeBegin = 10, RULE_mazeEnd = 11, 
		RULE_moveChar = 12, RULE_mazeChar = 13, RULE_endRow = 14, RULE_assignval = 15, 
		RULE_number = 16, RULE_error = 17;
	public static final String[] ruleNames = {
		"mazeGame", "moves", "maze", "moveSymbol", "mazeSymbol", "sectionTitle", 
		"sectionBegin", "sectionEnd", "listBegin", "listEnd", "mazeBegin", "mazeEnd", 
		"moveChar", "mazeChar", "endRow", "assignval", "number", "error"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", null, "'@'", null, null, null, "'_'", "'$'", "'('", 
		"')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SECTIONBEGIN", "SECTIONEND", "SECTIONTITLE", "ASSIGNVALUE", "MOVES", 
		"MAZE", "NUM", "UNDERSCORE", "ROWEND", "MAZEBEGIN", "MAZEEND", "LISTBEGIN", 
		"LISTEND", "WS", "ANYTHING"
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
	public String getGrammarFileName() { return "csce322a01part01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322a01part01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MazeGameContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(csce322a01part01Parser.EOF, 0); }
		public MazeContext maze() {
			return getRuleContext(MazeContext.class,0);
		}
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public MazeGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazeGame; }
	}

	public final MazeGameContext mazeGame() throws RecognitionException {
		MazeGameContext _localctx = new MazeGameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mazeGame);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					{
					setState(36);
					maze();
					setState(37);
					moves();
					}
					}
					break;
				case 2:
					{
					{
					setState(39);
					moves();
					setState(40);
					maze();
					}
					}
					break;
				}
				setState(44);
				match(EOF);
				System.out.println("File Ending");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(EOF);
				System.out.println("File Ending");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				error();
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

	public static class MovesContext extends ParserRuleContext {
		public SectionBeginContext sectionBegin() {
			return getRuleContext(SectionBeginContext.class,0);
		}
		public SectionTitleContext sectionTitle() {
			return getRuleContext(SectionTitleContext.class,0);
		}
		public AssignvalContext assignval() {
			return getRuleContext(AssignvalContext.class,0);
		}
		public ListBeginContext listBegin() {
			return getRuleContext(ListBeginContext.class,0);
		}
		public ListEndContext listEnd() {
			return getRuleContext(ListEndContext.class,0);
		}
		public SectionEndContext sectionEnd() {
			return getRuleContext(SectionEndContext.class,0);
		}
		public List<MoveSymbolContext> moveSymbol() {
			return getRuleContexts(MoveSymbolContext.class);
		}
		public MoveSymbolContext moveSymbol(int i) {
			return getRuleContext(MoveSymbolContext.class,i);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public MovesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moves; }
	}

	public final MovesContext moves() throws RecognitionException {
		MovesContext _localctx = new MovesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moves);
		try {
			int _alt;
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				sectionBegin();
				setState(53);
				sectionTitle();
				setState(54);
				assignval();
				setState(55);
				listBegin();
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(56);
						moveSymbol();
						}
						} 
					}
					setState(61);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(62);
				listEnd();
				setState(63);
				sectionEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				error();
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

	public static class MazeContext extends ParserRuleContext {
		public SectionBeginContext sectionBegin() {
			return getRuleContext(SectionBeginContext.class,0);
		}
		public SectionTitleContext sectionTitle() {
			return getRuleContext(SectionTitleContext.class,0);
		}
		public AssignvalContext assignval() {
			return getRuleContext(AssignvalContext.class,0);
		}
		public MazeBeginContext mazeBegin() {
			return getRuleContext(MazeBeginContext.class,0);
		}
		public MazeEndContext mazeEnd() {
			return getRuleContext(MazeEndContext.class,0);
		}
		public SectionEndContext sectionEnd() {
			return getRuleContext(SectionEndContext.class,0);
		}
		public List<MazeSymbolContext> mazeSymbol() {
			return getRuleContexts(MazeSymbolContext.class);
		}
		public MazeSymbolContext mazeSymbol(int i) {
			return getRuleContext(MazeSymbolContext.class,i);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public MazeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maze; }
	}

	public final MazeContext maze() throws RecognitionException {
		MazeContext _localctx = new MazeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_maze);
		try {
			int _alt;
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				sectionBegin();
				setState(69);
				sectionTitle();
				setState(70);
				assignval();
				setState(71);
				mazeBegin();
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(72);
						mazeSymbol();
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(78);
				mazeEnd();
				setState(79);
				sectionEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				error();
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

	public static class MoveSymbolContext extends ParserRuleContext {
		public MoveCharContext moveChar() {
			return getRuleContext(MoveCharContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(csce322a01part01Parser.UNDERSCORE, 0); }
		public MoveSymbolContext moveSymbol() {
			return getRuleContext(MoveSymbolContext.class,0);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public MoveSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveSymbol; }
	}

	public final MoveSymbolContext moveSymbol() throws RecognitionException {
		MoveSymbolContext _localctx = new MoveSymbolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moveSymbol);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				moveChar();
				setState(85);
				match(UNDERSCORE);
				setState(86);
				moveSymbol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				moveChar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				error();
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

	public static class MazeSymbolContext extends ParserRuleContext {
		public MazeCharContext mazeChar() {
			return getRuleContext(MazeCharContext.class,0);
		}
		public EndRowContext endRow() {
			return getRuleContext(EndRowContext.class,0);
		}
		public MazeSymbolContext mazeSymbol() {
			return getRuleContext(MazeSymbolContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public MazeSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazeSymbol; }
	}

	public final MazeSymbolContext mazeSymbol() throws RecognitionException {
		MazeSymbolContext _localctx = new MazeSymbolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mazeSymbol);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				mazeChar();
				setState(93);
				endRow();
				setState(94);
				mazeSymbol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				mazeChar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				number();
				setState(98);
				endRow();
				setState(99);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				error();
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

	public static class SectionTitleContext extends ParserRuleContext {
		public Token SECTIONTITLE;
		public TerminalNode SECTIONTITLE() { return getToken(csce322a01part01Parser.SECTIONTITLE, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public SectionTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionTitle; }
	}

	public final SectionTitleContext sectionTitle() throws RecognitionException {
		SectionTitleContext _localctx = new SectionTitleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sectionTitle);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTIONTITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				((SectionTitleContext)_localctx).SECTIONTITLE = match(SECTIONTITLE);
				System.out.println("Section Title: " + (((SectionTitleContext)_localctx).SECTIONTITLE!=null?((SectionTitleContext)_localctx).SECTIONTITLE.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				error();
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

	public static class SectionBeginContext extends ParserRuleContext {
		public Token SECTIONBEGIN;
		public TerminalNode SECTIONBEGIN() { return getToken(csce322a01part01Parser.SECTIONBEGIN, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public SectionBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionBegin; }
	}

	public final SectionBeginContext sectionBegin() throws RecognitionException {
		SectionBeginContext _localctx = new SectionBeginContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sectionBegin);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTIONBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((SectionBeginContext)_localctx).SECTIONBEGIN = match(SECTIONBEGIN);
				System.out.println("Section Beginning: " + (((SectionBeginContext)_localctx).SECTIONBEGIN!=null?((SectionBeginContext)_localctx).SECTIONBEGIN.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				error();
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

	public static class SectionEndContext extends ParserRuleContext {
		public Token SECTIONEND;
		public TerminalNode SECTIONEND() { return getToken(csce322a01part01Parser.SECTIONEND, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public SectionEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionEnd; }
	}

	public final SectionEndContext sectionEnd() throws RecognitionException {
		SectionEndContext _localctx = new SectionEndContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sectionEnd);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTIONEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				((SectionEndContext)_localctx).SECTIONEND = match(SECTIONEND);
				System.out.println("Section Ending: " + (((SectionEndContext)_localctx).SECTIONEND!=null?((SectionEndContext)_localctx).SECTIONEND.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				error();
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

	public static class ListBeginContext extends ParserRuleContext {
		public TerminalNode LISTBEGIN() { return getToken(csce322a01part01Parser.LISTBEGIN, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public ListBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBegin; }
	}

	public final ListBeginContext listBegin() throws RecognitionException {
		ListBeginContext _localctx = new ListBeginContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listBegin);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LISTBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(LISTBEGIN);
				System.out.println("List Beginning: [" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				error();
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

	public static class ListEndContext extends ParserRuleContext {
		public TerminalNode LISTEND() { return getToken(csce322a01part01Parser.LISTEND, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public ListEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listEnd; }
	}

	public final ListEndContext listEnd() throws RecognitionException {
		ListEndContext _localctx = new ListEndContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listEnd);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LISTEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(LISTEND);
				System.out.println("List Ending: ]" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				error();
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

	public static class MazeBeginContext extends ParserRuleContext {
		public TerminalNode MAZEBEGIN() { return getToken(csce322a01part01Parser.MAZEBEGIN, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public MazeBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazeBegin; }
	}

	public final MazeBeginContext mazeBegin() throws RecognitionException {
		MazeBeginContext _localctx = new MazeBeginContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mazeBegin);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAZEBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(MAZEBEGIN);
				System.out.println("Maze Beginning: (" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				error();
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

	public static class MazeEndContext extends ParserRuleContext {
		public TerminalNode MAZEEND() { return getToken(csce322a01part01Parser.MAZEEND, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public MazeEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazeEnd; }
	}

	public final MazeEndContext mazeEnd() throws RecognitionException {
		MazeEndContext _localctx = new MazeEndContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mazeEnd);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAZEEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(MAZEEND);
				System.out.println("Maze Ending: )" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				error();
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

	public static class MoveCharContext extends ParserRuleContext {
		public Token MOVES;
		public TerminalNode MOVES() { return getToken(csce322a01part01Parser.MOVES, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public MoveCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveChar; }
	}

	public final MoveCharContext moveChar() throws RecognitionException {
		MoveCharContext _localctx = new MoveCharContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_moveChar);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVES:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((MoveCharContext)_localctx).MOVES = match(MOVES);
				System.out.println("Move Symbol: " + (((MoveCharContext)_localctx).MOVES!=null?((MoveCharContext)_localctx).MOVES.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				error();
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

	public static class MazeCharContext extends ParserRuleContext {
		public Token MAZE;
		public TerminalNode MAZE() { return getToken(csce322a01part01Parser.MAZE, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public MazeCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazeChar; }
	}

	public final MazeCharContext mazeChar() throws RecognitionException {
		MazeCharContext _localctx = new MazeCharContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mazeChar);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((MazeCharContext)_localctx).MAZE = match(MAZE);
				System.out.println("Maze Symbol: " + (((MazeCharContext)_localctx).MAZE!=null?((MazeCharContext)_localctx).MAZE.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				error();
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

	public static class EndRowContext extends ParserRuleContext {
		public TerminalNode ROWEND() { return getToken(csce322a01part01Parser.ROWEND, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public EndRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endRow; }
	}

	public final EndRowContext endRow() throws RecognitionException {
		EndRowContext _localctx = new EndRowContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_endRow);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROWEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(ROWEND);
				System.out.println("Row Ending: $" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				error();
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

	public static class AssignvalContext extends ParserRuleContext {
		public TerminalNode ASSIGNVALUE() { return getToken(csce322a01part01Parser.ASSIGNVALUE, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public AssignvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignval; }
	}

	public final AssignvalContext assignval() throws RecognitionException {
		AssignvalContext _localctx = new AssignvalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignval);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGNVALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(ASSIGNVALUE);
				System.out.println("Assign Value: @");
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				error();
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

	public static class NumberContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(csce322a01part01Parser.NUM, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((NumberContext)_localctx).NUM = match(NUM);
				System.out.println("Number: " + (((NumberContext)_localctx).NUM!=null?((NumberContext)_localctx).NUM.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				error();
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

	public static class ErrorContext extends ParserRuleContext {
		public Token ANYTHING;
		public TerminalNode ANYTHING() { return getToken(csce322a01part01Parser.ANYTHING, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((ErrorContext)_localctx).ANYTHING = match(ANYTHING);
			System.out.println("Something on Line "+ (((ErrorContext)_localctx).ANYTHING!=null?((ErrorContext)_localctx).ANYTHING.getLine():0) + " is Unrecognized."); System.exit(1);
					
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2\65\n\2\3\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3\3\3\3"+
		"\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4\3\4\3\4"+
		"\5\4U\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\5\bt\n\b\3"+
		"\t\3\t\3\t\5\ty\n\t\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13\5\13\u0083\n\13"+
		"\3\f\3\f\3\f\5\f\u0088\n\f\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16\5"+
		"\16\u0092\n\16\3\17\3\17\3\17\5\17\u0097\n\17\3\20\3\20\3\20\5\20\u009c"+
		"\n\20\3\21\3\21\3\21\5\21\u00a1\n\21\3\22\3\22\3\22\5\22\u00a6\n\22\3"+
		"\23\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2"+
		"\2\2\u00b1\2\64\3\2\2\2\4D\3\2\2\2\6T\3\2\2\2\b\\\3\2\2\2\ni\3\2\2\2\f"+
		"n\3\2\2\2\16s\3\2\2\2\20x\3\2\2\2\22}\3\2\2\2\24\u0082\3\2\2\2\26\u0087"+
		"\3\2\2\2\30\u008c\3\2\2\2\32\u0091\3\2\2\2\34\u0096\3\2\2\2\36\u009b\3"+
		"\2\2\2 \u00a0\3\2\2\2\"\u00a5\3\2\2\2$\u00a7\3\2\2\2&\'\5\6\4\2\'(\5\4"+
		"\3\2(-\3\2\2\2)*\5\4\3\2*+\5\6\4\2+-\3\2\2\2,&\3\2\2\2,)\3\2\2\2-.\3\2"+
		"\2\2./\7\2\2\3/\60\b\2\1\2\60\65\3\2\2\2\61\62\7\2\2\3\62\65\b\2\1\2\63"+
		"\65\5$\23\2\64,\3\2\2\2\64\61\3\2\2\2\64\63\3\2\2\2\65\3\3\2\2\2\66\67"+
		"\5\16\b\2\678\5\f\7\289\5 \21\29=\5\22\n\2:<\5\b\5\2;:\3\2\2\2<?\3\2\2"+
		"\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\5\24\13\2AB\5\20\t\2BE\3"+
		"\2\2\2CE\5$\23\2D\66\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FG\5\16\b\2GH\5\f\7\2"+
		"HI\5 \21\2IM\5\26\f\2JL\5\n\6\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2NP\3\2\2\2OM\3\2\2\2PQ\5\30\r\2QR\5\20\t\2RU\3\2\2\2SU\5$\23\2TF\3\2"+
		"\2\2TS\3\2\2\2U\7\3\2\2\2VW\5\32\16\2WX\7\n\2\2XY\5\b\5\2Y]\3\2\2\2Z]"+
		"\5\32\16\2[]\5$\23\2\\V\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\t\3\2\2\2^_\5\34"+
		"\17\2_`\5\36\20\2`a\5\n\6\2aj\3\2\2\2bj\5\34\17\2cd\5\"\22\2de\5\36\20"+
		"\2ef\5\"\22\2fj\3\2\2\2gj\5\"\22\2hj\5$\23\2i^\3\2\2\2ib\3\2\2\2ic\3\2"+
		"\2\2ig\3\2\2\2ih\3\2\2\2j\13\3\2\2\2kl\7\5\2\2lo\b\7\1\2mo\5$\23\2nk\3"+
		"\2\2\2nm\3\2\2\2o\r\3\2\2\2pq\7\3\2\2qt\b\b\1\2rt\5$\23\2sp\3\2\2\2sr"+
		"\3\2\2\2t\17\3\2\2\2uv\7\4\2\2vy\b\t\1\2wy\5$\23\2xu\3\2\2\2xw\3\2\2\2"+
		"y\21\3\2\2\2z{\7\16\2\2{~\b\n\1\2|~\5$\23\2}z\3\2\2\2}|\3\2\2\2~\23\3"+
		"\2\2\2\177\u0080\7\17\2\2\u0080\u0083\b\13\1\2\u0081\u0083\5$\23\2\u0082"+
		"\177\3\2\2\2\u0082\u0081\3\2\2\2\u0083\25\3\2\2\2\u0084\u0085\7\f\2\2"+
		"\u0085\u0088\b\f\1\2\u0086\u0088\5$\23\2\u0087\u0084\3\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\27\3\2\2\2\u0089\u008a\7\r\2\2\u008a\u008d\b\r\1\2\u008b"+
		"\u008d\5$\23\2\u008c\u0089\3\2\2\2\u008c\u008b\3\2\2\2\u008d\31\3\2\2"+
		"\2\u008e\u008f\7\7\2\2\u008f\u0092\b\16\1\2\u0090\u0092\5$\23\2\u0091"+
		"\u008e\3\2\2\2\u0091\u0090\3\2\2\2\u0092\33\3\2\2\2\u0093\u0094\7\b\2"+
		"\2\u0094\u0097\b\17\1\2\u0095\u0097\5$\23\2\u0096\u0093\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\35\3\2\2\2\u0098\u0099\7\13\2\2\u0099\u009c\b\20"+
		"\1\2\u009a\u009c\5$\23\2\u009b\u0098\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\37\3\2\2\2\u009d\u009e\7\6\2\2\u009e\u00a1\b\21\1\2\u009f\u00a1\5$\23"+
		"\2\u00a0\u009d\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1!\3\2\2\2\u00a2\u00a3"+
		"\7\t\2\2\u00a3\u00a6\b\22\1\2\u00a4\u00a6\5$\23\2\u00a5\u00a2\3\2\2\2"+
		"\u00a5\u00a4\3\2\2\2\u00a6#\3\2\2\2\u00a7\u00a8\7\21\2\2\u00a8\u00a9\b"+
		"\23\1\2\u00a9%\3\2\2\2\26,\64=DMT\\insx}\u0082\u0087\u008c\u0091\u0096"+
		"\u009b\u00a0\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}