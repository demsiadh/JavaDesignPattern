package j2ee.mvc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <big>学生控制器</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/15 下午3:26
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentController {
    private Student model;
    private StudentView view;

    /**
     * 更新视图
     */
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getStuNo());
    }
}
