package lista_8_Chain_of_Responsibility;

public abstract class AbstractCadeia {

    public static int Vegetal = 1;
    public static int Grilo = 2;
    public static int Sapo = 3;
    public static int Cobra = 4;
    public static int Gaviao = 5;


    protected int level;

    protected AbstractCadeia nextLogger;

    public void setNextLogger(AbstractCadeia nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }


    }

    abstract protected void write(String message);


}
