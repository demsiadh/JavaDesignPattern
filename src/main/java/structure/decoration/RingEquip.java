package structure.decoration;

/**
 * <big>戒指</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class RingEquip implements IEquip{
    @Override
    public int calculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "戒指";
    }
}
