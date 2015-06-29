package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Professor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProfessorDaoImp implements ProfessorDao {

    private static List<Professor> listaProfessor = new ArrayList<Professor>();
    private final SessionFactory conexao;

    public List<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public ProfessorDaoImp() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void salvar(Professor professor) {
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(professor);
        tx.commit();
        session.close();

    }

    @Override
    public void remover(Professor professor) {
        ProfessorDaoImp.listaProfessor.remove(professor);
    }

    @Override
    public List<Professor> obterLista() {
        return ProfessorDaoImp.listaProfessor;
    }

    @Override
    public Professor pesquisar(Professor professor) {
        return ProfessorDaoImp.listaProfessor.get(ProfessorDaoImp.listaProfessor.indexOf(professor));
    }

}
