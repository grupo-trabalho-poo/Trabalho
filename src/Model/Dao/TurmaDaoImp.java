package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Turma;
import Model.Pojo.Turma;

public class TurmaDaoImp implements TurmaDao{
	
//primeiro comit

	private List<Turma> listaTurma;
	
	
	
	
	public List<Turma> getListaTurma() {
		return listaTurma;
	}
	
	
	
	
	public TurmaDaoImp(){
		this.listaTurma = new ArrayList<Turma>();
	}
	
	
	
	
	@Override
	public void cadastrar(Turma turma) {
		this.listaTurma.add(turma);
	}
	
	@Override
	public void remover(Turma turma) {
		this.listaTurma.add(turma);	
	}




	@Override
	public List<Turma> obterLista() {
		return this.listaTurma;
	}




	@Override
	public Turma pesquisar(Turma turma) {
		for(Turma turma1:listaTurma){
			if(turma1.equals(turma)){
				 return turma1;
			}
		}
		Turma turma2 = new Turma("",0, 0, "Nao Achou a Turma", null, 0);
		return turma2;
	}
}
