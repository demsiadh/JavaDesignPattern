package behavior.strategy;

/**
 * <big>减法</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/11 下午2:48
 */
public class OperationSubtract implements Strategy{
    @Override
    public int deOperation(int num1, int num2) {
        return num1 - num2;
    }
}
