// Generated from grmr.g4 by ANTLR 4.7.1

  package spark.dataset;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grmrParser}.
 */
public interface grmrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grmrParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(grmrParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmrParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(grmrParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmrParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(grmrParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmrParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(grmrParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmrParser#more}.
	 * @param ctx the parse tree
	 */
	void enterMore(grmrParser.MoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmrParser#more}.
	 * @param ctx the parse tree
	 */
	void exitMore(grmrParser.MoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmrParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(grmrParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmrParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(grmrParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link grmrParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(grmrParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link grmrParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(grmrParser.FuncContext ctx);
}