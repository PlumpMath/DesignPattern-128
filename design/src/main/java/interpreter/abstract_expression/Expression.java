package interpreter.abstract_expression;

import java.util.Map;

/**
 * Created by bnpinnovation on 2016. 8. 17..
 */
public interface Expression {
    public int interpret(Map<String, Expression> variables);
}
