package questao_4;

import java.util.Date;

public class ChatRoom {

	public static void showMenssage(Usuario user,String message) {
		String menssagem =(new Date().toString()+"[ "+ user.getNome()+" ]: "+message);
		System.out.println(menssagem);
		

	}
	
	
	
}