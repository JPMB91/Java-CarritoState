package comercio;

public interface CarritoState {

    void setCarrito(Carrito carrito);
    public void agregarProducto(Producto producto);
    public void cancelarCarrito();
    public void volverPuntoAnterior();
    public void pasarSiguienteEstado();

}
