package Model.Dao;

import java.util.List;

import Model.Pojo.Turma;

public interface TurmaDao {
	public void cadastrar(Turma turma);
	public void remover(Turma turma);
	List<Turma> obterLista();
	Turma pesquisar(Turma turma);

}