package lista_8_Chain_of_Responsibility;

public class Main {

    private static AbstractCadeia getCadeia() {
        AbstractCadeia vegetal = new Vegetal(AbstractCadeia.Vegetal);
        AbstractCadeia grilo = new Grilo(AbstractCadeia.Grilo);
        AbstractCadeia sapo = new Sapo(AbstractCadeia.Sapo);
        AbstractCadeia cobra = new Cobra(AbstractCadeia.Cobra);
        AbstractCadeia gaviao = new Gaviao(AbstractCadeia.Gaviao);

      vegetal.setNextLogger(grilo);
      grilo.setNextLogger(sapo);
      sapo.setNextLogger(cobra);
      cobra.setNextLogger(gaviao);
      gaviao.setNextLogger(null);
        
        
        
        return vegetal;

    }


    public static void main(String[] args) {
        AbstractCadeia cadeia = getCadeia();

        cadeia.logMessage(AbstractCadeia.Gaviao, "");
        System.out.println();
        cadeia.logMessage(AbstractCadeia.Vegetal, "");

        
        System.out.println();
        cadeia.logMessage(AbstractCadeia.Cobra, "");

    }
}
