package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import controller.Metodos;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println ("------------ Quantidade de dígitos de um número inteiro ------------");
		System.out.print("Digite um número: ");
		int n = Integer.parseInt (br.readLine());
		int result = Metodos.calculodig(n);
		System.out.printf("O número %d possui %d digitos!", n, result);
		
	}
}
