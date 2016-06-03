
/**
 * Write a description of class Mecanismo1 here.
 * Francisco.
 * •    Mecanismo de multiplicación por número primo: se escoge un número primo que es el que se utiliza para
 * encriptar el número original realizando una multiplicación. Para desencriptar se sigue el proceso inverso.
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    // instance variables - replace the example below with your own
 

    /**
     *  num introduzca un nº primo.
     *  numPaEncriptar es el nº para encriptar y desencriptar
     */
    public MecanismoMultiplicacionPrimo(int num)
    {
       super(num);

    }

    @Override
    public int encripta(int numParaEncriptar){
        return numParaEncriptar *  getNumElegido();
    } 
    
    @Override
    public int desencripta(int numParaEncriptar){
        return numParaEncriptar /  getNumElegido();
    } 
}





