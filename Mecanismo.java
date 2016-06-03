
/**
 * Write a description of class Mecanismo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mecanismo
{
    //nº que se utiliza para encriptar o desencriptar.
    private int numElegido; 

    /**
     * numElegido elige un número del 1 al 9
     */
    public Mecanismo(int numElegido)
    {
        this.numElegido = numElegido;
    }

    public abstract int encripta(int num);
    
    public abstract int desencripta(int num);
    
    public int getNumElegido(){
        return numElegido;
    }
}
