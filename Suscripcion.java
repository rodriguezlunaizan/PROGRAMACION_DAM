package EjercicioPagar;

public class Suscripcion implements Pagable {
    float precioMensual;
    int meses;

    public Suscripcion(float precioMensual, int meses) {
        this.precioMensual = precioMensual;
        this.meses = meses;
    }
    @Override
    public double calcularImporte() {
        return precioMensual * meses;
    }
    @Override
    public String generarTicket () {
       return "TOTAL SUSCRIPCION: " + calcularImporte();
    }
}
