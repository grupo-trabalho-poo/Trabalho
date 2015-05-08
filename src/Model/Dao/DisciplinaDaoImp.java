package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Disciplina;
import Model.Pojo.Disciplina;

public class DisciplinaDaoImp implements DisciplinaDao{
	
	private List<Disciplina> listaDisciplina;
	
	
	
	
	public List<Disciplina> getListaDisciplina() {
		return listaDisciplina;
	}
	
	
	
	
	public DisciplinaDaoImp(){
		this.listaDisciplina = new ArrayList<Disciplina>();
	}
	


	
	@Override
	public void cadastrar(Disciplina disciplina) {
		this.listaDisciplina.add(disciplina);
	}
	
	@Override
	public void remover(Disciplina disciplina) {
		this.listaDisciplina.remove(disciplina);	
	}




	@Override
	public List<Disciplina> obterLista() {
		return this.listaDisciplina;
	}




	@Override
	public Disciplina pesquisar(Disciplina disciplina) {
		for(Disciplina disciplina1:listaDisciplina){
			if(disciplina1.equals(disciplina)){
				 return disciplina1;
			}
		}
		Disciplina disciplina2 = new Disciplina("Não encontrou a Disciplina","000", 0);
		return disciplina2;
	}
}
