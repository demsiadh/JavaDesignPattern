package structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <big>女</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if ("FEMALE".equalsIgnoreCase(person.getGender())) {
                result.add(person);
            }
        }
        return result;
    }
}
