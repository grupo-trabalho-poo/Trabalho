package View;

import java.util.List;
import java.util.Scanner;

import Model.Dao.TurmaDaoImp;
import Model.Pojo.Aluno;
import Model.Pojo.Turma;

public class TurmaView {
	
	TurmaDaoImp turmaDaoImp = new TurmaDaoImp();
	private Scanner scanner;
	private Scanner scanner1;
	
	
	
	
	private void setTurmadaoImp(TurmaDaoImp turmaDaoImp) {
		
	}
	
	
	
	
	public TurmaView(TurmaDaoImp turmaDaoImp) {
		this.setTurmadaoImp(turmaDaoImp);
	}
	
	
	
	
	public void cadastrar(){
		scanner = new Scanner (System.in);
		System.out.println("Informe o Codigo da Turma: ");
		String codigoTurma = scanner.nextLine();
		System.out.println("Informe o Ano: ");
		int ano = scanner.nextInt();
		System.out.println("Informe o Periodo: ");
		int periodo = scanner.nextInt();
		System.out.println("Informe o Local: ");
		String local = scanner.nextLine();
		System.out.println("Informe o Horario: ");
		String horario = scanner.nextLine();
		System.out.println("Informe o Numero de Vagas: ");
		int numeroVagas = scanner.nextInt();
		Turma turma = new Turma(codigoTurma,ano,periodo,local,horario,numeroVagas);
		turmaDaoImp.cadastrar(turma);	
	}
	
	public void listar(){
		List<Turma> listaTurma = turmaDaoImp.obterLista();
		for(Turma turma:listaTurma){
			System.out.println(turma);
		}
	}
	
	public void removerTurma(){
		scanner1 = new Scanner (System.in);
		System.out.println("Entre com o codigo da Turma: ");
		String codigoTurma = scanner1.nextLine();
		Turma turma= new Turma(codigoTurma);
		turma = turmaDaoImp.pesquisar(turma);
		System.out.println("Aluno a ser Removido: " + turma);
		turmaDaoImp.remover(turma);	
	}
}
