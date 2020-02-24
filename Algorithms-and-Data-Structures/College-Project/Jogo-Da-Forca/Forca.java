package jogo_da_forca;

public class Forca {

    private String Palavra_secreta;
    private String Palavra_digitada;
    private char[] Letras_Palavra_secreta;
    private char[] Letras_diditadas;
    private int acerto;
    private int quantidade_caracter;
    private int erro_verificar;
    private int erro;
    private int pontuacao;
    private boolean condicao = false;

    Forca() {
        this.erro = 0;
        this.erro_verificar = 0;
        this.quantidade_caracter = 0;
    }

    public void Ler_palavra(String Palavra) {
        this.Palavra_secreta = Palavra;
        this.Letras_Palavra_secreta = this.Palavra_secreta.toCharArray();
        this.Letras_diditadas = this.Palavra_secreta.toCharArray();
        for (int i = 0; i < this.Palavra_secreta.length(); i++) {

            this.Letras_diditadas[i] = '*';
            quantidade_caracter++;

        }
        this.Palavra_digitada = new String(this.Letras_diditadas);

    }

    public int Verificar_Letra(char Letra) {
        erro_verificar = 0;
        for (int i = 0; i < this.Palavra_secreta.length(); i++) {
            if (Letra == this.Letras_Palavra_secreta[i]) {
                this.Letras_diditadas[i] = Letra;
                this.Palavra_digitada = new String(this.Letras_diditadas);
                quantidade_caracter--;
                this.pontuacao++;
                this.acerto++;
                erro_verificar = quantidade_caracter;
                condicao = true;
            }
        }

        for (int j = 0; j < this.Palavra_secreta.length(); j++) {
            if (Letras_diditadas[j]=='*') {
                condicao=false;
            }
            
        }
        if (erro_verificar != quantidade_caracter) {
            erro++;
        }
        return pontuacao;
    }

    public int Verificar_Palavra(String Palavra) {
        if (Palavra.equalsIgnoreCase(this.Palavra_secreta)) {
            this.Palavra_digitada = this.Palavra_secreta;
            return 1;

        } else {
            return 0;
        }

    }

    /**
     * @return the Palavra_secreta
     */
    public String getPalavra_secreta() {
        return Palavra_secreta;
    }

    /**
     * @return the Palavra_digitada
     */
    public String getPalavra_digitada() {
        return Palavra_digitada;
    }

    /**
     * @return the erro
     */
    public int getErro() {
        return erro;
    }

    public int getAcerto() {
        return acerto;
    }

    /**
     * @return the condicao
     */
    public boolean isCondicao() {
        return condicao;
    }

}
