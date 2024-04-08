package structure.combo;

import java.util.ArrayList;
import java.util.List;

/**
 * <big>员工类</big>
 *
 * @author 13684
 * @date 2024/4/8
 */
public class Employee {
    private String name; // 姓名
    private String dept; // 部门
    private int salary; // 工资
    private List<Employee> subordinates; // 下属员工列表

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    // 添加员工
    public void add(Employee e) {
        subordinates.add(e);
    }

    // 移除员工
    public void remove(Employee e) {
        subordinates.remove(e);
    }

    // 得到员工列表
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
