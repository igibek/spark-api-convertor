// Generated from Dataframe.g4 by ANTLR 4.7.1

package spark.dataframe;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
// import DataframeParser.*;

/**
 * This class provides an empty implementation of {@link DataframeListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CustomDataframeListener implements DataframeListener {

  String result = "";
	boolean isSimpleUdf = false;
	String simpleExpression = "";
	String complexExpression = "";
	String pureExpression = "";
	ArrayList<String> expressions;
	Map<String, String> map;
  
	public String getResult() {
    return result;
  }

	private String transform(DataframeParser.Pure_expressionContext ctx) {
		if (ctx.identity() != null) {
			return map.get(ctx.getText());
		} else if (ctx.NUMBER() != null) {
			return ctx.NUMBER().getText();
		} else if (ctx.op() != null) {
			return transform(ctx.pure_expression(0)) + ctx.op().getText() + transform(ctx.pure_expression(1));
		} 
		return null;
	}
	private String transform(DataframeParser.Comp_expressionContext ctx) {
		return transform(ctx.pure_expression(0)) + ctx.comp().getText() + transform(ctx.pure_expression(1)); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(DataframeParser.ProgramContext ctx) { 
		result = "spark.range(";
		String args = "";
		for(TerminalNode node: ctx.NUMBER()) {
			args += node.getText() + ",";
		}
		args = args.substring(0, args.length()-1);
		result += args + ").selectExpr(\"id as _1\")";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(DataframeParser.ProgramContext ctx) { 
		result += ".collect()";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMapops(DataframeParser.MapopsContext ctx) {
		result += ".selectExpr(";
		
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMapops(DataframeParser.MapopsContext ctx) { 
		result += ")";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUdf(DataframeParser.UdfContext ctx) {
		simpleExpression = "";
		map = new HashMap<String, String>();
		expressions = new ArrayList<String>();
		// result += ctx.getText();
		System.out.println("\n> ENTER: " + ctx.getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUdf(DataframeParser.UdfContext ctx) {
		for(int i = 0; i < expressions.size(); i++) {
			Integer tag = i + 1;
			result += "\"" + expressions.get(i) + " as _" + tag.toString() + "\", ";
		}
		result = result.substring(0, result.length()-2);
		System.out.println("> EXIT UDF");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(DataframeParser.ExpressionContext ctx) { 
		// String start = ctx.getStart().getText();
		// if (start.equals("{")) {
		// 	System.out.println("> COMPLEX: " + ctx.getText());
		// 	isSimpleUdf = false;
		// } else {
		// 	System.out.println("> SIMPLE: " + ctx.getText());
		// 	isSimpleUdf = true;
		// }
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(DataframeParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimple_expression(DataframeParser.Simple_expressionContext ctx) { 
		pureExpression = "";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimple_expression(DataframeParser.Simple_expressionContext ctx) { 
		simpleExpression += pureExpression;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTuple_expression(DataframeParser.Tuple_expressionContext ctx) { 
		System.out.println("> TUPLE EXPR: " + ctx.pure_expression().size());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTuple_expression(DataframeParser.Tuple_expressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComplex_expression(DataframeParser.Complex_expressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComplex_expression(DataframeParser.Complex_expressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssign_exprs(DataframeParser.Assign_exprsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssign_exprs(DataframeParser.Assign_exprsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssign_expr(DataframeParser.Assign_exprContext ctx) { 
		// 1. detect identifier
		// 2. mark it for substitution with the right hand side.
		// 3. store the value inside a key-value dictionary
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssign_expr(DataframeParser.Assign_exprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPure_expression(DataframeParser.Pure_expressionContext ctx) { 
		// pureExpression = "";
		// String start = ctx.getText() + " " + ctx.getRuleIndex() + " " + ctx.getAltNumber();
		// System.out.println(start);
		if (!(ctx.getParent() instanceof DataframeParser.Pure_expressionContext)) {
			pureExpression = "";
		}
		
		if (ctx.getStart().getText().equals("if")) {
			System.out.println("\nif statement");
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPure_expression(DataframeParser.Pure_expressionContext ctx) {
		
		if (ctx.op() != null) {
			System.out.println("> HAS OPERATION: " + ctx.getText());
			pureExpression += ctx.op().getText() + transform(ctx.pure_expression(1));
			if (ctx.pure_expression(0).identity() != null) {
				pureExpression = transform(ctx.pure_expression(0)) + pureExpression;
			}
		} else if(ctx.getStart().getText().equals("if")) {
			pureExpression = "if(" 
				+ transform(ctx.comp_expression())
				+ "," 
				+ transform(ctx.pure_expression(0)) 
				+ "," 
				+ transform(ctx.pure_expression(1)) 
				+ ")";
		} else if (ctx.getStart().getText().equals("(")) {
			pureExpression = "(" + pureExpression + ")";
		} else if (ctx.identity() != null && ctx.identity().IDENTIFIER().size() == 1) {
			System.out.println("> IDENTITY: " + ctx.identity().getText());
			pureExpression += transform(ctx);
		} else if (ctx.NUMBER() != null) {
			pureExpression += transform(ctx);
		}

		if (ctx.getParent() instanceof DataframeParser.Tuple_expressionContext || ctx.getParent() instanceof DataframeParser.Simple_expressionContext) {
			System.out.println("> EXIT PURE: " + ctx.getText() + " --> " + pureExpression);
			expressions.add(pureExpression);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIdentity(DataframeParser.IdentityContext ctx) {
		String value = "";
		if (ctx.getParent() instanceof DataframeParser.Assign_exprContext) {
			System.out.println("> PARENT: " + ctx.getParent().getText());
			DataframeParser.Assign_exprContext parent = (DataframeParser.Assign_exprContext)ctx.getParent();
			value = transform(parent.pure_expression());
		} else {
			if (ctx.IDENTIFIER().size() > 1) {
				value = ctx.IDENTIFIER(1).getText();
			} else {
				Integer i = map.size()+1;
				value = "_" + i.toString();
			}
		}
		if (!map.containsKey(ctx.getText())) {
			System.out.println("> MAP IDENTIFIER: " + ctx.getText() + " --> " + value);
			map.put(ctx.getText(), value);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIdentity(DataframeParser.IdentityContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComp_expression(DataframeParser.Comp_expressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComp_expression(DataframeParser.Comp_expressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOp(DataframeParser.OpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOp(DataframeParser.OpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComp(DataframeParser.CompContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComp(DataframeParser.CompContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}