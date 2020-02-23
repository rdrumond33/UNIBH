package TrabalhoFatorialFibonacci;

import java.util.concurrent.TimeUnit;

public class Conometro {

    private static long inicio, tempo_gasto, fim;

    public static void iniciar() {
        tempo_gasto = 0;
        inicio = System.nanoTime();
    }

    public static void parar() {
        fim = System.nanoTime();
        tempo_gasto = fim - inicio;
    }

    public static double converterMilisegundos() {
        return  TimeUnit.MILLISECONDS.convert(tempo_gasto, TimeUnit.NANOSECONDS);
    }
     
    public static double converterSecundos() {
        return  TimeUnit.SECONDS.convert(tempo_gasto, TimeUnit.NANOSECONDS);
    }
    
    
    public static double getNanoSecundos() {
        return tempo_gasto;
    }

}
