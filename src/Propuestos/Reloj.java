package Propuestos;

import java.util.Calendar;
//Vamos a implementar la clase Reloj, que nos dará una medida para calcular el tiempo que tarda en ser atendido un paciente
//Clase que permite obtener la fecha y hora actual,
//en milisegundos desde la época
public class Reloj {

    public static long ahora() {
        return Calendar.getInstance().getTimeInMillis();
    }
}
