package trabalho_integral;

import java.util.*;

/**
 *
 * @author Rodrigo Drumond de Paula
 */
public class Trabalho_integral {

    public static void main(String[] args) {
        //f(x)=-x^2+4

        Scanner ent = new Scanner(System.in);
        Scanner ent_1 = new Scanner(System.in);

        Verificacao cal = new Verificacao();
        String verificacao = "", particao = "";

        do {
            System.out.println("Digite ponto inicial (A): ");
            cal.setA(ent.nextDouble());
            System.out.println("Digite ponto final (B):");
            cal.setB(ent.nextDouble());
            while (cal.verificacao_intervalo()) {
                System.out.println("O valor de a deve ser obrigatoriamente menor que o valor de b");
                System.out.println("digite um valor valido: ");
                System.out.println("digite ponto inicial (A): ");
                cal.setA(ent.nextDouble());
                System.out.println("digite ponto final (B):");
                cal.setB(ent.nextDouble());
            }

            System.out.println("Digite quantas partições: ");
            particao = ent_1.nextLine();
            while (!cal.verificacao_particao(particao) || Integer.parseInt(particao) <= 0) {

                System.out.printf("O número de partições deve ser inteiro.\n");
                particao = ent_1.nextLine();
            }

            cal.setParticoes(Integer.parseInt(particao));
            cal.verificacao_area();

            System.out.printf("A área e: %10.2f", cal.getResultado());
            System.out.printf("\nDeseja fazer outro calculo: \nse sim digite S ou s \nse nao N ou n: ");
            verificacao = ent_1.nextLine();
            cal.setResultado(0);
            
        } while (verificacao.equalsIgnoreCase("S"));

    }

}
