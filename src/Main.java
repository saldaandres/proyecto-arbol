public class Main {
    static void main(String[] args) {
        ArbolInventario arbol= new ArbolInventario();
        arbol.registrarProducto(5, "telefono");
        arbol.registrarProducto(6, "televisor");
        arbol.registrarProducto(3, "reloj");
        arbol.recorrerEnOrden();
        System.out.println("parar antes de esto");
    }
}
