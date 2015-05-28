package View;

import java.util.Scanner;

import Model.Dao.AlunoDaoImp;

public class MenuAluno {
	static Scanner scanner1 = new Scanner(System.in);

	public MenuAluno() {
	}

	public void menu(AlunoDaoImp alunoDaoImp) {

		String opcao2 = "0";
		System.out.println();
		while (opcao2 != "7") {
			AlunoView alunoView = new AlunoView(alunoDaoImp);
			System.out.println("Menu academico de aluno");
			System.out.println("Para cadastrar um aluno no sistema, digite 1");
			System.out.println("Para remover um aluno no sistema, digite 2");
			System.out.println("Para cadastrar uma nota de um aluno , digite 3");
			System.out.println("Para consultar a situação de um aluno em uma disciplina, digite 4");
			opcao2 = scanner1.nextLine();

			if (opcao2.equals("1")) {
				alunoView.cadastrar();
				alunoView.listar();
			}

			else if (opcao2.equals("2")) {
				alunoView.removerAluno();

			}

			else if (opcao2.equals("3")) {

			}

			else if (opcao2.equals("4")) {
			}

			else
				break;

		}

	}

}
