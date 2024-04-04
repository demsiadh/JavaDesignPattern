package creational.creater;

/**
 * <big>食品实现类-素食汉堡</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 22.5f;
    }
}
