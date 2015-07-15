/* *******************************************************
 * Gabriel Martinez 14070
 * Belen Hernandez 14361
 * Arturo Garcia 14186
 * Marcos Benedict 14368
 * *******************************************************
 * El proposito de este programa es genrar la interfaz de
 * una radio mediante el uso de tipos de dato abractos e
 * implementacion de estos.
 * *******************************************************
 * HT1: se encarga de generar el main del programa y el
 * frame para el panel que contiene la GUI
 */
package hojaradiofinal;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author marcosb11
 */
public class HT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //inicio del main
        // TODO code application logic here
        JFrame frame = new JFrame(); //se crea un JFrame
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //el frame para que se cierre normalmente
        frame.getContentPane().add(new radioGUI()); //se agrega el contenido del panel
        frame.pack(); //empaqueta
        frame.setVisible(true); //se hace visible
        
    }
    
}
