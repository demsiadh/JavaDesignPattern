package j2ee.composite;

/**
 * <big>组合实体</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/20 下午5:34
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
