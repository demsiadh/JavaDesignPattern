package j2ee.composite;

/**
 * <big>组合实体模式</big>
 * <p>有点类似Spring，会组装自己所需要的依赖对象</p>
 *
 * @author 13684
 * @data 2024/5/20 下午5:30
 */
public class CompositeApplication {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("First", "Second");
        client.printData();
        client.setData("Third", "Fourth");
        client.printData();
    }
}
