package View;

import java.util.Scanner;

import Model.Dao.AlunoDao;

public class MenuAluno {

    static Scanner scanner1 = new Scanner(System.in);

    public MenuAluno() {
    }

    public void menu(AlunoDao alunoDao) {

        String opcao2 = "0";
        System.out.println();
        while (opcao2 != "7") {
            AlunoView alunoView = new AlunoView(alunoDao);
            System.out.println("------------------------Menu academico de aluno------------------------");
            System.out.println("1 - Para cadastrar um aluno no sistema");
            System.out.println("2-Sair");
            opcao2 = scanner1.nextLine();

            if (opcao2.equals("1")) {
                alunoView.cadastrar();
                alunoView.listar();
            } else if (opcao2.equals("2")) {
                break;
            }

        }

    }

}
