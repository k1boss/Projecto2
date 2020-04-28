package DAL;

import DAL.Mesas;
import DAL.Produto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-23T16:59:06")
@StaticMetamodel(Estabelecimento.class)
public class Estabelecimento_ { 

    public static volatile SingularAttribute<Estabelecimento, BigDecimal> idEstabelecimento;
    public static volatile ListAttribute<Estabelecimento, Produto> produtoList;
    public static volatile SingularAttribute<Estabelecimento, String> nome;
    public static volatile SingularAttribute<Estabelecimento, String> descCodPostal;
    public static volatile SingularAttribute<Estabelecimento, String> numPorta;
    public static volatile SingularAttribute<Estabelecimento, String> codPostal;
    public static volatile ListAttribute<Estabelecimento, Mesas> mesasList;
    public static volatile SingularAttribute<Estabelecimento, String> rua;

}