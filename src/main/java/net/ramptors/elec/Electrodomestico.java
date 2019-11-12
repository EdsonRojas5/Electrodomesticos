package net.ramptors.elec;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/** Clase conectada a la tabla Pasatiempo.
 * Esta clase se crea con los siguientes pasos:
 * <ol>
 * <li>Selecciona el paquete donde quieras colocar la clase .</li>
 * <li>Menú File > New File... </li>
 * <li>
 * Categories: Persistence, File Types: Entity Class, Next>.
 * </li>
 * <li>
 * Class Name: Pasatiempo, Package: net.ramptors.pasa Primary Key Type: Integer.
 * </li>
 * <li>Clic en Finish.</li>
 * </ol>
 * <p>
 * <code>Serializable</code> indica que el objeto se puede almacenar y
 * recuperar.
 * </p> */
@Entity
@Table(name = "ELECTRODOMESTICOS") // Tabla a la que está ligada esta Entity.
public class Electrodomestico implements Serializable {
  /** Constante que se utiliza cuando la clase es serializable. */
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ELE_ID")
  private Integer id;
  // Las siguientes anotaciones se explican en el la página sobre Bean Validation.
  @NotNull
  @Size(min = 1, max = 255)
  @Column(name = "ELE_NOMBRE")
  private String nombre;
   @NotNull
  @Size(min = 1, max = 255)
  @Column(name = "ELE_MARCA")
  private String marca;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) { 
    this.marca = marca;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
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
    if (!(object instanceof Electrodomestico)) {
      return false;
    }
    Electrodomestico other = (Electrodomestico) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.
        equals(other.id))) {
      return false;
    }
    return true;
  }
  @Override
  public String toString() {
    return "net.ramptors.elec.Electrodomestico[ id=" + id + " ]";
  }
}
