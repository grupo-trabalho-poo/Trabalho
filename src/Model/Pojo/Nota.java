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

public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    private String nota;
    @JoinColumn(name="aluno",referencedColumnName="id")
    @ManyToOne(optional=false,fetch=FetchType.EAGER)
    private Aluno aluno;
    @JoinColumn(name="atividade",referencedColumnName="id")
    @ManyToOne(optional=false,fetch=FetchType.EAGER)
    private Atividade atividade;

    public String getNota() {
        return nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public Nota(String nota, Aluno aluno, Atividade atividade) {
        this.aluno = aluno;
        this.atividade = atividade;
        this.nota = nota;
    }
}
