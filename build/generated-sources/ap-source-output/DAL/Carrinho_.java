package DAL;

import DAL.Cliente;
import DAL.Mesas;
import DAL.ProdutosCarrinho;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-23T16:59:06")
@StaticMetamodel(Carrinho.class)
public class Carrinho_ { 

    public static volatile SingularAttribute<Carrinho, BigDecimal> idCarrinho;
    public static volatile SingularAttribute<Carrinho, Mesas> idMesa;
    public static volatile SingularAttribute<Carrinho, Cliente> idCliente;
    public static volatile SingularAttribute<Carrinho, Double> valorTotal;
    public static volatile ListAttribute<Carrinho, ProdutosCarrinho> produtosCarrinhoList;

}