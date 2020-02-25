package jogo_da_forca;

public class forca {

    private String palavra_secreta;
    private String Palavra_acertada;
    private boolean erro;
    private boolean acerto;
    private int erro_verificar;
    private int acerto_verificar;
    private char[] Palavra_acertada_char = new char[20];
    private int Erro;
    int teste;

    public forca() {
        Erro = 6;
        acerto_verificar = 0;
        erro_verificar = 0;
        erro = false;
        acerto = false;

    }

    public void palavra(String Palavra) {
        palavra_secreta = Palavra;
        for (int i = 0; i < palavra_secreta.length(); i++) {
            Palavra_acertada_char[i] = '*';
            teste++;
        }
        for (int i = 0; i < palavra_secreta.length(); i++) {
            System.out.printf(" " + Palavra_acertada_char[i]);
        }
    }

    public void verificacao(String letra) {
        erro_verificar = 0;

        for (int i = 0; i < palavra_secreta.length(); i++) {
            if (palavra_secreta.charAt(i) == letra.charAt(0)) {
                Palavra_acertada_char[i] = letra.charAt(0);
                acerto = true;
                acerto_verificar++;
            }

        }

        for (int j = 0; j <= palavra_secreta.length(); j++) {
            if (Palavra_acertada_char[j] == '*') {
                acerto = false;
                erro_verificar++;
            } /*else if (erro_verificar == (Palavra_acertada_char.length-) - acerto_verificar) {
                Erro--;

            }*/

        }
        for (int i = 0; i < palavra_secreta.length(); i++) {
            System.out.printf(" " + Palavra_acertada_char[i]);
        }
    }

    /**
     * @return the palavra_secreta
     */
    public String getPalavra_secreta() {
        return palavra_secreta;
    }

    /**
     * @return the Palavra_acertada
     */
    public String getPalavra_acertada() {
        return Palavra_acertada;
    }

    /**
     * @return the erro
     */
    public boolean isErro() {
        return erro;
    }

    /**
     * @return the acerto
     */
    public boolean isAcerto() {
        return acerto;
    }

    /**
     * @return the Palavra_acertada_char
     */
    public char[] getPalavra_acertada_char() {
        return Palavra_acertada_char;
    }

    /**
     * @return the Erro
     */
    public int getErro() {
        return Erro;
    }

    /**
     * @param Erro the Erro to set
     */
    public void setErro(int Erro) {
        this.Erro = Erro;
    }

}
