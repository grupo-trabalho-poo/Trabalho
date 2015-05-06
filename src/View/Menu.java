package View;

import Model.Dao.AlunoDaoImp;

public class Menu {

	public static void main(String[] args) {
		AlunoDaoImp alunoDaoImp = new AlunoDaoImp();
		AlunoView alunoView = new AlunoView(alunoDaoImp);
		alunoView.cadastrar();
		alunoView.cadastrar();
		alunoView.cadastrar();
		alunoView.listar();
		
		
		
		//ProfessorDaoImp professorDaoImp = new ProfessorDaoImp();
		//ProfessorView professorView = new ProfessorView(professorDaoImp);
		//professorView.cadastrar();
		
		

	}

}
