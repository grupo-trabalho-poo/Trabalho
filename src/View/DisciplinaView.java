package View;

import java.util.Scanner;

import Model.Dao.DisciplinaDaoImp;
import Model.Pojo.Disciplina;

public class DisciplinaView {
	DisciplinaDaoImp disciplinaDaoImp = new DisciplinaDaoImp();

	private Scanner scanner;
	
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
	

	
	
	public DisciplinaView(DisciplinaDaoImp disciplinaDaoImp) {
		this.setDisciplinadaoImp(disciplinaDaoImp);
	}




	private void setDisciplinadaoImp(DisciplinaDaoImp disciplinaDaoImp) {
				
	}


}
