package View;

import java.util.Calendar;
import java.util.Scanner;

import Model.Dao.AtividadeDaoImp;
import Model.Pojo.Atividade;

public class AtividadeView {
	
	AtividadeDaoImp atividadeDaoImp = new AtividadeDaoImp();

	private Scanner scanner;
	
	public void cadastrar(){
		scanner = new Scanner (System.in);
		System.out.println("Informe o nome do Atividade: ");
		String nome = scanner.nextLine();
		System.out.println("Informe o tipo da Atividade: ");
		String tipo = scanner.nextLine();
		System.out.println("Informe a Data: ");
		Calendar data = Calendar.getInstance();
		System.out.println("Informe a Data (dia/mes/ano): ");
		int dia = scanner.nextInt(); 
		int mes = scanner.nextInt();
		int ano = scanner.nextInt();
		data.set(Calendar.YEAR,ano);
		data.set(Calendar.MONTH,mes);
		data.set(Calendar.DAY_OF_MONTH,dia);
		System.out.println("Informe o Valor: ");
		float valor = scanner.nextInt();
		
		Atividade atividade = new Atividade(nome,tipo,data,valor);
		atividadeDaoImp.cadastrar(atividade);
		
	}
	

	
	
	public AtividadeView(AtividadeDaoImp atividadeDaoImp) {
		this.setAtividadedaoImp(atividadeDaoImp);
	}




	private void setAtividadedaoImp(AtividadeDaoImp atividadeDaoImp) {
				
	}


}
