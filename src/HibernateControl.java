/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jadson
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author jadson
 */
public class HibernateControl {
    private final SessionFactory factory;
    
    public HibernateControl(){
        this.factory = new AnnotationConfiguration().configure().buildSessionFactory();
        
    }
    
    public Session getSession(){
        return factory.openSession();
    }
}
