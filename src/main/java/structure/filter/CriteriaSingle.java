package structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <big>单身</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result =new ArrayList<>();
        for (Person person : persons) {
            if ("SINGLE".equalsIgnoreCase(person.getMaritalStatus())){
                result.add(person);
            }
        }
        return result;
    }
}
