import java.util.Scanner;

/*
	Refazer o algoritmo que calcula a área de um triângulo usando o comando Repita.
	Solicite ao usuário o número de triângulos.
	
*/

public class exerc3{
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);

		int numeroTriangulos, contador = 0;
		double base, altura, area;

		System.out.println("Digite o número de triangulos a serem calculados: ");
		numeroTriangulos = entrada.nextInt();

		if(numeroTriangulos < 0){
			while(numeroTriangulos < 0){
				numeroTriangulos = entrada.nextInt();
			}
		}


		do{
			System.out.println("Digite o valor da base: ");
			base = entrada.nextDouble();

			System.out.println("Digite o valor da altura: ");
			altura = entrada.nextDouble();

			area = (base * altura)/2;

			System.out.println("O valor da área calcula é: " + area);
			System.out.println("");


			contador++;

		}while(contador < numeroTriangulos);

	}
}