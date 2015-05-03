package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Aluno;


public class AlunoDaoImp implements AlunoDao {

	
	private List<Aluno> listaAluno;
	
	@Override
	public void salvar(Aluno aluno) {
		// TODO Auto-generated method stub
		this.listaAluno.add(aluno);
		
	}

	@Override
	public List<Aluno> obter() {
		// TODO Auto-generated method stub
		return this.listaAluno;
	}



	public List<Aluno> getListaAluno() {
		return listaAluno;
	}
	
	public AlunoDaoImp() {
		// TODO Auto-generated constructor stub
		this.listaAluno = new ArrayList<Aluno>();
	}

	@Override
	public Aluno pesquisar(Aluno aluno) {
		/*int indice = getListaAluno().indexOf(aluno);
		Aluno aluno2= getListaAluno().get(indice);
		return aluno2;*/
		
		/*for(Aluno aluno1:listaAluno){
			//System.out.println(aluno1.getCpf() +" - " + aluno.getCpf());
			
			if(aluno.getCpf() == aluno1.getCpf()){
				System.out.println("entrou");
				 return aluno1;
			}
		}
		return aluno;*/
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
