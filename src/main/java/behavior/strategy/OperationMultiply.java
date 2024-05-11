package behavior.strategy;

/**
 * <big></big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/11 下午2:49
 */
public class OperationMultiply implements Strategy{
    @Override
    public int deOperation(int num1, int num2) {
        return num1 * num2;
    }
}
