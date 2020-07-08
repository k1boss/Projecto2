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
@Table(name = "TIPOUTILIZADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoutilizador.findAll", query = "SELECT t FROM Tipoutilizador t"),
    @NamedQuery(name = "Tipoutilizador.findById", query = "SELECT t FROM Tipoutilizador t WHERE t.id = :id"),
    @NamedQuery(name = "Tipoutilizador.findByTipo", query = "SELECT t FROM Tipoutilizador t WHERE t.tipo = :tipo")})
public class Tipoutilizador implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TIPO")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoutilizador")
    private List<Cliente> clienteList;

    public Tipoutilizador() {
    }

    public Tipoutilizador(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoutilizador)) {
            return false;
        }
        Tipoutilizador other = (Tipoutilizador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Tipoutilizador[ id=" + id + " ]";
    }
    
}
