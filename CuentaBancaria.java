
public class CuentaBancaria {

    private String iban;
    private String nombreCompleto;
    private float saldo;
    private String[] movimientos;
    public int numMovimientos;
    private boolean estado;
    public static int totalCuentas=0;
    private static int pin;
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public CuentaBancaria(String iban, String nombreCompleto) {
        this.iban = iban;
        this.nombreCompleto = nombreCompleto;
        this.saldo = 0;
        this.movimientos = new String[10];
        this.numMovimientos = 0;
        this.estado = true;
        totalCuentas++;
        System.out.println("CUENTA CREADA");
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public float getSaldo() {
        return saldo;
    }
    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void datosCuenta() {
        System.out.println("· IBAN: " + getIban()
                + "\n· TITULAR: " + getNombreCompleto()
                + "\n· SALDO: " + getSaldo());
    }

    public void mostrarIban() {
        System.out.println("· IBAN: " + getIban());
    }

    public void mostrarTitular() {
        System.out.println("· TITULAR: " + getNombreCompleto());
    }

    public void mostrarSaldo() {
        System.out.println("· SALDO: " + getSaldo());
    }

    public void ingreso(float cantidad) {
        if (cantidad > 3000) {
            System.err.println("AVISO: Notificar a Hacienda");
        }
        setSaldo(getSaldo() + cantidad);
        registrarMovimiento("Ingreso: +" + cantidad + " euros");
    }

    public void retirada(float cantidad) {
        float saldoFinal = getSaldo() - cantidad;

        if (saldoFinal < -50) {
            System.out.println("Operación no realizada");
        } else {
            setSaldo(saldoFinal);

            if (getSaldo() < 0) {
                System.err.println("AVISO: Saldo negativo");
            }

            registrarMovimiento("Retirada: -" + cantidad + " euros");
        }
    }


    public void mostrarMovimientos() {
        System.out.println("· Movimientos en la cuenta:");
        for (int i = 0; i < numMovimientos; i++) {
            System.out.println(movimientos[i]);
        }
    }

    private void registrarMovimiento(String movimiento) {
        if (numMovimientos >= 10) {
            for (int i = 0; i < 9; i++) {
                movimientos[i] = movimientos[i + 1];
            }
            numMovimientos--;
        }
        movimientos[numMovimientos] = movimiento;
        numMovimientos++;
    }
}