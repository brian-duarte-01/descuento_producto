// tarea 7 ejercicio 1 del curso de JAVA
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //declaracion de variables
        int precio=10;
        int cantidad;
        int total;
        double r;
        double porcentaje;
        //entrada de datos
        System.out.println("ingrese la cantdad de unidades del producto ?");
        cantidad=in.nextInt();
        //proceso 
        total=cantidad*precio;
        if(total>=100){
            porcentaje=total*0.10;
            r=total-porcentaje;
            System.out.println("tiene un descuento del 10% por su compra de mas de 100 quetzales el total a pagar es: "+r);
        }else{
            System.out.println("no tiene descuento del 10% por su compra menos de 100 quetzales el total a pagar es:"+total);
        }
        
    }
    
}
