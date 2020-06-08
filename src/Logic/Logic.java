
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import DAL.Cliente;
import java.math.BigInteger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;





/**
 *
 * @author Carlos
 */


public class Logic {
    
    private static final String PERSISTENCE_UNIT_NAME = "ProjectoPU";
    private static EntityManagerFactory factory;
    
    
    
    public static boolean login(String username, String password ) throws Exception
    {
        boolean loggedIn = false;
        Cliente cli = null;
        
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        
        Query getUser = em.createNamedQuery("Cliente.findByUsername");
        getUser.setParameter("username", username);
        
        Object res;
        res = (Object) getUser.getSingleResult();
       
        if(res != null)
        {
            cli = (Cliente) res;
            if(cli.getPasswd().equals(password))
            {
                loggedIn = true;
             System.out.println("login ok!!");
            }
            else
            {
                throw new Exception("Password Errada");
            }
           
        }
        else
        {
            throw new Exception("Nao existe nenhum utilizador ");
        }
        
        
        
        return loggedIn;
            
           
    }
    
    /*public static void insertCliente(Cliente cliente)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        em.("INSERT INTO Cliente(nome, email, username, nif, passwd) VALUES(?,?,?,?,?)")
                .setParameter(1, cliente.getNome())
                .setParameter(2, cliente.getEmail())
                .setParameter(3, cliente.getUsername())
                .setParameter(4, cliente.getNif())
                .setParameter(5, cliente.getPasswd())
                .executeUpdate();
    }*/

    public static void insertCliente(Cliente cliente)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();

    }
    
    
    
}
