package behavior.template;

/**
 * <big>模板模式</big>
 * <p>定义具体操作的流程和需要的方法，由子类去实现</p>
 * <p>有点：封装了模板，而方法由子类去实现</p>
 * <p>缺点：每一个不同的子类都需要实现一遍，而且如果模板更改，其他子类也要更改</p>
 *
 * @author 13684
 * @data 2024/5/14 下午3:05
 */
public class TemplateApplication {
    public static void main(String[] args) {
        new Cricket().play();
        System.out.println("-----------------------------");
        new Football().play();
    }
}
