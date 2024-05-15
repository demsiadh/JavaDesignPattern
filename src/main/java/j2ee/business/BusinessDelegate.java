package j2ee.business;

import lombok.Setter;

/**
 * <big>业务代表</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/15 下午3:38
 */
public class BusinessDelegate {
    private final BusinessLookUp lookupService = new BusinessLookUp();
    @Setter
    private String serviceType;

    public void doTask()
    {
        BusinessService businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
