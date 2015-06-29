package Model.Pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class Falta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String numeroFaltas;
    @JoinColumn(name="aluno",referencedColumnName="id")
    @ManyToOne(optional=false,fetch=FetchType.EAGER)
    private Aluno aluno;
    @JoinColumn(name="turma",referencedColumnName="id")
    @ManyToOne(optional=false,fetch=FetchType.EAGER)
    private Turma turma;

    public String getNumeroFaltas() {
        return numeroFaltas;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Falta)) {
            return false;
        }
        Falta falta = (Falta) obj;
        return this.numeroFaltas.equals(falta.numeroFaltas);
    }

    public Falta(String numeroFaltas) {

        this.numeroFaltas = numeroFaltas;
    }
}
