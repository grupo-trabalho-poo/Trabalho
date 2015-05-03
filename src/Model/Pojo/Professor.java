package Model.Pojo;

import java.util.List;

public class Professor extends Pessoa {

	private String departamento;
	private List<Turma> listaTurma;
	private List<Disciplina> listaDisciplina;

	public String getDepartamento() {
		return departamento;
	}
	
	public Professor(String nome, String cpf, String departamento) {
		super(nome, cpf);
		this.departamento=departamento;
		// TODO Auto-generated constructor stub
	}

	public List<Turma> getListaTurma() {
		return listaTurma;
	}

	public List<Disciplina> getListaDisciplina() {
		return listaDisciplina;
	}

	

}
