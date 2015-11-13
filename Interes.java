//fichero Interes.java
//Clase el interés (I) que produce un capital
//el cúal  es directamente proporcional al capital inicial (C),
// al tiempo (t), y a la tasa de interés (i) :
//I = C · i · t
/**
 * @author david martinez tuñon
 * @version 1.0
 */

public class Interes{
public static double calcularInter (double C, double T ,double i){
   double interes= C * T * i;
   return interes;
}
}
