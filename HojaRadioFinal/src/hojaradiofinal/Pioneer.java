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
 * Pioneer: esta clase implementa los metodos de la interfaz
 * Radio, mediante sus metodos es posible hacer las funciones
 * y calculos necesarios para el correcto funcionamiento de la
 * interfaz grafica para el usuario
 */
package hojaradiofinal;

/**
 *
 * @author marcosb11
 */
public class Pioneer implements Radio{ //se implementa la interfaz Radio
    private boolean estado; //almacena el estado de la radio ON (true) y OFF (false)
    private int amfm; //almacena la banda en la que se encuentra AM (0) y FM (1)
    private boolean ud; //almacena la direccion, si se avanza (true) o se retrocede (false) en las emisoras
    private double estacion[] = new double [2]; //almacena las emisoras tanto para am (estacion[0]) como para fm (estacdion[1])
    private double botones[][] = new double[12][2]; //almacena la memoria de los botones de la radio 
    //tanto para am (botones[0 - 11][0]) como para fm (botones[0 - 12][1])
    
    
    
    public void setESTADO(boolean estado) { //controla el estado del radio ON/OFF dependiendo del parametro
        this.estado=estado; //se almacena el estado actual
        this.estacion[0]=530; //los valores predeterminados de emisora son cargados a las variables
        this.estacion[1]=87.9;
        this.amfm=1;
    }

    public boolean getEstado() { //getter para el estado, envia el estado actual
        return this.estado; //retorna la banda actual
    }

    public int getAMFM() { //getter para la banda AM/FM, envia la banda actual
        return this.amfm; //retorna la banda actual
    }

    public void setAMFM(int amfm) { //controla la banda de la radio AM/FM dependiendo del parametro
        this.amfm=amfm; //se almacena la banda actual
    }

    public void Sintonizar(boolean ud) { //controla las emisoras, avanza o retrocede segun el parametro ud
        this.ud = ud; //se almacena la accion actual
        
        if(this.ud){ //si la accion es avanzar (true) 
            if(this.amfm==0){ //si la banda es AM (0)...
                this.estacion[amfm] = this.estacion[amfm]+10; //... las estaciones avanzan en intervalos de 10 (AM)
                if(this.estacion[amfm]>1610){ //pero si se supera el limite permitido
                    this.estacion[amfm]=530; //se regresa a la primera estacion
                }
            }else{ //de lo contrario se encuentra en una banda FM (1)...
                this.estacion[amfm] = this.estacion[amfm]+0.20; //... por lo que los intervalos avanzan en 0.2
                if(this.estacion[amfm]>107.9){ //pero si se supera el limite permitido
                    this.estacion[amfm]=87.9; //se regresa a la primera estacion
                }
            }
        }else{ //si la accion es retroceder (false)
            if(this.amfm==0){ //si la banda es AM (0)...
                this.estacion[amfm] = this.estacion[amfm]-10; //... las estaciones retroceden en intervalos de 10 (AM)
                if(this.estacion[amfm]<530){ //pero si se supera el limite permitido
                    this.estacion[amfm]=1610; //se regresa a la ultima estacion
                }
            }else{ //de lo contrario se encuentra en una banda FM (1)...
                this.estacion[amfm] = this.estacion[amfm]-0.2; //... por lo que los intervalos retroceden en 0.2
                if(this.estacion[amfm]<87.9){ //pero si se supera el limite permitido
                    this.estacion[amfm]=107.9; //se regresa a la ultima estacion
                }
            }
        }
        
        this.estacion[amfm] = Math.round( this.estacion[amfm] * 100.0 ) / 100.0; //las estaciones se redondean a 2 decimales
    }

    public void Guardar(int pos) { //se encarga de almacenar en la memoria el contenido de cada boton
        this.botones[pos][amfm]=this.estacion[amfm];  //dependiendo de la banda se almacena la estacion en el boton seleccionado
    }

    public void Memoria(int pos) { //se encarga de cargar (dependiendo de la posicion y del la banda) la estacion del boton seleccionado
        if(this.botones[pos][0]>=530 && this.botones[pos][0]<=1610 && (amfm ==0)){ //si esta dentro del rango y es am
                this.estacion[amfm]=this.botones[pos][amfm]; //se carga la estacion contenida en el boton seleccionado
                
        }
        if(this.botones[pos][1]>=87.9 && this.botones[pos][1]<=107.9 && (amfm ==1)){ //si esta dentro del rango y es fm
                this.estacion[amfm]=this.botones[pos][amfm]; //se carga la estacion contenida en el boton seleccionado
        }
    }

    public double getEmisora() { //getter para la estacion actual
        return estacion[amfm]; //se retorna el valor de la estacion actual
    }
    
}
