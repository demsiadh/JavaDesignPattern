package behavior.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * <big>备忘录</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/8 上午10:19
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Memento {
    // 状态
    private String state;
    // 时间
    private LocalDateTime time;
}
