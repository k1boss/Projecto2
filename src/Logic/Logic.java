
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import DAL.Cliente;
import DAL.Estabelecimento;
import DAL.Mesas;
import DAL.Produto;
import java.math.BigDecimal;
import java.math.BigInteger;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import static org.eclipse.persistence.jpa.jpql.utility.CollectionTools.list;


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
    private static Mesas selectedMesa;
    public static Cliente verificar;
    private static int  tipoUser = 0;

   
    
    
    
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
                 
                tipoUser = cli.getIdTipoutilizador().getId();
                System.out.println(tipoUser);
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
    
    public static int TipoFuncao()
    {
        return tipoUser;
    }
    
    public static void logout() throws Exception
    {
        loggedCliente = null;
        selectedEstab = null;
        updateMesaToLivre(selectedMesa.getIdMesa().intValue());
        selectedMesa = null;
    }
    
    public static boolean userExists(String username)
    {
        boolean exists;
        
        
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
    
        public static  ObservableList numMesas()
    {
        ObservableList<Mesas> results = null;
        
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        Query numMesas = em.createNamedQuery("Mesas.findAll"); 

        
        List<Mesas> list = numMesas.getResultList();
     
       
        results = FXCollections.observableArrayList(list);
        

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
    
    public static Mesas getSelectedMesa()
    {
        return selectedMesa;
    }
    
    /*
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
    */
    
    public static ObservableList getMesasDisponiveis()
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        ObservableList<Mesas> results = null;
        Estabelecimento selected = getSelectedEstab();
        
        Query getMesasLivres = em.createNamedQuery("Mesas.findAllLivres");
        getMesasLivres.setParameter("idEstabelecimento", selected);
        getMesasLivres.setParameter("estado",0);
        
        List<Mesas> mesas = getMesasLivres.getResultList();
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
    
       public static Estabelecimento getEstabelecimentoByID(BigDecimal idEstabelecimento)
    {
        Estabelecimento estab = new Estabelecimento();
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        
        Query getEstabelecimentoByID = em.createNamedQuery("Estabelecimento.findByIdEstabelecimento");
        getEstabelecimentoByID.setParameter("idEstabelecimento", idEstabelecimento);
        
        estab = (Estabelecimento) getEstabelecimentoByID.getSingleResult();
        
        return estab;
        
    }
    
    public static Mesas getMesaByID(int idMesa)
    {
        Mesas mesa = new Mesas();
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        Query getMesaByID = em.createNamedQuery("Mesas.findByIdMesa");
        getMesaByID.setParameter("idMesa", idMesa);
        
        mesa = (Mesas) getMesaByID.getSingleResult();
        return mesa;
    }
    
    public static void updateUsernameCliente(String username)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Query updateUsernameCliente =  em.createQuery("UPDATE Cliente SET username = :username " + "WHERE idCliente = :idCliente");
        updateUsernameCliente.setParameter("username", username).setParameter("idCliente",loggedCliente.getIdCliente()).executeUpdate();
        
        em.getTransaction().commit();
    }
    
    
    public static void updatePasswordCliente(String password)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Query updatePasswordCliente =  em.createQuery("UPDATE Cliente SET passwd = :passwd " + "WHERE idCliente = :idCliente");
        updatePasswordCliente.setParameter("passwd", password).setParameter("idCliente",loggedCliente.getIdCliente()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public static void updateNomeCliente(String newNome)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Query updateNomeCliente =  em.createQuery("UPDATE Cliente SET nome = :nome " + "WHERE idCliente = :idCliente");
        updateNomeCliente.setParameter("nome", newNome).setParameter("idCliente",loggedCliente.getIdCliente()).executeUpdate();
        em.getTransaction().commit();
    }
    
    public static void updateEmailCliente(String email)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Query updateEmailCliente =  em.createQuery("UPDATE Cliente SET email = :email " + "WHERE idCliente = :idCliente");
        updateEmailCliente.setParameter("email", email).setParameter("idCliente",loggedCliente.getIdCliente()).executeUpdate();
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
    
    public static void setLoggedClientePassword(String newPassword)
    {
        loggedCliente.setPasswd(newPassword);
    }
    
    public static void setLoggedClienteEmail(String newEmail)
    {
        loggedCliente.setEmail(newEmail);
    }
    
    public static void updateMesaToOcupado(int selectedMesaID)
    {
        //TODO
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        Query updateEstadoMesa =  em.createQuery("UPDATE Mesas SET estado = :estado " + "WHERE idMesa = :idMesa");
        updateEstadoMesa.setParameter("estado", 1).setParameter("idMesa",selectedMesaID).executeUpdate();
        em.getTransaction().commit();
        
    }
    
    public static void updateMesaToLivre(int selectedMesaID)
    {
        //TODO
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        Query updateEstadoMesa =  em.createQuery("UPDATE Mesas SET estado = :estado " + "WHERE idMesa = :idMesa");
        updateEstadoMesa.setParameter("estado", 0).setParameter("idMesa",selectedMesaID).executeUpdate();
        em.getTransaction().commit();
        
    }
    
    public static void escolherMesa(int idMesa)
    {
        selectedMesa = getMesaByID(idMesa);
        updateMesaToOcupado(idMesa);
        System.out.println(selectedMesa.getEstado());
    }
    
    public static String getUsername (){
        return loggedCliente.getUsername();
    }
    
    public static Estabelecimento getSelectEstabelecimento(){
        return selectedEstab;
    }
    
  public static int getReferenciaMB()
    {
        int referenciaMB = (int)(Math.random() * (999999999 - 111111111 + 1) + 111111111);        
        return referenciaMB;
    }
  
  public static boolean estabExists(String numPorta){
      boolean exists;
        
        
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        
        Query getEstab = em.createNamedQuery("Estabelecimento.findByNumPorta");
        getEstab.setParameter("numPorta", numPorta);
        
        try
        {
            Object res;
            res = (Object) getEstab.getSingleResult();
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
  
   public static void insertEstabelecimento(Estabelecimento estabelecimento)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(estabelecimento);
        em.getTransaction().commit();

    }

   public static void apagaEstabelecimento(String nomeEstabelecimento){
       
         factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        Query getEstabelecimento = em.createNamedQuery("Estabelecimento.findByNome");
        getEstabelecimento.setParameter("nome", nomeEstabelecimento);
        
        selectedEstab =(Estabelecimento) getEstabelecimento.getSingleResult();
         em.getTransaction().begin();

        em.remove(selectedEstab);
        em.getTransaction().commit();

   }

   
 
   public static void editaEstabelecimento(String nome, String rua, String numPorta,String codPostal, String descCodPostal ){
  
         factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

       
        em.getTransaction().begin();
        Query editaEstabelecimento =  em.createQuery("UPDATE Estabelecimento SET nome = :nome, rua = :rua, numPorta = :numPorta, codPostal = :codPostal, descCodPostal = :descCodPostal " + "WHERE idEstabelecimento = :idEstabelecimento");
        editaEstabelecimento.setParameter("nome", nome).setParameter("rua", rua).setParameter("numPorta", numPorta).setParameter("codPostal", codPostal).setParameter("descCodPostal", descCodPostal).setParameter("idEstabelecimento",selectedEstab.getIdEstabelecimento()).executeUpdate();
        em.getTransaction().commit();
        
        
   }
 

        public static void setSelectedEstabAll(String newNome,String newRua,String newNumPorta, String newCodPostal,String newDescCodPostal)
    {
        selectedEstab.setNome(newNome); 
        selectedEstab.setRua(newRua); 
        selectedEstab.setNumPorta(newNumPorta); 
        selectedEstab.setCodPostal(newCodPostal); 
        selectedEstab.setDescCodPostal(newDescCodPostal); 
    }
   
         public static boolean mesaExists(BigInteger numMesa){
      boolean exists;
        
        
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        
        Query mesaExists = em.createNamedQuery("Estabelecimento.findByNumMesa");
        mesaExists.setParameter("numMesa", numMesa);
        
        try
        {
            Object res;
            res = (Object) mesaExists.getSingleResult();
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
         
         public static void insertMesa(Mesas mesa)
    {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(mesa);
        em.getTransaction().commit();

    }
         
    public static void apagaMesas(BigInteger numMesa){
       
         factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        Query apagaMesas = em.createNamedQuery("Mesas.findByNumMesa");
        apagaMesas.setParameter("numMesa", numMesa);
        
        selectedMesa =(Mesas) apagaMesas.getSingleResult();
         em.getTransaction().begin();

        em.remove(selectedMesa);
        em.getTransaction().commit();

   }
   
}
