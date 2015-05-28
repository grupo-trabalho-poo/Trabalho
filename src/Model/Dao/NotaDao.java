package Model.Dao;

import Model.Pojo.Nota;
import Model.Pojo.Turma;

public interface NotaDao {
	
	public void cadastrar(Nota nota);
	public void remover(Nota nota);
	void cadastrar(Nota nota, Turma turma);

}
