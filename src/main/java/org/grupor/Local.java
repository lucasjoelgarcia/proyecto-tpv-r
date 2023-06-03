public class Local {
    private String nombre;
    private String vendedor;
    private Float pago;

    public Local(String nombre, String vendedor, Float pago) {
        this.nombre = nombre;
        this.vendedor = vendedor;
        this.pago = pago;
    }

    public String getNombre() {
        return nombre;
    }
    public String getVendedor() {
        return vendedor;
    }
    public  Float getPago() {
        return pago;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    public void setPago(Float pago) {
        this.pago = pago;
    }
}
