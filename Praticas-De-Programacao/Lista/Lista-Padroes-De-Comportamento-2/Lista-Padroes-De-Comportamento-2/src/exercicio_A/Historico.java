package exercicio_A;

import java.io.*;

public class Historico {

	public static void Read(String Caminho) {

		String conteudo = "";

		try {
			FileReader arq = new FileReader(Caminho);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = "";
			try {
				linha = lerArq.readLine();
				while (linha != null) {
					conteudo += linha;
					linha = lerArq.readLine();
				}
				arq.close();
			} catch (Exception e) {
				conteudo = "" + e;
			}
		} catch (Exception e) {
			conteudo = "" + e;
		}

		String [] splitString = conteudo.split(";");
		for (String string : splitString) {
			System.out.println(string);	
		}
		

	}

	public static void Gravar(String Caminho, String texto) {
		

		try {
			FileWriter arqWriter = new FileWriter(Caminho);
			PrintWriter gravar = new PrintWriter(arqWriter);

			gravar.println(texto);
			gravar.close();

		} catch (Exception e) {
		
		}

	}

}
