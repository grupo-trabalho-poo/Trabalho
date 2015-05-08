package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Turma;

public class TurmaDaoImp implements TurmaDao{
	
//primeiro comit

	private List<Turma> listaTurma;
	@Override
	public void cadastrar(Turma turma) {
		this.listaTurma.add(turma);
		
	}
	
	@Override
	public void remover(Turma turma) {
		this.listaTurma.add(turma);
		
	}
	
	public List<Turma> getListaTurma() {
		return listaTurma;
	}
	
	
	
	
	public TurmaDaoImp(){
		this.listaTurma = new ArrayList<Turma>();
	}

}
