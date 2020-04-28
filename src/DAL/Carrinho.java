/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "CARRINHO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carrinho.findAll", query = "SELECT c FROM Carrinho c"),
    @NamedQuery(name = "Carrinho.findByIdCarrinho", query = "SELECT c FROM Carrinho c WHERE c.idCarrinho = :idCarrinho"),
    @NamedQuery(name = "Carrinho.findByValorTotal", query = "SELECT c FROM Carrinho c WHERE c.valorTotal = :valorTotal")})
public class Carrinho implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CARRINHO")
    private BigDecimal idCarrinho;
    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarrinho")
    private List<ProdutosCarrinho> produtosCarrinhoList;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "ID_MESA", referencedColumnName = "ID_MESA")
    @ManyToOne
    private Mesas idMesa;

    public Carrinho() {
    }

    public Carrinho(BigDecimal idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public BigDecimal getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(BigDecimal idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @XmlTransient
    public List<ProdutosCarrinho> getProdutosCarrinhoList() {
        return produtosCarrinhoList;
    }

    public void setProdutosCarrinhoList(List<ProdutosCarrinho> produtosCarrinhoList) {
        this.produtosCarrinhoList = produtosCarrinhoList;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Mesas getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Mesas idMesa) {
        this.idMesa = idMesa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarrinho != null ? idCarrinho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrinho)) {
            return false;
        }
        Carrinho other = (Carrinho) object;
        if ((this.idCarrinho == null && other.idCarrinho != null) || (this.idCarrinho != null && !this.idCarrinho.equals(other.idCarrinho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Carrinho[ idCarrinho=" + idCarrinho + " ]";
    }
    
}
