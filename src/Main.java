import java.util.Scanner;

public class Main {
    Scanner scanner;
    ArbolInventario arbol;

    public Main() {
        scanner = new Scanner(System.in);
        arbol = new ArbolInventario();
    }

    static void main(String[] args) {
        Main menu = new Main();
        System.out.println("\n              Bienvenido al Sistema de Control de Inventario");
        int eleccion = 1;
        while (eleccion != 0) {
            menu.imprimirMenu();
            System.out.print("\nDigita tu eleccion aqui: ");
            eleccion = menu.scanner.nextInt();
            switch (eleccion) {
                case 1: menu.registrarProducto();
                    break;
                case 2: menu.mostrarInventario();
                    break;
                case 3: menu.buscarId();
                    break;
                default: eleccion = 0;
            }
        }
        System.out.println("\nHas salido del programa");
    }

    void registrarProducto() {
        System.out.print("Digita el ID del nuevo producto: ");
        int id = scanner.nextInt();
        System.out.print("Digita el Nombre del nuevo producto: ");
        String nombre = scanner.next();
        arbol.registrarProducto(id, nombre);
        System.out.println("Producto anadido con exito");
    }

    void mostrarInventario() {
        System.out.println("\n---------- Inventario Actual -----------");
        arbol.recorrerEnOrden();
    }

    void buscarId() {
        System.out.print("Digita el ID que deseas buscar:");
        int id = scanner.nextInt();
        Producto producto = arbol.buscar(id);
        if (producto != null) {
            System.out.println(producto);
            return;
        }
        System.out.println("Producto no encontrado");
    }

    void imprimirMenu() {
        System.out.println();
        System.out.println("------- Escoge una de las opciones a continuacion -------");
        System.out.println("|         1. Registrar nuevo producto.                    |");
        System.out.println("|         2. Mostrar el inventario.                       |");
        System.out.println("|         3. Buscar un producto por ID.                   |");
        System.out.println("|         0. Salir del programa.                          |");
        System.out.println("-----------------------------------------------------------");
    }
}
