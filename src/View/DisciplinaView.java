package View;

import java.util.List;
import java.util.Scanner;

import Model.Dao.DisciplinaDaoImp;
import Model.Dao.TurmaDaoImp;
import Model.Pojo.Disciplina;
import Model.Pojo.Turma;

public class DisciplinaView {
	
	private DisciplinaDaoImp disciplinaDaoImp;
	private Scanner scanner;
	private Scanner scanner1;
	private Scanner scanner12;
	


	
	
	
	public DisciplinaView(DisciplinaDaoImp disciplinaDaoImp) {
		this.disciplinaDaoImp=disciplinaDaoImp;
	}




	public void cadastrar(){
		System.out.println("\n-------------Cadastro de Disciplina-------------\n");
		scanner = new Scanner (System.in);
		System.out.println("Informe o nome do Disciplina: ");
		String nome = scanner.nextLine();
		System.out.println("Informe a ementa: ");
		String ementa = scanner.nextLine();
		System.out.println("Informe a carga horaria: ");
		String carga = scanner.nextLine();
		Disciplina disciplina = new Disciplina(nome,ementa,carga);
		disciplinaDaoImp.cadastrar(disciplina);		
	}
	
	public void listar(){
		List<Disciplina> listaDisciplina = disciplinaDaoImp.obterLista();
		for(Disciplina disciplina:listaDisciplina){
			System.out.println(disciplina);
		}
	}
	
	public void removerDisciplina(){
		scanner1 = new Scanner (System.in);
		System.out.println("Entre com o nome da disciplina: ");
		String nome = scanner1.nextLine();
		Disciplina disciplina = new Disciplina(nome);
		disciplina = disciplinaDaoImp.pesquisar(disciplina);
		System.out.println("Disciplina a ser Removida: " + disciplina);
		disciplinaDaoImp.remover(disciplina);	
	}	

	public void consultaHistoricamenteDisciplina(TurmaDaoImp turmaDaoImp){
		scanner12 = new Scanner(System.in);
		System.out.println("Digite nome da disciplina");
		String nomeDisciplina = scanner12.nextLine(); 
		List<Turma> listaTurma = turmaDaoImp.pesquisarTurmaNomeDisciplina(nomeDisciplina);
		for(Turma turma:listaTurma){
			System.out.println(turma);
			
			
		}
		
	
	}
}