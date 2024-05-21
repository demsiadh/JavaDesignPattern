package j2ee.intercepting;

/**
 * <big>处理类</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/21 下午3:32
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
