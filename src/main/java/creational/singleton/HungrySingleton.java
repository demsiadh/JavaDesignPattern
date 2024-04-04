package creational.singleton;

/**
 * <big>饿汉式单列模式</big>
 * <p>由于直接加载，所以不会有线程安全问题</p>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class HungrySingleton {
    int value;
    private static final HungrySingleton INSTANCE = new HungrySingleton(1);
    private HungrySingleton(int value){
        this.value = value;
    }

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
}
