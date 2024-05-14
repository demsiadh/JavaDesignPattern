package behavior.visitor;

/**
 * <big>访问者模式</big>
 * <p>主要将数据结构和数据操作分离，根据不同的访问者访问不同的部分</p>
 * <p>优点：符合单一职责，扩展性高，灵活性高</p>
 * <p>缺点：具体元素变更更加困难，违反迪米特原则，违反依赖倒置原则</p>
 *
 *
 * @author 13684
 * @data 2024/5/14 下午3:16
 */
public class VisitorApplication {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        ComputerPart mouse = new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());
    }
}
