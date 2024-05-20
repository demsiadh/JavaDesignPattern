package j2ee.composite;

/**
 * <big>粗粒度对象</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/20 下午5:32
 */
public class CoarseGrainedObject {
    private DependentObject1 do1 = new DependentObject1();
    private DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2) {
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData() {
        return new String[]{do1.getData(), do2.getData()};
    }
}
