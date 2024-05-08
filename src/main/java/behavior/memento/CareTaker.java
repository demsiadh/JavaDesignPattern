package behavior.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <big>照顾人</big>
 * <p>用来保存状态集合</p>
 *
 * @author 13684
 * @data 2024/5/8 上午10:35
 */
public class CareTaker {
    private final Stack<Memento> mementoList = new Stack<>();

    // 添加状态
    public void add(Memento memento) {
        mementoList.push(memento);
    }

    // 返回上一个状态
    public Memento get() {
        return mementoList.pop();
    }
}
