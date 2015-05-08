package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Atividade;

public class AtividadeDaoImp implements AtividadeDao {

	private List<Atividade> listaAtividade;
	
	
	
	
	public List<Atividade> getListaAtividade() {
		return listaAtividade;
	}
	
	
	
	
	public AtividadeDaoImp(){
		this.listaAtividade = new ArrayList<Atividade>();
	}
	
	
	
	
	@Override
	public void cadastrar(Atividade atividade) {
		this.listaAtividade.add(atividade);
		
	}
	
	@Override
	public void remover(Atividade atividade) {
		this.listaAtividade.remove(atividade);
		
	}

	@Override
	public List<Atividade> obterLista() {
		return this.listaAtividade;
	}

	@Override
	public Atividade pesquisar(Atividade atividade) {
		for(Atividade atividade1:listaAtividade){
			if(atividade1.equals(atividade)){
				 return atividade1;
			}
		}
		Atividade atividade2 = new Atividade("Não encontrou a Atividade","000", null, 0);
		return atividade2;
	}
}
