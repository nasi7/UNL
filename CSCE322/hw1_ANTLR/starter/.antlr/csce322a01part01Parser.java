// Generated from c:\Users\Nasi\Desktop\FALL2019\CSCE322\homeworks\hw1\starter\csce322a01part01.g4 by ANTLR 4.7.1
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
		RULE_mazeGame = 0, RULE_sectionTitle = 1, RULE_sectionBegin = 2, RULE_sectionEnd = 3, 
		RULE_listBegin = 4, RULE_listEnd = 5, RULE_mazeBegin = 6, RULE_mazeEnd = 7, 
		RULE_moveChar = 8, RULE_mazeChar = 9, RULE_endRow = 10, RULE_assignval = 11, 
		RULE_number = 12, RULE_underscore = 13, RULE_error = 14;
	public static final String[] ruleNames = {
		"mazeGame", "sectionTitle", "sectionBegin", "sectionEnd", "listBegin", 
		"listEnd", "mazeBegin", "mazeEnd", "moveChar", "mazeChar", "endRow", "assignval", 
		"number", "underscore", "error"
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
		public List<SectionTitleContext> sectionTitle() {
			return getRuleContexts(SectionTitleContext.class);
		}
		public SectionTitleContext sectionTitle(int i) {
			return getRuleContext(SectionTitleContext.class,i);
		}
		public List<SectionBeginContext> sectionBegin() {
			return getRuleContexts(SectionBeginContext.class);
		}
		public SectionBeginContext sectionBegin(int i) {
			return getRuleContext(SectionBeginContext.class,i);
		}
		public List<SectionEndContext> sectionEnd() {
			return getRuleContexts(SectionEndContext.class);
		}
		public SectionEndContext sectionEnd(int i) {
			return getRuleContext(SectionEndContext.class,i);
		}
		public List<ListBeginContext> listBegin() {
			return getRuleContexts(ListBeginContext.class);
		}
		public ListBeginContext listBegin(int i) {
			return getRuleContext(ListBeginContext.class,i);
		}
		public List<ListEndContext> listEnd() {
			return getRuleContexts(ListEndContext.class);
		}
		public ListEndContext listEnd(int i) {
			return getRuleContext(ListEndContext.class,i);
		}
		public List<MazeBeginContext> mazeBegin() {
			return getRuleContexts(MazeBeginContext.class);
		}
		public MazeBeginContext mazeBegin(int i) {
			return getRuleContext(MazeBeginContext.class,i);
		}
		public List<MazeEndContext> mazeEnd() {
			return getRuleContexts(MazeEndContext.class);
		}
		public MazeEndContext mazeEnd(int i) {
			return getRuleContext(MazeEndContext.class,i);
		}
		public List<MoveCharContext> moveChar() {
			return getRuleContexts(MoveCharContext.class);
		}
		public MoveCharContext moveChar(int i) {
			return getRuleContext(MoveCharContext.class,i);
		}
		public List<UnderscoreContext> underscore() {
			return getRuleContexts(UnderscoreContext.class);
		}
		public UnderscoreContext underscore(int i) {
			return getRuleContext(UnderscoreContext.class,i);
		}
		public List<MazeCharContext> mazeChar() {
			return getRuleContexts(MazeCharContext.class);
		}
		public MazeCharContext mazeChar(int i) {
			return getRuleContext(MazeCharContext.class,i);
		}
		public List<EndRowContext> endRow() {
			return getRuleContexts(EndRowContext.class);
		}
		public EndRowContext endRow(int i) {
			return getRuleContext(EndRowContext.class,i);
		}
		public List<AssignvalContext> assignval() {
			return getRuleContexts(AssignvalContext.class);
		}
		public AssignvalContext assignval(int i) {
			return getRuleContext(AssignvalContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public MazeGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazeGame; }
	}

	public final MazeGameContext mazeGame() throws RecognitionException {
		MazeGameContext _localctx = new MazeGameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mazeGame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SECTIONBEGIN) | (1L << SECTIONEND) | (1L << SECTIONTITLE) | (1L << ASSIGNVALUE) | (1L << MOVES) | (1L << MAZE) | (1L << NUM) | (1L << UNDERSCORE) | (1L << ROWEND) | (1L << MAZEBEGIN) | (1L << MAZEEND) | (1L << LISTBEGIN) | (1L << LISTEND) | (1L << ANYTHING))) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30);
					sectionTitle();
					}
					break;
				case 2:
					{
					setState(31);
					sectionBegin();
					}
					break;
				case 3:
					{
					setState(32);
					sectionEnd();
					}
					break;
				case 4:
					{
					setState(33);
					listBegin();
					}
					break;
				case 5:
					{
					setState(34);
					listEnd();
					}
					break;
				case 6:
					{
					setState(35);
					mazeBegin();
					}
					break;
				case 7:
					{
					setState(36);
					mazeEnd();
					}
					break;
				case 8:
					{
					setState(37);
					moveChar();
					}
					break;
				case 9:
					{
					setState(38);
					underscore();
					}
					break;
				case 10:
					{
					setState(39);
					mazeChar();
					}
					break;
				case 11:
					{
					setState(40);
					endRow();
					}
					break;
				case 12:
					{
					setState(41);
					assignval();
					}
					break;
				case 13:
					{
					setState(42);
					number();
					}
					break;
				case 14:
					{
					setState(43);
					error();
					}
					break;
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(EOF);
			System.out.println("File Ending");
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
		enterRule(_localctx, 2, RULE_sectionTitle);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTIONTITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				((SectionTitleContext)_localctx).SECTIONTITLE = match(SECTIONTITLE);
				System.out.println("Section Title: " + (((SectionTitleContext)_localctx).SECTIONTITLE!=null?((SectionTitleContext)_localctx).SECTIONTITLE.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
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
		enterRule(_localctx, 4, RULE_sectionBegin);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTIONBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((SectionBeginContext)_localctx).SECTIONBEGIN = match(SECTIONBEGIN);
				System.out.println("Section Beginning: " + (((SectionBeginContext)_localctx).SECTIONBEGIN!=null?((SectionBeginContext)_localctx).SECTIONBEGIN.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
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
		enterRule(_localctx, 6, RULE_sectionEnd);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTIONEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((SectionEndContext)_localctx).SECTIONEND = match(SECTIONEND);
				System.out.println("Section Ending: " + (((SectionEndContext)_localctx).SECTIONEND!=null?((SectionEndContext)_localctx).SECTIONEND.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
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
		enterRule(_localctx, 8, RULE_listBegin);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LISTBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(LISTBEGIN);
				System.out.println("List Beginning: [" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
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
		enterRule(_localctx, 10, RULE_listEnd);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LISTEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(LISTEND);
				System.out.println("List Ending: ]" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
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
		enterRule(_localctx, 12, RULE_mazeBegin);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAZEBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(MAZEBEGIN);
				System.out.println("Maze Beginning: (" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
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
		enterRule(_localctx, 14, RULE_mazeEnd);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAZEEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(MAZEEND);
				System.out.println("Maze Ending: )" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
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
		enterRule(_localctx, 16, RULE_moveChar);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVES:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				((MoveCharContext)_localctx).MOVES = match(MOVES);
				System.out.println("Move Symbol: " + (((MoveCharContext)_localctx).MOVES!=null?((MoveCharContext)_localctx).MOVES.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
		enterRule(_localctx, 18, RULE_mazeChar);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((MazeCharContext)_localctx).MAZE = match(MAZE);
				System.out.println("Maze Symbol: " + (((MazeCharContext)_localctx).MAZE!=null?((MazeCharContext)_localctx).MAZE.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
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
		enterRule(_localctx, 20, RULE_endRow);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROWEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(ROWEND);
				System.out.println("Row Ending: $" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
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
		enterRule(_localctx, 22, RULE_assignval);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGNVALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(ASSIGNVALUE);
				System.out.println("Assign Value: @");
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
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
		enterRule(_localctx, 24, RULE_number);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((NumberContext)_localctx).NUM = match(NUM);
				System.out.println("Number: " + (((NumberContext)_localctx).NUM!=null?((NumberContext)_localctx).NUM.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
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

	public static class UnderscoreContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(csce322a01part01Parser.UNDERSCORE, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public UnderscoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underscore; }
	}

	public final UnderscoreContext underscore() throws RecognitionException {
		UnderscoreContext _localctx = new UnderscoreContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_underscore);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(UNDERSCORE);
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
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
		enterRule(_localctx, 28, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\5\5D\n\5\3\6\3\6"+
		"\3\6\5\6I\n\6\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\5\bS\n\b\3\t\3\t\3\t\5"+
		"\tX\n\t\3\n\3\n\3\n\5\n]\n\n\3\13\3\13\3\13\5\13b\n\13\3\f\3\f\3\f\5\f"+
		"g\n\f\3\r\3\r\3\r\5\rl\n\r\3\16\3\16\3\16\5\16q\n\16\3\17\3\17\5\17u\n"+
		"\17\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\2\2\u0085\2\60\3\2\2\2\49\3\2\2\2\6>\3\2\2\2\bC\3\2\2\2\nH\3\2\2\2"+
		"\fM\3\2\2\2\16R\3\2\2\2\20W\3\2\2\2\22\\\3\2\2\2\24a\3\2\2\2\26f\3\2\2"+
		"\2\30k\3\2\2\2\32p\3\2\2\2\34t\3\2\2\2\36v\3\2\2\2 /\5\4\3\2!/\5\6\4\2"+
		"\"/\5\b\5\2#/\5\n\6\2$/\5\f\7\2%/\5\16\b\2&/\5\20\t\2\'/\5\22\n\2(/\5"+
		"\34\17\2)/\5\24\13\2*/\5\26\f\2+/\5\30\r\2,/\5\32\16\2-/\5\36\20\2. \3"+
		"\2\2\2.!\3\2\2\2.\"\3\2\2\2.#\3\2\2\2.$\3\2\2\2.%\3\2\2\2.&\3\2\2\2.\'"+
		"\3\2\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/"+
		"\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64"+
		"\7\2\2\3\64\65\b\2\1\2\65\3\3\2\2\2\66\67\7\5\2\2\67:\b\3\1\28:\5\36\20"+
		"\29\66\3\2\2\298\3\2\2\2:\5\3\2\2\2;<\7\3\2\2<?\b\4\1\2=?\5\36\20\2>;"+
		"\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\7\4\2\2AD\b\5\1\2BD\5\36\20\2C@\3\2\2"+
		"\2CB\3\2\2\2D\t\3\2\2\2EF\7\16\2\2FI\b\6\1\2GI\5\36\20\2HE\3\2\2\2HG\3"+
		"\2\2\2I\13\3\2\2\2JK\7\17\2\2KN\b\7\1\2LN\5\36\20\2MJ\3\2\2\2ML\3\2\2"+
		"\2N\r\3\2\2\2OP\7\f\2\2PS\b\b\1\2QS\5\36\20\2RO\3\2\2\2RQ\3\2\2\2S\17"+
		"\3\2\2\2TU\7\r\2\2UX\b\t\1\2VX\5\36\20\2WT\3\2\2\2WV\3\2\2\2X\21\3\2\2"+
		"\2YZ\7\7\2\2Z]\b\n\1\2[]\5\36\20\2\\Y\3\2\2\2\\[\3\2\2\2]\23\3\2\2\2^"+
		"_\7\b\2\2_b\b\13\1\2`b\5\36\20\2a^\3\2\2\2a`\3\2\2\2b\25\3\2\2\2cd\7\13"+
		"\2\2dg\b\f\1\2eg\5\36\20\2fc\3\2\2\2fe\3\2\2\2g\27\3\2\2\2hi\7\6\2\2i"+
		"l\b\r\1\2jl\5\36\20\2kh\3\2\2\2kj\3\2\2\2l\31\3\2\2\2mn\7\t\2\2nq\b\16"+
		"\1\2oq\5\36\20\2pm\3\2\2\2po\3\2\2\2q\33\3\2\2\2ru\7\n\2\2su\5\36\20\2"+
		"tr\3\2\2\2ts\3\2\2\2u\35\3\2\2\2vw\7\21\2\2wx\b\20\1\2x\37\3\2\2\2\21"+
		".\609>CHMRW\\afkpt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}