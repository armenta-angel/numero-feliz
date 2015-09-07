package solveet.aarmenta;

public class NumeroFeliz {

	public static boolean esNumeroFeliz(int numero) {
		boolean feliz = false;
		int suma = numero;
		
		// La suma de cuadrados de un número infeliz en algún momento es 4.
		
		for (int i = 0; !feliz && suma != 4; i++) {
			suma = sumaCuadrados(suma); 
			if (suma == 1)
				feliz = true;
		}

		return feliz;
	}

	private static int sumaCuadrados(int numero) {
		int resultado = 0;
		Integer[] digitos = descomponerEnDigitos(numero);

		for (int i = 0; i < digitos.length; i++) {
			resultado += Math.pow(digitos[i], 2);
		}

		return resultado;
	}

	private static Integer[] descomponerEnDigitos(int numero) {
		Integer[] resultado = new Integer[String.valueOf(numero).length()];
		int iterador = 0;

		while (numero >= 10) {
			resultado[iterador] = numero % 10;
			numero = numero / 10;
			iterador++;
		}		
		resultado[iterador] = numero;

		return resultado;
	}

}
