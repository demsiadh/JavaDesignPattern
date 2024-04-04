package creational.factory.method;

/**
 * <big>肉夹馍店</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public abstract class RoujiaMoStore {
    public abstract RoujiaMo createRoujiaMo(String type);
    /**
     * 根据传入类型卖一个肉夹馍
     *
     * @param type 类型
     * @return {@code RoujiaMo}
     */
    public RoujiaMo sellRouJiaMo(String type) {
        RoujiaMo roujiaMo = createRoujiaMo(type);
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
