package ar.edu.dds.api.entidades;


public class CalculadoraGradoImpacto {

  public CalculadoraGradoImpacto() {
  }

  public double calcularGradoImpacto(double tiempoResolucionIncidente, int cantIncidentesNoResueltos, double cnf, int totalPersonasImpactadas) {
    double resultado = (tiempoResolucionIncidente + cantIncidentesNoResueltos * cnf) * totalPersonasImpactadas;
    return resultado;
  }
}
