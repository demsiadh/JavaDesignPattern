package j2ee.data;

/**
 * <big>数据访问对象模式</big>
 * <p>类似DAO层用于访问数据库</p>
 *
 * @author 13684
 * @data 2024/5/20 下午5:41
 */
public class DataApplication {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }


        //更新学生
        Student student =studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
