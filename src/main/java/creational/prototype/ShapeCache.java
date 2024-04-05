package creational.prototype;

import java.util.Hashtable;

/**
 * <big>形状缓存池</big>
 *
 * @author 13684
 * @date 2024/4/5
 */
public class ShapeCache {
    private static final Hashtable<String, Shape> SHAPE_MAP = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = SHAPE_MAP.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        SHAPE_MAP.put(circle.getId(), circle);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        SHAPE_MAP.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        SHAPE_MAP.put(square.getId(), square);
    }

    public static Shape removeShape(String shapeId) {
        return SHAPE_MAP.remove(shapeId);
    }

    public static void addShape(String shapeId, Shape shape) {
        SHAPE_MAP.put(shapeId, shape);
    }

}
