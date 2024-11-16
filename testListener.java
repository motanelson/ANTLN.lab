// Generated from test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(testParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(testParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(testParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(testParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(testParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(testParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(testParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(testParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#subrotina}.
	 * @param ctx the parse tree
	 */
	void enterSubrotina(testParser.SubrotinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#subrotina}.
	 * @param ctx the parse tree
	 */
	void exitSubrotina(testParser.SubrotinaContext ctx);
}