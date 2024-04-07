package structure.filter;

import java.util.List;

/**
 * <big>和</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class AndCriteria implements Criteria{
    private final Criteria criteria;
    private final Criteria otherCriteria;
    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> people = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(people);
    }
}
