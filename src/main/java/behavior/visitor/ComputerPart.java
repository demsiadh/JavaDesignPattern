package behavior.visitor;

/**
 * <big>元素接口</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/14 下午3:19
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
