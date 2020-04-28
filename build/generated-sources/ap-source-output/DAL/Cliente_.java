package DAL;

import DAL.Carrinho;
import DAL.Pagamento;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-23T16:59:06")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile ListAttribute<Cliente, Pagamento> pagamentoList;
    public static volatile ListAttribute<Cliente, Carrinho> carrinhoList;
    public static volatile SingularAttribute<Cliente, BigDecimal> idCliente;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, BigInteger> nif;
    public static volatile SingularAttribute<Cliente, String> email;

}