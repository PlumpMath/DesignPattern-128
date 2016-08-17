package interpreter.expressions;

import interpreter.abstract_expression.Expression;

import java.util.Map;

/**
 * Created by bnpinnovation on 2016. 8. 17..
 */
public class MinusExpression implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public MinusExpression(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}