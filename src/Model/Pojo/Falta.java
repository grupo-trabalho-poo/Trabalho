package Model.Pojo;

public class Falta {
	private int numeroFaltas;
	private Aluno aluno;
	private Turma turma;
	
	public int getNumeroFaltas() {
		return numeroFaltas;
	}

	public Falta(int numeroFaltas) {
	
		this.numeroFaltas=numeroFaltas;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Turma getTurma() {
		return turma;
	}




	
}
