package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Disciplina;

public class DisciplinaDaoImp implements DisciplinaDao{
	
	private static List<Disciplina> listaDisciplina= new ArrayList<Disciplina>();
	
	
	
	
	public static List<Disciplina> getListaDisciplina() {
		return DisciplinaDaoImp.listaDisciplina;
	}
	
	
	
	
	public DisciplinaDaoImp(){
	}
	


	
	@Override
	public void cadastrar(Disciplina disciplina) {
		DisciplinaDaoImp.listaDisciplina.add(disciplina);
	}
	
	@Override
	public void remover(Disciplina disciplina) {
		DisciplinaDaoImp.listaDisciplina.remove(disciplina);	
	}




	@Override
	public List<Disciplina> obterLista() {
		return DisciplinaDaoImp.listaDisciplina;
	}




	@Override
	public Disciplina pesquisar(Disciplina disciplina) {
		
		int index =DisciplinaDaoImp.listaDisciplina.indexOf(disciplina);
		System.out.println("---" +index);
			return DisciplinaDaoImp.listaDisciplina.get(index);
		
		}


	

	@Override
	public Disciplina pesquisar2(Disciplina disciplina) {
		for(Disciplina disciplina1:listaDisciplina){
			if(disciplina1.equals(disciplina)){
				 return disciplina1;
			}
		}
		Disciplina disciplina2 = new Disciplina(null);
		return disciplina2;
	}		

	}

