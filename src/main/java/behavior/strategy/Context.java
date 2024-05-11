package behavior.strategy;

/**
 * <big>环境类</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/11 下午2:49
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.deOperation(num1, num2);
    }
}
