package lista_8_Chain_of_Responsibility;

public class Vegetal extends AbstractCadeia {


    public Vegetal(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.print("Vegetal->"+message);
    }
}

