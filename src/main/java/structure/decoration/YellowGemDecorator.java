package structure.decoration;

/**
 * <big>黄宝石</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class YellowGemDecorator implements IEquipDecorator{

    /**
     * 每个装饰品维护一个装备
     */
    private IEquip equip;

    public YellowGemDecorator(IEquip equip)
    {
        this.equip = equip;
    }


    @Override
    public int calculateAttack() {
        return 10 + equip.calculateAttack();
    }

    @Override
    public String description() {
        return "黄宝石 + " + equip.description();
    }
}
