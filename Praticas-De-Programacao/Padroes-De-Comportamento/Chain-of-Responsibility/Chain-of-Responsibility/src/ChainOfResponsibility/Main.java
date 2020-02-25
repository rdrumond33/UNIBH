package ChainOfResponsibility;

public class Main {

    public static AbstractLogger getChainOFLogeers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);


        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);


        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOFLogeers();

        System.out.println("");

        loggerChain.logMessage(AbstractLogger.INFO, "this is an information");
        System.out.println("");

        loggerChain.logMessage(AbstractLogger.DEBUG, "this is an debug level information");
        System.out.println("");

        loggerChain.logMessage(AbstractLogger.ERROR, "this is an error information");
        System.out.println("");

    }
}
