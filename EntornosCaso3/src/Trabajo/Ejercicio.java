package Trabajo;
import java.util.Scanner;
public class Ejercicio {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingresa la longitud del lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingresa la longitud del lado 3: ");
        double lado3 = scanner.nextDouble();

        double perimetro = calcularPerimetro(lado1, lado2, lado3);
        System.out.println("Perímetro del triángulo: " + perimetro);

        double area = calcularArea(lado1, lado2, lado3);
        System.out.println("Área del triángulo: " + area);

        scanner.close();
    }

    private static double calcularPerimetro(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    private static double calcularArea(double lado1, double lado2, double lado3) {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

}
