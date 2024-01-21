package Trabajo;

import java.util.Scanner;

public class Triangulo {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado 1: ");
        int lado1 = scanner.nextInt();

        System.out.print("Ingrese el lado 2: ");
        int lado2 = scanner.nextInt();

        double area = calcularArea(lado1, lado2);

        System.out.println("El área del triángulo es: " + area);
    }

    public static double calcularArea(int lado1, int lado2) {
        double area = (lado1 * lado2) / 2.0;
        return area;
    }
}