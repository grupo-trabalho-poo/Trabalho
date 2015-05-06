package View;

import java.util.Scanner;

import Model.Dao.FaltaDaoImp;
import Model.Pojo.Falta;

public class FaltaView {
	
	FaltaDaoImp faltaDaoImp = new FaltaDaoImp();

	private Scanner scanner;
	
	public void cadastrar(){
		scanner = new Scanner (System.in);
		System.out.println("Informe o Numero de Falta: ");
		int numeroFaltas = scanner.nextInt();
		Falta falta = new Falta(numeroFaltas);
		faltaDaoImp.cadastrar(falta);
		
	}
	

	
	
	public FaltaView(FaltaDaoImp faltaDaoImp) {
		this.setFaltadaoImp(faltaDaoImp);
	}




	private void setFaltadaoImp(FaltaDaoImp faltaDaoImp) {
				
	}


}
