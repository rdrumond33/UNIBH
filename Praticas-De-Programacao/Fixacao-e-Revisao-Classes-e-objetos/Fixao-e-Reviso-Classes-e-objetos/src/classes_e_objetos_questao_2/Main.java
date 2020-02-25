package classes_e_objetos_questao_2;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escola escola=new Escola();
	
		escola.setNomeEscola("EE ana de carvalho");
		escola.setCnpj("87.223.538/0001-43");
		escola.setCapacidadeSalas(20);
		
		Turma turma1=new Turma();
		turma1.criarTurma(1, "Noite", 1, escola);
		
		Turma turma2=new Turma();
		turma2.criarTurma(4, "tarde", 10, escola);
		
		
		Aluno aluno1= new Aluno();
		aluno1.criarALuno("Rodrigo", "01112");
				
		System.out.println("Nome o aluno1: "+aluno1.getNome());
		System.out.println("Matricula o aluno: "+aluno1.getMatricula());
		System.out.println("Adicionar o aluno na turma: "+aluno1.addTurma(turma1));
	
		System.out.println("quantidade na turma1: "+turma1.getQuanditadeAluno());

		System.out.println("Adicionar nota portugues: "+aluno1.addNotaPortugues(101));
		System.out.println("Adicionar nota Ciencia: "+aluno1.addNotaCiencias(50));
		System.out.println("Adicionar nota matematica: "+aluno1.addNotaMatematica(100));
		System.out.println("media: "+aluno1.Media());

		
		Aluno aluno2= new Aluno();
		aluno2.criarALuno("Jennifer", "2131321");
		
		System.out.println("\nNome o aluno2: "+aluno2.getNome());
		System.out.println("Matricula o aluno: "+aluno2.getMatricula());
		System.out.println("Adicionar o  aluno na turma: "+aluno2.addTurma(turma2));
		System.out.println("quantidade na turma2: "+turma2.getQuanditadeAluno());

		
		
		Aluno aluno3= new Aluno();
		aluno3.criarALuno("joao", "23231");
		
		System.out.println("\nNome o aluno3: "+aluno3.getNome());
		System.out.println("Matricula o aluno: "+aluno3.getMatricula());
		System.out.println("Adicionar o  aluno na turma2: "+aluno3.addTurma(turma2));
		System.out.println("periodo a turma: "+aluno3.getTurma().getPeriodo());
		
		System.out.println("quantidade na turma2: "+turma2.getQuanditadeAluno());

		System.out.println("\nAluno1 mudou para turma2: "+aluno1.trocaTurma(turma2));
		System.out.println("quantidade na turma1: "+turma1.getQuanditadeAluno());
		System.out.println("quantidade na turma2: "+turma2.getQuanditadeAluno());
		

		
		
		
		
	}

}
