package View;

import java.util.Scanner;

import Model.Dao.FaltaDaoImp;
import Model.Pojo.Falta;

public class FaltaView {
	
	private FaltaDaoImp faltaDaoImp;
	private Scanner scanner;
	
	
	
	public FaltaView(FaltaDaoImp faltaDaoImp) {
		this.faltaDaoImp=faltaDaoImp;
	}



	
	public void cadastrar(){
		scanner = new Scanner (System.in);
		System.out.println("Informe o Numero de Falta: ");
		String numeroFaltas = scanner.nextLine();
		Falta falta = new Falta(numeroFaltas);
		faltaDaoImp.cadastrar(falta);		
	}
}
