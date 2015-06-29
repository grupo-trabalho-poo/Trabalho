package View;

import java.util.Scanner;

import Model.Dao.NotaDao;
import Model.Pojo.Aluno;
import Model.Pojo.Atividade;
import Model.Pojo.Disciplina;
import Model.Pojo.Nota;
import Model.Pojo.Turma;

public class NotaView {
	
	private NotaDao notaDao;
	private Scanner scanner;
	
	
	


	public NotaView(NotaDao notaDao) {
		this.notaDao=notaDao;
	}
	
	
	
	
	public void cadastrar(){
		scanner = new Scanner (System.in);
		System.out.println("Informe a Nota: ");
		String notaAluno = scanner.nextLine();
		System.out.println("Informe o cpf  do aluno");
		String cpf = scanner.nextLine();
		Aluno aluno = new Aluno(cpf);
		System.out.println("Informe o nome da atividade: ");
		String nomeAtividade= scanner.nextLine();
		Atividade atividade =new Atividade(nomeAtividade);
		System.out.println("Entre com a Disciplina da Turma: ");
		String nomeDisciplina2  = scanner.nextLine();
		System.out.println("Entre com o Ano da turma: ");
		String ano  = scanner.nextLine();
		System.out.println("Entre com o Periodo da Turma: ");
		String periodo  = scanner.nextLine();
		Disciplina disciplina = new Disciplina(nomeDisciplina2);
		Turma turma= new Turma(disciplina,ano,periodo);
		Nota nota = new Nota(notaAluno,aluno,atividade);
		
		notaDao.salvar(nota);
	}
		
	}
