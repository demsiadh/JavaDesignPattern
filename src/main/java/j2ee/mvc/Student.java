package j2ee.mvc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <big>模型-也就是实体</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/15 下午3:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String stuNo;
    private String name;
}
