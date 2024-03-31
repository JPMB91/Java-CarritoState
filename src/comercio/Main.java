package comercio;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();

        carrito.pasarSiguienteEstado();
        Producto p1 = new Producto("Cepillo", 199.0);
        carrito.agregarProducto(p1);

        carrito.contenidoCarrito();

        carrito.pasarSiguienteEstado();

        carrito.cancelarCarrito();

        carrito.volverEstadoAnterior();
        carrito.pasarSiguienteEstado();
        carrito.pasarSiguienteEstado();
        carrito.pasarSiguienteEstado();
        carrito.pasarSiguienteEstado();


        //carrito.cancelarCarrito();
    }
}
