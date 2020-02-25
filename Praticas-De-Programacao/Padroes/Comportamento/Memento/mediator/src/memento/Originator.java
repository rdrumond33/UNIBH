package memento;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento savaStateToMemento() {
		return new Memento(state);
	}

	public void getStateFormMemento(Memento memento) {
		state = memento.getState();
	}
}
