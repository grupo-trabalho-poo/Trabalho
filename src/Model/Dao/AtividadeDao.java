package Model.Dao;

import java.util.List;

import Model.Pojo.Atividade;

public interface AtividadeDao {
	
		public void cadastrar(Atividade atividade);
		public void remover(Atividade Atividade);
		public List<Atividade> obterLista();
		public Atividade pesquisar(Atividade atividade);
}
