package creational.prototype;

/**
 * <big>原型模式</big>
 * <p>用于创建重复的对象,通过拷贝创建</p>
 *
 * @author 13684
 * @date 2024/4/5
 */
public class PrototypeApplication {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape("1");
        System.out.println(shape);
    }
}
