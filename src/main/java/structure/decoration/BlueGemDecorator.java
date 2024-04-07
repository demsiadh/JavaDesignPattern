package structure.decoration;

/**
 * <big>蓝宝石</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class BlueGemDecorator implements IEquipDecorator{
    // 每个装饰品维护一件装备
    private IEquip iEquip;
    public BlueGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }
    @Override
    public int calculateAttack() {
        return 5 + iEquip.calculateAttack();
    }

    @Override
    public String description() {
        return "蓝宝石 + " + iEquip.description();
    }
}
