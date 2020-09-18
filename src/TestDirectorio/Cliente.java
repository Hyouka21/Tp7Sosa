
package TestDirectorio;


public class Cliente {
     private String nombre;
     private String apellido;
     private String ciudad;
     private String direccion;
     private int dni;

    public Cliente(String nombre, String apellido, String ciudad, String direccion, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDni() {
        return dni;
    }
     
     @Override
    public String toString(){
    return "Nombre: "+apellido+" "+nombre+"  Dni:  "+ dni+"  Domicilio en la ciudad de "+ciudad+" con direccion en "+direccion;
    
    }
    
    
    
}
