package Trabajo;
import java.util.Scanner;
public class cubo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud de un lado del cubo: ");
        double lado = scanner.nextDouble();

        double volumen = Math.pow(lado, 3);

        System.out.println("El volumen del cubo es: " + volumen);

        scanner.close();
    }

}
