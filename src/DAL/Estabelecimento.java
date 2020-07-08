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
@Table(name = "ESTABELECIMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estabelecimento.findAll", query = "SELECT e FROM Estabelecimento e"),
    @NamedQuery(name = "Estabelecimento.findByIdEstabelecimento", query = "SELECT e FROM Estabelecimento e WHERE e.idEstabelecimento = :idEstabelecimento"),
    @NamedQuery(name = "Estabelecimento.findByNome", query = "SELECT e FROM Estabelecimento e WHERE e.nome = :nome"),
    @NamedQuery(name = "Estabelecimento.findByRua", query = "SELECT e FROM Estabelecimento e WHERE e.rua = :rua"),
    @NamedQuery(name = "Estabelecimento.findByNumPorta", query = "SELECT e FROM Estabelecimento e WHERE e.numPorta = :numPorta"),
    @NamedQuery(name = "Estabelecimento.findByCodPostal", query = "SELECT e FROM Estabelecimento e WHERE e.codPostal = :codPostal"),
    @NamedQuery(name = "Estabelecimento.findByDescCodPostal", query = "SELECT e FROM Estabelecimento e WHERE e.descCodPostal = :descCodPostal"),
    @NamedQuery(name = "Estabelecimento.findAllNomes", query = "SELECT e.nome FROM Estabelecimento e")})
public class Estabelecimento implements Serializable {

    private static final long serialVersionUID = 1L;


    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ESTABELECIMENTO")
    private BigDecimal idEstabelecimento;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "RUA")
    private String rua;
    @Basic(optional = false)
    @Column(name = "NUM_PORTA")
    private String numPorta;
    @Basic(optional = false)
    @Column(name = "COD_POSTAL")
    private String codPostal;
    @Basic(optional = false)
    @Column(name = "DESC_COD_POSTAL")
    private String descCodPostal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstabelecimento")
    private List<Mesas> mesasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstabelecimento")
    private List<Produto> produtoList;

    public Estabelecimento() {
    }

    public Estabelecimento(BigDecimal idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public Estabelecimento(BigDecimal idEstabelecimento, String nome, String rua, String numPorta, String codPostal, String descCodPostal) {
        this.idEstabelecimento = idEstabelecimento;
        this.nome = nome;
        this.rua = rua;
        this.numPorta = numPorta;
        this.codPostal = codPostal;
        this.descCodPostal = descCodPostal;
    }

    public BigDecimal getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(BigDecimal idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumPorta() {
        return numPorta;
    }

    public void setNumPorta(String numPorta) {
        this.numPorta = numPorta;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getDescCodPostal() {
        return descCodPostal;
    }

    public void setDescCodPostal(String descCodPostal) {
        this.descCodPostal = descCodPostal;
    }

    @XmlTransient
    public List<Mesas> getMesasList() {
        return mesasList;
    }

    public void setMesasList(List<Mesas> mesasList) {
        this.mesasList = mesasList;
    }

    @XmlTransient
    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstabelecimento != null ? idEstabelecimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estabelecimento)) {
            return false;
        }
        Estabelecimento other = (Estabelecimento) object;
        if ((this.idEstabelecimento == null && other.idEstabelecimento != null) || (this.idEstabelecimento != null && !this.idEstabelecimento.equals(other.idEstabelecimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Estabelecimento[ idEstabelecimento=" + idEstabelecimento + " ]";
    }
    
}
