package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Turma;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TurmaDaoImp implements TurmaDao {

    private static List<Turma> listaTurma = new ArrayList<Turma>();
    private final SessionFactory conexao;

    public List<Turma> getListaTurma() {
        return TurmaDaoImp.listaTurma;
    }

    public TurmaDaoImp() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    public void salvar(Turma turma) {
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(turma);
        tx.commit();
        session.close();
    }

    public void remover(Turma turma) {
        TurmaDaoImp.listaTurma.remove(turma);
    }

    @Override
    public List<Turma> obterLista() {
        return TurmaDaoImp.listaTurma;
    }

    @Override
    public Turma pesquisar(Turma turma) {
        return TurmaDaoImp.listaTurma.get(listaTurma.indexOf(turma));

    }

    public List<Turma> pesquisarTurmaNomeDisciplina(String nomeDisciplina) {
        List<Turma> listaDeTurmasDisciplina = new ArrayList<Turma>();
        for (Turma turma : listaTurma) {
            if (nomeDisciplina.equals(turma.getDisciplina().getNome())) {
                listaDeTurmasDisciplina.add(turma);
            }
        }
        return listaDeTurmasDisciplina;
    }

}
