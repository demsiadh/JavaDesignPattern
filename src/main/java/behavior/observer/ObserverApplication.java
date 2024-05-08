package behavior.observer;

/**
 * <big>观察者模式</big>
 * <p>当一个对象的状态发生改变的时候，其所有依赖者都会收到通知并更新</p>
 * <p>优点：观察者和被观察者是抽象耦合，并且有一套触发机制</p>
 * <p>缺点：观察者过多，会增加系统复杂度，如果循环依赖，会形成死循环，观察者无法得知具体变化</p>
 * <p>例子：拍卖场</p>
 * @author 13684
 * @date 2024/5/8
 */
public class ObserverApplication {
    public static void main(String[] args) {
        // 1. 创建被观察者
        Subject subject = new Subject();

        // 2。 创建观察者
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
