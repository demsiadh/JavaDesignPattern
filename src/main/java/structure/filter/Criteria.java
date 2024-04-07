package structure.filter;

import java.util.List;

/**
 * <big>过滤标准接口</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
