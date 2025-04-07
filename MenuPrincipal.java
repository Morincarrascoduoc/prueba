
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEntradas = 30;
        boolean continuar = true;
        int ubicacion;
        int asientoSeleccionado = 0;
        int edad;
        String zona = "";
        int precioEntrada = 1000;
        double descuentoEstudiante = 0.9;
        double descuentoAdulto = 0.85;
        int volverInicio;

        System.out.println("--Bienvenidos al Teatro Moro--");

        for (int i = 0; continuar; i++) {
            System.out.println("Menú Principal");
            System.out.println("1. Comprar entrada");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Ubicaciones disponibles ");
                System.out.println("1. Zona A");
                System.out.println("2. Zona B");
                System.out.println("3. Zona C");
                System.out.print("Selecciona una zona: ");
                ubicacion = scanner.nextInt();

                switch (ubicacion) {
                    case 1:
                        System.out.println("Zona A: asientos disponibles");
                        zona = "zona A";
                        for (int j = 1; j <= 10; j++) {
                            System.out.print(j + " ");
                            if (j % 10 == 0) {
                                System.out.println();
                            }
                        }
                        System.out.print("Seleccione su asiento (sólo 1 por persona): ");
                        asientoSeleccionado = scanner.nextInt();
                        while (asientoSeleccionado < 1 || asientoSeleccionado > 10) {
                            System.out.println("Opción inválida, vuelva a intentarlo");
                            asientoSeleccionado = scanner.nextInt();
                        }
                        break;
                    case 2:
                        System.out.println("Zona B: asientos disponibles");
                        zona = "zona B";
                        for (int j = 11; j <= 20; j++) {
                            System.out.print(j + " ");
                            if (j % 10 == 0) {
                                System.out.println();
                            }
                        }
                        System.out.print("Seleccione su asiento (sólo 1 por persona): ");
                        asientoSeleccionado = scanner.nextInt();
                        while (asientoSeleccionado < 11 || asientoSeleccionado > 20) {
                            System.out.println("Opción inválida, vuelva a intentarlo");
                            asientoSeleccionado = scanner.nextInt();
                        }
                        break;
                    case 3:
                        System.out.println("Zona C: asientos disponibles");
                        zona = "zona C";
                        for (int j = 21; j <= 30; j++) {
                            System.out.print(j + " ");
                            if (j % 10 == 0) {
                                System.out.println();
                            }
                        }
                        System.out.print("Seleccione su asiento (sólo 1 por persona): ");
                        asientoSeleccionado = scanner.nextInt();
                        while (asientoSeleccionado < 21 || asientoSeleccionado > 30) {
                            System.out.println("Opción inválida, vuelva a intentarlo");
                            asientoSeleccionado = scanner.nextInt();1
                        }
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, intente nuevamente.");
                }

                // EDAD Y DESCUENTO
                System.out.print("¿Cúal es su edad?: ");
                edad = scanner.nextInt();

                if (edad <= 23) {
                    System.out.println("Tiene un descuento del 10% en su ticket por ser Estudiante");
                    do {
                        System.out.println("Tarifa normal ticket = $1000");
                        System.out.println("Descuento Estudiante 10%");
                        System.out.println("Precio final = $ " + precioEntrada * descuentoEstudiante);
                        break;
                    } while (edad <= 23);
                } else if (edad >= 65) {
                    System.out.println("Tiene un descuento del 15% en su ticket por ser Adulto Mayor");
                    do {
                        System.out.println("Tarifa normal ticket = $1000");
                        System.out.println("Descuento Adulto Mayor 15%");
                        System.out.println("Precio final = $ " + precioEntrada * descuentoAdulto);
                        break;
                    } while (edad >= 65);
                } else {
                    System.out.println("Público general, no posee descuento");
                    System.out.println("Precio final = $ " + precioEntrada);
                }

                //RESUMEN COMPRA
                System.out.println("--Resumen de compra--");
                System.out.println("Ubicación seleccionada: " + zona + ", asiento " + asientoSeleccionado);
                System.out.println("Tarifa normal de entrada: $" + precioEntrada);

                if (edad <= 23) {
                    System.out.println("Precio final + descuento 10%: " + precioEntrada * descuentoEstudiante);
                } else if (edad >= 65) {
                    System.out.println("Precio final + descuento 15%: " + precioEntrada * descuentoAdulto);
                } else {
                    System.out.println("Precio final s/descuento: " + precioEntrada);
                }
                System.out.println("Gracias por su compra, que disfrute la función");

                System.out.println("¿Desea volver al Menú principal?");
                System.out.println("1. Si");
                System.out.println("2. No");
                volverInicio = scanner.nextInt();

                if (volverInicio == 1) {
                    continuar = true;
                } else {
                    continuar = false;
                    System.out.println("Gracias por su visita");
                }
            } else if (opcion == 2) {
                System.out.println("Gracias por su visita");
                continuar = false;
            } else {
                System.out.println("Opción no válida, vuelva a intentarlo");

            }
        }
        scanner.close();
    }

}
