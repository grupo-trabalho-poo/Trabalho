package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Aluno;

public class AlunoDaoImp implements AlunoDao {

	private static List<Aluno> listaAluno= new ArrayList<Aluno>();
	
	
	
	
	public static List<Aluno> getListaAluno() {
		return AlunoDaoImp.listaAluno;
	}
	
	
	
	
	public AlunoDaoImp() {
	
	}
	
	
	
	
	@Override
	public void cadastrar(Aluno aluno) {
		AlunoDaoImp.getListaAluno().add(aluno);	
	}
	
	@Override
	public void remover(Aluno aluno) {
		AlunoDaoImp.getListaAluno().remove(aluno);	
	}
	
	@Override
	public List<Aluno> obterLista() {
		return AlunoDaoImp.getListaAluno();
	}

	public Aluno pesquisar(Aluno alunoCpf) {
		
		return AlunoDaoImp.listaAluno.get(AlunoDaoImp.listaAluno.indexOf(alunoCpf));
	}
}
