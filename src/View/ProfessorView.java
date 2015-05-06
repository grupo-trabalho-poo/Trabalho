package View;

import java.util.Scanner;

import Model.Dao.ProfessorDaoImp;
import Model.Pojo.Professor;

public class ProfessorView {
	
	ProfessorDaoImp professorDaoImp = new ProfessorDaoImp();

	private Scanner scanner;
	
	public void cadastrar(){
		scanner = new Scanner (System.in);
		System.out.println("Informe o nome do Professor: ");
		String nome = scanner.nextLine();
		System.out.println("Informe o CPF: ");
		String cpf = scanner.nextLine();
		System.out.println("Informe o Departamento: ");
		String departamento = scanner.nextLine();
		Professor professor = new Professor(nome,cpf,departamento);
		professorDaoImp.cadastrar(professor);
		
	}
	

	
	
	public ProfessorView(ProfessorDaoImp professorDaoImp) {
		this.setProfessordaoImp(professorDaoImp);
	}




	private void setProfessordaoImp(ProfessorDaoImp professorDaoImp) {
				
	}



	

}
