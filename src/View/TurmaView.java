package View;

import java.util.List;
import java.util.Scanner;

import Model.Dao.AlunoDao;
import Model.Dao.DisciplinaDao;
import Model.Dao.ProfessorDao;
import Model.Dao.TurmaDao;
import Model.Pojo.Aluno;
import Model.Pojo.Disciplina;
import Model.Pojo.Professor;
import Model.Pojo.Turma;

public class TurmaView {

    private TurmaDao turmaDao;
    private Scanner scanner;
    private Scanner scanner1;
    DisciplinaDao disciplinaDao;
    ProfessorDao professorDao;
    AlunoDao alunoDao;

    public TurmaView(TurmaDao turmaDao, ProfessorDao professorDao, AlunoDao alunoDao, DisciplinaDao disciplinaDao) {
        this.turmaDao = turmaDao;
        this.professorDao = professorDao;
        this.alunoDao = alunoDao;
        this.disciplinaDao = disciplinaDao;
    }

    public void cadastraAluno() {
        System.out.println("Informe o CPF do aluno: ");
        String cpf1 = scanner.nextLine();
        Aluno aluno1 = new Aluno(cpf1);
        aluno1 = alunoDao.pesquisar(aluno1);
        System.out.println("Informe o Periodo: ");
        String periodo = scanner.nextLine();
        System.out.println("Informe o ano: ");
        String ano = scanner.nextLine();
        System.out.println("Informe o nome Disciplina: ");
        String nomeDisciplina = scanner.nextLine();
        Disciplina disciplina = new Disciplina(nomeDisciplina);
        disciplina = disciplinaDao.pesquisar(disciplina);
        Turma turma = new Turma(disciplina, ano, periodo);
        turma = turmaDao.pesquisar(turma);
        System.out.println("--" + turma);
        System.out.println("--" + aluno1);

        if (turmaDao.getListaTurma().contains(turma)) {
            turmaDao.getListaTurma().get(turmaDao.getListaTurma().indexOf(turma)).getListaAluno()
                    .add(aluno1);
        } else {
            System.out.println(" A Turma ainda n�o est� cadastrada");
        }

    }

    public void cadastrar(Disciplina disciplina, Professor professor) {
        System.out.println("\n-------------Cadastro de Turma-------------\n");
        scanner = new Scanner(System.in);
        System.out.println("Informe o Ano: ");
        String ano = scanner.nextLine();
        System.out.println("Informe o Periodo: ");
        String periodo = scanner.nextLine();
        System.out.println("Informe o Local: ");
        String local = scanner.nextLine();
        System.out.println("Informe o Horario: ");
        String horario = scanner.nextLine();
        System.out.println("Informe o Numero de Vagas: ");
        String numeroVagas = scanner.nextLine();
        Turma turma = new Turma(ano, periodo, local, horario, numeroVagas, disciplina, professor);

        turmaDao.salvar(turma);

    }

    public void listar() {
        List<Turma> listaTurma = turmaDao.obterLista();
        for (Turma turma : listaTurma) {
            System.out.println(turma);
        }
    }

    public void removerTurma() {
        scanner1 = new Scanner(System.in);
        System.out.println("Entre com a Disciplina: ");
        String nomeDisciplina2 = scanner1.nextLine();
        System.out.println("Entre com o Ano: ");
        String ano = scanner1.nextLine();
        System.out.println("Entre com o Periodo: ");
        String periodo = scanner1.nextLine();
        Disciplina disciplina = new Disciplina(nomeDisciplina2);
        Turma turma = new Turma(disciplina, ano, periodo);
        turma = turmaDao.pesquisar(turma);
        System.out.println("Turma a ser Removida: " + turma);
        turmaDao.remover(turma);
    }

    public void consultarTurmasDiciplina(Disciplina disciplina, String ano,
            String periodo) {

        Turma turma3 = new Turma(disciplina, ano, periodo);
        turma3 = turmaDao.pesquisar(turma3);
        for (Aluno aluno : turma3.getListaAluno()) {
            System.out.println(aluno);

        }

    }

}
