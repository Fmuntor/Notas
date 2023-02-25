package notas;

import java.util.Scanner;

public class Notas {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int nota = 0;
		String mensaje = "";
		System.out.print("Introduzca el valor de una calificación: ");
		nota = reader.nextInt();
		
		mensaje = califica(nota);
		
		System.out.println(mensaje);
		reader.close();
		}

	/**
	 * @deprecated Use {@link #califica(int)} instead
	 */
	public static String cali(int nota) {
		return califica(nota);
	}

	public static String califica(int num_nota) {
		String mensaje;
		if (num_nota >= 0 && num_nota < 5)
		mensaje = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
		mensaje = "Aprobado";
		else if (num_nota >= 7 && num_nota <9)
		mensaje = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
		mensaje = "Sobresaliente";
		else
		mensaje = "El valor de la calificación introducida no es correcta";
		return mensaje;
	}
}