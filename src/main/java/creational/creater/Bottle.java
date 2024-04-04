package creational.creater;

/**
 * <big>饼子类-实现包装接口，用来装水</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}
