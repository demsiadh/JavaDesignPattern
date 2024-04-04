package creational.factory.method;

/**
 * <big>工厂方法模式</big>
 * <p>定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法模式把类实例化的过程推迟到子类。</p>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class MethodFactoryApplication {
    public static void main(String[] args) {
        RoujiaMoStore store = new XianRouJiaMoStore();
        RoujiaMo roujiaMo = store.sellRouJiaMo("Suan");
        System.out.println(roujiaMo.name);
    }
}
