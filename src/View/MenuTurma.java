package View;

import java.util.Scanner;

import Model.Dao.DisciplinaDaoImp;
import Model.Dao.TurmaDaoImp;
import Model.Pojo.Disciplina;

public class MenuTurma {
	static Scanner scanner1 = new Scanner(System.in);

	public MenuTurma() {

	}

	public void menu(TurmaDaoImp turmaDaoImp) {
		String opcao2 = "0";
		DisciplinaDaoImp disciplinaDaoImp = new DisciplinaDaoImp();
		TurmaView turmaView = new TurmaView(turmaDaoImp);
		while (opcao2 != "7") {
			System.out.println("Menu academico referentes a Turma");
			System.out.println("Para cadastrar uma turma no sistema, digite 1");
			System.out.println("Para remover uma turma do sistema, digite 2");
			System.out.println("Para consultar turmas , digite 3");
			System.out.println("Para consultar historicamente turmas oferecidas por uma determinada disciplina, digite 4");
			opcao2 = scanner1.nextLine();

			if (opcao2.equals("1")) {
				turmaView.cadastrar();
				turmaView.listar();
			}

			else if (opcao2.equals("2")) {
				turmaView.removerTurma();

			}

			else if (opcao2.equals("3")) {
				System.out.println("Entre com a Disciplina: ");
				String nomeDisciplina5 = scanner1.nextLine();
				System.out.println("Entre com o Ano: ");
				String ano1 = scanner1.nextLine();
				System.out.println("Entre com o Periodo: ");
				String periodo1 = scanner1.nextLine();
				Disciplina disciplina5 = new Disciplina(nomeDisciplina5);
				turmaView.consultarTurmasDiciplina(disciplina5, ano1, periodo1);

			}

			else if (opcao2.equals("4")) {
				System.out.println("---Consulta de turmas oferecidas por uma determinada disciplina----");
				DisciplinaView disciplinaView= new DisciplinaView(disciplinaDaoImp);
				disciplinaView.consultaHistoricamenteDisciplina(turmaDaoImp);

			} 
			else
				break;

		}

	}
}
