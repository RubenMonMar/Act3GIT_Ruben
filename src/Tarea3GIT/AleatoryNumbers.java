package Tarea3GIT;

public class AleatoryNumbers {
	public static final int COMIENZO = 1;
	public static final int FIN = 10;

	public static void main(String[] args) {

		// Título del porgrama
		System.out.println("20 NUMEROS ALEATORIOS ENTRE 1 Y 10");

		// Creamos un contador para saber cuando tiene que para de sacar números
		// aleatorios
		int contadorNumerosAleatorios = 0;

		System.out.println("Números aleatorios:");
		do {
			// Creamos la operación que saca números aleatorios
			int numeroAleatorio = (int) (Math.random() * FIN+COMIENZO);
			System.out.println(numeroAleatorio);
			contadorNumerosAleatorios++;
		} while (contadorNumerosAleatorios < 20);

	}

}
