package View;

import java.util.List;
import java.util.Scanner;

import Model.Dao.AlunoDaoImp;
import Model.Pojo.Aluno;

public class AlunoView {
	
	private AlunoDaoImp alunodaoImp;
	
	AlunoDaoImp alunoDaoImp = new AlunoDaoImp();
	
	public void cadastrar(){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Informe o nome do Aluno: ");
		String nome = scanner.nextLine();
		System.out.println("Informe o CPF: ");
		String cpf = scanner.nextLine();
		Aluno aluno = new Aluno(nome,cpf);
		alunoDaoImp.salvar(aluno);
		
	}
	
	List<Aluno> listaAluno = alunoDaoImp.obter();
	public void listar(){
		
		for(Aluno aluno:listaAluno){
			System.out.println(" Nome: "+aluno.getNome()+" CPF: "+aluno.getCpf());
		}
	}
	
	public void buscar(){
		Scanner scanner1 = new Scanner (System.in);
		System.out.println("Entre com o cpf para pesquisar: ");
		String cpf = scanner1.nextLine();
		Aluno aluno = new Aluno(cpf);
		aluno = alunoDaoImp.pesquisar(aluno);
		System.out.println("Nome: "+aluno.getNome()+ " - CPF: "+aluno.getCpf());
		
	}
	
	
	
	public AlunoView(AlunoDaoImp alunodaoImp) {
		// TODO Auto-generated constructor stub
		this.alunodaoImp=alunodaoImp;
	}
	
	

}
