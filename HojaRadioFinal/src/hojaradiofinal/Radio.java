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
 * Radio: esta clase es un tipo de data abracta, con la
 * funcion de presentar los metodos necesarios para el
 * funcionamiento, pero no implementarlos.
 */
package hojaradiofinal;

/**
 *
 * @author marcosb11
 */
public interface Radio {
   
        public void setESTADO(boolean nEstado); //controla el estado del radio ON/OFF dependiendo del parametro
    
    public boolean getEstado(); //getter para el estado, envia el estado actual
    
    public int getAMFM(); //getter para la banda AM/FM, envia la banda actual
    
    public void setAMFM(int banda); //controla la banda de la radio AM/FM dependiendo del parametro
    
    public void Sintonizar(boolean ud); //controla las emisoras, avanza o retrocede segun el parametro ud
    
    public void Guardar(int pos); //se encarga de almacenar en la memoria el contenido de cada boton
    
    public void Memoria(int pos); //se encarga de cargar (dependiendo de la posicion y del la banda) la estacion del boton seleccionado
    
    public double getEmisora(); //getter para la estacion actual
    
}
