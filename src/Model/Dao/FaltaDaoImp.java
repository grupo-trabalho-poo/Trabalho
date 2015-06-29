package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Falta;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FaltaDaoImp implements FaltaDao {

    private static List<Falta> listaFalta = new ArrayList<Falta>();
    private final SessionFactory conexao;

    public List<Falta> getListaFalta() {
        return listaFalta;
    }

    public FaltaDaoImp() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void salvar(Falta falta) {
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(falta);
        tx.commit();
        session.close();
    }

    @Override
    public void remover(Falta falta) {
        FaltaDaoImp.listaFalta.remove(falta);
    }

    public Falta pesquisar(Falta falta) {

        return listaFalta.get(listaFalta.indexOf(falta.getNumeroFaltas()));

    }

}
