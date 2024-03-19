import ar.edu.dds.api.entidades.CalculadoraGradoImpacto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  public void testCalculoDeEjemplo() {
    /*
    Calculo de ejemplo:

    Sumatoria de tiempo de resolución de incidentes: 3 (horas)
    Cantidad de incidentes no resueltos: 2
    cnf = 0.5
    Miembros afectados: 20

    Grado de Impacto = (3 + 2 * 0.5) * 20 = 80
    */
    double sumatoriaTiempoDeResolucion = 3.0;
    int cantidadIncidentesNoResueltos = 2;
    double cnf = 0.5;
    int miembrosAfectados = 20;

    CalculadoraGradoImpacto calculadora = new CalculadoraGradoImpacto();
    Double gradoDeImpacto = calculadora.calcularGradoImpacto(sumatoriaTiempoDeResolucion, cantidadIncidentesNoResueltos, cnf, miembrosAfectados);

    Assertions.assertEquals(80, gradoDeImpacto);
  }


}
