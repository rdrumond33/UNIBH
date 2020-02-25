package lista_8_Command;

import java.util.*;

public class Controle {
	
	
	private List<Comando> comandos = new ArrayList<Comando>();
	
	
	public void pegarComando(Comando c) {
		comandos.add(c);
		
	}
	
	
	public void executarCoamdos()
	{
		for (Comando comando : comandos) {
			
			comando.executar();
			
		}
		
		comandos.clear();
	}
}
