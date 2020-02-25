package padroes_de_criacao_singleton;

public class SingleObject {

	private static SingleObject instance = new SingleObject();

	private SingleObject() {
	}

	public static SingleObject getInstanca() {

		return instance;
	}

	public void shoeMessage() {

		System.out.println("Hello Word!");
	}

}
