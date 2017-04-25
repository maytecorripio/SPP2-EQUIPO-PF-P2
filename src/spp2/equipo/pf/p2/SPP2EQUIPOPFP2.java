/*
Orianna Linette Virgen Mar       A01411515
María Teresa Corripio Herrera  A01410393
Rafael Alejandro Cisneros Gual A01410038
Leticia Vianey Narváez Reyes     A01410432
Ana Martha Alanis Cortaza        A01411418
 */
package spp2.equipo.pf.p2;
import javax.swing.JOptionPane;

/**
 *
 * @author MayteCorripio
 */
public class SPP2EQUIPOPFP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Arreglo();
    }
    public static int solicitacionEntero(String mensaje){
     
        int num = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            num = Integer.parseInt(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
    public static double solicitacionDouble(String mensaje){
     
        double num = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            num = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
    public static double[] Arreglo(){
        double suma=0;
        int var=solicitacionEntero ("¿Cuántas cantidades capturará?"); 
        double [] arreglo = new double [var];
        
        for (int i=0; i<arreglo.length; i++){
                arreglo[i]= solicitacionDouble("Introduzca una cantidad:");
                suma = (suma + arreglo[i]);
            }
        
        JOptionPane.showMessageDialog (null, "El total de gastos es: " + suma);
    return arreglo;
    }
}