package behavior.strategy;

/**
 * <big>加法</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/11 下午2:40
 */
public class OperationAdd implements Strategy {
    @Override
    public int deOperation(int num1, int num2) {
        return num1 + num2;
    }
}
