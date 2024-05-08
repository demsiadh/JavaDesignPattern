package behavior.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <big>用户类</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/8 上午9:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;

    public void showMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
