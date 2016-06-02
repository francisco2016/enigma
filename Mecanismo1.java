
/**
 * Write a description of class Mecanismo1 here.
 * Francisco.
 * •    Mecanismo de multiplicación por número primo: se escoge un número primo que es el que se utiliza para
 * encriptar el número original realizando una multiplicación. Para desencriptar se sigue el proceso inverso.
 */
public class Mecanismo1
{
    // instance variables - replace the example below with your own
    private int num;
    private int numPaEncriptar;
    /**
     *  num introduzca un nº primo.
     *  numPaEncriptar es el nº para encriptar y desencriptar
     */
    public Mecanismo1(int num, int numPaEncriptar )
    {
    this.num = num;
    this.numPaEncriptar = numPaEncriptar;
    }

    /**
     * numero que asigna un nº primo
     */
    public boolean numPrimo( ){
        int cont = 2;
        boolean primo = true;
        while(cont != num && primo){
            if(num % cont == 0){
                primo = false;
            }
            cont ++;
        }
        return primo;
    }
    
    /**
     * mt para multiplicar un nº pasado como parámetro por otro nº primo pasado como parámetro
     *  si el nº primo pasado como parámetro no es primo, usaremos el 31 por defecto.
     */ 
    public int encriptadoConMecanismoPrimo(){
        int encriptado = 0;
        if(numPrimo( ) == true){
            encriptado = numPaEncriptar * num;
        }
        else{
            encriptado = 31 * numPaEncriptar;
        }
        return encriptado;
    }
    
    /**
     * mt para desencriptar el nº encriptado
     */
    public int desencriptadoConMecanismoPrimo(){
        return numPaEncriptar /num ;
    }
    
}




















