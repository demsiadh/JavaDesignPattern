package j2ee.intercepting;

/**
 * <big>拦截过滤器模式</big>
 * <p>拦截器</p>
 *
 * @author 13684
 * @data 2024/5/21 下午3:30
 */
public class InterceptingApplication {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
