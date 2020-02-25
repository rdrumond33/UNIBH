package questao_5;

public class Soma extends Observer {

	public Soma(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update(Double num1, Double num2, Double num3) {

		System.out.println("Soma: "+(subject.getNum1() + subject.getNum2()+ subject.getNum3()));
	}

	

}
