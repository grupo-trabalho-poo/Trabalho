package View;

import java.util.List;
import java.util.Scanner;

import Model.Dao.AlunoDaoImp;
import Model.Dao.TurmaDaoImp;
import Model.Pojo.Aluno;
import Model.Pojo.Disciplina;
import Model.Dao.DisciplinaDaoImp;
import Model.Pojo.Professor;
import Model.Pojo.Turma;
import Model.Dao.ProfessorDaoImp;

public class TurmaView {
	
	private TurmaDaoImp turmaDaoImp;
	private Scanner scanner;
	private Scanner scanner1;
	DisciplinaDaoImp disciplinaDaoImp = new DisciplinaDaoImp();
	ProfessorDaoImp professorDaoImp = new ProfessorDaoImp();
	AlunoDaoImp alunoDaoImp = new AlunoDaoImp();
	
	
	
	
	
	public TurmaView(TurmaDaoImp turmaDaoImp) {
		this.turmaDaoImp=turmaDaoImp;
	}
	
	public void cadastraAluno(){
		System.out.println("Informe o CPF do aluno: ");
		String cpf1 = scanner.nextLine();
		Aluno aluno1 = new Aluno(cpf1);
		aluno1 = alunoDaoImp.pesquisar(aluno1);
		System.out.println("Informe o Periodo: ");
		String periodo = scanner.nextLine();
		System.out.println("Informe o ano: ");
		String ano = scanner.nextLine();
		System.out.println("Informe o nome Disciplina: ");
		String nomeDisciplina = scanner.nextLine();
		Disciplina disciplina = new Disciplina(nomeDisciplina);
		disciplina = disciplinaDaoImp.pesquisar(disciplina);
		Turma turma = new Turma(disciplina,ano, periodo);
		turma= turmaDaoImp.pesquisar(turma);
		System.out.println("--"+ turma);
		System.out.println("--"+ aluno1);
		
		turmaDaoImp.cadastrarAlunos(aluno1, turma);
	}
	
	
	public void cadastrar(){
		System.out.println("\n-------------Cadastro de Turma-------------\n");
		scanner = new Scanner (System.in);
		System.out.println("Informe o Ano: ");
		String ano = scanner.nextLine();
		System.out.println("Informe o Periodo: ");
		String periodo = scanner.nextLine();
		System.out.println("Informe o Local: ");
		String local = scanner.nextLine();
		System.out.println("Informe o Horario: ");
		String horario = scanner.nextLine();
		System.out.println("Informe o CPF do professor: ");
		String cpf = scanner.nextLine();
		System.out.println("Informe o nome Disciplina: ");
		String nomeDisciplina = scanner.nextLine();
		System.out.println("Informe o Numero de Vagas: ");
		String numeroVagas = scanner.nextLine();
		Professor professor = new Professor(cpf);
		
		professor = professorDaoImp.pesquisar(professor);
		Disciplina disciplina = new Disciplina(nomeDisciplina);
		disciplinaDaoImp.pesquisar(disciplina);
    	disciplina= disciplinaDaoImp.pesquisar(disciplina);
		Turma turma = new Turma(ano,periodo, local, horario, numeroVagas,disciplina,professor);
		turmaDaoImp.cadastrar(turma,disciplina,DisciplinaDaoImp.getListaDisciplina());	
	}
	
	public void listar(){
		List<Turma> listaTurma = turmaDaoImp.obterLista();
		for(Turma turma:listaTurma){
			System.out.println(turma);
		}
	}
	
	public void removerTurma(){
		scanner1 = new Scanner (System.in);
		System.out.println("Entre com a Disciplina: ");
		String nomeDisciplina2  = scanner1.nextLine();
		System.out.println("Entre com o Ano: ");
		String ano  = scanner1.nextLine();
		System.out.println("Entre com o Periodo: ");
		String periodo  = scanner1.nextLine();
		Disciplina disciplina = new Disciplina(nomeDisciplina2);
		Turma turma= new Turma(disciplina,ano,periodo);
		turma = turmaDaoImp.pesquisar(turma);
		System.out.println("Turma a ser Removida: " + turma);
		turmaDaoImp.remover(turma);	
	}
	public void consultarTurmasDiciplina(Disciplina disciplina, String ano,
			String periodo) {
		
		Turma turma3= new Turma(disciplina,ano,periodo);
		turma3 = turmaDaoImp.pesquisar(turma3);
		for(Aluno aluno:turma3.getListaAluno()){
			System.out.println(aluno);
			
		}
		
			
		
	}
		
}
