package controller;

public class Metodos {
	
	public static int calculodig (int n) {
		
		// A recursão encerra quando o número houver 1 digito
		if (n >= -9 && n <= 9) {
			return 1;
		}
		
		// Ao dividir por 10 o último digito é retirado de N (por virar parte decimal) e somamos um ao resultado final
		else {
			return 1 + calculodig (n / 10);
		}
	}
	
}
