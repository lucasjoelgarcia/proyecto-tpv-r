public class Vendedor extends Usuario {
    private ArrayList<String> productos;
    private ArrayList<Double> precios;
    private HashMap<String, Integer> stock;

    public Vendedor(String nombre, String apellido) {
        super(nombre, apellido);
        this.productos = new ArrayList<>();
        this.precios = new ArrayList<>();
        this.stock = new HashMap<>();
    }

    // Agrega un nuevo producto a la lista de productos y establece su stock inicial en 0
    public void agregarProducto(String producto) {
        productos.add(producto);
        stock.put(producto, 0);
    }

    // Agrega o actualiza el precio de un producto existente en la lista de precios
    public void agregarPrecioProducto(String producto, double precio) {
        int index = productos.indexOf(producto);
        if (index >= 0) {
            precios.set(index, precio);
        } else {
            System.out.println("El producto no existe.");
        }
    }

    // Establece el stock de un producto específico en el mapa de stock
    public void establecerStock(String producto, int stock) {
        if (this.stock.containsKey(producto)) {
            this.stock.put(producto, stock);
            System.out.println("El producto " + producto + " tiene " + stock + " unidades en stock.");
        } else {
            System.out.println("El producto no existe.");
        }
    }
}