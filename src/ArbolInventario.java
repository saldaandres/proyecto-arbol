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

    public Producto buscar(int id) {
        return buscar(id, raiz);
    }

    // visita los nodos recursivamente hasta encontrar un nodo nulo
    // donde insertar el valor adecuado
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

    // visita los nodos visitandolos recursivamente primero a la izquierda, y cuando llega a los extremos
    // se mueve a la derecha
    private static void recorrerEnOrden(Producto actual) {
        if (actual == null) {
            return;
        }
        recorrerEnOrden(actual.izquierdo);
        System.out.println(actual);
        recorrerEnOrden(actual.derecho);
    }

    // retorna el producto con el ID buscado y nulo si no se encuentra
    private static Producto buscar(int id, Producto actual) {
        if (actual == null || actual.id == id) {
            return actual;
        }

        if (actual.id < id) {
            return buscar(id, actual.derecho);
        }

        return buscar(id, actual.izquierdo);
    }
}
