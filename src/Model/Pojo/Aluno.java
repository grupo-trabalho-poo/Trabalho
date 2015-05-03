package Model.Pojo;

import java.util.List;


public class Aluno extends Pessoa {
	private List<Turma> listaTurma; 
	private List<Falta> listaFalta;
	private List<Nota> listaNotas;
	private List<Atividade> ListaAtividade;

	public Aluno(String nome, String cpf) {
		super(nome, cpf);
	
	}
	
	public Aluno(String cpf){
		super(cpf);
	}
	
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
	




}
