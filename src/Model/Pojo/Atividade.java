package Model.Pojo;

import java.util.Calendar;
import java.util.List;

public class Atividade {
	private String nome;
	private String tipo;
	private Calendar data;
	private List<Nota> listaNotas;
	private Turma turma;
	private List<Aluno> listaAluno;
	
	 
	private float valor;
	
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	public Calendar getData() {
		return data;
	}
	public float getValor() {
		return valor;
	}
	
	public Atividade(String nome, String tipo, Calendar data, float valor) {
		this.nome=nome;
		this.tipo=tipo;
		this.data=data;
		this.valor=valor;
	}
	public List<Nota> getListaNotas() {
		return listaNotas;
	}
	public Turma getTurma() {
		return turma;
	}
	public List<Aluno> getListaAluno() {
		return listaAluno;
	}

}
