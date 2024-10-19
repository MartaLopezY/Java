
package mlyt07A;

import java.time.LocalDateTime;


public class Coche {

    public  String matricula;
    public LocalDateTime horaLlegada;
    public double importePagar;

   Coche(String mat){
   matricula=mat;
   horaLlegada= LocalDateTime.now();
   importePagar=0;
   
   }
 
}
