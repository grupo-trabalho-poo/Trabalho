package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Atividade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AtividadeDaoImp implements AtividadeDao {

    private static List<Atividade> listaAtividade = new ArrayList<Atividade>();
    private final SessionFactory conexao;

    public List<Atividade> getListaAtividade() {
        return listaAtividade;
    }

    public AtividadeDaoImp() {
        conexao = new Configuration().configure().buildSessionFactory();

    }

    @Override
    public void salvar(Atividade atividade) {
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(atividade);
        tx.commit();
        session.close();

    }

    @Override
    public void remover(Atividade atividade) {
        AtividadeDaoImp.listaAtividade.remove(atividade);

    }

    @Override
    public List<Atividade> obterLista() {
        return AtividadeDaoImp.listaAtividade;
    }

    @Override
    public Atividade pesquisar(Atividade atividade) {

        return listaAtividade.get(listaAtividade.indexOf(atividade.getNome()));

    }
}
