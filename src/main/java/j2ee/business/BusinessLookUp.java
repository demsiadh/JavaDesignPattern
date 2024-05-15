package j2ee.business;

/**
 * <big>业务查询服务</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/15 下午3:36
 */
public class BusinessLookUp {
    public static final String EJB = "EJB";
    public static final String JMS = "JMS";
    /**
     * 获取对应的实体业务
     * @param serviceType 业务类型
     * @return 业务实体
     */
    public BusinessService getBusinessService(String serviceType) {
        if ("EJB".equalsIgnoreCase(serviceType)) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
