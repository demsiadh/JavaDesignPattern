package structure.decoration;

/**
 * <big>红宝石</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class RedGemDecorator implements IEquipDecorator{
    private IEquip equip;
    public RedGemDecorator(IEquip equip) {
        this.equip = equip;
    }
    @Override
    public int calculateAttack() {
        return 15 + equip.calculateAttack();
    }

    @Override
    public String description() {
        return "红宝石 + " + equip.description();
    }
}
