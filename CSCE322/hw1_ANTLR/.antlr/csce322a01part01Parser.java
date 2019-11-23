// Generated from c:\Users\Nasi\Desktop\FALL2019\CSCE322\homeworks\hw1\csce322a01part01.g4 by ANTLR 4.7.1
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
		LISTEND=13, END=14, WS=15, ANYTHING=16;
	public static final int
		RULE_sectionTitle = 0, RULE_sectionBegin = 1, RULE_sectionEnd = 2, RULE_listBegin = 3, 
		RULE_listEnd = 4, RULE_mazeBegin = 5, RULE_mazeEnd = 6, RULE_moveChar = 7, 
		RULE_mazeChar = 8, RULE_endRow = 9, RULE_end = 10, RULE_assignval = 11, 
		RULE_number = 12, RULE_error = 13;
	public static final String[] ruleNames = {
		"sectionTitle", "sectionBegin", "sectionEnd", "listBegin", "listEnd", 
		"mazeBegin", "mazeEnd", "moveChar", "mazeChar", "endRow", "end", "assignval", 
		"number", "error"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", null, "'@'", null, null, null, "'_'", "'$'", "'('", 
		"')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SECTIONBEGIN", "SECTIONEND", "SECTIONTITLE", "ASSIGNVALUE", "MOVES", 
		"MAZE", "NUM", "UNDERSCORE", "ROWEND", "MAZEBEGIN", "MAZEEND", "LISTBEGIN", 
		"LISTEND", "END", "WS", "ANYTHING"
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
		enterRule(_localctx, 0, RULE_sectionTitle);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTIONTITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				((SectionTitleContext)_localctx).SECTIONTITLE = match(SECTIONTITLE);
				System.out.println("Section Title: " + (((SectionTitleContext)_localctx).SECTIONTITLE!=null?((SectionTitleContext)_localctx).SECTIONTITLE.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
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
		enterRule(_localctx, 2, RULE_sectionBegin);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTIONBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((SectionBeginContext)_localctx).SECTIONBEGIN = match(SECTIONBEGIN);
				System.out.println("Section Beginning: " + (((SectionBeginContext)_localctx).SECTIONBEGIN!=null?((SectionBeginContext)_localctx).SECTIONBEGIN.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
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
		enterRule(_localctx, 4, RULE_sectionEnd);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTIONEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				((SectionEndContext)_localctx).SECTIONEND = match(SECTIONEND);
				System.out.println("Section Ending: " + (((SectionEndContext)_localctx).SECTIONEND!=null?((SectionEndContext)_localctx).SECTIONEND.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
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
		enterRule(_localctx, 6, RULE_listBegin);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LISTBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(LISTBEGIN);
				System.out.println("List Beginning: [" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
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
		enterRule(_localctx, 8, RULE_listEnd);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LISTEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(LISTEND);
				System.out.println("List Ending: ]" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
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
		enterRule(_localctx, 10, RULE_mazeBegin);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAZEBEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(MAZEBEGIN);
				System.out.println("Maze Beginning: (" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
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
		enterRule(_localctx, 12, RULE_mazeEnd);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAZEEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(MAZEEND);
				System.out.println("Maze Ending: )" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
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
		enterRule(_localctx, 14, RULE_moveChar);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVES:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((MoveCharContext)_localctx).MOVES = match(MOVES);
				System.out.println("Move Symbol: " + (((MoveCharContext)_localctx).MOVES!=null?((MoveCharContext)_localctx).MOVES.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
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
		enterRule(_localctx, 16, RULE_mazeChar);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				((MazeCharContext)_localctx).MAZE = match(MAZE);
				System.out.println("Maze Symbol: " + (((MazeCharContext)_localctx).MAZE!=null?((MazeCharContext)_localctx).MAZE.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
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
		enterRule(_localctx, 18, RULE_endRow);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROWEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(ROWEND);
				System.out.println("Row Ending: $" );
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(csce322a01part01Parser.END, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_end);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(END);
				System.out.println("File Ending");
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGNVALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(ASSIGNVALUE);
				System.out.println("Assign Value: @");
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((NumberContext)_localctx).NUM = match(NUM);
				System.out.println("Number: " + (((NumberContext)_localctx).NUM!=null?((NumberContext)_localctx).NUM.getText():null));
				}
				break;
			case ANYTHING:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
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
		enterRule(_localctx, 26, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((ErrorContext)_localctx).ANYTHING = match(ANYTHING);
			System.out.println("Something on Line "+ (((ErrorContext)_localctx).ANYTHING!=null?((ErrorContext)_localctx).ANYTHING.getLine():0) + " is Unrecognized.");
				System.exit(1);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\5\2\"\n\2\3\3\3\3\3\3\5"+
		"\3\'\n\3\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\5\6\66"+
		"\n\6\3\7\3\7\3\7\5\7;\n\7\3\b\3\b\3\b\5\b@\n\b\3\t\3\t\3\t\5\tE\n\t\3"+
		"\n\3\n\3\n\5\nJ\n\n\3\13\3\13\3\13\5\13O\n\13\3\f\3\f\3\f\5\fT\n\f\3\r"+
		"\3\r\3\r\5\rY\n\r\3\16\3\16\3\16\5\16^\n\16\3\17\3\17\3\17\3\17\2\2\20"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2a\2!\3\2\2\2\4&\3\2\2\2\6+\3"+
		"\2\2\2\b\60\3\2\2\2\n\65\3\2\2\2\f:\3\2\2\2\16?\3\2\2\2\20D\3\2\2\2\22"+
		"I\3\2\2\2\24N\3\2\2\2\26S\3\2\2\2\30X\3\2\2\2\32]\3\2\2\2\34_\3\2\2\2"+
		"\36\37\7\5\2\2\37\"\b\2\1\2 \"\5\34\17\2!\36\3\2\2\2! \3\2\2\2\"\3\3\2"+
		"\2\2#$\7\3\2\2$\'\b\3\1\2%\'\5\34\17\2&#\3\2\2\2&%\3\2\2\2\'\5\3\2\2\2"+
		"()\7\4\2\2),\b\4\1\2*,\5\34\17\2+(\3\2\2\2+*\3\2\2\2,\7\3\2\2\2-.\7\16"+
		"\2\2.\61\b\5\1\2/\61\5\34\17\2\60-\3\2\2\2\60/\3\2\2\2\61\t\3\2\2\2\62"+
		"\63\7\17\2\2\63\66\b\6\1\2\64\66\5\34\17\2\65\62\3\2\2\2\65\64\3\2\2\2"+
		"\66\13\3\2\2\2\678\7\f\2\28;\b\7\1\29;\5\34\17\2:\67\3\2\2\2:9\3\2\2\2"+
		";\r\3\2\2\2<=\7\r\2\2=@\b\b\1\2>@\5\34\17\2?<\3\2\2\2?>\3\2\2\2@\17\3"+
		"\2\2\2AB\7\7\2\2BE\b\t\1\2CE\5\34\17\2DA\3\2\2\2DC\3\2\2\2E\21\3\2\2\2"+
		"FG\7\b\2\2GJ\b\n\1\2HJ\5\34\17\2IF\3\2\2\2IH\3\2\2\2J\23\3\2\2\2KL\7\13"+
		"\2\2LO\b\13\1\2MO\5\34\17\2NK\3\2\2\2NM\3\2\2\2O\25\3\2\2\2PQ\7\20\2\2"+
		"QT\b\f\1\2RT\5\34\17\2SP\3\2\2\2SR\3\2\2\2T\27\3\2\2\2UV\7\6\2\2VY\b\r"+
		"\1\2WY\5\34\17\2XU\3\2\2\2XW\3\2\2\2Y\31\3\2\2\2Z[\7\t\2\2[^\b\16\1\2"+
		"\\^\5\34\17\2]Z\3\2\2\2]\\\3\2\2\2^\33\3\2\2\2_`\7\22\2\2`a\b\17\1\2a"+
		"\35\3\2\2\2\17!&+\60\65:?DINSX]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}