package interpreter.expressions;

import interpreter.abstract_expression.Expression;

import java.util.Map;

/**
 * Created by bnpinnovation on 2016. 8. 17..
 */
public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return number;
    }
}
