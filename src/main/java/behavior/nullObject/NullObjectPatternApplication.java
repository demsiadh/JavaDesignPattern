package behavior.nullObject;

/**
 * <big>空对象模式</big>
 * <p>利用空对象来处理对象空指针的情况，算是一种特殊处理</p>
 * <p>优点：处理了空对象的情况</p>
 * <p>缺点：增加了类的个数</p>
 *
 * @author 13684
 * @data 2024/5/11 下午2:19
 */
public class NullObjectPatternApplication {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
