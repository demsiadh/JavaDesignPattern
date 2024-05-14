package behavior.visitor;

/**
 * <big>被访问的实体</big>
 *
 * @author 13684
 * @data 2024/5/14 下午3:21
 */
public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
