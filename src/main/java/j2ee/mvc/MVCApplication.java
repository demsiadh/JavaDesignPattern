package j2ee.mvc;

/**
 * <big>MVC模式-模型 视图 控制图</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/15 下午3:21
 */
public class MVCApplication {
    public static void main(String[] args) {
        // 模拟从数据库中获取学生记录
        Student model = retrieveStudentFromDatabase();
        // 创建视图
        StudentView view = new StudentView();
        // 创建控制器
        StudentController controller = new StudentController(model, view);
        // 更新视图
        controller.updateView();

        // 更新数据模型
        controller.setModel(new Student("1111", "Tom"));
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Jack");
        student.setStuNo("10");
        return student;
    }
}
