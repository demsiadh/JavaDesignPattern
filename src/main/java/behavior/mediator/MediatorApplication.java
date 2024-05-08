package behavior.mediator;

/**
 * <big>中介者模式</big>
 * <p>通过一个中介来处理类与类之间的联系，降低类之间的耦合</p>
 * <p>优点：降低类之间的耦合，减少了通讯复杂程度</p>
 * <p>缺点：中介者类的职责过重，导致中介者类功能过于复杂，难以维护</p>
 * <p>例子：群聊，没有群聊就是单独找每一个人通信，有了群聊，可以直接在群里找到他通讯</p>
 *
 * @author 13684
 * @data 2024/5/8 上午9:50
 */
public class MediatorApplication {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User();
    }
}
