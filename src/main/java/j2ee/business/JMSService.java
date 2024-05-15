package j2ee.business;

/**
 * <big>实体业务服务类</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/15 下午3:35
 */
public class JMSService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("JMSService: Do processing");
    }
}
