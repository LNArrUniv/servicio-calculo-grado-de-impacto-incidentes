package ar.edu.dds.api.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValoresPorEntidad {
  @JsonProperty("entidad_id")
  public long entidad_id;
  @JsonProperty("tiempoResolucionIncidente")
  public double tiempoResolucionIncidente;
  @JsonProperty("cantIncidentesNoResueltos")
  public int cantIncidentesNoResueltos;
  @JsonProperty("cnf")
  public double cnf;
  @JsonProperty("totalPersonasImpactadas")
  public int totalPersonasImpactadas;

  public ValoresPorEntidad() {
  }
}
