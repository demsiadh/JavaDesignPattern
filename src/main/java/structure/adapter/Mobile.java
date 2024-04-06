package structure.adapter;

/**
 * <big>手机类</big>
 *
 * @author 13684
 * @date 2024/4/5
 */
public class Mobile {

    public void inputPower(V5Power power)
    {
        System.out.println("需要5V电压充电，现在是->" + power.provideV5Power() + "V");
    }
}
