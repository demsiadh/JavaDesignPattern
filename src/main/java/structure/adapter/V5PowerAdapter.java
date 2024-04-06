package structure.adapter;

/**
 * <big>220V转5V适配器</big>
 *
 * @author 13684
 * @date 2024/4/5
 */
public class V5PowerAdapter implements V5Power{
    private final V220Power v220Power;
    public V5PowerAdapter(V220Power v220Power)
    {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {
        int power = v220Power.provideV220Power();
        System.out.println("当前电压是 -> " + power);
        System.out.println("一系列操作 220V -> 5V");
        return 5;
    }
}
