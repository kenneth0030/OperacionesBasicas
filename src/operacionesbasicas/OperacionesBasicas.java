
package operacionesbasicas;

import java.util.Locale;

/**
 *
 * @author maryse
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicas {
    
    int valor1 = 10, valor2 = 8;
    float suma, resta, multiplicación, division;

    public void Operaciones(){
        
        //Reliza el cálculo de la suma
        
        //Reliza el cálculo de la resta
        //resta= valor1 - valor2;
        //System.out.println("La resta es: " + resta);
        
        //Reliza el cálculo de la multiplicación
        //multiplicación = valor1 * valor2;
        //System.out.println("La multiplicación es: " + multiplicación);
        
        //Reliza el cálculo de la división
        //division = valor1 / valor2;
        //System.out.println("La division es: " + division);
    }
public void suma ()
    {
        suma= valor1 + valor2;
        System.out.println("La suma es: " + suma);

    }        

  public void resta ()
    {
        resta= valor1 - valor2;
        System.out.println("La resta es: " + resta);

    }
  
  public void multiplicación ()
  {
      multiplicación = valor1 * valor2;
      System.out.println("la multiplicaion es: " + multiplicación);
  }
  
  public void división ()
  {
      division = valor1 / valor2;
      System.out.println("la división es " + division);
  }
public static void main(String[] args) 
{        
        OperacionesBasicas operaciones = new OperacionesBasicas();
        operaciones.Operaciones();
        OperacionesBasicas suma = new OperacionesBasicas();
        suma.suma();
         OperacionesBasicas resta = new OperacionesBasicas();
        resta.resta();
        OperacionesBasicas multiplicación = new OperacionesBasicas ();
        multiplicación.multiplicación();
        OperacionesBasicas división = new OperacionesBasicas ();
        división.división();
        
}

}
