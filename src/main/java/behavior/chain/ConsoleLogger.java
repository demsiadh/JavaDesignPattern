package behavior.chain;

/**
 * <big></big>
 *
 * @author 13684
 * @date 2024/4/13
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
