package creational.prototype;

/**
 * <big>圆形</big>
 *
 * @author 13684
 * @date 2024/4/5
 */
public class Circle extends Shape{
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle");
    }
}
