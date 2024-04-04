package creational.creater;

/**
 * <big>食品的实现类-鸡肉汉堡</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 4f;
    }
}
