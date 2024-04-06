package structure.bridging;

/**
 * <big>图形抽象类，传入绘画的API</big>
 *
 * @author 13684
 * @date 2024/4/6
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
