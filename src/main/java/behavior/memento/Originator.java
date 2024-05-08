package behavior.memento;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * <big>发起者</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/8 上午10:32
 */
@Data
public class Originator {
    private String state;
    private LocalDateTime time;

    /**
     * 保存状态
     * @return 保存的状态
     */
    public Memento saveStateToMemento()
    {
        return new Memento(state, LocalDateTime.now());
    }

    /**
     * 恢复状态
     * @param memento 状态
     */
    public void getStateFromMemento(Memento memento)
    {
        state = memento.getState();
        time = memento.getTime();
    }
}
