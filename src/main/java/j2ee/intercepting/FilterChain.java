package j2ee.intercepting;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * <big>过滤器链</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/21 下午3:32
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    @Setter
    private Target target;
    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

}
