package interpreter.context;

import interpreter.abstract_expression.Expression;

import java.util.Map;

/**
 * Created by bnpinnovation on 2016. 8. 17..
 */
public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(Map<String, Expression> variables) {
        if (null == variables.get(name)) return 0; //Either return new Number(0).
        return variables.get(name).interpret(variables);
    }
}
