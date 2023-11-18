public class UsuarioVIP {
    private String nombre;
    private String contraseña;
    private String tipoPlan;

    // Constructor
    public UsuarioVIP(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipoPlan = "VIP";
    }

    // Métodos
    public String fechaViaje(String fechaViaje) {
        return "Fecha de viaje definida: " + fechaViaje;
    }

    public String roundTrip(String roundTrip) {
        return "Tipo de vuelo seleccionado: " + roundTrip;
    }

    public String cantidadBoletos(String cantidadBoletos) {
        return "Cantidad de boletos definida: " + cantidadBoletos;
    }

    public String aerolinea(String aerolinea) {
        return "Aerolínea seleccionada: " + aerolinea;
    }

    public String numeroTarjeta(String numeroTarjeta) {
        return "Número de tarjeta ingresado: " + numeroTarjeta;
    }

    public int cantidadCuotas(int cantidadCuotas) {
        return cantidadCuotas;
    }

    public String claseVuelo(String claseVuelo) {
        return "Clase de vuelo seleccionada: " + claseVuelo;
    }

    public String numeroAsiento(String numeroAsiento) {
        return "Número de asiento seleccionado: " + numeroAsiento;
    }

    public int cantidadMaletas(int cantidadMaletas) {
        return cantidadMaletas;
    }

    public String modificarTipoCliente(String tipoCliente) {
        // Método no aplicable para usuarios VIP
        return "Este método no es aplicable para usuarios VIP.";
    }

    public int descuento10() {
        // Lógica para aplicar el descuento del 10%
        return 10;
    }

    public String cambiarContra(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
        return "Contraseña cambiada exitosamente";
    }
}
