import java.util.Scanner;

/*
	Escreva um programa que, para um determinado valor, informe se este é positivo, negativo ou zero.
*/

public class exerc4{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		Double valor;

		//instanciação do valor a ser testado
		System.out.println("Digite o valor a ser verificado: ");
		valor = entrada.nextDouble();


		if(valor > 0) //verifica se é positivo
			System.out.println("O valor é positivo");
		else
			if (valor < 0) //verifica se é negativo
				System.out.println("O valor é negativo");
			else //cai aqui se for nulo
				System.out.println("O valor é zero");
	}
}