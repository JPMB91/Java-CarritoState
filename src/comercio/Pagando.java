package comercio;

public class Pagando implements CarritoState{

    private Carrito carrito;
    @Override
    public void setCarrito(Carrito carrito) {
        this.carrito =carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No es posible agregar nuevos productos durante el pago, debe volver al estado anterior o realizar el pago");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("No es posible cancelar el carrito durante el pago, debe volver al estado anterior y cancelar el carrito o avanzar al estado siguiente para pagar");
    }

    @Override
    public void volverPuntoAnterior() {

        carrito.setEstado(new Cargando());
        System.out.println("Estado: Ha vuelto a Cargando");

    }

    @Override
    public void pasarSiguienteEstado() {
        System.out.println("Aceptando la compra y pasando a Estado Cerrado");
        carrito.setEstado(new Cerrado());
    }
}
