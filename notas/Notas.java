package notas;

import java.util.Scanner;

public class Notas {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int nota = 0;
		String mensaje = "";
		System.out.print("Introduzca el valor de una calificación: ");
		nota = reader.nextInt();
		
		mensaje = Notas2.califica(nota);
		
		System.out.println(mensaje);
		reader.close();
		}

	/**
	 * @deprecated Use {@link Notas2#califica(int)} instead
	 */
	public static String cali(int nota) {
		return Notas2.califica(nota);
	}

	/**
	 * @deprecated Use {@link Notas2#califica(int)} instead
	 */
	public static String califica(int num_nota) {
		return Notas2.califica(num_nota);
	}
}