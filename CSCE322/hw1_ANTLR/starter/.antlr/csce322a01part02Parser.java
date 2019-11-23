// Generated from c:\Users\Nasi\Desktop\FALL2019\CSCE322\homeworks\hw1\starter\csce322a01part02.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322a01part02Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTIONBEGIN=1, SECTIONEND=2, SECTIONTITLE=3, ASSIGNVALUE=4, UP=5, DOWN=6, 
		LEFT=7, RIGHT=8, MAZE1=9, MAZE2=10, MAZE3=11, MAZE4=12, UNDERSCORE=13, 
		ROWEND=14, MAZEBEGIN=15, MAZEEND=16, LISTBEGIN=17, LISTEND=18, WS=19;
	public static final int
		RULE_mazeGame = 0, RULE_moves = 1, RULE_moveSymbol = 2, RULE_moveChar = 3, 
		RULE_moveUP = 4, RULE_moveDOWN = 5, RULE_moveLEFT = 6, RULE_moveRIGHT = 7, 
		RULE_maze = 8, RULE_firstRow = 9, RULE_lastRow = 10, RULE_column = 11, 
		RULE_row = 12, RULE_maze1 = 13, RULE_maze2 = 14, RULE_maze3 = 15, RULE_maze4 = 16, 
		RULE_mazeChar = 17, RULE_sectionTitle = 18, RULE_sectionBegin = 19, RULE_sectionEnd = 20, 
		RULE_listBegin = 21, RULE_listEnd = 22, RULE_mazeBegin = 23, RULE_mazeEnd = 24, 
		RULE_endRow = 25, RULE_assignval = 26, RULE_semanticRules = 27;
	public static final String[] ruleNames = {
		"mazeGame", "moves", "moveSymbol", "moveChar", "moveUP", "moveDOWN", "moveLEFT", 
		"moveRIGHT", "maze", "firstRow", "lastRow", "column", "row", "maze1", 
		"maze2", "maze3", "maze4", "mazeChar", "sectionTitle", "sectionBegin", 
		"sectionEnd", "listBegin", "listEnd", "mazeBegin", "mazeEnd", "endRow", 
		"assignval", "semanticRules"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", null, "'@'", "'u'", "'d'", "'l'", "'r'", "'x'", "'-'", 
		"'g'", null, "'_'", "'$'", "'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SECTIONBEGIN", "SECTIONEND", "SECTIONTITLE", "ASSIGNVALUE", "UP", 
		"DOWN", "LEFT", "RIGHT", "MAZE1", "MAZE2", "MAZE3", "MAZE4", "UNDERSCORE", 
		"ROWEND", "MAZEBEGIN", "MAZEEND", "LISTBEGIN", "LISTEND", "WS"
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
	public String getGrammarFileName() { return "csce322a01part02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	int players = 0;
	int countG = 0;
	int xSymbols = 0;
	int allSymbols = 0;
	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	boolean isValid = true;

	public csce322a01part02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MazeGameContext extends ParserRuleContext {
		public MazeContext maze() {
			return getRuleContext(MazeContext.class,0);
		}
		public MovesContext moves() {
			return getRuleContext(MovesContext.class,0);
		}
		public SemanticRulesContext semanticRules() {
			return getRuleContext(SemanticRulesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(csce322a01part02Parser.EOF, 0); }
		public MazeGameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazeGame; }
	}

	public final MazeGameContext mazeGame() throws RecognitionException {
		MazeGameContext _localctx = new MazeGameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mazeGame);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(56);
				maze();
				setState(57);
				moves();
				setState(58);
				semanticRules();
				setState(59);
				match(EOF);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(61);
				moves();
				setState(62);
				maze();
				setState(63);
				semanticRules();
				setState(64);
				match(EOF);
				}
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
		public MoveSymbolContext moveSymbol() {
			return getRuleContext(MoveSymbolContext.class,0);
		}
		public ListEndContext listEnd() {
			return getRuleContext(ListEndContext.class,0);
		}
		public SectionEndContext sectionEnd() {
			return getRuleContext(SectionEndContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			sectionBegin();
			setState(69);
			sectionTitle();
			setState(70);
			assignval();
			setState(71);
			listBegin();
			setState(72);
			moveSymbol();
			setState(73);
			listEnd();
			setState(74);
			sectionEnd();
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
		public List<MoveCharContext> moveChar() {
			return getRuleContexts(MoveCharContext.class);
		}
		public MoveCharContext moveChar(int i) {
			return getRuleContext(MoveCharContext.class,i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(csce322a01part02Parser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(csce322a01part02Parser.UNDERSCORE, i);
		}
		public MoveSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveSymbol; }
	}

	public final MoveSymbolContext moveSymbol() throws RecognitionException {
		MoveSymbolContext _localctx = new MoveSymbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moveSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			moveChar();
			setState(77);
			match(UNDERSCORE);
			setState(78);
			moveChar();
			setState(79);
			match(UNDERSCORE);
			setState(80);
			moveChar();
			setState(81);
			match(UNDERSCORE);
			setState(82);
			moveChar();
			setState(83);
			match(UNDERSCORE);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(84);
					moveChar();
					setState(85);
					match(UNDERSCORE);
					}
					break;
				case 2:
					{
					setState(87);
					moveChar();
					}
					break;
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT))) != 0) );
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
		public MoveUPContext moveUP() {
			return getRuleContext(MoveUPContext.class,0);
		}
		public MoveDOWNContext moveDOWN() {
			return getRuleContext(MoveDOWNContext.class,0);
		}
		public MoveLEFTContext moveLEFT() {
			return getRuleContext(MoveLEFTContext.class,0);
		}
		public MoveRIGHTContext moveRIGHT() {
			return getRuleContext(MoveRIGHTContext.class,0);
		}
		public MoveCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveChar; }
	}

	public final MoveCharContext moveChar() throws RecognitionException {
		MoveCharContext _localctx = new MoveCharContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moveChar);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UP:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				moveUP();
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				moveDOWN();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				moveLEFT();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				moveRIGHT();
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

	public static class MoveUPContext extends ParserRuleContext {
		public TerminalNode UP() { return getToken(csce322a01part02Parser.UP, 0); }
		public MoveUPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveUP; }
	}

	public final MoveUPContext moveUP() throws RecognitionException {
		MoveUPContext _localctx = new MoveUPContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moveUP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(UP);
			up = true;
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

	public static class MoveDOWNContext extends ParserRuleContext {
		public TerminalNode DOWN() { return getToken(csce322a01part02Parser.DOWN, 0); }
		public MoveDOWNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveDOWN; }
	}

	public final MoveDOWNContext moveDOWN() throws RecognitionException {
		MoveDOWNContext _localctx = new MoveDOWNContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moveDOWN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(DOWN);
			down = true;
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

	public static class MoveLEFTContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(csce322a01part02Parser.LEFT, 0); }
		public MoveLEFTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveLEFT; }
	}

	public final MoveLEFTContext moveLEFT() throws RecognitionException {
		MoveLEFTContext _localctx = new MoveLEFTContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_moveLEFT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(LEFT);
			left = true;
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

	public static class MoveRIGHTContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(csce322a01part02Parser.RIGHT, 0); }
		public MoveRIGHTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveRIGHT; }
	}

	public final MoveRIGHTContext moveRIGHT() throws RecognitionException {
		MoveRIGHTContext _localctx = new MoveRIGHTContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moveRIGHT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(RIGHT);
			right = true;
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
		public FirstRowContext firstRow() {
			return getRuleContext(FirstRowContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public LastRowContext lastRow() {
			return getRuleContext(LastRowContext.class,0);
		}
		public MazeEndContext mazeEnd() {
			return getRuleContext(MazeEndContext.class,0);
		}
		public SectionEndContext sectionEnd() {
			return getRuleContext(SectionEndContext.class,0);
		}
		public MazeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maze; }
	}

	public final MazeContext maze() throws RecognitionException {
		MazeContext _localctx = new MazeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_maze);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			sectionBegin();
			setState(111);
			sectionTitle();
			setState(112);
			assignval();
			setState(113);
			mazeBegin();
			setState(114);
			firstRow();
			setState(115);
			column();
			setState(116);
			lastRow();
			setState(117);
			mazeEnd();
			setState(118);
			sectionEnd();
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

	public static class FirstRowContext extends ParserRuleContext {
		public List<Maze1Context> maze1() {
			return getRuleContexts(Maze1Context.class);
		}
		public Maze1Context maze1(int i) {
			return getRuleContext(Maze1Context.class,i);
		}
		public EndRowContext endRow() {
			return getRuleContext(EndRowContext.class,0);
		}
		public FirstRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstRow; }
	}

	public final FirstRowContext firstRow() throws RecognitionException {
		FirstRowContext _localctx = new FirstRowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_firstRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			maze1();
			setState(121);
			maze1();
			setState(122);
			maze1();
			setState(123);
			maze1();
			setState(124);
			maze1();
			setState(125);
			maze1();
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				maze1();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MAZE1 );
			setState(131);
			endRow();
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

	public static class LastRowContext extends ParserRuleContext {
		public List<Maze1Context> maze1() {
			return getRuleContexts(Maze1Context.class);
		}
		public Maze1Context maze1(int i) {
			return getRuleContext(Maze1Context.class,i);
		}
		public LastRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastRow; }
	}

	public final LastRowContext lastRow() throws RecognitionException {
		LastRowContext _localctx = new LastRowContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lastRow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			maze1();
			setState(134);
			maze1();
			setState(135);
			maze1();
			setState(136);
			maze1();
			setState(137);
			maze1();
			setState(138);
			maze1();
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				maze1();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MAZE1 );
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

	public static class ColumnContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_column);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			row();
			setState(145);
			row();
			setState(146);
			row();
			setState(147);
			row();
			setState(149); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(148);
					row();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(151); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class RowContext extends ParserRuleContext {
		public List<Maze1Context> maze1() {
			return getRuleContexts(Maze1Context.class);
		}
		public Maze1Context maze1(int i) {
			return getRuleContext(Maze1Context.class,i);
		}
		public List<MazeCharContext> mazeChar() {
			return getRuleContexts(MazeCharContext.class);
		}
		public MazeCharContext mazeChar(int i) {
			return getRuleContext(MazeCharContext.class,i);
		}
		public EndRowContext endRow() {
			return getRuleContext(EndRowContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_row);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			maze1();
			setState(154);
			mazeChar();
			setState(155);
			mazeChar();
			setState(156);
			mazeChar();
			setState(158); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(157);
					mazeChar();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(162);
			maze1();
			setState(163);
			endRow();
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

	public static class Maze1Context extends ParserRuleContext {
		public TerminalNode MAZE1() { return getToken(csce322a01part02Parser.MAZE1, 0); }
		public Maze1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maze1; }
	}

	public final Maze1Context maze1() throws RecognitionException {
		Maze1Context _localctx = new Maze1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_maze1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(MAZE1);
			xSymbols++;allSymbols++;
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

	public static class Maze2Context extends ParserRuleContext {
		public TerminalNode MAZE2() { return getToken(csce322a01part02Parser.MAZE2, 0); }
		public Maze2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maze2; }
	}

	public final Maze2Context maze2() throws RecognitionException {
		Maze2Context _localctx = new Maze2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_maze2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(MAZE2);
			allSymbols++;
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

	public static class Maze3Context extends ParserRuleContext {
		public TerminalNode MAZE3() { return getToken(csce322a01part02Parser.MAZE3, 0); }
		public Maze3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maze3; }
	}

	public final Maze3Context maze3() throws RecognitionException {
		Maze3Context _localctx = new Maze3Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_maze3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(MAZE3);
			countG++;allSymbols++;
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

	public static class Maze4Context extends ParserRuleContext {
		public TerminalNode MAZE4() { return getToken(csce322a01part02Parser.MAZE4, 0); }
		public Maze4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maze4; }
	}

	public final Maze4Context maze4() throws RecognitionException {
		Maze4Context _localctx = new Maze4Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_maze4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(MAZE4);
			allSymbols++;players++;
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
		public Maze1Context maze1() {
			return getRuleContext(Maze1Context.class,0);
		}
		public Maze2Context maze2() {
			return getRuleContext(Maze2Context.class,0);
		}
		public Maze3Context maze3() {
			return getRuleContext(Maze3Context.class,0);
		}
		public Maze4Context maze4() {
			return getRuleContext(Maze4Context.class,0);
		}
		public MazeCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazeChar; }
	}

	public final MazeCharContext mazeChar() throws RecognitionException {
		MazeCharContext _localctx = new MazeCharContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mazeChar);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAZE1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				maze1();
				}
				break;
			case MAZE2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				maze2();
				}
				break;
			case MAZE3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				maze3();
				}
				break;
			case MAZE4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				maze4();
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

	public static class SectionTitleContext extends ParserRuleContext {
		public TerminalNode SECTIONTITLE() { return getToken(csce322a01part02Parser.SECTIONTITLE, 0); }
		public SectionTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionTitle; }
	}

	public final SectionTitleContext sectionTitle() throws RecognitionException {
		SectionTitleContext _localctx = new SectionTitleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sectionTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(SECTIONTITLE);
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
		public TerminalNode SECTIONBEGIN() { return getToken(csce322a01part02Parser.SECTIONBEGIN, 0); }
		public SectionBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionBegin; }
	}

	public final SectionBeginContext sectionBegin() throws RecognitionException {
		SectionBeginContext _localctx = new SectionBeginContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sectionBegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(SECTIONBEGIN);
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
		public TerminalNode SECTIONEND() { return getToken(csce322a01part02Parser.SECTIONEND, 0); }
		public SectionEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionEnd; }
	}

	public final SectionEndContext sectionEnd() throws RecognitionException {
		SectionEndContext _localctx = new SectionEndContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sectionEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(SECTIONEND);
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
		public TerminalNode LISTBEGIN() { return getToken(csce322a01part02Parser.LISTBEGIN, 0); }
		public ListBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBegin; }
	}

	public final ListBeginContext listBegin() throws RecognitionException {
		ListBeginContext _localctx = new ListBeginContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_listBegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(LISTBEGIN);
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
		public TerminalNode LISTEND() { return getToken(csce322a01part02Parser.LISTEND, 0); }
		public ListEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listEnd; }
	}

	public final ListEndContext listEnd() throws RecognitionException {
		ListEndContext _localctx = new ListEndContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(LISTEND);
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
		public TerminalNode MAZEBEGIN() { return getToken(csce322a01part02Parser.MAZEBEGIN, 0); }
		public MazeBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazeBegin; }
	}

	public final MazeBeginContext mazeBegin() throws RecognitionException {
		MazeBeginContext _localctx = new MazeBeginContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mazeBegin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(MAZEBEGIN);
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
		public TerminalNode MAZEEND() { return getToken(csce322a01part02Parser.MAZEEND, 0); }
		public MazeEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mazeEnd; }
	}

	public final MazeEndContext mazeEnd() throws RecognitionException {
		MazeEndContext _localctx = new MazeEndContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mazeEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(MAZEEND);
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
		public TerminalNode ROWEND() { return getToken(csce322a01part02Parser.ROWEND, 0); }
		public EndRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endRow; }
	}

	public final EndRowContext endRow() throws RecognitionException {
		EndRowContext _localctx = new EndRowContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_endRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ROWEND);
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
		public TerminalNode ASSIGNVALUE() { return getToken(csce322a01part02Parser.ASSIGNVALUE, 0); }
		public AssignvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignval; }
	}

	public final AssignvalContext assignval() throws RecognitionException {
		AssignvalContext _localctx = new AssignvalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ASSIGNVALUE);
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

	public static class SemanticRulesContext extends ParserRuleContext {
		public SemanticRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semanticRules; }
	}

	public final SemanticRulesContext semanticRules() throws RecognitionException {
		SemanticRulesContext _localctx = new SemanticRulesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_semanticRules);
		try {
			enterOuterAlt(_localctx, 1);
			{

			    if(players > 4)
			    {
			        System.out.println("Semantic Violation: Rule 1");
			        isValid = false;
			    }
			    if(countG > 1)
			    {
			        System.out.println("Semantic Violation: Rule 2");
			        isValid = false;
			    }
			    if(xSymbols > (allSymbols/2))
			    {
			        System.out.println("Semantic Violation: Rule 3"); 
			        isValid = false;    

			    }
			    if(up == false || down == false || left == false || right == false)
			    {
			        System.out.println("Semantic Violation: Rule 4");  
			        isValid = false;  
			    }
			    if(isValid == true)
			    {
			        System.out.println("There are " + players + " players.");
			        System.out.println("There are " + players + " players. (If you are not attempting extra credit or honors)");

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u00ce\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2E\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4[\n\4\r\4\16\4\\\3\5\3\5\3\5\3\5\5\5"+
		"c\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u0082"+
		"\n\13\r\13\16\13\u0083\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u008f"+
		"\n\f\r\f\16\f\u0090\3\r\3\r\3\r\3\r\3\r\6\r\u0098\n\r\r\r\16\r\u0099\3"+
		"\16\3\16\3\16\3\16\3\16\6\16\u00a1\n\16\r\16\16\16\u00a2\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23\u00b8\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\2\2\36\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\2\2\u00be"+
		"\2D\3\2\2\2\4F\3\2\2\2\6N\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fg\3\2\2\2\16"+
		"j\3\2\2\2\20m\3\2\2\2\22p\3\2\2\2\24z\3\2\2\2\26\u0087\3\2\2\2\30\u0092"+
		"\3\2\2\2\32\u009b\3\2\2\2\34\u00a7\3\2\2\2\36\u00aa\3\2\2\2 \u00ad\3\2"+
		"\2\2\"\u00b0\3\2\2\2$\u00b7\3\2\2\2&\u00b9\3\2\2\2(\u00bb\3\2\2\2*\u00bd"+
		"\3\2\2\2,\u00bf\3\2\2\2.\u00c1\3\2\2\2\60\u00c3\3\2\2\2\62\u00c5\3\2\2"+
		"\2\64\u00c7\3\2\2\2\66\u00c9\3\2\2\28\u00cb\3\2\2\2:;\5\22\n\2;<\5\4\3"+
		"\2<=\58\35\2=>\7\2\2\3>E\3\2\2\2?@\5\4\3\2@A\5\22\n\2AB\58\35\2BC\7\2"+
		"\2\3CE\3\2\2\2D:\3\2\2\2D?\3\2\2\2E\3\3\2\2\2FG\5(\25\2GH\5&\24\2HI\5"+
		"\66\34\2IJ\5,\27\2JK\5\6\4\2KL\5.\30\2LM\5*\26\2M\5\3\2\2\2NO\5\b\5\2"+
		"OP\7\17\2\2PQ\5\b\5\2QR\7\17\2\2RS\5\b\5\2ST\7\17\2\2TU\5\b\5\2UZ\7\17"+
		"\2\2VW\5\b\5\2WX\7\17\2\2X[\3\2\2\2Y[\5\b\5\2ZV\3\2\2\2ZY\3\2\2\2[\\\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\7\3\2\2\2^c\5\n\6\2_c\5\f\7\2`c\5\16\b\2"+
		"ac\5\20\t\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\t\3\2\2\2de\7\7\2"+
		"\2ef\b\6\1\2f\13\3\2\2\2gh\7\b\2\2hi\b\7\1\2i\r\3\2\2\2jk\7\t\2\2kl\b"+
		"\b\1\2l\17\3\2\2\2mn\7\n\2\2no\b\t\1\2o\21\3\2\2\2pq\5(\25\2qr\5&\24\2"+
		"rs\5\66\34\2st\5\60\31\2tu\5\24\13\2uv\5\30\r\2vw\5\26\f\2wx\5\62\32\2"+
		"xy\5*\26\2y\23\3\2\2\2z{\5\34\17\2{|\5\34\17\2|}\5\34\17\2}~\5\34\17\2"+
		"~\177\5\34\17\2\177\u0081\5\34\17\2\u0080\u0082\5\34\17\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\5\64\33\2\u0086\25\3\2\2\2\u0087\u0088\5\34"+
		"\17\2\u0088\u0089\5\34\17\2\u0089\u008a\5\34\17\2\u008a\u008b\5\34\17"+
		"\2\u008b\u008c\5\34\17\2\u008c\u008e\5\34\17\2\u008d\u008f\5\34\17\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\27\3\2\2\2\u0092\u0093\5\32\16\2\u0093\u0094\5\32\16\2\u0094"+
		"\u0095\5\32\16\2\u0095\u0097\5\32\16\2\u0096\u0098\5\32\16\2\u0097\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\31\3\2\2\2\u009b\u009c\5\34\17\2\u009c\u009d\5$\23\2\u009d\u009e\5$\23"+
		"\2\u009e\u00a0\5$\23\2\u009f\u00a1\5$\23\2\u00a0\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\5\34\17\2\u00a5\u00a6\5\64\33\2\u00a6\33\3\2\2\2\u00a7\u00a8\7"+
		"\13\2\2\u00a8\u00a9\b\17\1\2\u00a9\35\3\2\2\2\u00aa\u00ab\7\f\2\2\u00ab"+
		"\u00ac\b\20\1\2\u00ac\37\3\2\2\2\u00ad\u00ae\7\r\2\2\u00ae\u00af\b\21"+
		"\1\2\u00af!\3\2\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\b\22\1\2\u00b2#\3"+
		"\2\2\2\u00b3\u00b8\5\34\17\2\u00b4\u00b8\5\36\20\2\u00b5\u00b8\5 \21\2"+
		"\u00b6\u00b8\5\"\22\2\u00b7\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8%\3\2\2\2\u00b9\u00ba\7\5\2\2\u00ba"+
		"\'\3\2\2\2\u00bb\u00bc\7\3\2\2\u00bc)\3\2\2\2\u00bd\u00be\7\4\2\2\u00be"+
		"+\3\2\2\2\u00bf\u00c0\7\23\2\2\u00c0-\3\2\2\2\u00c1\u00c2\7\24\2\2\u00c2"+
		"/\3\2\2\2\u00c3\u00c4\7\21\2\2\u00c4\61\3\2\2\2\u00c5\u00c6\7\22\2\2\u00c6"+
		"\63\3\2\2\2\u00c7\u00c8\7\20\2\2\u00c8\65\3\2\2\2\u00c9\u00ca\7\6\2\2"+
		"\u00ca\67\3\2\2\2\u00cb\u00cc\b\35\1\2\u00cc9\3\2\2\2\13DZ\\b\u0083\u0090"+
		"\u0099\u00a2\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}