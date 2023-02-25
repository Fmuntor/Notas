package notas;

public class Notas2 {

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
