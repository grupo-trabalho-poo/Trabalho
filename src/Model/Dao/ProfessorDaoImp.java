package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Professor;


public class ProfessorDaoImp implements ProfessorDao{
	
	private static List<Professor> listaProfessor= new ArrayList<Professor>();
	
	
	
	
	public List<Professor> getListaProfessor() {
		return listaProfessor;
	}
	
	
	
	
	public ProfessorDaoImp() {
		
	}
	
	
	
	
	@Override
	public void cadastrar(Professor professor) {
		ProfessorDaoImp.listaProfessor.add(professor);
	}
	
	@Override
	public void remover(Professor professor) {
		ProfessorDaoImp.listaProfessor.remove(professor);
	}
	
	@Override
	public List<Professor> obterLista() {
		return ProfessorDaoImp.listaProfessor;
	}

	@Override
	public Professor pesquisar(Professor professor) {
		int index = listaProfessor.indexOf(professor);
		
		//System.out.println("REsultado:" + index);
		
		if(index==-1){
			System.out.println("Professor nao cadastrado");
			return null;
		}
		return listaProfessor.get(index);

	}

}
