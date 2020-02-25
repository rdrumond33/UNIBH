package classes_e_objetos_questao_2;

public class Turma {

	private Escola escola;
	private String turno;
	private int periodo;
	private int quanditadeAluno;
	private int quanditadeAlunoMax;

	
	public Turma() {
		quanditadeAluno=0;
		
	}
	
	/*um m�todo para definir o per�odo, o turno e quantidade m�xima de alunos.*/
	public void criarTurma(int periodo,String turno,int quanditadeAlunoMax,Escola escola){
		
		setPeriodo(periodo);
		setTurno(turno);
		setQuanditadeAlunoMax(quanditadeAlunoMax);
		setEscola(escola);
		
		
	}
	
	/*um m�todo para atribuir a quantidade de alunos.*/
	
	public void quantidadeAluno() {
	
	setQuanditadeAluno(getQuanditadeAluno()+1);
	
	}
	
	/*um m�todo para atribuir a quantidade de alunos.*/
	public boolean verificarLimiteMax() {

		return (quanditadeAluno < quanditadeAlunoMax);
	}

	
	
	
	
	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getQuanditadeAluno() {
		return quanditadeAluno;
	}

	public void setQuanditadeAluno(int quanditadeAluno) {
		this.quanditadeAluno = quanditadeAluno;
	}

	public int getQuanditadeAlunoMax() {
		return quanditadeAlunoMax;
	}

	public void setQuanditadeAlunoMax(int quanditadeAlunoMax) {
		this.quanditadeAlunoMax = quanditadeAlunoMax;
	}

	
	
	
	

}
