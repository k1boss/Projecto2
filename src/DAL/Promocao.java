/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "PROMOCAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Promocao.findAll", query = "SELECT p FROM Promocao p"),
    @NamedQuery(name = "Promocao.findByIdPromocao", query = "SELECT p FROM Promocao p WHERE p.idPromocao = :idPromocao"),
    @NamedQuery(name = "Promocao.findByValor", query = "SELECT p FROM Promocao p WHERE p.valor = :valor"),
    @NamedQuery(name = "Promocao.findByDataInicio", query = "SELECT p FROM Promocao p WHERE p.dataInicio = :dataInicio"),
    @NamedQuery(name = "Promocao.findByDataFim", query = "SELECT p FROM Promocao p WHERE p.dataFim = :dataFim")})
public class Promocao implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PROMOCAO")
    private BigDecimal idPromocao;
    @Basic(optional = false)
    @Column(name = "VALOR")
    private double valor;
    @Basic(optional = false)
    @Column(name = "DATA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInicio;
    @Basic(optional = false)
    @Column(name = "DATA_FIM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFim;
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID_PRODUTO")
    @ManyToOne(optional = false)
    private Produto idProduto;

    public Promocao() {
    }

    public Promocao(BigDecimal idPromocao) {
        this.idPromocao = idPromocao;
    }

    public Promocao(BigDecimal idPromocao, double valor, Date dataInicio, Date dataFim) {
        this.idPromocao = idPromocao;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public BigDecimal getIdPromocao() {
        return idPromocao;
    }

    public void setIdPromocao(BigDecimal idPromocao) {
        this.idPromocao = idPromocao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
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
        hash += (idPromocao != null ? idPromocao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promocao)) {
            return false;
        }
        Promocao other = (Promocao) object;
        if ((this.idPromocao == null && other.idPromocao != null) || (this.idPromocao != null && !this.idPromocao.equals(other.idPromocao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Promocao[ idPromocao=" + idPromocao + " ]";
    }
    
}
