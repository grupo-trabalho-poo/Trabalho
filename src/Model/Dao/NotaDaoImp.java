package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Nota;
import Model.Pojo.Turma;

public class NotaDaoImp implements NotaDao {

	private static List<Nota> listaNota= new ArrayList<Nota>();
	
	
	
	
	public List<Nota> getListaNota() {
		return listaNota;
	}
	
	
	
	
	public NotaDaoImp(){
		
	}
	
	
	
	
	public void cadastrar(Nota nota,Turma turma ) {
		
		NotaDaoImp.listaNota.add(nota);	
		
	}
	
	@Override
	public void remover(Nota nota) {
		NotaDaoImp.listaNota.remove(nota);
	}




	@Override
	public void cadastrar(Nota nota) {
		// TODO Auto-generated method stub
		
	}



	}
