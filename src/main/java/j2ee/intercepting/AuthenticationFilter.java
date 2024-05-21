package j2ee.intercepting;

/**
 * <big>身份验证拦截器</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/21 下午3:31
 */
public class AuthenticationFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
