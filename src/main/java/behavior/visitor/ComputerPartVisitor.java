package behavior.visitor;

/**
 * <big>访问者类接口</big>
 * <p></p>
 *
 * @author 13684
 * @data 2024/5/14 下午3:19
 */
public interface ComputerPartVisitor {
    /**
     * 访问方法
     * @param computer 访问的实体
     */
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
