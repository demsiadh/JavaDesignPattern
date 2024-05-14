package behavior.visitor;

/**
 * <big></big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/14 下午3:23
 */
public class Computer implements ComputerPart{
    ComputerPart[] computerParts;
    public Computer() {
        computerParts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
