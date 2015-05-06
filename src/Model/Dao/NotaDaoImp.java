package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Nota;

public class NotaDaoImp implements NotaDao {

	private List<Nota> listaNota;
	@Override
	public void cadastrar(Nota nota) {
		this.listaNota.add(nota);
		
	}
	
	@Override
	public void remover(Nota nota) {
		this.listaNota.remove(nota);
		
	}
	
	public NotaDaoImp(){
		this.listaNota = new ArrayList<Nota>();
	}

	public List<Nota> getListaNota() {
		return listaNota;
	}



	
}
