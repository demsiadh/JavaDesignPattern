package creational.creater;

/**
 * <big>Item接口的抽象类，实现Item接口，并实现Item接口中的方法</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing()
    {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
