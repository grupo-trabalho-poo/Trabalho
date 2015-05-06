package View;

import java.util.Scanner;

import Model.Dao.TurmaDaoImp;
import Model.Pojo.Turma;

public class TurmaView {
	
	TurmaDaoImp turmaDaoImp = new TurmaDaoImp();

	private Scanner scanner;
	
	public void cadastrar(){
		scanner = new Scanner (System.in);
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
		
		
		Turma turma = new Turma(ano,periodo,local,horario,numeroVagas);
		turmaDaoImp.cadastrar(turma);
		
	}
	

	
	
	public TurmaView(TurmaDaoImp turmaDaoImp) {
		this.setTurmadaoImp(turmaDaoImp);
	}




	private void setTurmadaoImp(TurmaDaoImp turmaDaoImp) {
				
	}


}
