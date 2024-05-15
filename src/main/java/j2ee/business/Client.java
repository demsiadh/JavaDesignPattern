package j2ee.business;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * <big>客户端</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/15 下午3:40
 */
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    BusinessDelegate businessService;

    public void doTask() {
        businessService.doTask();
    }
}
