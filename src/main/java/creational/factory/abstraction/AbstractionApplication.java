package creational.factory.abstraction;

/**
 * <big>抽象工厂模式</big>
 * <p>提供一个接口，用于创建相关的或依赖对象的家族，而不需要明确指定具体类。</p>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class AbstractionApplication {
    public static void main(String[] args) {
        RoujiaMoStore roujiaMoStore = new RoujiaMoStore(new RoujiaMoFactory());
        RoujiaMo suan = roujiaMoStore.sellRoujiaMo("Suan");
        System.out.println(suan.name);
    }
}
