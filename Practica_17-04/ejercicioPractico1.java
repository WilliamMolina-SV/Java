import java.util.*;

public class ejercicioPractico1 {
    public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);
    double promedio, descuento, totalPagar;
    double cuota=60;

    System.out.println("¿Cual es el promedio obtenido por el estudiante?");
    promedio = entrada.nextDouble();
    
    if (promedio >= 8.5){
        descuento = cuota * 0.3;
        totalPagar = cuota - descuento;
        System.out.println("El total a cancelar es: $" + totalPagar);
    } else {
        totalPagar = cuota * 1.13;
        System.out.println("El total a cancelar es: $" + totalPagar);
    }
    
}
}
