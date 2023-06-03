public class Cliente extends Usuario{
    private double tarjeta;

    public Cliente(String nombre, String apellido, double tarjeta) {
        super(nombre, apellido);
        this.tarjeta = tarjeta;
    }

    public double getTarjeta() {
        return tarjeta;
    }

    public void seleccionarProducto(String producto) {
        System.out.println("Producto seleccionado: " + producto);
    }

    public void setTarjeta(double tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void comprarConTarjeta(double monto) {
        System.out.println("Realizar pago con tarjeta");
    }
    public void comprarConQR(double monto) {
        System.out.println("Realizar pago con QR");
    }

}
