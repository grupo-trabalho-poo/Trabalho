package Model.Pojo;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	
	private List<Turma> listaTurma=new ArrayList<Turma>(); 
	private List<Falta> listaFalta=new ArrayList<Falta>();
	private List<Nota> listaNotas=new ArrayList<Nota>();
	private List<Atividade> ListaAtividade=new ArrayList<Atividade>();
	
	
	
	
	public List<Turma> getListaTurma() {
		return listaTurma;
	}

	public List<Falta> getListaFalta() {
		return listaFalta;
	}
	
	public List<Nota> getListaNotas() {
		return listaNotas;
	}

	public List<Atividade> getListaAtividade() {
		return ListaAtividade;
	}
	
	
	
	
	public Aluno(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public Aluno(String cpf){
		super(cpf);
	}
}
