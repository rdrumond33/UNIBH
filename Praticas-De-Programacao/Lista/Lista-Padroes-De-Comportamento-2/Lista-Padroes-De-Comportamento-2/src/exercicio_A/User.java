package exercicio_A;


public class User {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public User(String nome) {
		
		this.nome= nome;
	}
	
	public void sendMenssager(String nmenssage) {
		
		ChatRoom.showMenssage(this,nmenssage);
	}
	
}
