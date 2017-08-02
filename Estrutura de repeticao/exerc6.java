import java.util.Scanner;

/*

	Revisitar o algoritmo que calcula a área de um triângulo usando o comando Para-Faça.

*/

public class exerc6{
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);

		int numeroTriangulos;
		double base, altura, area;

		System.out.println("Digite o numero de triângulo a serem calculados: ");
		numeroTriangulos = entrada.nextInt();

		if(numeroTriangulos < 0){
			while(numeroTriangulos < 0){
				System.out.println("Digite um número válido de triagulos");
				numeroTriangulos = entrada.nextInt();
			}
		}

		for(int i = 0; i < numeroTriangulos; i++){
			System.out.println("Digite o valor da base: ");
			base = entrada.nextDouble();
			System.out.println("Digite o valor da altura: ");
			altura = entrada.nextDouble();
			area = (base * altura)/2;

			System.out.println("A área calculada é: " + area);
			System.out.println("");
		}
	}
}