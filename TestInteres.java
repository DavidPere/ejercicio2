//fichero Interes.java
//leemos desde un Scanner los valores
//capital, tiempo y tasa de  interés
//y mediante el  método calcularInteres de la
//clase  Interes muestra por pantalla el interés
//calculado
import java.util.Scanner;
public class TestInteres{
   public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce Capital, tiempo y tasa interes");
        double C=sc.nextDouble();
        double T=sc.nextDouble();
        double i=sc.nextDouble();
        //mostramos por pantalla el valor del interés
        System.out.println(Interes.calcularInter(C,T,i));
   }
}
