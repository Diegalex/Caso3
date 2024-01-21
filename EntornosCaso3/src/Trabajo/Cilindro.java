package Trabajo;
import java.util.Scanner;
public class Cilindro {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa el radio del cilindro: ");
	        double radio = scanner.nextDouble();

	        System.out.print("Ingresa la altura del cilindro: ");
	        double altura = scanner.nextDouble();

	        double area = calcularAreaCilindro(radio, altura);

	        System.out.println("El área del cilindro es: " + area);

	        scanner.close();
	    }

	    public static double calcularAreaCilindro(double radio, double altura) {
	        double areaBase = 2 * Math.PI * Math.pow(radio, 2);
	        double areaLateral = 2 * Math.PI * radio * altura;
	        double areaTotal = areaBase + areaLateral;
	        return areaTotal;
	    }

}
