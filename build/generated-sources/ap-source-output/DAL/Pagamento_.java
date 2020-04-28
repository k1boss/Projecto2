package DAL;

import DAL.Cliente;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-23T16:59:06")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, BigDecimal> idPagamento;
    public static volatile SingularAttribute<Pagamento, Date> data;
    public static volatile SingularAttribute<Pagamento, Cliente> idCliente;
    public static volatile SingularAttribute<Pagamento, Double> valor;

}