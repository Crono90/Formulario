package giovanni.itt.tarea2_formulario;

/**
 * Created by Gio on 25/03/2017.
 */

public class Variables {

    private String Nombre;
    private String Direccion;
    private String Telefono;

    public Variables(String nombre, String direccion, String telefono) {
        Nombre = nombre;
        Direccion = direccion;
        Telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
