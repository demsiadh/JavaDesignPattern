package structure.filter;

import lombok.Getter;

/**
 * <big>人</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
@Getter
public class Person {
    private final String name;
    private final String gender;
    private final String maritalStatus;
    public Person(String name, String gender, String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}
