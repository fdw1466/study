package designPattern.action.ChainPattern;

/**
 * 责任链模式（行为型模式）
 * @author Administrator
 *
 */
public class Test {

	private static AbstractLogger getLogger() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLoggr(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger logger = getLogger();

		logger.logMessage(AbstractLogger.INFO, "This is an information.");
		logger.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		logger.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}

}
