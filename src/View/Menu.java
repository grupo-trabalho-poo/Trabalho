package View;

import Model.Dao.AlunoDaoImp;
import Model.Pojo.Aluno;

public class Menu {

	public static void main(String[] args) {
		
		AlunoDaoImp alunoDaoImp = new AlunoDaoImp();
		AlunoView alunoView = new AlunoView(alunoDaoImp);
		alunoView.cadastrar();
		//alunoView.cadastrar();
		//alunoView.cadastrar();
		alunoView.listar();
		alunoView.buscar();
		

	}

}
