package EjercicioPagar;

public class Facturas implements  Pagable {
    float base;
    float IVA;

    public Facturas(float base, float IVA) {

        this.base = base;
        this.IVA = IVA;
    }
    @Override
    public String generarTicket () {
        return "Total Factura : " + calcularImporte();
    }

    @Override
    public double calcularImporte() {
        return this.base * this.IVA;
    }
}
