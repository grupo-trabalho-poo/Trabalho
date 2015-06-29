package Model.Dao;

import java.util.List;

import Model.Pojo.Disciplina;

public interface DisciplinaDao {
	
	public void salvar(Disciplina disciplina);
	public void remover(Disciplina disciplina);
	public  List<Disciplina> getListaDisciplina();
	public Disciplina pesquisar(Disciplina disciplina);
	
}
