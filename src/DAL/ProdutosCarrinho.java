/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "PRODUTOS_CARRINHO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProdutosCarrinho.findAll", query = "SELECT p FROM ProdutosCarrinho p"),
    @NamedQuery(name = "ProdutosCarrinho.findByIdProdCarr", query = "SELECT p FROM ProdutosCarrinho p WHERE p.idProdCarr = :idProdCarr"),
    @NamedQuery(name = "ProdutosCarrinho.findByQuantidade", query = "SELECT p FROM ProdutosCarrinho p WHERE p.quantidade = :quantidade")})
public class ProdutosCarrinho implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PROD_CARR")
    private BigDecimal idProdCarr;
    @Basic(optional = false)
    @Column(name = "QUANTIDADE")
    private BigInteger quantidade;
    @JoinColumn(name = "ID_CARRINHO", referencedColumnName = "ID_CARRINHO")
    @ManyToOne(optional = false)
    private Carrinho idCarrinho;
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID_PRODUTO")
    @ManyToOne(optional = false)
    private Produto idProduto;

    public ProdutosCarrinho() {
    }

    public ProdutosCarrinho(BigDecimal idProdCarr) {
        this.idProdCarr = idProdCarr;
    }

    public ProdutosCarrinho(BigDecimal idProdCarr, BigInteger quantidade) {
        this.idProdCarr = idProdCarr;
        this.quantidade = quantidade;
    }

    public BigDecimal getIdProdCarr() {
        return idProdCarr;
    }

    public void setIdProdCarr(BigDecimal idProdCarr) {
        this.idProdCarr = idProdCarr;
    }

    public BigInteger getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigInteger quantidade) {
        this.quantidade = quantidade;
    }

    public Carrinho getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(Carrinho idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProdCarr != null ? idProdCarr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutosCarrinho)) {
            return false;
        }
        ProdutosCarrinho other = (ProdutosCarrinho) object;
        if ((this.idProdCarr == null && other.idProdCarr != null) || (this.idProdCarr != null && !this.idProdCarr.equals(other.idProdCarr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.ProdutosCarrinho[ idProdCarr=" + idProdCarr + " ]";
    }
    
}
