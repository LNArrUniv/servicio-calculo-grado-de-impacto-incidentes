package ar.edu.dds.api.server;

import ar.edu.dds.api.controller.ResultadosController;

public class Router {

  public static void init() {
    ResultadosController controller = new ResultadosController();

    Server.app().get("/api/calcularImpacto", controller::listResultados);
    Server.app().post("/api/calcularImpacto", controller::calcularResultados);
    Server.app().get("/api/swagger", controller::documentacion);
  }

}