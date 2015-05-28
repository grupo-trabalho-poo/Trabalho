package Model.Pojo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private String nome;
	private String ementa;
	private String cargaHoraria;
	private List<Turma> listaTurma=new ArrayList<Turma>();
	private List<Professor> listaProfessores=new ArrayList<Professor>();
	
	public String getNome() {
		return nome;
	}
	
	public String getEmenta() {
		return ementa;
	}
	
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	
	public List<Turma> getListaTurma() {
		return listaTurma;
	}
	
	public List<Professor> getListaProfessores() {
		return listaProfessores;
	}


	
	
	public Disciplina(String nome,String ementa,String cargaHoraria) {
		this.nome=nome;
		this.ementa=ementa;
		this.cargaHoraria=cargaHoraria;
	}
	
	public Disciplina(String nome) {
		this.nome=nome;
	}	
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Disciplina)) {
			return false;
		}
		Disciplina disciplina = (Disciplina)obj;
		return this.nome.equals(disciplina.getNome());
	}
	
	@Override
	public String toString() {
		return (" Nome: "+this.nome+" Ementa: "+this.ementa  + " Carga Horaria: " + this.cargaHoraria);
	}
}
