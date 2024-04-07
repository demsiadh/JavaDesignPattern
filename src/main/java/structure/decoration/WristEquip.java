package structure.decoration;

/**
 * <big>护腕</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class WristEquip implements IEquip{
    @Override
    public int calculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "护腕";
    }
}
