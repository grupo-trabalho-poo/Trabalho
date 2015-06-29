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

public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    private String departamento;
    @OneToMany
    private List<Turma> listaTurma = new ArrayList<Turma>();
    @OneToMany
    private List<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

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
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
    }

    public Professor(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Professor)) {
            return false;
        }
        Professor professor = (Professor) obj;
        return this.cpf.equals(professor.getCpf());
    }

    @Override
    public String toString() {
        return (" Nome: " + this.nome + " CPF: " + this.cpf + "Departamento: " + this.departamento);
    }
}
