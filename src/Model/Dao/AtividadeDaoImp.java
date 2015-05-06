package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Atividade;

public class AtividadeDaoImp implements AtividadeDao {

	private List<Atividade> listaAtividade;
	@Override
	public void cadastrar(Atividade atividade) {
		this.listaAtividade.add(atividade);
		
	}
	
	@Override
	public void remover(Atividade atividade) {
		this.listaAtividade.remove(atividade);
		
	}
	
	
	public List<Atividade> getListaAtividade() {
		return listaAtividade;
	}
	
	public AtividadeDaoImp(){
		this.listaAtividade = new ArrayList<Atividade>();
	}




}
