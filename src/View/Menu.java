package View;

import java.util.Scanner;

import Model.Dao.AlunoDao;
import Model.Dao.AlunoDaoImp;
import Model.Dao.AtividadeDao;
import Model.Dao.AtividadeDaoImp;
import Model.Dao.DisciplinaDao;
import Model.Dao.DisciplinaDaoImp;
import Model.Dao.FaltaDao;
import Model.Dao.FaltaDaoImp;
import Model.Dao.NotaDao;
import Model.Dao.NotaDaoImp;
import Model.Dao.ProfessorDao;
import Model.Dao.ProfessorDaoImp;
import Model.Dao.TurmaDao;
import Model.Dao.TurmaDaoImp;
import View.Interface.Principal;

public class Menu {

    public static void main(String[] args) {
        new Principal().setVisible(true);
        ProfessorDao professorDao = new ProfessorDaoImp();
        AlunoDao alunoDao = new AlunoDaoImp();
        AtividadeDao atividadeDao = new AtividadeDaoImp();
        DisciplinaDao disciplinaDao = new DisciplinaDaoImp();
        FaltaDao faltaDao = new FaltaDaoImp();
        TurmaDao turmaDao = new TurmaDaoImp();
        NotaDao notaDao = new NotaDaoImp();

        String opcao1 = "0";
        while (opcao1 != "6") {
            System.out.println("Menu academico da UFLN");
            System.out.println("1 - Para assuntos relacionados ao aluno");
            System.out.println("2 - Para assuntos relacionados ao professor");
            System.out.println("3 - Para assuntos relacionados a disciplina");
            System.out.println("4 - Para assuntos relacionados a turma");
            System.out.println("5 - Para assuntos relacionados a notas, faltas e atividades");
            opcao1 = new Scanner(System.in).nextLine();

            if (opcao1.equals("1")) {
                MenuAluno menualuno = new MenuAluno();
                menualuno.menu(alunoDao);
            } else if (opcao1.equals("2")) {
                MenuProfessor menuprofessor = new MenuProfessor();
                menuprofessor.menu(disciplinaDao, professorDao);
            } else if (opcao1.equals("4")) {
                MenuTurma menuturma = new MenuTurma();
                menuturma.menu(turmaDao, disciplinaDao, professorDao, alunoDao);
            } else if (opcao1.equals("3")) {
                MenuDisciplina menudisciplina = new MenuDisciplina();
                menudisciplina.menu(disciplinaDao);
            } else if (opcao1.equals("5")) {
                MenuExtra menuextra = new MenuExtra();
                menuextra.menu(faltaDao, notaDao, atividadeDao);
            } else {
                System.out.println("Op��o inv�lida , digite novamente");
            }

        }

    }
}
