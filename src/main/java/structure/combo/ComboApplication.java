package structure.combo;

/**
 * <big>组合模式</big>
 *
 * @author 13684
 * @date 2024/4/8
 */
public class ComboApplication {
    public static void main(String[] args) {
        // 创建CEO员工对象
        Employee CEO = new Employee("John", "CEO", 30000);

        // 创建销售部主管和市场部主管对象
        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        // 创建市场部和销售部的职员对象
        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        // 将销售部和市场部主管添加到CEO的下属中
        CEO.add(headSales);
        CEO.add(headMarketing);
        // 将销售部和市场部的员工添加到各自主管的下属中
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        // 打印CEO及其下属的组织结构
        System.out.println(CEO);
        // 遍历CEO的直接下属（销售部和市场部主管）
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            // 遍历各主管的直接下属（销售部执行员和市场部职员）
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }

    }
}
