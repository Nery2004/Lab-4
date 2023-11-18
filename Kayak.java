import java.util.Scanner;

public class Kayak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un usuario VIP
        UsuarioVIP usuarioVIP = new UsuarioVIP("NombreUsuario", "Contraseña123");

        // Menú para el usuario VIP
        int opcion;
        do {
            System.out.println("\n--- Menú VIP ---");
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

                    // Llamadas a los métodos de la clase ReservaVIP
                    reservaVIP.definirFechaViaje(fechaViaje);
                    reservaVIP.roundTrip(tipoVuelo);
                    reservaVIP.definirCantidadBoletos(cantidadBoletos);
                    reservaVIP.elegirAerolinea(aerolinea);

                    // Aquí podrías mostrar la información de la reserva si lo deseas
                    break;

                case 2:
                    // Confirmar reserva
                    ConfirmacionVIP confirmacionVIP = new ConfirmacionVIP();
                    System.out.print("Ingrese el número de tarjeta: ");
                    String numeroTarjeta = scanner.next();
                    System.out.print("Seleccione la cantidad de cuotas (1-24): ");
                    int cantidadCuotas = scanner.nextInt();

                    // Llamadas a los métodos de la clase ConfirmacionVIP
                    confirmacionVIP.ingresarNumeroTarjeta(numeroTarjeta);
                    confirmacionVIP.cantidadCuotas(cantidadCuotas);

                    // Aquí podrías mostrar la información de la confirmación si lo deseas
                    break;

                case 3:
                    // Modificar perfil
                    PerfilVIP perfilVIP = new PerfilVIP();
                    System.out.println("Seleccione la opción:");
                    System.out.println("1. Aplicar cupón de descuento");
                    System.out.println("2. Cambiar contraseña");
                    int opcionModificar = scanner.nextInt();

                    switch (opcionModificar) {
                        case 1:
                            System.out.print("Ingrese el cupón de descuento: ");
                            String cuponDescuento = scanner.next();
                            perfilVIP.aplicarCuponDescuento(cuponDescuento);
                            break;

                        case 2:
                            System.out.print("Ingrese la nueva contraseña: ");
                            String nuevaContraseña = scanner.next();
                            perfilVIP.cambiarContraseña(nuevaContraseña);
                            break;

                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
}
