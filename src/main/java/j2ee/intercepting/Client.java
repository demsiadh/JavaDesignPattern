package j2ee.intercepting;

/**
 * <big>客户端</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/21 下午3:35
 */
public class Client {
    FilterManager filterManager;
    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
