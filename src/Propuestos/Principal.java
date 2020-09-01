package Propuestos;

import java.util.Date;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        ReparacionVehiculo taller = new ReparacionVehiculo();
        
        int opcion = 0;
        String el, nombre, matricula=null;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "  1. Desea Añadir un vehiculo\n"
                        + "2. Desea  saber el tiempo de clientes no atendidos.?\n"
                        + "3. Desea  saber el tiempo de clientes atendidos.?\n"
                        + "4. Borrar de la lista si ya fue atendido\n"
                        + "5. Desea Salir", "Menú de Opciones", 3));
                switch (opcion) {
                    case 1:
                        nombre = JOptionPane.showInputDialog(null, "Ingrese el medelo", JOptionPane.INFORMATION_MESSAGE);
                        matricula = JOptionPane.showInputDialog(null, "Ingrese la matricula", JOptionPane.INFORMATION_MESSAGE);
                       
                        Date fecha_ingreso = new Date();
                        taller.añadirVehiculo(nombre, matricula, fecha_ingreso);

                        break;
                    case 2:

                       taller.mostrarDatos();
                       

                        break;
                        
                        
                    case 3:
                        
                        JOptionPane.showMessageDialog(null, "El auto reparado es de placa :");
                    
                        taller.reparado(matricula);
                       
                       
                        break;

                    case 4:
                         taller.eliminarPrimerRegistro();
                        break;
                    case 5:
                        
                        JOptionPane.showMessageDialog(null, "Que tenga un hermoso Dia nena...");
                        break;

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }

        } while (opcion != 5);
    }

}




//https://www.redeszone.net/2012/03/19/curso-de-java-resolucion-del-ejercicio-de-linkedlist/
