package comercio;

public class Vacio implements CarritoState {

    private Carrito carrito;

    @Override
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }


    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("proceda al siguiente paso para agregar productos: "
                + producto.getDescripcion()+" "+producto.getPrecio());
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("no es posible cancelar un carrito vacío");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("no hay punto anterior al que volver");
    }

    @Override
    public void pasarSiguienteEstado() {
        carrito.setEstado(new Cargando());
        System.out.println("Estado: Ha avanzado a estado Cargando. Puede comenzar a agregar productos");
    }



}
