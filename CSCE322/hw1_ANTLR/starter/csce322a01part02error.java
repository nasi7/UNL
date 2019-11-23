import java.io.IOException;
import org.antlr.v4.runtime.*;

class csce322a01part02error extends BaseErrorListener {
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int position, String msg,
			RecognitionException e) {
		// replace with code to process syntax errors
		System.err.println(msg);
		System.out.printf("Something on Line %d is Problematic.", line);
		System.exit(0);
	}
}
