package View;

import java.util.List;
import java.util.Scanner;

import Model.Dao.DisciplinaDaoImp;
import Model.Pojo.Disciplina;

public class DisciplinaView {
	
	DisciplinaDaoImp disciplinaDaoImp = new DisciplinaDaoImp();
	private Scanner scanner;
	private Scanner scanner1;
	
	
	
	
	private void setDisciplinadaoImp(DisciplinaDaoImp disciplinaDaoImp) {
		
	}
	
	
	
	
	public DisciplinaView(DisciplinaDaoImp disciplinaDaoImp) {
		this.setDisciplinadaoImp(disciplinaDaoImp);
	}




	public void cadastrar(){
		scanner = new Scanner (System.in);
		System.out.println("Informe o nome do Disciplina: ");
		String nome = scanner.nextLine();
		System.out.println("Informe a ementa: ");
		String ementa = scanner.nextLine();
		System.out.println("Informe a carga horaria: ");
		int carga = scanner.nextInt();
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
		System.out.println("Disciplina a ser Removido: " + disciplina);
		disciplinaDaoImp.remover(disciplina);	
	}	
}
