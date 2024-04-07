package structure.decoration;

/**
 * <big>鞋子</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public class ShoeEquip implements IEquip{
    @Override
    public int calculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "鞋子";
    }
}
