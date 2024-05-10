package behavior.state;

/**
 * <big>开始状态</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/10 下午5:30
 */
public class StartState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
