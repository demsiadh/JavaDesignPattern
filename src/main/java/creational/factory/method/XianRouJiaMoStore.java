package creational.factory.method;

/**
 * <big>西安肉夹馍店</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class XianRouJiaMoStore extends RoujiaMoStore{
    @Override
    public RoujiaMo createRoujiaMo(String type) {
        RoujiaMo roujiaMo = null;

        if ("Suan".equals(type)) {
            roujiaMo = new SuanRoujiaMo();
        } else if ("Tian".equals(type)) {
            roujiaMo = new TianRoujiaMo();
        } else if ("La".equals(type)) {
            roujiaMo = new LaRoujiaMo();
        } else {
            throw new RuntimeException("没有这种类型的肉夹馍");
        }

        return roujiaMo;
    }
}
