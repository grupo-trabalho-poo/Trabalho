package Model.Pojo;

import java.util.Calendar;
import java.util.List;

public class Turma {
	private int ano;
	private int periodo;
	private String local;
	private Calendar horario;
	private int numeroVagas;
	private List<Falta> listaFalta;
	private List<Atividade> listaAtividade;
	private Disciplina disciplina;
	private Professor professor;
	private List<Aluno> listaAluno;
	
	public int getAno() {
		return ano;
	}
	public int getPeriodo() {
		return periodo;
	}
	public String getLocal() {
		return local;
	}
	public Calendar getHorario() {
		return horario;
	}
	public int getNumeroVagas() {
		return numeroVagas;
	}
	
	public Turma(int ano,int periodo, String local, Calendar horario, int numeroVagas) {
		this.ano=ano;
		this.periodo=periodo;
		this.local=local;
		this.horario=horario;
		this.numeroVagas=numeroVagas;
	}
	public List<Falta> getListaFalta() {
		return listaFalta;
	}
	public List<Atividade> getListaAtividade() {
		return listaAtividade;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public List<Aluno> getListaAluno() {
		return listaAluno;
	}

	
}
