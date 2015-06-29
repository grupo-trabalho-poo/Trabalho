package Model.Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Pojo.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AlunoDaoImp implements AlunoDao {

    private static List<Aluno> listaAluno = new ArrayList<Aluno>();

    private final SessionFactory conexao;

    public AlunoDaoImp() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    public static List<Aluno> getListaAluno() {
        return AlunoDaoImp.listaAluno;
    }

    @Override
    public void salvar(Aluno aluno) {

        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(aluno);
        tx.commit();
        session.close();

    }

    @Override
    public void remover(Aluno aluno) {
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(aluno);
        tx.commit();
        session.close();
        
    }

    @Override
    public List<Aluno> obterLista() {
        return AlunoDaoImp.getListaAluno();
    }

    public Aluno pesquisar(Aluno alunoCpf) {

        return AlunoDaoImp.listaAluno.get(AlunoDaoImp.listaAluno.indexOf(alunoCpf));
    }
}
