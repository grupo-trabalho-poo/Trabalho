package View;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import Model.Dao.AtividadeDao;
import Model.Pojo.Atividade;


public class AtividadeView {
	
	private AtividadeDao atividadeDao ;
	private Scanner scanner;
	private Scanner scanner1;
	
	
	
	
	public AtividadeView(AtividadeDao atividadeDao) {
		this.atividadeDao= atividadeDao;
	}
	
	
	
	
	public void cadastrar(){
		scanner = new Scanner (System.in);
		System.out.println("Informe o nome do Atividade: ");
		String nome = scanner.nextLine();
		System.out.println("Informe o tipo da Atividade: ");
		String tipo = scanner.nextLine();
		System.out.println("Informe a Data (dia/mes/ano): ");
                String data = scanner.nextLine();
		System.out.println("Informe o Valor: ");
		float valor = scanner.nextInt();	
		Atividade atividade = new Atividade(nome,tipo,data,valor);
		atividadeDao.salvar(atividade);	
	}
	

	public void listar(){
		List<Atividade> listaAtividade = atividadeDao.obterLista();
		for(Atividade atividade:listaAtividade){
			System.out.println(atividade);
		}
	}
	
	public void removerAtividade(){
		scanner1 = new Scanner (System.in);
		System.out.println("Entre com o nome da atividade: ");
		String nome = scanner1.nextLine();
		Atividade atividade = new Atividade(nome);
		atividade = atividadeDao.pesquisar(atividade);
		System.out.println("Atividade a ser Removido: " + atividade);
		atividadeDao.remover(atividade);	
	}	
}
