package j2ee.mvc;

/**
 * <big>视图-差不多就是前端</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/15 下午3:24
 */
public class StudentView {
    /**
     * 打印出学生的全部信息
     * 和前端使用数据是一个道理
     * @param studentName 学生姓名
     * @param studentNo 学生学号
     */
    public void printStudentDetails(String studentName, String studentNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("No: " + studentNo);
    }
}
