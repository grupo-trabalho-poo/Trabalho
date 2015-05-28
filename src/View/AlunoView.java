package View;

import java.util.List;
import java.util.Scanner;

import Model.Dao.AlunoDaoImp;
import Model.Pojo.Aluno;

public class AlunoView {
	private AlunoDaoImp alunoDaoImp ;
	private Scanner scanner;
	private Scanner scanner1;
	
	
	
	
	public AlunoView(AlunoDaoImp alunoDaoImp) {
		this.alunoDaoImp= alunoDaoImp;
	}
	
	
	
	
	public void cadastrar(){
		System.out.println("\n-------------Cadastro de Aluno-------------\n");
		scanner = new Scanner (System.in);
		System.out.println("Informe o nome do Aluno: ");
		String nome = scanner.nextLine();
		System.out.println("Informe o CPF: ");
		String cpf = scanner.nextLine();
		Aluno aluno = new Aluno(nome,cpf);
		alunoDaoImp.cadastrar(aluno);
	}
	
	public void listar(){
		List<Aluno> listaAluno = alunoDaoImp.obterLista();
		for(Aluno aluno:listaAluno){
			System.out.println(aluno);
		}
	}
	
	public void removerAluno(){
		scanner1 = new Scanner (System.in);
		System.out.println("Entre com o cpf do aluno a ser deletado: ");
		String cpf = scanner1.nextLine();
		Aluno aluno = new Aluno(cpf);
		aluno = alunoDaoImp.pesquisar(aluno);
		System.out.println("Aluno a ser Removido: " + aluno);
		alunoDaoImp.remover(aluno);	
	}
}
