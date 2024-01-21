package Trabajo;

import java.util.Scanner;

public class Cubo {
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
    	System.out.println("Ingrese el lado 1: ");
    	int lado1 = scanner.nextInt();
    	
    	System.out.println("Ingrese el lado 2: ");
    	int lado2 = scanner.nextInt();
    	
    	System.out.println("Ingrese el lado 3: ");
    	int lado3 = scanner.nextInt();
    	
    	double volumen = calcularVolumen(lado1, lado2, lado3);
    	
    	System.out.println("El volumen del cubo es: " + volumen);
    }
public static double calcularVolumen(int lado1, int lado2, int lado3) {
	double volumen = lado1 * lado2 * lado3;
	return volumen;
	}
}