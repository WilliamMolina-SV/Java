import java.util.Scanner;

public class ejercicioPractico2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        double numeroCompras, valorCompras, iva;
        double descuento=0;
    
        System.out.println("¿Cuantas compras ha realizado?");
        numeroCompras = entrada.nextDouble();
        System.out.println("¿Cual ha sido el valor de sus compras?");
        valorCompras = entrada.nextDouble();
    
        if (numeroCompras > 3){
            if (valorCompras < 1000){
                descuento = valorCompras * 0.025;
            } else if (valorCompras >= 1000 && valorCompras <= 19999) {
                descuento = valorCompras * 0.04;
            } else if (valorCompras >= 20000 && valorCompras <= 40000) {
                descuento = valorCompras * 0.07;
            }else if (valorCompras > 40000){
                descuento = valorCompras * 0.025;
            }
        }
        System.out.println("El valor de la compra con IVA ha sido: $" + valorCompras * 0.13 );
        System.out.println("El valor de la compra sin IVA ha sido: $" + valorCompras);
        System.out.println("El valor del descuento ha sido: $" + descuento);
        System.out.println("El total a pagar con IVA es: $" + valorCompras * 1.13);
    }
}
