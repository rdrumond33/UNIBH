package questao_5;

public class Media extends Observer {

	public Media(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update(Double num1, Double num2, Double num3) {

		System.out.println("Media: "+(subject.getNum1() + subject.getNum2()+ subject.getNum3())/3);
	}

}
