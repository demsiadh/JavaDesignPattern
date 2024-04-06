package structure.bridging;

/**
 * <big>桥接模式</big>
 * <p>使抽象化和实现化解耦,使得二者可以独立变化</p>
 *
 * @author 13684
 * @date 2024/4/6
 */
public class BridgingApplication {
    public static void main(String[] args) {
        Circle redCircle = new Circle(1, 2, 3, new RedCircle());
        Circle greenCircle = new Circle(1, 2, 3, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
