package creational.factory.abstraction;



/**
 * <big>肉夹馍工厂</big>
 *
 * @author 13684
 * @date 2024/4/4
 */
public class RoujiaMoFactory {
    public RoujiaMo createRoujiaMo(String type) {

        RoujiaMo roujiaMo = null;
        if ("Suan".equals(type)) {
            roujiaMo = new SuanRoujiaMo();
        } else if ("Tian".equals(type)) {
            roujiaMo = new TianRoujiaMo();
        } else if ("La".equals(type)) {
            roujiaMo = new LaRoujiaMo();
        } else {
            throw new RuntimeException("没有这种肉夹馍");
        }
        // 创建原料
        roujiaMo.prepare(new RouJiaMoYLFactory() {
            @Override
            public Meat createMeat() {
                return new Meat();
            }
            @Override
            public YuanLiao createYuanLiao() {
                return new YuanLiao();
            }
        });
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
