package lista_8_Interpreter;

public class Main {

	public static void main(String[] args) {
		//Para interpretar deve escrever om ; como exemplo: L;L-> 20;20 quadrado 20; circulo
		//e 20;21 retangulo
		Expressao dados = new TerminalExpressao();
	
	
		dados.interpretar("20;20;");
		dados.interpretar("20;30;");
		dados.interpretar("20;");
		
	}

}
