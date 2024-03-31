package comercio;

public class Cerrado implements CarritoState{

    private Carrito carrito;
    @Override
    public void setCarrito(Carrito carrito) {
        this.carrito=carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("No es posible agregar nuevos productos");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("no es posible cancelar el carrito en este estado");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("No es posible volver al estado anterior. Compra ha sido cerrada");
    }

    @Override
    public void pasarSiguienteEstado() {
        carrito.setEstado(new Vacio());
        System.out.println("Estado: Movido a estado Vacio para iniciar su compra");
    }
}
