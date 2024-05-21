package j2ee.intercepting;

/**
 * <big>日志拦截器</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/21 下午3:31
 */
public class DebugFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
