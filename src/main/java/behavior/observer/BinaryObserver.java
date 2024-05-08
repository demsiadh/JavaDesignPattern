package behavior.observer;

/**
 * <big>实体观察者</big>
 *
 * @author 13684
 * @date 2024/5/8
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
