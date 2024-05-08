package behavior.memento;

import java.time.LocalDateTime;

/**
 * <big>备忘录模式</big>
 * <p>保存一个对象的某个状态，以便使用时直接恢复对象状态</p>
 * <p>优点：可以恢复历史状态，用户并不需要关心状态的保存细节</p>
 * <p>缺点：消耗资源，如果成员变多，每次保存都消耗资源</p>
 * <p>例子：游戏存档，ctrl+z 这里模拟ctrl+z</p>
 *
 * @author 13684
 * @data 2024/5/8 上午10:14
 */
public class MementoApplication {
    public static void main(String[] args) {
        // 使用者
        Originator originator = new Originator();
        // 存储者
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1");
        originator.setTime(LocalDateTime.now());

        // 保存状态
        careTaker.add(originator.saveStateToMemento());


        originator.setState("State 2");
        originator.setTime(LocalDateTime.now());

        // 保存状态
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State 3");
        originator.setTime(LocalDateTime.now());

        // 当前状态
        System.out.println("当前状态: " + originator.getState() + " " + originator.getTime());
        // 上一个状态
        originator.getStateFromMemento(careTaker.get());
        System.out.println("上一个状态: " + originator.getState() + " " + originator.getTime());

        // 上一个状态
        originator.getStateFromMemento(careTaker.get());
        System.out.println("上一个状态: " + originator.getState() + " " + originator.getTime());

        // 当前状态
        System.out.println("当前状态: " + originator.getState() + " " + originator.getTime());

    }
}
