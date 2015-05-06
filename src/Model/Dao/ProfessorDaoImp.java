package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Professor;


public class ProfessorDaoImp implements ProfessorDao{
	
	private List<Professor> listaProfessor;
	@Override
	public void cadastrar(Professor professor) {
		
		this.listaProfessor.add(professor);
		
	}
	
	@Override
	public void remover(Professor professor) {
		this.listaProfessor.remove(professor);
		
	}
	
	public List<Professor> getListaProfessor() {
		return listaProfessor;
	}
	
	public ProfessorDaoImp() {
		
		this.listaProfessor = new ArrayList<Professor>();
	}

	
}
