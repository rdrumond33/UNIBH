package trabalho_integral;

public class Verificacao {

    private double A;
    private double B;
    private double resultado;
    private double intervalo;
    private int particoes;

    public void verificacao_area() {
        intervalo = (B - A) / particoes;

        for (int j = 0; j <= particoes; j++) {

            if (((-Math.pow(A, 2)) + 4) < 0) {
                resultado += ((Math.abs((-Math.pow(A, 2)) + 4)) * intervalo);
                A += intervalo;
            } else {
                resultado += (((-Math.pow(A, 2)) + 4) * intervalo);
                A += intervalo;

            }
        }

    }

    public boolean verificacao_intervalo() {
        if (A > B) {
            return true;
        } else {
            return false;
        }

    }

    public boolean verificacao_particao(String particao) {
        try {
            Integer.parseInt(particao);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    /**
     * @return the A
     */
    public double getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(double A) {
        this.A = A;
    }

    /**
     * @return the B
     */
    public double getB() {
        return B;
    }

    /**
     * @param B the B to set
     */
    public void setB(double B) {
        this.B = B;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the particoes
     */
    public int getParticoes() {

        return particoes;
    }

    /**
     * @param particoes the particoes to set
     */
    public void setParticoes(int particoes) {
        this.particoes = particoes;
    }

}
