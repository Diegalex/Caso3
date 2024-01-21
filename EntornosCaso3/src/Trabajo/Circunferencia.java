package Trabajo;

import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double area = calcularAreaCircunferencia(radio);

        double perimetro = calcularPerimetroCircunferencia(radio);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }

    public static double calcularAreaCircunferencia(double radio) {
        return 3.14 * Math.pow(radio, 2);
    }
    
    public static double calcularPerimetroCircunferencia(double radio) {
        return 2 * 3.14 * radio;
    }
}
