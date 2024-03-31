package comercio;

import java.util.ArrayList;
import java.util.List;

public class Cargando implements CarritoState {
    private Carrito carrito;
    private List<Producto> productos;

    public Cargando() {
        productos = new ArrayList<>();
    }

    @Override
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto cargado exitosamente: " + producto.getDescripcion() + ", " + producto.getPrecio());
    }

    @Override
    public void cancelarCarrito() {
        productos.clear();
        System.out.println("Carrito ha sido vaciado");
    }

    @Override
    public void volverPuntoAnterior() {
        carrito.setEstado(new Vacio());
    }

    @Override
    public void pasarSiguienteEstado() {
        carrito.setEstado(new Pagando());
    }
}
