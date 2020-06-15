
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import DAL.Cliente;
import DAL.Estabelecimento;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private static Cliente loggedCliente;
    private static Estabelecimento selectedEstab;
    
    
    
    public static boolean login(String username, String password )
    {
        boolean loggedIn = false;
        Cliente cli = null;
        
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        
        Query getUser = em.createNamedQuery("Cliente.findByUsername");
        getUser.setParameter("username", username);
        
        try
        {
            Object res;
            res = (Object) getUser.getSingleResult();
       
            if(res != null)
             {
                 cli = (Cliente) res;
                 if(cli.getPasswd().equals(password))
                 {
                     loggedIn = true;
                  System.out.println("login ok!!");
                  loggedCliente = cli;
                 }
                 else
                 {
                     loggedIn = false;
                     System.out.println("Password Errada");
                 }

             }
        }
        catch(Exception e)
        {
            System.out.println("Nao existe nenhum utilizador");
            loggedIn = false;
        }
        
        return loggedIn;
        
    }
    
    public static boolean userExists(String username)
    {
        boolean exists ;
        
        
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        
        Query getUser = em.createNamedQuery("Cliente.findByUsername");
        getUser.setParameter("username", username);
        
        try
        {
            Object res;
            res = (Object) getUser.getSingleResult();
            if(res != null)
            {
                exists = true;
            }
            else
            {
                exists = false;
            }
        }
        catch(Exception e)
        {
            exists = false;
        }
        
        
        
        
        
        return exists;
    }

    public static void insertCliente(Cliente cliente)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();

    }
    
    public static  ObservableList nomesEstabelecimentos()
    {
        ObservableList<String> results = null;
        
        
        
        
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        Query getEstabelecimentos = em.createNamedQuery("Estabelecimento.findAllNomes");
        List<String> nomes = getEstabelecimentos.getResultList();
        
        results = FXCollections.observableArrayList(nomes);
        
        
        return results;
    }
    
    public static void escolherEstabelecimento(String nomeEstabelecimento)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        Query getEstabelecimento = em.createNamedQuery("Estabelecimento.findByNome");
        getEstabelecimento.setParameter("nome", nomeEstabelecimento);
        
        selectedEstab =(Estabelecimento) getEstabelecimento.getSingleResult();
        
    }
    
    public static ObservableList getMesasDisponiveis()
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        ObservableList<String> results = null;
        Estabelecimento selected = getSelectedEstab();
        
        Query getNumMesas = em.createNamedQuery("Mesas.findLivreByEstabelecimento");
        getNumMesas.setParameter("idEstabelecimento", selected);
        getNumMesas.setParameter("estado",0);
        
        List<BigInteger> list = getNumMesas.getResultList();
        List<String> mesas = new ArrayList<>(list.size());
        for(BigInteger myBigInt : list)
        {
            mesas.add(myBigInt.toString());
        }
        
        
        
        results = FXCollections.observableArrayList(mesas);
        
        return results;
        
    }
    
    //retornar cliente loggado
    public static Cliente getLoggedCliente()
    {
        return loggedCliente;
    }
    
    //retornar estabelecimento seleccionado
    public static Estabelecimento getSelectedEstab()
    {
        return selectedEstab;
    }
    
    
    //------- Funçao de Teste ----------
    public static void printStuff()
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        Estabelecimento selected = getSelectedEstab();
        
        Query getNumMesas = em.createNamedQuery("Mesas.findLivreByEstabelecimento");
        getNumMesas.setParameter("idEstabelecimento", selected);
        getNumMesas.setParameter("estado",0);
        
        List<BigInteger> list = getNumMesas.getResultList();
         
        List<String> mesas = new ArrayList<>(list.size());
        for(BigInteger myInt : list)
        {
            mesas.add(myInt.toString());
        }
         
         System.out.println(mesas);   
    }
    
    //Verificar se duas strings sao iguais
    public static boolean compareStrings(String firstString, String secondString)
    {
        boolean isEqual = false;
        if(firstString.equals(secondString))
        {
            isEqual = true;
        }
        
        return isEqual;
    }
    
    
    
}
