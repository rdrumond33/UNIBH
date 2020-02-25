package compilador;

import java.io.File;

public class Portugolo {
public static void main(String[] args) {
        String pathPortugoloExemple = null;
        try {
            File portugoloExemple = new File("portugolo/primeiro_portugolo.ptgl");
            pathPortugoloExemple = portugoloExemple.getAbsolutePath();
        } catch (Exception e) {
        }

        Lexema lexer = new Lexema(pathPortugoloExemple); // diretorio

        Parser parser = new Parser(lexer);
        parser.Compilador();
        parser.fechaArquivo();

        lexer.printTS();

        System.out.println("			Compilacao realizada do Portugolo			");
    }

}
