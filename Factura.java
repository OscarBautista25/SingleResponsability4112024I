public class Factura {
    Libro libro;
    int cantidad;
    double tasaDescuento;
    double tasaImpuesto;
    double total;
    public Factura(Libro libro, int cantidad, double tasaDescuento, double tasaImpuesto) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.tasaDescuento = tasaDescuento;
        this.tasaImpuesto = tasaImpuesto;
        this.total = this.calcularTotal();
    }

    public double calcularTotal(){
        double precio = ((libro.precio-libro.precio*tasaDescuento)*this.cantidad);
        double precioConImpuestos = precio+precio*tasaImpuesto;
        return precioConImpuestos;
    }

    
    
}
