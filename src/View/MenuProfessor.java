package View;

import java.util.Scanner;

import Model.Dao.DisciplinaDaoImp;
import Model.Dao.ProfessorDaoImp;

public class MenuProfessor {
	static Scanner scanner1 = new Scanner(System.in);

	public MenuProfessor() {
	}

	public void menu(DisciplinaDaoImp disciplinaDaoImp ,ProfessorDaoImp professorDaoImp) {

		String opcao2 = "0";
		System.out.println();
		while (opcao2 != "7") {
			ProfessorView professorView = new ProfessorView(professorDaoImp);
			System.out.println("Menu academico de professor");
			System.out.println("Para cadastrar um professor no sistema, digite 1");
			System.out.println("Para remover um professor no sistema, digite 2");
			System.out.println("Para consultar a situação de um aluno em uma disciplina, digite 3");
			opcao2 = scanner1.nextLine();

			if (opcao2.equals("1") ) {
				professorView.cadastrar();
				professorView.listar();
			}

			else if (opcao2.equals("2")) {
				professorView.removerProfessor();

			}

			else if (opcao2.equals("3")) {

			}
			
			else
				break;

		}

	}

}


