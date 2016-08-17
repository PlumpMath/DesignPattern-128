package interpreter;

import interpreter.abstract_expression.Expression;
import interpreter.context.Evaluator;
import interpreter.expressions.NumberExpression;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bnpinnovation on 2016. 8. 17..
 */
public class Main {
    /*
    재귀 프로그램
    문법규칙을 클래스로 표현한 구조
    도메인 특화 언어를 사용하기 위한 디자인 패턴
    특화 언어는 범용 언어보다 고속으로 처리될 수 있다.
    보통 각각의 심볼에 대한 클래스를 가진다.
    특화 언어의 예: SQL, 통신프로토콜 언어 등
    */
    public static void main(String[] ar) {
        String expression = "w x z - +";
        Evaluator sentence = new Evaluator(expression);
        Map<String, Expression> variables = new HashMap<String, Expression>();
        variables.put("w", new NumberExpression(5));
        variables.put("x", new NumberExpression(10));
        variables.put("z", new NumberExpression(42));
        int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
