package behavior.chain;

/**
 * <big></big>
 *
 * @author 13684
 * @date 2024/4/13
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
