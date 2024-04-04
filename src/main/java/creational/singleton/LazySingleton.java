package creational.singleton;

/**
 * <big>懒汉式-单例模式</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class LazySingleton {
    int value;
    private static volatile LazySingleton instance;
    private LazySingleton(int value)
    {
        this.value = value;
    }

    public static LazySingleton getInstance()
    {
        if (instance == null)
        {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton(1);
                }
            }
        }
        return instance;
    }
}
