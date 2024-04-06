package structure.adapter;

/**
 * <big>适配器模式</big>
 * <p>两个不兼容的接口之间的桥梁</p>
 *
 * @author 13684
 * @date 2024/4/5
 */
public class AdapterApplication {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }
}
