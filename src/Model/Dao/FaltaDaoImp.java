package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Falta;

public class FaltaDaoImp implements FaltaDao {

	private List<Falta> listaFalta;
	
	
	
	
	public List<Falta> getListaFalta() {
		return listaFalta;
	}
	
	
	
	
	public FaltaDaoImp(){
		this.listaFalta = new ArrayList<Falta>();
	}
	
	
	
	
	@Override
	public void cadastrar(Falta falta) {
		this.listaFalta.add(falta);
	}
	
	@Override
	public void remover(Falta falta) {
		this.listaFalta.remove(falta);	
	}
}
