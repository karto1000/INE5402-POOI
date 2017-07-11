import java.util.Scanner;
/*
	Elabore um programa que, para um número inteiro positivo N, determine se esse número é par ou não.
*/
public class exerc2{
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);

		int N;

		System.out.println("Digite o valor de N: "); //instanciação do valor de N e tratamento dessa variável
		N = entrada.nextInt();
		if(N <= 0){
			while(N <= 0){
				System.out.println("Digite um valos válido para N ");
				N = entrada.nextInt();
			}
		}

		if(N % 2 == 0){ //verificação se é um numero par ou ímpar
			System.out.println("É um número par");
		}else
			System.out.println("É um número ímpar");

	}
}