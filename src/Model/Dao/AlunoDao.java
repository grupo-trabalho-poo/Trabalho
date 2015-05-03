package Model.Dao;

import java.util.List;

import Model.Pojo.Aluno;

public interface AlunoDao {
	
	void salvar(Aluno aluno);
	List<Aluno> obter();
	//Aluno pesquisar(Aluno aluno, List<Aluno> listaAluno);
	Aluno pesquisar(Aluno aluno);
	
	
}
