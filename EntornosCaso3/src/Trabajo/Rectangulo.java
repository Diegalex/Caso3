package Trabajo;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingresa el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        double area = calcularAreaRectangulo(longitud, ancho);

        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }

   
    public static double calcularAreaRectangulo(double longitud, double ancho) {
        return longitud * ancho;
    }
}