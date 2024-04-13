package behavior.chain;

/**
 * <big>抽象记录器</big>
 *
 * @author 13684
 * @date 2024/4/13
 */
public abstract class AbstractLogger {
    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int ERROR = 3;
    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger)
    {
        this.nextLogger = nextLogger;
    }
    public void logMessage(int level, String message)
    {
        if (this.level < level) {
            if (nextLogger != null) {
                nextLogger.logMessage(level, message);
            }else {
                System.out.println("未找到对应的记录器! " + message );
            }
        }else {
            this.write(message);
        }
    }

    public static AbstractLogger getLoggerChain(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);

        consoleLogger.nextLogger = fileLogger;
        fileLogger.nextLogger = errorLogger;
        return consoleLogger;
    }

    abstract protected void write(String message);
}
