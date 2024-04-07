package structure.decoration;

/**
 * <big>武器</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class ArmEquip implements IEquip{
    @Override
    public int calculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "武器";
    }
}
