public class ReservaVIP {
    private String fechaViaje;
    private String tipoVuelo;
    private int cantidadBoletos;
    private String aerolinea;

    // Constructor
    public ReservaVIP() {
        // Inicialización de atributos
    }

    // Métodos
    public String definirFechaViaje(String fecha) {
        this.fechaViaje = fecha;
        return "Fecha de viaje definida: " + fecha;
    }

    public String roundTrip(String tipo) {
        this.tipoVuelo = tipo;
        return "Tipo de vuelo seleccionado: " + tipo;
    }

    public String definirCantidadBoletos(String cantidad) {
        this.cantidadBoletos = Integer.parseInt(cantidad);
        return "Cantidad de boletos definida: " + cantidad;
    }

    public String elegirAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
        return "Aerolínea seleccionada: " + aerolinea;
    }
}
