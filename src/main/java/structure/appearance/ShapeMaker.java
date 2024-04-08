package structure.appearance;

/**
 * <big>外观类</big>
 * <p>这里只是模拟。在Spring中可以通过依赖注入，直接注入所有的Shape实现类，没必要现在这么麻烦</p>
 *
 * @author 13684
 * @date 2024/4/8
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker()
    {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
