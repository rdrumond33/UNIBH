package lista_8_Chain_of_Responsibility;

public class Grilo extends AbstractCadeia {

    public Grilo(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.print("Grilo->"+message);
    }
}
