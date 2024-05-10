package behavior.state;

/**
 * <big>停止状态</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/10 下午5:33
 */
public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
