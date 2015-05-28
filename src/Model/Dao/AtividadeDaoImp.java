package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Atividade;

public class AtividadeDaoImp implements AtividadeDao {

	private static List<Atividade> listaAtividade= new ArrayList<Atividade>();;
	
	
	
	
	public List<Atividade> getListaAtividade() {
		return listaAtividade;
	}
	
	
	
	
	public AtividadeDaoImp(){
		
	}
	
	
	
	
	@Override
	public void cadastrar(Atividade atividade) {
		AtividadeDaoImp.listaAtividade.add(atividade);
		
	}
	
	@Override
	public void remover(Atividade atividade) {
		AtividadeDaoImp.listaAtividade.remove(atividade);
		
	}

	@Override
	public List<Atividade> obterLista() {
		return AtividadeDaoImp.listaAtividade;
	}

	@Override
	public Atividade pesquisar(Atividade atividade) {

		return listaAtividade.get(listaAtividade.indexOf(atividade.getNome()));

	}
}
