package EjercicioPagar;

public class VIP extends Suscriptor {
    int idVip;
    int tiempoVip;

    public VIP(float precioMensual, int meses, String nombre, String apellido, String dni, String direccion, int idVip , int tiempoVip) {
        super(precioMensual, meses, nombre, apellido, dni, direccion);
        this.idVip = idVip;
        this.tiempoVip = tiempoVip;
    }

}
