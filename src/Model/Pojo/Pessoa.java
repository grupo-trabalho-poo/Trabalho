package Model.Pojo;

public class Pessoa {
	private String nome;
	private String cpf;
	
	
	
	public String getNome() {
		return nome;
	}



	public String getCpf() {
		return cpf;
	}

	
	public Pessoa (String nome, String cpf){
		this.nome=nome;
		this.cpf=cpf;
	}
	
	public Pessoa (String cpf){
		this.cpf=cpf;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Aluno)){
			return false;
		}
		
		Aluno aluno = (Aluno)obj;
		//return this.cpf == aluno.getCpf();
		return this.cpf.equals(aluno.getCpf());
	}
	
	@Override
	public String toString() {
		
		return (" Nome: "+this.nome+" CPF: "+this.cpf);
	}
}
