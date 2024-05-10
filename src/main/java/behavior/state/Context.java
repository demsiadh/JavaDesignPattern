package behavior.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <big>概要</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/10 下午5:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Context {
    private State state;
}
