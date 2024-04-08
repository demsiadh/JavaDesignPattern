package structure.appearance;

/**
 * <big>外观模式</big>
 * <p>对外隐藏系统内容，提供接口调用</p>
 *
 * @author 13684
 * @date 2024/4/8
 */
public class AppearanceApplication {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
