package Model.Pojo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity


public class Aluno {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    private String cpf;
    @OneToMany
    private List<Turma> listaTurma = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Aluno)) {
            return false;
        }
        Aluno aluno = (Aluno) obj;
        return this.cpf.equals(aluno.getCpf());
    }

    @Override
    public String toString() {
        return (" Nome: " + this.nome + " CPF: " + this.cpf);
    }

    public List<Turma> getListaTurma() {
        return listaTurma;
    }

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Aluno(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
