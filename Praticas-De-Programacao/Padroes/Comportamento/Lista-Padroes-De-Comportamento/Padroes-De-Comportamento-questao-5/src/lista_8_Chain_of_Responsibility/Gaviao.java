package lista_8_Chain_of_Responsibility;

public class Gaviao extends  AbstractCadeia {
    public Gaviao(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.print("Gaviao->"+message);
    }
}
