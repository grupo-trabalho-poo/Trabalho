package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Disciplina;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DisciplinaDaoImp implements DisciplinaDao {

    private static List<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
    private final SessionFactory conexao;

    public List<Disciplina> getListaDisciplina() {
        return DisciplinaDaoImp.listaDisciplina;
    }

    public DisciplinaDaoImp() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void salvar(Disciplina disciplina) {
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(disciplina);
        tx.commit();
        session.close();
    }

    @Override
    public void remover(Disciplina disciplina) {
        DisciplinaDaoImp.listaDisciplina.remove(disciplina);
    }

    @Override
    public Disciplina pesquisar(Disciplina disciplina) {

        int index = DisciplinaDaoImp.listaDisciplina.indexOf(disciplina);
        return DisciplinaDaoImp.listaDisciplina.get(index);

    }

}
