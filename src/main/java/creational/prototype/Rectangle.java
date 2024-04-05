package creational.prototype;

/**
 * <big>矩形</big>
 *
 * @author 13684
 * @date 2024/4/5
 */
public class Rectangle extends Shape{
    public Rectangle() {
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}
