package behavior.visitor;

/**
 * <big>被访问的实体类</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/14 下午3:23
 */
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
