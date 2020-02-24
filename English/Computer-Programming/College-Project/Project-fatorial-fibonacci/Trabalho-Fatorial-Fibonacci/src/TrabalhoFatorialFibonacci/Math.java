package TrabalhoFatorialFibonacci;

import java.math.BigInteger;

public class Math {

    public BigInteger FatorialRecursivo(int n) {

        if ((n == 0) || (n == 1)) {
            return BigInteger.ONE;
        } else {
            BigInteger fatorial = BigInteger.valueOf(n);
            return fatorial.multiply(FatorialRecursivo(n - 1));
        }

    }

    public BigInteger FatorialSemRecurvidade(int n) {
        BigInteger fatorial = BigInteger.valueOf(n);
        if (n == 0) {
            fatorial = BigInteger.ONE;
        } else {
            fatorial = BigInteger.ONE;
            for (int i = 2; i <=n; i++) {
                BigInteger ii = BigInteger.valueOf(i);
                fatorial = fatorial.multiply(ii);

            }
        }
        return fatorial;
    }

    public BigInteger FibonnaciRecursivo(int n) {

        BigInteger Fibonnaci = BigInteger.valueOf(n);

        if (n < 2) {
            return Fibonnaci;
        } else {
            return FibonnaciRecursivo(n - 1).add(FibonnaciRecursivo(n - 2));
        }

    }

    public BigInteger FibonnaciSemRecursividade(int n) {
        BigInteger ini = BigInteger.valueOf(0);

        BigInteger fim = BigInteger.valueOf(0);

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                ini = BigInteger.ONE;
                fim = BigInteger.ZERO;

            } else {
                ini = ini.add(fim);
                fim = ini.subtract(fim);
            }

        }

        return ini;

    }

}
