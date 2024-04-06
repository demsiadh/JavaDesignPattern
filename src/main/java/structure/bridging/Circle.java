package structure.bridging;

/**
 * <big>圆-实现类，传入不同的实现类，绘画不同的圆</big>
 *
 * @author 13684
 * @date 2024/4/6
 */
public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
