package structure.decoration;

/**
 * <big>装饰器模式</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class DecorationApplication {
    public static void main(String[] args) {
        System.out.println("一颗红宝石，两颗蓝宝石的装备，鞋子");
        RedGemDecorator redGemDecorator = new RedGemDecorator(new BlueGemDecorator(new BlueGemDecorator(new ShoeEquip())));
        System.out.println("攻击力： " + redGemDecorator.calculateAttack());
        System.out.println("描述: " + redGemDecorator.description());
    }
}
