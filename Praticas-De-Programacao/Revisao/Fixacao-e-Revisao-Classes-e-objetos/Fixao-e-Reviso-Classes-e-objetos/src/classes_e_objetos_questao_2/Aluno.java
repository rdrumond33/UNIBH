package classes_e_objetos_questao_2;

public class Aluno {

	private Turma turma;
	private String nome;
	private String matricula;
	private double notaPortugues;
	private double notaMatematica;
	private double notaCiencias;

	/*
	 * um m�todo que permita adicionar o aluno a uma turma. � necess�rio validar se
	 * a turma possui vagas.
	 */
	public void criarALuno(String nome,String matricula) {
		setNome(nome);
		setMatricula(matricula);
		
	}
	
	public boolean addTurma(Turma t) {

		if (t.verificarLimiteMax()) {

			setTurma(t);
			turma.quantidadeAluno();
			return true;
		} else {
			return false;

		}

	}

	/* um m�todo que permita trocar o aluno de turma. */
	public boolean trocaTurma(Turma t) {

		if (t.verificarLimiteMax()) {
			turma.setQuanditadeAluno(turma.getQuanditadeAluno() - 1);
			addTurma(t);
			return true;
		} else {
			return false;
		}
	}

	/*
	 * um m�todo que permita inserir uma nota para a disciplina de Matem�tica. A
	 * notadeve ser menor ou igual a 100.
	 */
	public boolean addNotaMatematica(double nota) {
		if (nota<=100) {
			setNotaMatematica(nota);
			return true;		
		}else {
			return false;		
	
		}
	}

	/*
	 * um m�todo que permita inserir uma nota para a disciplina de Portugu�s. A
	 * nota deve ser menor ou igual a 100.
	 */
	public boolean addNotaPortugues(double nota) {
		if (nota<=100) {
			setNotaPortugues(nota);
			return true;		
		}else {
			return false;		

			
		}
	}

	/*
	 * um m�todo que permita inserir uma nota para a disciplina de Ci�ncias. A nota
	 * deve ser menor ou igual a 100.
	 */
	public boolean addNotaCiencias(double nota) {
		if (nota<=100) {
			setNotaCiencias(nota);
			return true;		
		}else {
			return false;		
	
		}
	}

	/*um m�todo que permita calcular a m�dia de todas as notas.*/
	public double Media() {
		
		
		
		return((getNotaMatematica()+getNotaPortugues()+getNotaCiencias())/3);
	}
	
	
	
	
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getNotaPortugues() {
		return notaPortugues;
	}

	public void setNotaPortugues(double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}

	public double getNotaMatematica() {
		return notaMatematica;
	}

	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}

	public double getNotaCiencias() {
		return notaCiencias;
	}

	public void setNotaCiencias(double notaCiencias) {
		this.notaCiencias = notaCiencias;
	}

}
