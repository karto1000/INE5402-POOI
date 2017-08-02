import java.util.Scanner;
/*
	Refazer o algoritmo que calcula a área de um triângulo usando o comando 
	enquanto-faça. Solicite ao usuário o número de triângulos.
*/
public class exerc1{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		Double base, altura, area;
		int numeroTriangulos;

		System.out.println("Digite o número de triangulos a serem calculados");
		numeroTriangulos = entrada.nextInt();

		if(numeroTriangulos <= 0){
			while(numeroTriangulos <= 0){
				System.out.println("Digite um número válido de triangulos");
				numeroTriangulos = entrada.nextInt();
			}
		}

		while(numeroTriangulos > 0){
			numeroTriangulos--;

			System.out.println("Digite o valor da base: ");
			base = entrada.nextDouble();

			System.out.println("Digite o valor da altura: ");
			altura = entrada.nextDouble();
			area = (base*altura)/2;

			System.out.println("O valor da área calculada do triangulo é: ");
			System.out.println(area);
			System.out.println(" ");
		}

	}
}