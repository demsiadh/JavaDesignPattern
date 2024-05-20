package j2ee.composite;

/**
 * <big>使用组合实体的客户端类</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/20 下午5:35
 */
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();
    public void printData() {
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
