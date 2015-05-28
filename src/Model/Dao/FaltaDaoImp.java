package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Atividade;
import Model.Pojo.Falta;

public class FaltaDaoImp implements FaltaDao {

	private static List<Falta> listaFalta=new ArrayList<Falta>();
	
	
	
	
	public List<Falta> getListaFalta() {
		return listaFalta;
	}
	
	
	
	
	public FaltaDaoImp(){
	
	}
	
	
	
	
	@Override
	public void cadastrar(Falta falta) {
		FaltaDaoImp.listaFalta.add(falta);
	}
	
	@Override
	public void remover(Falta falta) {
		FaltaDaoImp.listaFalta.remove(falta);	
	}
	
	
	public Falta pesquisar(Falta falta) {

		return listaFalta.get(listaFalta.indexOf(falta.getNumeroFaltas()));

	}
	
	
	
}
