package Model.Dao;

import java.util.List;

import Model.Pojo.Aluno;
import Model.Pojo.Disciplina;
import Model.Pojo.Turma;

public interface TurmaDao {
	
	public void remover(Turma turma);
	List<Turma> obterLista();
	public Turma pesquisar(Turma turma);
	public void cadastrarAlunos(Aluno aluno, Turma turma);
	public void cadastrar(Turma turma, Disciplina disciplina,
			List<Disciplina> listaDisciplina);

}