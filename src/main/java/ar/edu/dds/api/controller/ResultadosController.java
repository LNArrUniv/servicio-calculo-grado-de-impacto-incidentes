package ar.edu.dds.api.controller;

import ar.edu.dds.api.entidades.CalculadoraGradoImpacto;
import ar.edu.dds.api.entidades.ListadoValores;
import ar.edu.dds.api.entidades.Resultado;
import ar.edu.dds.api.entidades.ValoresPorEntidad;
import ar.edu.dds.api.repositorio.RepositorioResultados;
import io.javalin.http.Context;
import io.javalin.http.HttpStatus;

public class ResultadosController {

  public ResultadosController() {
  }

  public void listResultados(Context ctx) {
    System.out.println("Enviando resultados...");

    ctx.json(RepositorioResultados.getInstance().obtenerTodosLosResultadosOrdenados());

    ctx.status(HttpStatus.OK);
  }

  public void calcularResultados(Context ctx) {
    ListadoValores listado = ctx.bodyAsClass(ListadoValores.class);
    System.out.println("Datos recibidos, calculando grado de impacto...");
    System.out.println(listado.getValoresPorEntidad().size());

    CalculadoraGradoImpacto calculadora = new CalculadoraGradoImpacto();
    for (ValoresPorEntidad valoresPorEntidad : listado.getValoresPorEntidad()) {
      double gradoImpacto = calculadora.calcularGradoImpacto(valoresPorEntidad.tiempoResolucionIncidente,
          valoresPorEntidad.cantIncidentesNoResueltos,
          valoresPorEntidad.cnf,
          valoresPorEntidad.totalPersonasImpactadas);
      System.out.println(gradoImpacto);
      RepositorioResultados.getInstance().guardarResultado(new Resultado(valoresPorEntidad.entidad_id, gradoImpacto));
    }

    ctx.status(HttpStatus.OK);
  }

  public void documentacion(Context ctx) {
    ctx.render("dist/index.hbs");
  }


}
