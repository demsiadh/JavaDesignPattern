package j2ee.service;

/**
 * <big>服务定位器模式</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/21 下午3:39
 */
public class ServiceApplication {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
