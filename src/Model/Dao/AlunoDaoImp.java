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

	@Override
	public Aluno pesquisar(Aluno aluno) {
		
		for(Aluno aluno1:listaAluno){
			//System.out.println(aluno1.getCpf() +" - " + aluno.getCpf());
			
			if(aluno1.equals(aluno)){
				System.out.println("entrou");
				//System.out.println(aluno1.getCpf() +" - " + aluno1.getNome());
				 return aluno1;
			}
		}
		Aluno aluno2 = new Aluno("Não achou Aluno","000 ");
		return aluno2;
		
	}




	

}
