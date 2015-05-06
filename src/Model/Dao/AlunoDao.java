package Model.Dao;

import java.util.List;

import Model.Pojo.Aluno;

public interface AlunoDao {
	
	public void cadastrar(Aluno aluno);
	public void remover(Aluno aluno);
	public List<Aluno> obterLista();
	
}
