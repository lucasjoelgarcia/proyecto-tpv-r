public class Cliente extends Usuario {
    private double tarjeta;

    // Constructor de la clase Cliente que incluye el nombre, apellido y el saldo de la tarjeta
    public Cliente(String nombre, String apellido, double tarjeta) {
        super(nombre, apellido);
        this.tarjeta = tarjeta;
    }

    // Método getter para obtener el saldo de la tarjeta
    public double getTarjeta() {
        return tarjeta;
    }

    // Método para seleccionar un producto
    public void seleccionarProducto(String producto) {
        System.out.println("Producto seleccionado: " + producto);
    }

    // Método setter para establecer el saldo de la tarjeta
    public void setTarjeta(double tarjeta) {
        this.tarjeta = tarjeta;
    }

    // Método para realizar una compra con tarjeta
    public void comprarConTarjeta(double monto) {
        System.out.println("Realizar pago con tarjeta");
    }

    // Método para realizar una compra con QR
    public void comprarConQR(double monto) {
        System.out.println("Realizar pago con QR");
    }
}
