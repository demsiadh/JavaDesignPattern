package j2ee.controller;

/**
 * <big>前端控制器模式</big>
 * <p>三层架构中的前端控制器模式</p>
 *
 * @author 13684
 * @data 2024/5/21 下午3:26
 */
public class ControllerApplication {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
