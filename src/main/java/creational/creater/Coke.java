package creational.creater;

/**
 * <big>饮品实现类-可乐</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 3f;
    }
}
