public class Local {
    private String nombre;
    private String vendedor;
    private Float pago;

    // Constructor de la clase Local que recibe el nombre del local, el nombre del vendedor y el pago
    public Local(String nombre, String vendedor, Float pago) {
        this.nombre = nombre;
        this.vendedor = vendedor;
        this.pago = pago;
    }

    // Método getter para obtener el nombre del local
    public String getNombre() {
        return nombre;
    }

    // Método getter para obtener el nombre del vendedor
    public String getVendedor() {
        return vendedor;
    }

    // Método getter para obtener el pago
    public Float getPago() {
        return pago;
    }

    // Método setter para establecer el nombre del local
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método setter para establecer el nombre del vendedor
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    // Método setter para establecer el pago
    public void setPago(Float pago) {
        this.pago = pago;
    }
}
