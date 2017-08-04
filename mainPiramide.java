package br.megasena.main;

import java.util.Scanner;

public class mainPiramide {

	public static void main(String[] args) {
		// Scanner s = new Scanner(System.in);
		// System.out.println("Digite o numero do tamanho: ");
		// int tamanho = s.nextInt();

		//tentativa
		int b = 1;
		int j = 1;
		for (int i = 0; i <= 10; i++) {
			b = j;
			while(b >= 1){
				System.out.print("#");
				b--;
			}
			j += 2;
			System.out.println("");
		}
		
		//tentativa
		int t = 10;
		for (int i = 0; i < t; i++) {
			for (int k = t - i; k > 0 ; k--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print(" #");
			}
			System.out.println("");
		}
		for (int i = 0; i < t; i++) {
			for (int k = 0; k <= i ; k++) {
				System.out.print(" ");
			}
			for (int k = t-i-1; k > 0; k--) {
				System.out.print(" #");
			}
			System.out.println("");
		}
		
		//tentativa
		int n = 10;
		for (int i = 0; i < n*2; i++) {
			for (int k = n*2 - i; k > 0 ; k--) {
				System.out.print("-");
			}
			for (int k = 0; k < i; k++) {
				if(!(i % 2 == 0)){
					System.out.print(" #");
				}
			}
			System.out.println("");
		}
		for (int i = 0; i < n; i++) {
			for (int k = 0; k <= i ; k++) {
				System.out.print("-");
			}
			for (int k = n-i-1; k > 0; k--) {
				System.out.print(" #");
			}
			System.out.println("");
		}

	}
}
