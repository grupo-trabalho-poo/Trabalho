package Model.Dao;

import java.util.List;

import Model.Pojo.Professor;

public interface ProfessorDao {
	
	public void cadastrar(Professor professor);
	public void remover(Professor professor);
	public List<Professor> obterLista();
	public Professor pesquisar(Professor professor);
}
