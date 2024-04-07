package structure.decoration;

/**
 * <big>装备的接口</big>
 *
 * @author 13684
 * @date 2024/4/7
 */
public interface IEquip {

    /**
     * 计算攻击力
     *
     * @return 攻击力
     */
    int calculateAttack();
    /**
     * 装备描述
     *
     * @return java.lang.String
     */
    String description();
}
