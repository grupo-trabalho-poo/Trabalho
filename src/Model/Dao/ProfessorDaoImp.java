package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Professor;


public class ProfessorDaoImp implements ProfessorDao{
	
	private List<Professor> listaProfessor;
	
	
	
	
	public List<Professor> getListaProfessor() {
		return listaProfessor;
	}
	
	
	
	
	public ProfessorDaoImp() {
		this.listaProfessor = new ArrayList<Professor>();
	}
	
	
	
	
	@Override
	public void cadastrar(Professor professor) {
		this.listaProfessor.add(professor);
	}
	
	@Override
	public void remover(Professor professor) {
		this.listaProfessor.remove(professor);
	}
	
	@Override
	public List<Professor> obterLista() {
		return this.listaProfessor;
	}

	@Override
	public Professor pesquisar(Professor professor) {
		for(Professor professor1:listaProfessor){
			if(professor1.equals(professor)){
				 return professor1;
			}
		}
		Professor professor2 = new Professor("Não achou Professor","000 ","Invalido");
		return professor2;
	}
}
