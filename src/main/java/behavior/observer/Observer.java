package behavior.observer;

/**
 * <big>观察者抽象类</big>
 *
 * @author 13684
 * @date 2024/5/8
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
