package questao1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* A �rea de um campo de futebol � de X metros quadrados. Usando a classe 
		ConversaoDeUnidadesDeArea (letra a), escreva um programa em Java que leia do 
		teclado a �rea x em metros quadrados e depois mostre(na tela de um computador) 
		qual � a �rea de um campo de futebol em p�s quadrados, acres e cent�metros 
		quadrados. Escreva m�todos adicionais para a classe
		*/
		
		String texto;
		double numero;
		
		ConversaoDeUnidadesDeArea Conversor = new ConversaoDeUnidadesDeArea();
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Entre com o valor desejado em metros");
		texto = scanner.next(); 
		numero = Double.parseDouble(texto);
		scanner.close();
		
		System.out.println("Em p�s quadrados: " + Conversor.MetroQuadradoParaPeQuadrado(numero));
		System.out.println("Em acres: " + Conversor.MetroQuadradoParaAcre(numero));
		System.out.println("Em centimetros: " + Conversor.MetroQuadradoParaCentimetrosQuadrado(numero));
		
	}

}
