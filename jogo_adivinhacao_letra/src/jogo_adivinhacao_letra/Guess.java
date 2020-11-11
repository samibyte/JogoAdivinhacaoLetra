package jogo_adivinhacao_letra;

import java.io.IOException;

public class Guess {

	public static void main(String[] args) throws IOException {

		char ch, answer = 'S';
		
		System.out.println("Eu estou pensando em uma letra entre A a Z.");
		System.out.print("Qual letra é o seu palpite? ");
		
		ch = (char) System.in.read();
		
		if(ch == answer) System.out.println("*** Você ACERTOU! ***");
		else System.out.println("Você ERROU! Rode o programa e tente novamente.");
	}

}
