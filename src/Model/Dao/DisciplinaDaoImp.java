package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Disciplina;

public class DisciplinaDaoImp implements DisciplinaDao{
	
	private List<Disciplina> listaDisciplina;
	
	@Override
	public void cadastrar(Disciplina disciplina) {
		
		this.listaDisciplina.add(disciplina);
		
	}
	
	@Override
	public void remover(Disciplina disciplina) {
		this.listaDisciplina.remove(disciplina);
		
	}
	
	public DisciplinaDaoImp(){
		this.listaDisciplina = new ArrayList<Disciplina>();
	}


	
}
