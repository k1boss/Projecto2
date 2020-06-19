
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import DAL.Cliente;
import DAL.Estabelecimento;
import DAL.Produto;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    private static HashMap<BigDecimal,Integer> selectedProd;
    
    
    
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
    
    public static void logout() throws Exception
    {
        loggedCliente = null;
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
    
    public static void escolherProdutos(HashMap<BigDecimal, Integer> quantidades)
    {
        selectedProd = quantidades;
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
    
    //retornar lista de produtos seleccionados
    public static HashMap<BigDecimal,Integer> getSelectedProd()
    {
        return selectedProd;
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
    
    public static ObservableList getProdutos()
    {
        ObservableList<Produto> produtos = null;
        Estabelecimento selected = getSelectedEstab();
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        Query getProdutos = em.createNamedQuery("Produto.findByIdEstabelecimento");
        getProdutos.setParameter("idEstabelecimento", selected);
        
        produtos = FXCollections.observableArrayList(getProdutos.getResultList());
        
        return produtos;
    }
    
    public static Cliente getClienteByID(BigDecimal idCliente)
    {
        Cliente cli = new Cliente();
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        Query getClienteByID = em.createNamedQuery("Cliente.findByIdCliente");
        getClienteByID.setParameter("idCliente", idCliente);
        
        cli = (Cliente) getClienteByID.getSingleResult();
        
        return cli;
        
    }
    
    public static void updateUsernameCliente(String username)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Query updateCliente =  em.createQuery("UPDATE Cliente SET username = :username " + "WHERE idCliente = :idCliente");
        updateCliente.setParameter("username", username).setParameter("idCliente",loggedCliente.getIdCliente()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public static void updateNomeCliente(String newNome)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Query updateCliente =  em.createQuery("UPDATE Cliente SET nome = :nome " + "WHERE idCliente = :idCliente");
        updateCliente.setParameter("nome", newNome).setParameter("idCliente",loggedCliente.getIdCliente()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public static void setLoggedClienteNome(String newNome)
    {
        loggedCliente.setNome(newNome);
        
    }
    
    public static void setLoggedClienteUsername(String newUsername)
    {
        loggedCliente.setUsername(newUsername);
    }
}
