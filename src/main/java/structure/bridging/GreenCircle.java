package structure.bridging;

/**
 * <big>绿色圆形</big>
 *
 * @author 13684
 * @date 2024/4/6
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
