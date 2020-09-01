
package propuesto2;
import javax.swing.JOptionPane;

public class Banco {
   

    public static void main(String[] args) {
        
        ColaBanco c = new ColaBanco();
        
        int introducido =0;
        do {
            String entrada = JOptionPane.showInputDialog( null, 
                    "1. Ingresar cliente\n"
                    + "2. Atender cliente \n"   
                    + "3. Finalizar atención al cliente \n" 
                    + "4. Mostrar estados\n"
                    + "0. Salir\n");
            
        
            introducido = Integer.parseInt(entrada);
           
            switch(introducido){
                case 1: 
                  c.ingresarCliente();
                   break;
                case 2:
                    if (c.existeListaEspera()) {
                        c.atenderCliente();
                        
                    }
                    else
                        JOptionPane.showMessageDialog(null, "No existen clientes en cola");
                    
                    break;
                case 3:
                    if (c.existeAux()) {
                        c.terminarCliente();
                    }
                     else
                        JOptionPane.showMessageDialog(null, "No existen clientes en atención");
                    break;
                case 4:
                    c.imprimir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opción válida");
                    break;
                    
            }
            
        }while(introducido!=0);
        
    }
    

} 

