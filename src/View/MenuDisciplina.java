package View;

import java.util.Scanner;

import Model.Dao.DisciplinaDao;

public class MenuDisciplina {

    static Scanner scanner1 = new Scanner(System.in);

    public MenuDisciplina() {

    }

    public void menu(DisciplinaDao disciplinaDao) {
        String opcao2 = "0";
        while (opcao2 != "7") {
            DisciplinaView disciplinaView = new DisciplinaView(disciplinaDao);
            System.out.println("Menu academico de Disciplina");
            System.out.println("1 - Para cadastrar uma disciplina no sistema");
            System.out.println("2 - Sair");
            opcao2 = scanner1.nextLine();

            if (opcao2.equals("1")) {
                disciplinaView.cadastrar();
                disciplinaView.listar();
            } else if (opcao2.equals("2")) {
                break;
            }

        }

    }
}
