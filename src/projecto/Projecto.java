/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto;


import DAL.Cliente;
import DAL.Pagamento;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Carlos
 */
public class Projecto {

    /**
     * @param args the command line arguments
     */
    
    private static final String PERSISTENCE_UNIT_NAME = "ProjectoPU";
    private static EntityManagerFactory factory;
    
    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            EntityManager em = factory.createEntityManager();
            
            Cliente cli1 = new Cliente();
            cli1.setNome("Asdrubal"); cli1.setNif(BigInteger.valueOf(123456789));
            cli1.setEmail("asdru@gmail.com");
            
            em.getTransaction().begin();
            em.persist(cli1);
            em.getTransaction().commit();
            
            Query q = em.createNamedQuery("Cliente.findAll");
            for(Object cli : q.getResultList())
            {
                System.out.println( ((Cliente)cli).getIdCliente() + " - " + ((Cliente)cli).getNome());
            }
            
            Query q2 = em.createNamedQuery("Cliente.findByIdCliente");
            q2.setParameter("idCliente", 1);
            Cliente cli151 = null;
            Object res = q2.getSingleResult();
            if(res != null) cli151 = (Cliente) res;
            
            System.out.println("---->>Pagamentos do cliente " + cli151.getNome());
            
            for(Pagamento pag : cli151.getPagamentoList())
            {
                System.out.println(pag.getIdPagamento() + " " + pag.getIdCliente() + " " + pag.getValor() + "€" + " " + pag.getData());
            }
    }
    
}
