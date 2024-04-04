package creational.singleton;

/**
 * <big>内部类-单例模式</big>
 * <p>这也是懒汉式单例模式，但是线程安全</p>
 * <p>因为静态内部类只会在第一次调用getInstance()方法时才会被加载，所以是线程安全的</p>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class InnerSingleton {
    int value;
    private InnerSingleton(int value)
    {
        this.value = value;
    }

    private static class InnerSingletonHolder
    {
        private static final InnerSingleton INSTANCE = new InnerSingleton(1);
    }

    public static InnerSingleton getInstance()
    {
        return InnerSingletonHolder.INSTANCE;
    }
}
