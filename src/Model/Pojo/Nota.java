package Model.Pojo;

public class Nota {
	
	private String nota;
	private Aluno aluno;
	private Atividade atividade;
	

	

	public String getNota() {
		return nota;
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public Atividade getAtividade() {
		return atividade;
	}
	
	
	
	
	public Nota(String nota, Aluno aluno,Atividade atividade) {
		this.aluno= aluno;
		this.atividade=atividade;
		this.nota=nota;
	}
}
