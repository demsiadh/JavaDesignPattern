package creational.singleton;

/**
 * <big>枚举-单例模式(线程安全)</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public enum EnumSingleton {
    INSTANCE(1);

    int value;
    private EnumSingleton(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
