public class PerfilVIP {
    private float cuponDescuento;

    // Constructor
    public PerfilVIP() {
        // Inicialización de atributos
        this.cuponDescuento = 0.0f;
    }

    // Métodos
    public String aplicarCuponDescuento(String cupon) {
        // Lógica para aplicar el cupón de descuento
        this.cuponDescuento = 10.0f;  // Supongamos que aplicamos un descuento del 10%
        return "Cupón de descuento aplicado: " + cupon;
    }

    public String cambiarContraseña(String contraseña) {
        // Lógica para cambiar la contraseña
        return "Contraseña cambiada exitosamente";
    }
}
