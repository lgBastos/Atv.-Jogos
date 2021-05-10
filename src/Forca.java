package br.ucsal;

//lucas was here
import java.util.Scanner;

public class Forca {

	public static void main(String[] args) {
		inicio();
	
	}
	public static void inicio() {
		System.out.println("---------------------------------------------");
		System.out.println("Digite a palavra escolhida:");
		Scanner sc = new Scanner(System.in);
		String palavra = sc.next();
		String sublin = "";
		for (int i = 0; i < palavra.length(); i++) {
			sublin += "_ ";
			}
		System.out.println(sublin);
		
		
		// Implementar funcionalidade de dica
		// Implementar preenchimento de letras 
		// Implementar mais de um acerto pra uma s� letra
		int erro = 0, acerto = 0;
		String frase = "";
		while (true) {
			System.out.println();
			System.out.println("Digite uma letra:");
			String letra = sc.next();
			if (palavra.contains(letra)) {
				acerto++;
				System.out.println("Acertou a letra");
				frase += letra;
				System.out.println(frase + " " + sublin.substring(0, sublin.length()- (2 * acerto)));
			} 
			else {
				erro++;// erro come�a com 6
				if (erro < 6) {
					System.out.println(desenho(erro));
					System.out.println("Voc� tem mais " + (6 - erro) + " chances.");
				} else {
					System.out.println(desenho(erro));
					System.out.println("Acabaram suas chances.");
				}
			}
			if (acerto == palavra.length()) {
				System.out.print("VOC� GANHOU!!!\n"
						+ "A palavra �: " + palavra);
				break;
			} else if (erro == 6) {
				System.out.println("VOC� PERDEU!!!");
				break;
			}
		}// fim do while
		
		
	}
	public static String sub(String palavra) {
		String sublin = "";
		for (int i = 0; i < palavra.length(); i++) {
			System.out.print("_ ");
			}
		return sublin;
	}
	public static String desenho(int erro) {
		String des = "";
		switch (erro) {
		case 1:
			des = ("  ______\r\n" + " |      |\r\n" + " |      O\r\n" + " |     \r\n" + " |     \r\n" + " |\r\n"
					+ " |	\r\n" + "_|___");
			break;
		case 2:
			des = ("  ______\r\n" + " |      |\r\n" + " |      O\r\n" + " |      |\r\n" + " |     \r\n" + " |\r\n"
					+ " |	\r\n" + "_|___");
			break;
		case 3:
			des = ("  ______\r\n" + " |      |\r\n" + " |      O\r\n" + " |      |\\\r\n" + " |     \r\n" + " |\r\n"
					+ " |	\r\n" + "_|___");
			break;
		case 4:
			des = ("  ______\r\n" + " |      |\r\n" + " |      O\r\n" + " |     /|\\\r\n" + " |     \r\n" + " |\r\n"
					+ " |	\r\n" + "_|___");
			break;
		case 5:
			des = ("  ______\r\n" + " |      |\r\n" + " |      O\r\n" + " |     /|\\\r\n" + " |     /\r\n" + " |\r\n"
					+ " |	\r\n" + "_|___");
			break;
		case 6:
			des = ("  ______\r\n" + " |      |\r\n" + " |      O\r\n" + " |     /|\\\r\n" + " |     /\\\r\n" + " |\r\n"
					+ " |	\r\n" + "_|___");
			break;
		}
		return des;
	}

}