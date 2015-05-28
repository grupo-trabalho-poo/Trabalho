package Model.Pojo;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private String ano;
	private String periodo;
	private String local;
	private String horario;
	private String numeroVagas;
	private List<Falta> listaFalta= new ArrayList<Falta>();
	private static List<Atividade> listaAtividade= new ArrayList<Atividade>();
	private Disciplina disciplina;
	private Professor professor;
	private static List<Aluno> listaAluno= new ArrayList<Aluno>();
	


	public String getAno() {
		return ano;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	
	public String getLocal() {
		return local;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public String getNumeroVagas() {
		return numeroVagas;
	}
	
	public List<Falta> getListaFalta() {
		return listaFalta;
	}
	
	public static List<Atividade> getListaAtividade() {
		return listaAtividade;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public static List<Aluno> getListaAluno() {
		return listaAluno;
	}
	
	
	
	
	public Turma(String ano,String periodo, String local, String horario, String numeroVagas, Disciplina disciplina,Professor professor ) {
		this.ano=ano;
		this.periodo=periodo;
		this.local=local;
		this.horario=horario;
		this.numeroVagas=numeroVagas;
		this.professor= professor;
		this.disciplina= disciplina;
		
	}
	
	public Turma (Disciplina disciplina,String ano,String periodo){
		this.ano=ano;
		this.periodo=periodo;
		this.disciplina= disciplina;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Turma)) {
			return false;
		}
		Turma turma = (Turma)obj;
		return this.disciplina.equals(turma.getDisciplina()) && this.ano.equals(turma.getAno()) && this.periodo.equals(turma.getPeriodo());
	}
	
	@Override
	public String toString() {
		return ("Professor: "+this.professor.getNome() + " Disciplina: "+ this.disciplina.getNome()+" ano: "+this.ano  + " periodo: " + this.periodo + " Local: "+this.local + " Horario: "+this.horario + " Numero de Vagas: "+ this.numeroVagas );
	}
}
