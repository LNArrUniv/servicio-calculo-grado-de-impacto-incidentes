package ar.edu.dds.api.entidades;

import ar.edu.dds.api.entidades.ValoresPorEntidad;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ListadoValores {

  @JsonProperty("valoresPorEntidad")
  List<ValoresPorEntidad> valoresPorEntidad;

  public ListadoValores() {
  }

  public List<ValoresPorEntidad> getValoresPorEntidad() {
    return valoresPorEntidad;
  }

  public void setValoresPorEntidad(List<ValoresPorEntidad> valoresPorEntidad) {
    this.valoresPorEntidad = valoresPorEntidad;
  }
}
