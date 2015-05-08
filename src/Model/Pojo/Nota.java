package Model.Pojo;

public class Nota {
	
	private float nota;
	private Aluno aluno;
	private Atividade atividade;
	

	

	public float getNota() {
		return nota;
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public Atividade getAtividade() {
		return atividade;
	}
	
	
	
	
	public Nota(float nota) {
		this.nota=nota;
	}
}
