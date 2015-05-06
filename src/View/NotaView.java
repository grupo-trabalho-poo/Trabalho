package View;

import java.util.Scanner;

import Model.Dao.NotaDaoImp;
import Model.Pojo.Nota;

public class NotaView {
	
	NotaDaoImp notaDaoImp = new NotaDaoImp();

	private Scanner scanner;
	
	public void cadastrar(){
		scanner = new Scanner (System.in);
		System.out.println("Informe a Nota: ");
		float notaAluno = scanner.nextInt();
		Nota nota = new Nota(notaAluno);
		notaDaoImp.cadastrar(nota);
		
	}
	

	
	
	public NotaView(NotaDaoImp notaDaoImp) {
		this.setNotadaoImp(notaDaoImp);
	}




	private void setNotadaoImp(NotaDaoImp notaDaoImp) {
				
	}

}
