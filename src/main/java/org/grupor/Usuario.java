public class Usuario {
    private String nombre;
    private String apellido;

    // Constructor de la clase Usuario
    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Método toString para representar el objeto Usuario como una cadena
    public String toString() {
        return nombre + " " + apellido;
    }

    // Métodos getter para obtener el nombre y el apellido
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // Métodos setter para establecer el nombre y el apellido
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
