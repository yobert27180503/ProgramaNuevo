package Propuesto1;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class RepacionVehiculo {

    ArrayList<AtributosMecanico> listaEspera;
    ArrayList<AtributosMecanico> aux;

    public RepacionVehiculo() {
        listaEspera = new ArrayList<>();
        aux = new ArrayList<>();
    }

    public void ingresarVehiculo() {
        AtributosMecanico mecanico = new AtributosMecanico();
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo");
        mecanico.setModelo(modelo);
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo ");
        mecanico.setPlaca(placa);
        mecanico.setEstado("En espera de atención");
        listaEspera.add(mecanico);

    }

    public void atenderVehiculo() {
        if (existeListaEspera()) {
            JOptionPane.showMessageDialog(null, "Cliente " + listaEspera.get(0).getModelo() + " en atención");
            aux.add(listaEspera.remove(0));
            aux.get(aux.size() - 1).setEstado("En atención");
        }

    }

    public void terminarVehiculo() {
        if (existeAux()) {
            Date salida = new Date();

            aux.get(aux.size() - 1).setSalida(salida);
            aux.get(aux.size() - 1).setEstado("Atendido");
            long milisegundos = aux.get(aux.size() - 1).getSalida().getTime() - aux.get(aux.size() - 1).getIngreso().getTime();
            int seg = (int) ((milisegundos / 1000) % 60);
            int min = (int) ((milisegundos / 1000) / 60);

            JOptionPane.showMessageDialog(null, "El vehiculo " + aux.get(aux.size() - 1).getModelo() + " atendido" + "---- Tiempo de atención : " + min + " minutos y " + seg + " segundos");

        }

    }
     public boolean existeListaEspera() {
        boolean ban = false;
        if (listaEspera.get(0) != null) {
            ban = true;
        }
        return ban;
    }

    public boolean existeAux() {
        boolean ban = false;
        if (aux.get(0) != null) {
            ban = true;
        }
        return ban;
    }

    public void imprimir() {
        for (AtributosMecanico mecanico : listaEspera) {
            JOptionPane.showMessageDialog(null, mecanico.getModelo() + " " + mecanico.getPlaca() + " -- " + mecanico.getEstado());
        }
        for (AtributosMecanico mecanico : aux) {
            JOptionPane.showMessageDialog(null, mecanico.getModelo() + " " + mecanico.getPlaca() + " -- " + mecanico.getEstado());
        }

    }

}