package creational.creater;

/**
 * <big>饮品实现类-百事</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "ColdDrink";
    }

    @Override
    public float price() {
        return 3f;
    }
}
