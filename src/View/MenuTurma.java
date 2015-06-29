package View;

import java.util.Scanner;

import Model.Dao.AlunoDao;
import Model.Dao.DisciplinaDao;
import Model.Dao.ProfessorDao;
import Model.Dao.TurmaDao;
import Model.Pojo.Disciplina;
import Model.Pojo.Professor;

public class MenuTurma {

    static Scanner scanner1 = new Scanner(System.in);

    public MenuTurma() {

    }

    public void menu(TurmaDao turmaDao, DisciplinaDao disciplinaDao, ProfessorDao professorDao, AlunoDao alunoDao) {
        String opcao2 = "0";
        TurmaView turmaView = new TurmaView(turmaDao, professorDao, alunoDao, disciplinaDao);
        while (opcao2 != "7") {
            System.out.println("Menu academico referentes a Turma");
            System.out.println("1 - Para cadastrar uma turma no sistema");
            System.out.println("2 - Sair");
            opcao2 = scanner1.nextLine();

            if (opcao2.equals("1")) {
                System.out.println("Informe o nome Disciplina: ");
                String nomeDisciplina = scanner1.nextLine();
                Disciplina disciplina = new Disciplina(nomeDisciplina);
                System.out.println("Informe o CPF do professor: ");
                String cpf = scanner1.nextLine();
                Professor professor = new Professor(cpf);
                turmaView.cadastrar(disciplina, professor);
            } else if (opcao2.equals("2")) {
                break;
            }

        }
    }
}