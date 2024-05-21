package j2ee.intercepting;

/**
 * <big>过滤管理器</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/21 下午3:35
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
