// Generated from Grmr.g4 by ANTLR 4.7.1

package spark.dataset;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link GrmrListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CustomDatasetListener extends DatasetBaseListener {

	String result = new String();

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	public String getResult(){
		return(result);
	}

	public String getArgs(String ctxData){
		int i = 0;
		int pCount = 0;
		char c;
		int argStart = ctxData.indexOf('(');
		for(i = argStart; i < ctxData.length(); i++){
			if(ctxData.charAt(i) == '('){
				pCount++;
			}else if(ctxData.charAt(i) == ')'){
				pCount--;
			}
			if(pCount == 0){break;}
		}
		int argEnd = i; 
		return(ctxData.substring(argStart+1, argEnd));
	}

	
	@Override public void enterProg(DatasetParser.ProgContext ctx) { 
		//System.out.println(ctx.getText() + " " + ctx.getRuleIndex());
		result += "spark";// + ctx.start().mod().getText(); 
		//////System.out.println(ctx.getText()); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProg(DatasetParser.ProgContext ctx) { ////System.out.println(ctx.getText()); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStart(DatasetParser.StartContext ctx) { ////System.out.println(ctx.getText()); 

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStart(DatasetParser.StartContext ctx) { //System.out.println(ctx.getText()); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	//@Override public void enterMore(DatasetParser.MoreContext ctx) { //System.out.println(ctx.getText()); 
		//System.out.println(ctx.getText() + " " + ctx.getRuleIndex());
	//}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	//@Override public void exitMore(DatasetParser.MoreContext ctx) { //System.out.println(ctx.getText()); 
	//}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMod(DatasetParser.ModContext ctx) { //System.out.println(ctx.getText());
		//System.out.println(ctx.getStart().getText());
		String ctxData = ctx.getStart().getText();
		switch(ctxData){
			case (".textFile("):
				result += ".read.textFile(" + getArgs(ctx.getText()) + ")";
				break;
			case (".range("):
				//result += ctx.getText();
				result += ".range(" + getArgs(ctx.getText()) + ")";
				break;
			case (".map("):
				//result += ctx.getText();
				result += ".map(" + getArgs(ctx.getText()) + ")";
				break;
			case (".filter("):
				//result += ctx.getText();
				result += ".filter(" + getArgs(ctx.getText()) + ")";
				break;
			case (".reduce("):
				result += ".select(reduceAggregator(" + getArgs(ctx.getText()) + ")).collect()";
				break;
			case (".reduceByKey("):
				result += ".groupByKey(_._1).agg(reduceByKeyAggregator(<func>" + getArgs(ctx.getText()) + "))";
				break;
			case (".sortBy("):
				result += ".map(row=>((" + getArgs(ctx.getText()) + ")(row), row)).orderBy(\"_1\").map(_._2)";
				break;
			case (".collect("):
				result += ".collect(" + getArgs(ctx.getText()) + ")";
				break;
			case ("<EOF>"):
				break;
			default: 
				break;
				//result += ctx.getText();
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMod(DatasetParser.ModContext ctx) { //System.out.println(ctx.getText()); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc(DatasetParser.FuncContext ctx) { //System.out.println(ctx.getText()); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc(DatasetParser.FuncContext ctx) { //System.out.println(ctx.getText()); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFuncSym(DatasetParser.FuncSymContext ctx) { //System.out.println(ctx.getText()); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFuncSym(DatasetParser.FuncSymContext ctx) { //System.out.println(ctx.getText()); 
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { //System.out.println(ctx.getText()); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { //System.out.println(ctx.getText()); 
	}
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