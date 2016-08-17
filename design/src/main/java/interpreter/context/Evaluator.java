package interpreter.context;

import interpreter.abstract_expression.Expression;
import interpreter.expressions.MinusExpression;
import interpreter.expressions.PlusExpression;

import java.util.Map;
import java.util.Stack;

/**
 * Created by bnpinnovation on 2016. 8. 17..
 */
public class Evaluator implements Expression {
    private Expression syntaxTree;

    public Evaluator(String expression) {
        Stack<Expression> expressionStack = new Stack<Expression>();
        for (String token : expression.split(" ")) {
            if (token.equals("+")) {
                Expression subExpression = new PlusExpression(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.equals("-")) {
                // it's necessary remove first the right operand from the stack
                Expression right = expressionStack.pop();
                // ..and after the left one
                Expression left = expressionStack.pop();
                Expression subExpression = new MinusExpression(left, right);
                expressionStack.push(subExpression);
            } else
                expressionStack.push(new Variable(token));
        }
        syntaxTree = expressionStack.pop();
    }

    public int interpret(Map<String, Expression> context) {
        return syntaxTree.interpret(context);
    }
}
