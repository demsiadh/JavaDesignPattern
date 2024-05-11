package behavior.strategy;

/**
 * <big>策略模式</big>
 * <p>根据需求选择不同的策略，选择不同的行为和算法</p>
 * <p>优点：算法可以自由切换，拓展性好，避免了多重判断</p>
 * <p>缺点：策略类会增多，所有的策略都需要对外暴露</p>
 * <p>例子：出行方式：骑自行车、坐地铁、坐公交 本例子则为计算模式+-*÷</p>
 * <p>其实这里可以直接使用枚举解决，例如：OperationEnum</p>
 *
 * @author 13684
 * @data 2024/5/11 下午2:32
 */
public class StrategyApplication {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context.setStrategy(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        context.setStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
