public class ArbolInventario {
    private Producto raiz;

    public ArbolInventario() {
        raiz = null;
    }

    public void registrarProducto(int id, String nombre) {
        raiz = registrar(raiz, id, nombre);
    }

    public void recorrerEnOrden() {
        recorrerEnOrden(raiz);
    }

    private static Producto registrar(Producto actual, int idNuevo, String nombreNuevo ) {
        if (actual == null) {
            return new Producto(idNuevo, nombreNuevo);
        }

        if (actual.id < idNuevo) {
            actual.derecho = registrar(actual.derecho, idNuevo, nombreNuevo);
            return actual;
        }

        actual.izquierdo = registrar(actual.izquierdo, idNuevo, nombreNuevo);
        return actual;
    }

    private static void recorrerEnOrden(Producto actual) {
        if (actual == null) {
            return;
        }
        recorrerEnOrden(actual.izquierdo);
        System.out.println(actual);
        recorrerEnOrden(actual.derecho);

    }

}
