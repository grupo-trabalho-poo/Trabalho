package View;

import java.util.Scanner;

import Model.Dao.DisciplinaDaoImp;

public class MenuDisciplina {
	static Scanner scanner1 = new Scanner(System.in);

	public MenuDisciplina() {

	}

	public void menu(DisciplinaDaoImp disciplinaDaoImp) {
		String opcao2 = "0";
		while (opcao2 != "7") {
			DisciplinaView disciplinaView = new DisciplinaView(disciplinaDaoImp);
			System.out.println("Menu academico de Disciplina");
			System.out.println("Para cadastrar uma disciplina no sistema, digite 1");
			System.out.println("Para remover uma disicplina do sistema, digite 2");
			opcao2 = scanner1.nextLine();

			if (opcao2.equals("1")) {
				disciplinaView.cadastrar();
				disciplinaView.listar();
			}

			else if (opcao2.equals("2")) {
				disciplinaView.removerDisciplina();
				disciplinaView.listar();

			}
			 
			else
				break;

		}

	}
}



