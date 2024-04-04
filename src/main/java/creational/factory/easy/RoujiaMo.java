package creational.factory.easy;

/**
 * <big>肉夹馍抽象类</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public abstract class RoujiaMo {
    protected String name;

    public void prepare() {
        System.out.println("揉面-剁肉-完成准备工作");
    }

    public void fire() {
        System.out.println("放入你们的肉-放入你们的蔬菜-放入你们的调料-完成 firing");
    }

    public void pack() {
        System.out.println("打包-完成打包");
    }

    public void sell() {
        System.out.println("卖肉夹馍");
    }
}
