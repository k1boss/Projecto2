package DAL;

import DAL.Produto;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-23T16:59:06")
@StaticMetamodel(Promocao.class)
public class Promocao_ { 

    public static volatile SingularAttribute<Promocao, BigDecimal> idPromocao;
    public static volatile SingularAttribute<Promocao, Produto> idProduto;
    public static volatile SingularAttribute<Promocao, Date> dataFim;
    public static volatile SingularAttribute<Promocao, Double> valor;
    public static volatile SingularAttribute<Promocao, Date> dataInicio;

}