package creational.prototype;

/**
 * <big>正方形</big>
 *
 * @author 13684
 * @date 2024/4/5
 */
public class Square extends Shape{
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square");
    }
}
