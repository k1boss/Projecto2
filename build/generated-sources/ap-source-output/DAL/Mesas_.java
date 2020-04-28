package DAL;

import DAL.Carrinho;
import DAL.Estabelecimento;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-23T16:59:06")
@StaticMetamodel(Mesas.class)
public class Mesas_ { 

    public static volatile ListAttribute<Mesas, Carrinho> carrinhoList;
    public static volatile SingularAttribute<Mesas, BigInteger> estado;
    public static volatile SingularAttribute<Mesas, Estabelecimento> idEstabelecimento;
    public static volatile SingularAttribute<Mesas, BigDecimal> idMesa;
    public static volatile SingularAttribute<Mesas, BigInteger> numMesa;

}