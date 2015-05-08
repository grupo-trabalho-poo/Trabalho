package Model.Pojo;

import java.util.List;

public class Turma {
	
	private String codigoTurma;
	private int ano;
	private int periodo;
	private String local;
	private String horario;
	private int numeroVagas;
	private List<Falta> listaFalta;
	private List<Atividade> listaAtividade;
	private Turma disciplina;
	private Professor professor;
	private List<Aluno> listaAluno;
	
	
	
	public String getCodigoTurma() {
		return codigoTurma;
	}



	public int getAno() {
		return ano;
	}
	
	public int getPeriodo() {
		return periodo;
	}
	
	public String getLocal() {
		return local;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public int getNumeroVagas() {
		return numeroVagas;
	}
	
	public List<Falta> getListaFalta() {
		return listaFalta;
	}
	
	public List<Atividade> getListaAtividade() {
		return listaAtividade;
	}
	
	public Turma getTurma() {
		return disciplina;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public List<Aluno> getListaAluno() {
		return listaAluno;
	}
	

	
	
	
	
	public Turma(String i,int ano,int periodo, String local, String horario, int numeroVagas) {
		this.codigoTurma = i;
		this.ano=ano;
		this.periodo=periodo;
		this.local=local;
		this.horario=horario;
		this.numeroVagas=numeroVagas;
	}
	
	public Turma(String codigoTurma) {
		this.codigoTurma = codigoTurma;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Turma)) {
			return false;
		}
		Turma turma = (Turma)obj;
		return this.codigoTurma.equals(turma.getCodigoTurma());
	}
	
	@Override
	public String toString() {
		return (" Codigo da Turma: "+this.codigoTurma+" ano: "+this.ano  + " periodo: " + this.periodo + " Local: "+this.local + " Horario: "+this.horario + " Numero de Vagas: "+ this.numeroVagas);
	}
}
