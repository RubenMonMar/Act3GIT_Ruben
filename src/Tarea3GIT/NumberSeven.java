package Tarea3GIT;

import java.util.Scanner;

public class NumberSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Titulo del programa
		System.out.println("Números de 7 en 7");

		// Creamos las variables
		int numeroInicial = 0;
		int numeroTerminar = 0;
		int numeroTres = 0;

		do

		{
			// Pedimos valores por teclado
			System.out.print("Introduce un número entero:");
			numeroInicial = Integer.parseInt(sc.nextLine());
			System.out.print("Introduce otro número entero:");
			numeroTerminar = Integer.parseInt(sc.nextLine());
			System.out.print("Introduce el tercer número entero:");
			numeroTres = Integer.parseInt(sc.nextLine());

			// Si los numero son iguales da un error
			if (numeroInicial == numeroTerminar) {
				System.out.println("Datos incoorectos, los número introducidos deben ser distintos");
			}
		} while (numeroInicial == numeroTerminar);

		for (int i = numeroInicial; i <= numeroTerminar; i += 7) {
			System.out.println(i);

		}
		if ((numeroTres > numeroInicial) && (numeroTres < numeroTerminar)) {
			System.out.println("Número tres: " + numeroTres);
		}
	}
}
