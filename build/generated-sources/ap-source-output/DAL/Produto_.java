package DAL;

import DAL.Estabelecimento;
import DAL.ProdutosCarrinho;
import DAL.Promocao;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-23T16:59:06")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Double> preco;
    public static volatile SingularAttribute<Produto, Estabelecimento> idEstabelecimento;
    public static volatile SingularAttribute<Produto, BigDecimal> idProduto;
    public static volatile ListAttribute<Produto, ProdutosCarrinho> produtosCarrinhoList;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile ListAttribute<Produto, Promocao> promocaoList;
    public static volatile SingularAttribute<Produto, String> descricao;

}