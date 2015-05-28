package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Aluno;
import Model.Pojo.Disciplina;
import Model.Pojo.Turma;

public class TurmaDaoImp implements TurmaDao {

	// primeiro comit

	private static List<Turma> listaTurma = new ArrayList<Turma>();;

	public static List<Turma> getListaTurma() {
		return TurmaDaoImp.listaTurma;
	}

	public TurmaDaoImp() {

	}

	@Override
	public void cadastrar(Turma turma, Disciplina disciplina,
			List<Disciplina> listaDisciplina) {
		if (listaDisciplina.contains(disciplina)) {
			TurmaDaoImp.listaTurma.add(turma);
		} else
			System.out.println("A disciplina ainda não foi cadastrada");

	}

	@Override
	public void remover(Turma turma) {
		TurmaDaoImp.listaTurma.remove(turma);
	}

	@Override
	public List<Turma> obterLista() {
		return TurmaDaoImp.listaTurma;
	}

	@Override
	public Turma pesquisar(Turma turma) {
		return TurmaDaoImp.listaTurma.get(listaTurma.indexOf(turma));

	}

	public void cadastrarAlunos(Aluno aluno, Turma turma) {

		if (TurmaDaoImp.listaTurma.contains(turma)) {
			TurmaDaoImp.getListaTurma().get(TurmaDaoImp.listaTurma.indexOf(turma)).getListaAluno()
					.add(aluno);
		} else
			System.out.println(" A Turma ainda não está cadastrada");

	}

	public List<Turma> pesquisarTurmaNomeDisciplina(String nomeDisciplina) {
		List<Turma> listaDeTurmasDisciplina = new ArrayList<Turma>();
		for (Turma turma : listaTurma) {
			if (nomeDisciplina.equals(turma.getDisciplina().getNome())) {
				listaDeTurmasDisciplina.add(turma);
			}
		}
		return listaDeTurmasDisciplina;
	}

}
