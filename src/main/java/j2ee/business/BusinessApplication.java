package j2ee.business;

/**
 * <big>业务代表模式</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/15 下午3:33
 */
public class BusinessApplication {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType(BusinessLookUp.EJB);

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType(BusinessLookUp.JMS);
        client.doTask();
    }
}
