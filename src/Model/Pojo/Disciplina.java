package Model.Pojo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Disciplina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    private String ementa;
    private String cargaHoraria;
    @OneToMany        
    private List<Turma> listaTurma = new ArrayList<Turma>();
    @OneToMany
    private List<Professor> listaProfessores = new ArrayList<Professor>();

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

    public Disciplina(String nome, String ementa, String cargaHoraria) {
        this.nome = nome;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Disciplina)) {
            return false;
        }
        Disciplina disciplina = (Disciplina) obj;
        return this.nome.equals(disciplina.getNome());
    }

    @Override
    public String toString() {
        return (" Nome: " + this.nome + " Ementa: " + this.ementa + " Carga Horaria: " + this.cargaHoraria);
    }
}
