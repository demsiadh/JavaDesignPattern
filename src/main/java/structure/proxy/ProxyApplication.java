package structure.proxy;

/**
 * <big>代理模式</big>
 * <p>用一个类代表领一个类的行为，并进行增强</p>
 *
 * @author 13684
 * @date 2024/4/12
 */
public class ProxyApplication {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_10mb.jpg");
        // 不使用默认文件
        image1.display();
        System.out.println(" ");
        // 使用默认文件
        Image image2 = new ProxyImage();
        image2.display();
    }
}
