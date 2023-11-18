import java.util.Scanner;

public class Kayak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un usuario VIP
        UsuarioVIP usuarioVIP = new UsuarioVIP("NombreUsuario", "Contraseña123");

        // Menú para el usuario VIP
        int opcion;
        do {
            System.out.println("\n--- Menu VIP ---");
            System.out.println("1. Realizar reserva");
            System.out.println("2. Confirmar reserva");
            System.out.println("3. Modificar perfil");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Realizar reserva
                    ReservaVIP reservaVIP = new ReservaVIP();
                    System.out.print("Ingrese la fecha de viaje: ");
                    String fechaViaje = scanner.next();
                    System.out.print("Seleccione tipo de vuelo (ida/vuelta): ");
                    String tipoVuelo = scanner.next();
                    System.out.print("Ingrese la cantidad de boletos: ");
                    String cantidadBoletos = scanner.next();
                    System.out.print("Seleccione aerolínea: ");
                    String aerolinea = scanner.next();

                    // Mostrar información para confirmación
                    mostrarDatosParaConfirmacion("Reserva", fechaViaje, tipoVuelo, cantidadBoletos, aerolinea);

                    // Confirmar datos
                    if (!confirmarDatos()) {
                        break; // Salir del switch y volver al menú principal
                    }

                    // Llamadas a los métodos de la clase ReservaVIP
                    reservaVIP.definirFechaViaje(fechaViaje);
                    reservaVIP.roundTrip(tipoVuelo);
                    reservaVIP.definirCantidadBoletos(cantidadBoletos);
                    reservaVIP.elegirAerolinea(aerolinea);

                    break;

                case 2:
                    // Confirmar reserva
                    ConfirmacionVIP confirmacionVIP = new ConfirmacionVIP();
                    System.out.print("Ingrese el numero de tarjeta: ");
                    String numeroTarjeta = scanner.next();
                    System.out.print("Seleccione la cantidad de cuotas (1-24): ");
                    int cantidadCuotas = scanner.nextInt();

                    // Mostrar información para confirmación
                    mostrarDatosParaConfirmacion("Confirmacion", numeroTarjeta, String.valueOf(cantidadCuotas));

                    // Confirmar datos
                    if (!confirmarDatos()) {
                        break; // Salir del switch y volver al menú principal
                    }

                    // Llamadas a los métodos de la clase ConfirmacionVIP
                    confirmacionVIP.ingresarNumeroTarjeta(numeroTarjeta);
                    confirmacionVIP.definirCantidadCuotas(cantidadCuotas);

                    break;

                case 3:
                    // Modificar perfil
                    PerfilVIP perfilVIP = new PerfilVIP();
                    System.out.println("Seleccione la opcion:");
                    System.out.println("1. Aplicar cupon de descuento");
                    System.out.println("2. Cambiar contraseña");
                    int opcionModificar = scanner.nextInt();

                    switch (opcionModificar) {
                        case 1:
                            System.out.print("Ingrese el cupon de descuento: ");
                            String cuponDescuento = scanner.next();

                            // Mostrar información para confirmación
                            mostrarDatosParaConfirmacion("CuponDescuento", cuponDescuento);

                            // Confirmar datos
                            if (!confirmarDatos()) {
                                break; // Salir del switch y volver al menú principal
                            }

                            perfilVIP.aplicarCuponDescuento(cuponDescuento);
                            break;

                        case 2:
                            System.out.print("Ingrese la nueva contraseña: ");
                            String nuevaContraseña = scanner.next();

                            // Mostrar información para confirmación
                            mostrarDatosParaConfirmacion("CambioContraseña", nuevaContraseña);

                            // Confirmar datos
                            if (!confirmarDatos()) {
                                break; // Salir del switch y volver al menú principal
                            }

                            perfilVIP.cambiarContraseña(nuevaContraseña);
                            break;

                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }

    private static void mostrarDatosParaConfirmacion(String tipo, String... datos) {
        System.out.println("\n--- Confirmación de Datos ---");
        System.out.println("Tipo: " + tipo);
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Dato " + (i + 1) + ": " + datos[i]);
        }
    }

    private static boolean confirmarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Los datos son correctos? (Si/No): ");
        String respuesta = scanner.next().toLowerCase();
        return respuesta.equals("si");
    }
}
