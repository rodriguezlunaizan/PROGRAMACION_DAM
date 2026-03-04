package EjercicioPagar;

public class MainPagable {
    public static void main(String[] args) {
        Pagable arrayPgabale [] = new Pagable[4];
        arrayPgabale [0]  = new Facturas(10.0f , 11);
        arrayPgabale [1] = new Suscripcion(100.0f , 11);
        arrayPgabale [2] = new Facturas(100.0f , 10.0f);
        arrayPgabale [3] = new Suscripcion(200.0f , 2);
        for (int i = 0; i < arrayPgabale.length; i++) {
            System.out.println(arrayPgabale[i].generarTicket());
        }
    }
}
