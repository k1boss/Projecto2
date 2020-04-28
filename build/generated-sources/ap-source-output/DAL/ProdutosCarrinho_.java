package DAL;

import DAL.Carrinho;
import DAL.Produto;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-23T16:59:06")
@StaticMetamodel(ProdutosCarrinho.class)
public class ProdutosCarrinho_ { 

    public static volatile SingularAttribute<ProdutosCarrinho, Carrinho> idCarrinho;
    public static volatile SingularAttribute<ProdutosCarrinho, Produto> idProduto;
    public static volatile SingularAttribute<ProdutosCarrinho, BigDecimal> idProdCarr;
    public static volatile SingularAttribute<ProdutosCarrinho, BigInteger> quantidade;

}