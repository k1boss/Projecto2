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
@Table(name = "PRODUTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByIdProduto", query = "SELECT p FROM Produto p WHERE p.idProduto = :idProduto"),
    @NamedQuery(name = "Produto.findByPreco", query = "SELECT p FROM Produto p WHERE p.preco = :preco"),
    @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto.findByNome", query = "SELECT p FROM Produto p WHERE p.nome = :nome"),
    @NamedQuery(name = "Produto.findByIdEstabelecimento", query = "SELECT p FROM Produto p WHERE p.idEstabelecimento = :idEstabelecimento")})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PRODUTO")
    private BigDecimal idProduto;
    @Basic(optional = false)
    @Column(name = "PRECO")
    private double preco;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @JoinColumn(name = "ID_ESTABELECIMENTO", referencedColumnName = "ID_ESTABELECIMENTO")
    @ManyToOne(optional = false)
    private Estabelecimento idEstabelecimento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<ProdutosCarrinho> produtosCarrinhoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private List<Promocao> promocaoList;

    public Produto() {
    }

    public Produto(BigDecimal idProduto) {
        this.idProduto = idProduto;
    }

    public Produto(BigDecimal idProduto, double preco, String descricao, String nome) {
        this.idProduto = idProduto;
        this.preco = preco;
        this.descricao = descricao;
        this.nome = nome;
    }

    public BigDecimal getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(BigDecimal idProduto) {
        this.idProduto = idProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estabelecimento getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Estabelecimento idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    @XmlTransient
    public List<ProdutosCarrinho> getProdutosCarrinhoList() {
        return produtosCarrinhoList;
    }

    public void setProdutosCarrinhoList(List<ProdutosCarrinho> produtosCarrinhoList) {
        this.produtosCarrinhoList = produtosCarrinhoList;
    }

    @XmlTransient
    public List<Promocao> getPromocaoList() {
        return promocaoList;
    }

    public void setPromocaoList(List<Promocao> promocaoList) {
        this.promocaoList = promocaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduto != null ? idProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idProduto == null && other.idProduto != null) || (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Produto[ idProduto=" + idProduto + " ]";
    }
    
}
