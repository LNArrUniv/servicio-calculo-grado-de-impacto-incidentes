package ar.edu.dds.api.entidades;


public class Resultado {
  private long entidad_id;
  private double resultadoGradoImpacto;

  public Resultado(long entidad_id, double resultadoGradoImpacto) {
    this.entidad_id = entidad_id;
    this.resultadoGradoImpacto = resultadoGradoImpacto;
  }

  public long getEntidad_id() {
    return entidad_id;
  }

  public double getResultadoGradoImpacto() {
    return resultadoGradoImpacto;
  }

  public void setEntidad_id(long entidad_id) {
    this.entidad_id = entidad_id;
  }

  public void setResultadoGradoImpacto(double resultadoGradoImpacto) {
    this.resultadoGradoImpacto = resultadoGradoImpacto;
  }
}
