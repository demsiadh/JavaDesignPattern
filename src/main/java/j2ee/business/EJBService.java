package j2ee.business;

/**
 * <big>实体业务服务类</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/15 下午3:34
 */
public class EJBService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("EJBService: Do processing");
    }
}
