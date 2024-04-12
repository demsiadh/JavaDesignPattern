package structure.flyweight;

import java.util.HashMap;

/**
 * <big>图形工厂</big>
 *
 * @author 13684
 * @date 2024/4/12
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circle.setY(getRandomY());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
