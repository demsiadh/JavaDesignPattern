package structure.filter;

import java.util.List;

/**
 * <big>或</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class OrCriteria implements Criteria{
    private final Criteria criteria;
    private final Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = criteria.meetCriteria(persons);
        List<Person> second = otherCriteria.meetCriteria(persons);
        for (Person person : second) {
            if (!first.contains(person)) {
                first.add(person);
            }
        }
        return first;
    }
}
