package Model.Dao;

import java.util.List;

import Model.Pojo.Turma;

public interface TurmaDao {
	
	public void remover(Turma turma);
	List<Turma> obterLista();
	public Turma pesquisar(Turma turma);
	public void salvar(Turma turma);
	public List<Turma> pesquisarTurmaNomeDisciplina(String nomeDisciplina);
	public List<Turma> getListaTurma();


}