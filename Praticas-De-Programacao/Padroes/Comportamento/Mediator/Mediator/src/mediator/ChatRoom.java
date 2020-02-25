package mediator;

import java.util.Date;

public class ChatRoom {
	
	public static void showMenssage(User user,String message) {

		System.out.println(new Date().toString()+"[ "+ user.getNome()+" ]: "+message);


	}
}