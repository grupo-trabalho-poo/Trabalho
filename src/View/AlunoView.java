package View;

import java.util.List;
import java.util.Scanner;

import Model.Dao.AlunoDao;
import Model.Pojo.Aluno;

public class AlunoView {
	private AlunoDao alunoDao ;
	private Scanner scanner;
	private Scanner scanner1;
	
	
	
	
	public AlunoView(AlunoDao alunoDao) {
		this.alunoDao= alunoDao;
	}
	
	
	
	
	public void cadastrar(){
		System.out.println("\n-------------Cadastro de Aluno-------------\n");
		scanner = new Scanner (System.in);
		System.out.println("Informe o nome do Aluno: ");
		String nome = scanner.nextLine();
		System.out.println("Informe o CPF: ");
		String cpf = scanner.nextLine();
		Aluno aluno = new Aluno(nome,cpf);
		alunoDao.salvar(aluno);
	}
	
	public void listar(){
		List<Aluno> listaAluno = alunoDao.obterLista();
		for(Aluno aluno:listaAluno){
			System.out.println(aluno);
		}
	}
	
	public void removerAluno(){
		scanner1 = new Scanner (System.in);
		System.out.println("Entre com o cpf do aluno a ser deletado: ");
		String cpf = scanner1.nextLine();
		Aluno aluno = new Aluno(cpf);
		aluno = alunoDao.pesquisar(aluno);
		System.out.println("Aluno a ser Removido: " + aluno);
		alunoDao.remover(aluno);	
	}
}
