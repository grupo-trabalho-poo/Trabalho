package Model.Pojo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String tipo;
    private String data;
    @JoinColumn(name="turma",referencedColumnName="id")
    @ManyToOne(optional=false,fetch=FetchType.EAGER)
    private Turma turma;
    private float valor;

    public Turma getTurma() {
        return turma;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getData() {
        return data;
    }

    public float getValor() {
        return valor;
    }

    public Atividade(String nome, String tipo, String data, float valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
    }

    public Atividade(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Atividade)) {
            return false;
        }
        Atividade atividade = (Atividade) obj;
        return this.nome.equals(atividade.getNome());
    }

    @Override
    public String toString() {
        return (" Nome: " + this.nome + " Tipo: " + this.tipo + " Data: " + this.data + " Valor: " + this.valor);
    }
}
