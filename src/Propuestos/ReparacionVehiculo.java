package Propuestos;

import java.util.Date;
import java.util.LinkedList;

public class ReparacionVehiculo {

    private LinkedList<FichaVehiculo> lista = new LinkedList<FichaVehiculo>();

    /**
     * Metodo que añade un vehiculo para ser arreglado con una fecha de entrada
     *
     * @param nombre
     * @param matricula
     */
    public void añadirVehiculo(String nombre, String matricula, Date fecha_ingreso) {
        long f = Reloj.ahora();

        FichaVehiculo fich = new FichaVehiculo(nombre, matricula, fecha_ingreso);//creamos un nuevo vehículo
        lista.add(fich);//añadimos
    }

    /**
     * Metodo que añade una fecha de reparacion a un vehiculo
     *
     * @param matricula
     */
    public void reparado(String matricula) {
        boolean encontrado = false;
        int i = 0;

        while (!encontrado && i < lista.size()) {

//condiciones que ha de cumplir(todas)
            if (lista.get(i).matricula().equals(matricula) && lista.get(i).fechaReparacion() == 0) {

                lista.get(i).modificaFechaReparacion(Reloj.ahora());
                encontrado = true;
            } else {
                i++;
            }
        }

        if (encontrado == true) {
            System.out.println("Fecha de reparación modificada correctamente");
        } else {
            System.out.println("Error al modificar la fecha de reparación del vehículo " + matricula);
        }
    }

    /**
     * Metodo que añade una fecha de salida a un vehiculo
     *
     * @param matricula
     */
    public void fechaSalidaTaller(String matricula) {
        boolean encontrado = false;
        int i = 0;

        while (!encontrado && i < lista.size()) {

//condiciones que ha de cumplir(todas)
            if (lista.get(i).matricula().equals(matricula) && lista.get(i).fechaSalida() == 0 && lista.get(i).estaArreglado()) {

                lista.get(i).modificaFechaSalida(Reloj.ahora());
                encontrado = true;
            } else {
                i++;
            }
        }

        if (encontrado == true) {
            System.out.println("Fecha de salida modificada correctamente");
        } else {
            System.out.println("Error al modificar la fecha de salida del vehículo " + matricula);
        }
    }

    /**
     * Borramos la primera fiche de un vehiculo
     *
     * @return
     */
    public boolean eliminarPrimerRegistro() {
        if (lista.isEmpty()) {
            return false;
        } else {
            lista.removeFirst();
            return true;
        }
    }

    public LinkedList getList() {
        return lista;
    }

    public void mostrarDatos() {

        String salida = "";

        for (int i = 0; i < lista.size(); i++) {
            //System.out.println("El modelo de auto es :" + lista.get(i).nombre());
            System.out.println("La fecha de ingreso del auto es : "+lista.get(i).getFecha_ingreso());
            salida += "Nombre posicion " + i + " : " + lista.get(i).matricula();
            
           
        }
    }

}
