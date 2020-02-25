package lista_8_Interpreter;

public class TerminalExpressao  implements Expressao{

	private String data[] = new String[2];
	
	public TerminalExpressao() {

	}
	
	@Override
	public void interpretar (String data) {
		this.data = data.split(";"); 
		
		if (this.data.length == 2) {
			
			if (Integer.parseInt(this.data[0]) == Integer.parseInt(this.data[1])) {
				 System.out.printf("\nE um Quadrado de lados %s",this.data[0]);
			}else {
				 System.out.printf("\nE um Retangulo de lado %s e %s",this.data[0],this.data[1]);
			}
			
		}else
			 System.out.printf("\nE um Circulo com Raio %s",this.data[0]);

	}

	
}
