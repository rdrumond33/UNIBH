/*
 * This experiment the for how it work memory cache.
 * 
 */
package DifferenceTimeAccessCacheLine;

import java.util.concurrent.*;

/**
 *
 * @author Rodrigo Drumond de Paula(rodrigodru33@gmail.com)
 */
public class differencetimeaccesscacheline {

    public static void main(String[] args) {
        int MaxSize = 10000;
        double[][] Matrix = new double[MaxSize][MaxSize];
        double[] value = new double[MaxSize];
        double sum = 0;

        for (int i = 0; i < MaxSize; i++) {
            value[i] = (int) (Math.random() * 501);
            for (int j = 0; j < MaxSize; j++) {
                Matrix[i][j] = (int) (Math.random() * 501);
            }
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < MaxSize; i++) {
            for (int j = 0; j < MaxSize; j++) {
                sum += Matrix[i][j] * value[j];
            }
        }
        long duration = System.nanoTime() - startTime;
        System.out.printf("\nInteraction Duration `|#1||#2|#3|#4|...` seconds: %Ss, milisecconds:%Sms\n", TimeUnit.SECONDS.convert(duration, TimeUnit.NANOSECONDS), TimeUnit.MILLISECONDS.convert(duration, TimeUnit.NANOSECONDS));

        System.out.println("---------------------------------------------------------------------------");

        startTime = System.nanoTime();
        for (int j = 0; j < MaxSize; j++) {
            for (int i = 0; i < MaxSize; i++) {
                sum += Matrix[i][j] * value[i];
            }
        }
        duration = System.nanoTime() - startTime;

        System.out.printf("Interaction Duration `|#1||#3|#2|#4|...` seconds: %Ss, milisecconds:%Sms ", TimeUnit.SECONDS.convert(duration, TimeUnit.NANOSECONDS), TimeUnit.MILLISECONDS.convert(duration, TimeUnit.NANOSECONDS));
    }
}
