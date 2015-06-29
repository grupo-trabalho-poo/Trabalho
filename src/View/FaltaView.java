package View;

import java.util.Scanner;

import Model.Dao.FaltaDao;
import Model.Pojo.Falta;

public class FaltaView {
	
	private FaltaDao faltaDao;
	private Scanner scanner;
	
	
	
	public FaltaView(FaltaDao faltaDao) {
		this.faltaDao=faltaDao;
	}



	
	public void cadastrar(){
		scanner = new Scanner (System.in);
		System.out.println("Informe o Numero de Falta: ");
		String numeroFaltas = scanner.nextLine();
		Falta falta = new Falta(numeroFaltas);
		faltaDao.salvar(falta);		
	}
}
