package mediator;

public class Main {

	public static void main(String[] args) {

		User robert = new User("Robert");
		User john = new User("John");
		
		robert.sendMenssager("hello, John");
		john.sendMenssager("hi!");
	}

}
