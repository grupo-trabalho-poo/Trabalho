package Model.Pojo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Atividade {
	
	private String nome;
	private String tipo;
	private Calendar data;
	private List<Nota> listaNotas=new ArrayList<Nota>();
	private Turma turma;
	private List<Aluno> listaAluno=new ArrayList<Aluno>();
	private float valor;
	
	
	
	
	public List<Nota> getListaNotas() {
		return listaNotas;
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public List<Aluno> getListaAluno() {
		return listaAluno;
	}
	
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
	
	public Atividade (String nome){
		this.nome=nome;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Atividade)) {
			return false;
		}
		Atividade atividade = (Atividade)obj;
		return this.nome.equals(atividade.getNome());
	}
	
	@Override
	public String toString() {
		return (" Nome: "+this.nome+" Tipo: "+this.tipo + " Data: "+ data.get(Calendar.DAY_OF_MONTH)+"/"+data.get(Calendar.MONTH)+"/"+data.get(Calendar.YEAR) + " Valor: " + this.valor);
	}
}
