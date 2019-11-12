package net.ramptors.elec;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import net.ramptors.web.Mensajes;

@Named
@RequestScoped
public class CtrlElectrodomesticos {
  @Inject
  private Mensajes mensajes;
  @Inject
  private DaoElectrodomestico dao;
  private List<Electrodomestico> instancias;
  /* @PostConstruct indica que el método se ejecuta después de crear el objeto y
   * realizar todos los inject. Funciona casi como un constructor. */
  @PostConstruct
  void init() {
    try {
      instancias = dao.consulta();
    } catch (Exception ex) {
      mensajes.procesa(ex);
    }
  }
  public List<Electrodomestico> getInstancias() {
    return instancias;
  }
}
