package Propuesto1;

import javax.swing.JOptionPane;
import propuesto2.ColaBanco;

public class mecanicoPrincipal {

    public static void main(String[] args) {

        RepacionVehiculo taller = new RepacionVehiculo();
        String el;
        int opcion = 0 ;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Desea Registrar su vehiculo-?\n"
                        + "2. Desea ser atendido su vehiculo.? \n"
                        + "3. Desea dar alta su Vehiculo.? \n"
                        + "4. Mostrar la lista de vehiculos \n"
                        + "5. Salir\n", "Menú de Opciones", 3));

                switch (opcion) {
                    case 1:
                        taller.ingresarVehiculo();
                        break;
                    case 2:
                        if (taller.existeListaEspera()) {
                            taller.atenderVehiculo();

                        } else {
                            JOptionPane.showMessageDialog(null, "No existen clientes en cola");
                        }

                        break;
                    case 3:
                        if (taller.existeAux()) {
                            
                            JOptionPane.showMessageDialog(null,"El Vehiculo que saldra del taller es :",
                          "TALLER Laurita",JOptionPane.INFORMATION_MESSAGE);
                        taller.terminarVehiculo();
                        } else {
                            JOptionPane.showMessageDialog(null, "No existen clientes en atención");
                        }
                        break;
                    case 4:
                        taller.imprimir();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Que tenga un hermoso Dia");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                        break;

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error..." + n.getMessage());
            }

        } while (opcion != 5);

    }

}
