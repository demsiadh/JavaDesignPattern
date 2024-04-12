package structure.flyweight;

/**
 * <big>享元模式</big>
 * <p>主要用于减少创建对象的数量，以减少内存占用和提高性能</p>
 *
 * @author 13684
 * @date 2024/4/12
 */
public class FlyweightApplication {
    private static final String[] COLORS = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }
}
