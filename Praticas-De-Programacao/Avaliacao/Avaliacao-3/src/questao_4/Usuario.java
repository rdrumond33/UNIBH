package questao_4;

public class Usuario {
	
	private String nome;

	public Usuario(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void sendMenssager(String nmenssage) {

		ChatRoom.showMenssage(this, nmenssage);
	}

}