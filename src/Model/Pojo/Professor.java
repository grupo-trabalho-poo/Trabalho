package Model.Pojo;

import java.util.List;

public class Professor extends Pessoa {

	private String departamento;
	private List<Turma> listaTurma;
	private List<Disciplina> listaDisciplina;

	
	
	
	public String getDepartamento() {
		return departamento;
	}
	
	public List<Turma> getListaTurma() {
		return listaTurma;
	}

	public List<Disciplina> getListaDisciplina() {
		return listaDisciplina;
	}
	
	
	
	
	public Professor(String nome, String cpf, String departamento) {
		super(nome, cpf);
		this.departamento=departamento;
	}
	
	public Professor(String cpf){
		super(cpf);
	}
	
	
	
	
	@Override
	public String toString() {
		return super.toString()+" Departamento: "+ this.departamento;
	}
}
