package View;

import java.util.Scanner;

import Model.Dao.AtividadeDao;
import Model.Dao.FaltaDao;
import Model.Dao.NotaDao;

public class MenuExtra {
	static Scanner scanner1 = new Scanner(System.in);

	public MenuExtra() {
	}

	public void menu(FaltaDao faltaDao,NotaDao notaDao,AtividadeDao atividadeDao) {

		String opcao2 = "0";
		System.out.println();
		while (opcao2 != "10") {
			FaltaView faltaView = new FaltaView(faltaDao);
			NotaView notaView = new NotaView(notaDao);
			AtividadeView atividadeView = new AtividadeView(atividadeDao);

			System.out.println("Menu academico de aluno");
			System.out.println("1 - Para cadastrar uma falta de um aluno no sistema");
			System.out.println("2 - Para cadastrar uma nota de um aluno no sistema");
			System.out.println("3 - Para cadastrar uma atividade em uma disciplina ");
			System.out.println("4 - Sair ");
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
			else if (opcao2.equals("4"))
				break;

		}

	}

}
