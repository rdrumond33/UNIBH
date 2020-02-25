package exercicio_A;

import java.util.*;
import java.util.Date;

public class ChatRoom {
	
	private static List<String> historico=new ArrayList<String>();
	
	
	public static void showMenssage(User user,String message) {
		String menssagem =new Date().toString()+"[ "+ user.getNome()+" ]: "+message;
		System.out.println(menssagem);
		historico.add(menssagem);
		

	}
	
	public static String historico() {
		String historico1 = "";
		for (String string : historico) {
			historico1+=string+";";
			
		}
		return historico1;
	}
	
	
}