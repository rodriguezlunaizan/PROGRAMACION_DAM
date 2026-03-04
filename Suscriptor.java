package EjercicioPagar;

public class Suscriptor extends Suscripcion {
    String nombre;
    String apellido;
    String dni;
    String direccion;

    public Suscriptor(float precioMensual, int meses, String nombre, String apellido, String dni, String direccion) {
        super(precioMensual, meses);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Suscriptor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
