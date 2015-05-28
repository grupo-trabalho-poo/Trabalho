package Model.Pojo;

public class Falta {
	
	private String numeroFaltas;
	private Aluno aluno;
	private Turma turma;
	
	
	
	
	public String getNumeroFaltas() {
		return numeroFaltas;
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Falta)) {
			return false;
		}
		Falta falta = (Falta)obj;
		return this.numeroFaltas.equals(falta.numeroFaltas);
	}
	
	
	public Falta(String numeroFaltas) {
	
		this.numeroFaltas=numeroFaltas;
	}	
}
