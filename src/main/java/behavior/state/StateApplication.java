package behavior.state;

/**
 * <big>状态模式</big>
 * <p>允许对象在内部状态发生改变时改变它的行为，看起来对象好像修改了字节的类</p>
 * <p>优点：1、封装了转换规则。2、枚举可能的状态，在枚举状态之前，通常需要定义状态对象。3、枚举可能的状态，在枚举状态之前，通常需要定义状态对象。</p>
 * <p>缺点：增加了系统的类和对象的数量</p>
 * <p>例子：行为随状态变化的昌吉，条件分支语句的代替者</p>
 *
 * @author 13684
 * @data 2024/5/10 下午5:26
 */
public class StateApplication {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        StopState stopState = new StopState();
        stopState.doAction(context);

    }
}
