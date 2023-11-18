public class ConfirmacionVIP {
    private String numeroTarjeta;
    private String claseVuelo;
    private String itinerario;
    private String numeroAsiento;
    private int cantidadMaletas;
    private int cantidadCuotas;  // Nuevo atributo

    // Constructor
    public ConfirmacionVIP() {
        // Inicialización de atributos
    }

    // Métodos
    public String ingresarNumeroTarjeta(String numero) {
        this.numeroTarjeta = numero;
        return "Número de tarjeta ingresado: " + numero;
    }

    public String imprimirItinerario() {
        return "Imprimiendo itinerario: " + itinerario;
    }

    public String seleccionarAsiento(String numero) {
        this.numeroAsiento = numero;
        return "Número de asiento seleccionado: " + numero;
    }

    public String definirCantidadMaletas(int cantidad) {
        this.cantidadMaletas = cantidad;
        return "Cantidad de maletas definida: " + cantidad;
    }

    public int definirCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
        return cantidadCuotas;
    }
}
