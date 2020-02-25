package lista_8_Chain_of_Responsibility;

public class Cobra extends  AbstractCadeia {

    public Cobra(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.print("Cobra->"+message);
    }
}
