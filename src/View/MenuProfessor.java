package View;

import java.util.Scanner;

import Model.Dao.DisciplinaDao;
import Model.Dao.ProfessorDao;

public class MenuProfessor {

    static Scanner scanner1 = new Scanner(System.in);

    public MenuProfessor() {
    }

    public void menu(DisciplinaDao disciplinaDao, ProfessorDao professorDao) {

        String opcao2 = "0";
        System.out.println();
        while (opcao2 != "7") {
            ProfessorView professorView = new ProfessorView(professorDao);
            System.out.println("Menu academico de professor");
            System.out.println("1 - Para cadastrar um professor no sistema");
            System.out.println("2 - Sair");
            opcao2 = scanner1.nextLine();

            if (opcao2.equals("1")) {
                professorView.cadastrar();
                professorView.listar();          
           } else if (opcao2.equals("2")) {
                break;
            }

        }

    }

}
