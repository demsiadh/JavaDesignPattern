package behavior.chain;

/**
 * <big>责任链模式</big>
 * <p>用于链路已知，且有先后顺序</p>
 *
 * @author 13684
 * @date 2024/4/13
 */
public class ChainApplication {
    public static void main(String[] args) {
        AbstractLogger loggerChain = AbstractLogger.getLoggerChain();

        loggerChain.logMessage(4, "错误记录");
        loggerChain.logMessage(AbstractLogger.DEBUG, "DEBUG");
        loggerChain.logMessage(AbstractLogger.INFO, "INFO");
        loggerChain.logMessage(AbstractLogger.ERROR, "ERROR");
    }
}
