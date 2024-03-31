package comercio;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private CarritoState estado;
    private List<Producto> productos = new ArrayList<>();
    public Carrito() {
        setEstado(new Vacio());
    }



    public void agregarProducto(Producto producto) {
        productos.add(producto);
        this.estado.agregarProducto(producto);
    }
    public void cancelarCarrito(){
        this.estado.cancelarCarrito();
    }

    public void volverEstadoAnterior(){
        getEstado().volverPuntoAnterior();
        //this.estado.volverPuntoAnterior();
    }

    public void pasarSiguienteEstado(){
        this.estado.pasarSiguienteEstado();
    }

    public void contenidoCarrito() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void setEstado(CarritoState estado){
        this.estado = estado;
        this.estado.setCarrito(this);
    }

    public CarritoState getEstado() {
        return estado;
    }

}
