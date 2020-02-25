package jogo_da_forca;

import java.util.*;

public class Jogo_da_forca {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
           Scanner ent1 = new Scanner(System.in);
        forca forc = new forca();

        System.out.println("Digite uma palavra: ");
        forc.palavra(ent.nextLine());

        while (forc.isAcerto() == false ) {
            System.out.printf("Numero de tentativas %d\n",forc.getErro());
            System.out.print("\nDigite a letra: ");
            forc.verificacao(ent1.nextLine());
          

        }

    }

}
