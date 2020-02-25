package lista_8_Chain_of_Responsibility;

public class Sapo extends AbstractCadeia {


    public Sapo(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.print("Sapo->"+message);
    }
}
