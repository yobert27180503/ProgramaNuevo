package propuesto2;




import java.util.Date;



public class ClienteBanco {

    private String nombre;
    private String apellido;
    private Date ingreso;
    private Date salida;
    private String estado;

    public ClienteBanco() {

        this.ingreso = new Date();

        this.nombre = nombre;

        this.apellido = apellido;

    }

    public Date getSalida() {

        return salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getIngreso() {

        return ingreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

}
