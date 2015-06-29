package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Nota;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NotaDaoImp implements NotaDao {

    private static List<Nota> listaNota = new ArrayList<Nota>();
    private final SessionFactory conexao;

    public List<Nota> getListaNota() {
        return listaNota;
    }

    public NotaDaoImp() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void remover(Nota nota) {
        NotaDaoImp.listaNota.remove(nota);
    }

    @Override
    public void salvar(Nota nota) {
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(nota);
        tx.commit();
        session.close();
    }

}
