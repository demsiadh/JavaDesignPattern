package behavior.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * <big>主题-被观察者</big>
 *
 * @author 13684
 * @date 2024/5/8
 */
public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int state;
    public Subject() {
        this.state = 0;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 添加观察者
     * @param observer 观察者
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知观察者变化
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
