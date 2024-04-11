public class FacturaImpresion {
    Factura factura;

    public FacturaImpresion(Factura factura) {
        this.factura = factura;
    }

    public void imprimirFactura(){
        System.out.println(factura.cantidad + " x " +factura.libro.nombre + " " +factura.libro.precio);
        System.out.println("Tasa de descuento = " +factura.tasaDescuento);
        System.out.println("Tasa de impuestos = " +factura.tasaImpuesto);
        System.out.println("Total = " +factura.total);
    }

    
}
