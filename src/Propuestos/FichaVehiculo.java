package Propuestos;

import java.util.Date;

public class FichaVehiculo {

    private long entrada, reparacion, salida;
    private Date fecha_ingreso;
    private String modelo;
    private String matricula;

    /**
     * Constructor
     */
    public FichaVehiculo(String m, String ma, Date fecha_ingreso) {
        modelo = m;
        matricula = ma;
       fecha_ingreso=this.fecha_ingreso;
       // entrada = e;
        reparacion = 0;
        salida = 0;

    }

    public String matricula() {
        return matricula;
    }

    public String modelo() {
        return modelo;
    }

    public void modificaFechaEntrada(long fecha_entrada) {
        entrada = fecha_entrada;
    }
    
    public void modificaFechaSalida(long fecha_salida) {
        entrada = fecha_salida;
    }

    public void modificaFechaReparacion(long fecha_reparacion) {
        entrada = fecha_reparacion;
    }

    public boolean estaArreglado() {
        if (reparacion != 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * **************Observadores de las fechas de reparación y salida***
     */
    public long fechaReparacion() {
        return reparacion;
    }

    public long fechaSalida() {
        return salida;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

}

