package View;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import Model.Dao.AtividadeDaoImp;
import Model.Pojo.Atividade;


public class AtividadeView {
	
	private AtividadeDaoImp atividadeDaoImp ;
	private Scanner scanner;
	private Scanner scanner1;
	
	
	
	
	public AtividadeView(AtividadeDaoImp atividadeDaoImp) {
		this.atividadeDaoImp= atividadeDaoImp;
	}
	
	
	
	
	public void cadastrar(){
		scanner = new Scanner (System.in);
		System.out.println("Informe o nome do Atividade: ");
		String nome = scanner.nextLine();
		System.out.println("Informe o tipo da Atividade: ");
		String tipo = scanner.nextLine();
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
	
	public void listar(){
		List<Atividade> listaAtividade = atividadeDaoImp.obterLista();
		for(Atividade atividade:listaAtividade){
			System.out.println(atividade);
		}
	}
	
	public void removerAtividade(){
		scanner1 = new Scanner (System.in);
		System.out.println("Entre com o nome da atividade: ");
		String nome = scanner1.nextLine();
		Atividade atividade = new Atividade(nome);
		atividade = atividadeDaoImp.pesquisar(atividade);
		System.out.println("Atividade a ser Removido: " + atividade);
		atividadeDaoImp.remover(atividade);	
	}	
}
