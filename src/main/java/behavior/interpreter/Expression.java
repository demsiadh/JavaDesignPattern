package behavior.interpreter;

/**
 * 表达式接口
 */
public interface Expression {
    boolean interpret(String context);
}
