package behavior.mediator;

/**
 * <big>聊天室</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/8 上午9:58
 */
public class ChatRoom {
    /**
     * 展示消息
     * @param user 用户
     * @param message 消息内容
     */
    public static void showMessage(User user, String message) {
        System.out.println(user.getName() + ": " + message);
    }
}
