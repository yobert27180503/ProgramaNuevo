package propuesto2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class ColaBanco {

    ArrayList<ClienteBanco> listaEspera;
    ArrayList<ClienteBanco> aux;
    DateFormat formatodia = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

    public ColaBanco() {
        listaEspera = new ArrayList();
        aux = new ArrayList();
    }

    public void ingresarCliente() {
        ClienteBanco e = new ClienteBanco();
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        e.setNombre(nombre);
        String apellido = JOptionPane.showInputDialog("Ingrese apellidos del cliente");
        e.setApellido(apellido);
        e.setEstado("En espera de atención");
        listaEspera.add(e);

    }

    public void atenderCliente() {
        if (existeListaEspera()) {
            JOptionPane.showMessageDialog(null, "Cliente " + listaEspera.get(0).getNombre() + " en atención");
            aux.add(listaEspera.remove(0));
            aux.get(aux.size() - 1).setEstado("En atención");
        }

    }

    public void terminarCliente() {
        if (existeAux()) {
            Date salida = new Date();

            aux.get(aux.size() - 1).setSalida(salida);
            aux.get(aux.size() - 1).setEstado("Atendido");
            long milisegundos = aux.get(aux.size() - 1).getSalida().getTime() - aux.get(aux.size() - 1).getIngreso().getTime();
            int seg = (int) ((milisegundos / 1000) % 60);
            int min = (int) ((milisegundos / 1000) / 60);

            JOptionPane.showMessageDialog(null, "Cliente " + aux.get(aux.size() - 1).getNombre() + " atendido" + "---- Tiempo de atención : " + min + " minutos y " + seg + " segundos");

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
        for (ClienteBanco c : listaEspera) {
            JOptionPane.showMessageDialog(null, c.getNombre() + " " + c.getApellido() + " -- " + c.getEstado());
        }
        for (ClienteBanco c : aux) {
            JOptionPane.showMessageDialog(null, c.getNombre() + " " + c.getApellido() + " -- " + c.getEstado());
        }

    }

    public String convertirFecha(Date f) {
        String s = "Hora y fecha: " + formatodia.format(f);
        return s;
    }

}
