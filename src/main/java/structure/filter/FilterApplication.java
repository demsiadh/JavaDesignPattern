package structure.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <big>过滤器模式</big>
 * <p>使用不同的标准得到单一标准的对象</p>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class FilterApplication {
    public static void main(String[] args) {
        // 初始化一个人员列表，包含不同性别和婚姻状况的人员
        List<Person> persons = new ArrayList<Person>();

        // 添加人员到列表中
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        // 创建不同条件的筛选标准
        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male); // 筛选单身男性
        Criteria singleOrFemale = new OrCriteria(single, female); // 筛选单身或女性

        // 打印筛选结果
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }

}
