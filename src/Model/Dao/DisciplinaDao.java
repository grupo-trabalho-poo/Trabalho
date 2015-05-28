package Model.Dao;

import java.util.List;

import Model.Pojo.Disciplina;

public interface DisciplinaDao {
	
	public Disciplina pesquisar2(Disciplina disciplina);
	public void cadastrar (Disciplina disciplina);
	public void remover(Disciplina disciplina);
	public List<Disciplina> obterLista();
	public Disciplina pesquisar(Disciplina disciplina);
}
