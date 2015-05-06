package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Aluno;


public class AlunoDaoImp implements AlunoDao {

	private List<Aluno> listaAluno;
	
	@Override
	public void cadastrar(Aluno aluno) {
		
		this.listaAluno.add(aluno);
		
	}
	
	@Override
	public void remover(Aluno aluno) {
		this.listaAluno.remove(aluno);
		
	}
	
	@Override
	public List<Aluno> obterLista() {
		return this.listaAluno;
	}
	


	public List<Aluno> getListaAluno() {
		return listaAluno;
	}
	
	public AlunoDaoImp() {
		this.listaAluno = new ArrayList<Aluno>();
	}




	

}
