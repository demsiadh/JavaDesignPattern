package creational.creater;

/**
 * <big>Item的实现接口。用来存放饮品</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
