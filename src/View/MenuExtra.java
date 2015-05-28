package View;

import java.util.Scanner;

import Model.Dao.AtividadeDaoImp;
import Model.Dao.FaltaDaoImp;
import Model.Dao.NotaDaoImp;

public class MenuExtra {
	static Scanner scanner1 = new Scanner(System.in);

	public MenuExtra() {
	}

	public void menu(FaltaDaoImp faltaDaoImp,NotaDaoImp notaDaoImp,AtividadeDaoImp atividadeDaoImp) {

		String opcao2 = "0";
		System.out.println();
		while (opcao2 != "4") {
			FaltaView faltaView = new FaltaView(faltaDaoImp);
			NotaView notaView = new NotaView(notaDaoImp);
			AtividadeView atividadeView = new AtividadeView(atividadeDaoImp);

			System.out.println("Menu academico de aluno");
			System.out.println("Para cadastrar uma falta de um aluno no sistema, digite 1");
			System.out.println("Para cadastrar uma nota de um aluno no sistema, digite 2");
			System.out.println("Para cadastrar uma atividade em uma disciplina , digite 3");
			opcao2 = scanner1.nextLine();

			if (opcao2.equals("1")) {
				faltaView.cadastrar();
			}

			else if (opcao2.equals("2")) {
				notaView.cadastrar();

			}

			else if (opcao2.equals("3")) {
				atividadeView.cadastrar();
				

			}
			else
				break;

		}

	}

}
