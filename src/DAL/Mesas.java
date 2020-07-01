/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "MESAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesas.findAll", query = "SELECT m FROM Mesas m"),
    @NamedQuery(name = "Mesas.findByIdMesa", query = "SELECT m FROM Mesas m WHERE m.idMesa = :idMesa"),
    @NamedQuery(name = "Mesas.findByNumMesa", query = "SELECT m FROM Mesas m WHERE m.numMesa = :numMesa"),
    @NamedQuery(name = "Mesas.findByEstado", query = "SELECT m FROM Mesas m WHERE m.estado = :estado"),
    @NamedQuery(name = "Mesas.findLivreByEstabelecimento", query = "SELECT m.numMesa FROM Mesas m WHERE m.idEstabelecimento = :idEstabelecimento AND m.estado = :estado"),
    @NamedQuery(name = "Mesas.findAllLivres", query = "SELECT m FROM Mesas m WHERE m.idEstabelecimento = :idEstabelecimento AND m.estado = :estado")})
public class Mesas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_MESA")
    private BigDecimal idMesa;
    @Basic(optional = false)
    @Column(name = "NUM_MESA")
    private BigInteger numMesa;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private BigInteger estado;
    @JoinColumn(name = "ID_ESTABELECIMENTO", referencedColumnName = "ID_ESTABELECIMENTO")
    @ManyToOne(optional = false)
    private Estabelecimento idEstabelecimento;
    @OneToMany(mappedBy = "idMesa")
    private List<Carrinho> carrinhoList;

    public Mesas() {
    }

    public Mesas(BigDecimal idMesa) {
        this.idMesa = idMesa;
    }

    public Mesas(BigDecimal idMesa, BigInteger numMesa, BigInteger estado) {
        this.idMesa = idMesa;
        this.numMesa = numMesa;
        this.estado = estado;
    }

    public BigDecimal getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(BigDecimal idMesa) {
        this.idMesa = idMesa;
    }

    public BigInteger getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(BigInteger numMesa) {
        this.numMesa = numMesa;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
    }

    public Estabelecimento getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Estabelecimento idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    @XmlTransient
    public List<Carrinho> getCarrinhoList() {
        return carrinhoList;
    }

    public void setCarrinhoList(List<Carrinho> carrinhoList) {
        this.carrinhoList = carrinhoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMesa != null ? idMesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesas)) {
            return false;
        }
        Mesas other = (Mesas) object;
        if ((this.idMesa == null && other.idMesa != null) || (this.idMesa != null && !this.idMesa.equals(other.idMesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Mesas[ idMesa=" + idMesa + " ]";
    }
    
}
