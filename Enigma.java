
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{


    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *  assertEquals(35084, enigma.encripta(mecanismo01, 5012)); 
     */
   public int encripta(Mecanismo mecanismo, int num){
       int numero;
       if (num <= 10) {
           numero = -1;
        }
        else {
            numero= mecanismo.encripta(num);
        }
        return numero;
   }
   
   /**
     * An example of a method - replace this comment with your own
     *  assertEquals(35084, enigma.encripta(mecanismo01, 5012)); 
     */
   public int desencripta(Mecanismo mecanismo, int num){
       int numero = mecanismo.desencripta(num);
       if (numero <= 10) {
           numero = -1;
        }
        return numero;
   }
}
