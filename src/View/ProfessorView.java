package View;

import java.util.List;
import java.util.Scanner;

import Model.Dao.ProfessorDaoImp;
import Model.Pojo.Professor;

public class ProfessorView {
	
	private ProfessorDaoImp professorDaoImp;
	private Scanner scanner;
	private Scanner scanner1;

	
	

	
	
	
	public ProfessorView(ProfessorDaoImp professorDaoImp) {
		this.professorDaoImp=professorDaoImp;
	}
	
	
	
	
	public void cadastrar(){
		System.out.println("\n-------------Cadastro de Professor-------------\n");
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
	
	public void listar(){
		List<Professor> listaProfessor = professorDaoImp.obterLista();
		for(Professor professor:listaProfessor){
			System.out.println(professor);
		}
	}
	
	public void removerProfessor(){
		scanner1 = new Scanner (System.in);
		System.out.println("Entre com o cpf do professor a ser deletado: ");
		String cpf = scanner1.nextLine();
		Professor professor = new Professor(cpf);
		professor = professorDaoImp.pesquisar(professor);
		System.out.println("Professor a ser Removido: " + professor);
		professorDaoImp.remover(professor);	
	}
	

		
}
