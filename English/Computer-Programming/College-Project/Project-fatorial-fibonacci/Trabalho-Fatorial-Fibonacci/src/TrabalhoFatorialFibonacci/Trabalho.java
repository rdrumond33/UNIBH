package TrabalhoFatorialFibonacci;

import java.util.*;
import java.lang.*;

public class Trabalho {

    public static void main(String[] args) {
        Random RDM = new Random();

        int N1, N2;
        Scanner ent = new Scanner(System.in);
        Math math = new Math();
        ArrayList<Integer> SQD = new ArrayList<Integer>();
        for (int i = 0; i < 8; i++) {
            SQD.add(RDM.nextInt(47));
        }

        for (int i = 0; i < SQD.size(); i++) {
            System.out.printf("\n--------------------------Interacao %s------------------------------",i);

            Conometro.iniciar();
            System.out.printf("\nRecursivo: Fatorial(%d) = %d", SQD.get(i), math.FatorialRecursivo(SQD.get(i)));
            Conometro.parar();
            System.out.printf("\nSegundos: %S s, milisegundos: %S ms, nanoSecundos: %S ns", Conometro.converterSecundos(), Conometro.converterMilisegundos(), Conometro.getNanoSecundos());

            Conometro.iniciar();
            System.out.printf("\nSem-Recursividade: Fatorial(%d) = %d", SQD.get(i), math.FatorialSemRecurvidade(SQD.get(i)));
            Conometro.parar();
            System.out.printf("\nSegundos: %S s, milisegundos: %S ms, nanoSecundos: %S ns", Conometro.converterSecundos(), Conometro.converterMilisegundos(), Conometro.getNanoSecundos());


            System.out.println("\n-------------------------------------------------------------------");

            Conometro.iniciar();
            System.out.printf("\nRecursivo: fibonnaci(%d) = %d", SQD.get(i), math.FibonnaciRecursivo(SQD.get(i)));
            Conometro.parar();
            System.out.printf("\nSegundos: %S s, milisegundos: %S ms, nanoSecundos: %S ns", Conometro.converterSecundos(), Conometro.converterMilisegundos(), Conometro.getNanoSecundos());

            Conometro.iniciar();
            System.out.printf("\nSem-Recursividade: Fibonnaci(%d) = %d", SQD.get(i), math.FibonnaciSemRecursividade(SQD.get(i)));
            Conometro.parar();
            System.out.printf("\nSegundos: %S s, milisegundos: %S ms, nanoSecundos: %S ns", Conometro.converterSecundos(), Conometro.converterMilisegundos(), Conometro.getNanoSecundos());


            System.out.println("\n--------------------------------FIM---------------------------------");

        }

    }

}
