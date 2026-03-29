import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n              Bienvenido al Sistema de Control de Inventario");
        int eleccion = 1;
        while (eleccion != 0) {
            imprimirMenu();
            System.out.print("\nDigita tu eleccion aqui: ");
            eleccion = scanner.nextInt();
        }
    }

    public static void imprimirMenu() {
        System.out.println("------- Escoge una de las opciones a continuacion -------");
        System.out.println("|         1. Registrar nuevo producto.                    |");
        System.out.println("|         2. Mostrar el inventario.                       |");
        System.out.println("|         3. Buscar un producto por ID.                   |");
        System.out.println("|         0. Salir del programa.                          |");
        System.out.println("-----------------------------------------------------------");
    }
}
