package Model.Pojo;

import java.util.List;

public class Disciplina {
	private String nome;
	private String ementa;
	private int cargaHoraria;
	private List<Turma> listaTurma;
	private List<Professor> listaProfessores;

	public String getNome() {
		return nome;
	}
	public String getEmenta() {
		return ementa;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public Disciplina(String nome,String ementa,int cargaHoraria) {
		// TODO Auto-generated constructor stub
		this.nome=nome;
		this.ementa=ementa;
		this.cargaHoraria=cargaHoraria;
		
	}
	public List<Turma> getListaTurma() {
		return listaTurma;
	}
	public List<Professor> getListaProfessores() {
		return listaProfessores;
	}

	
}
