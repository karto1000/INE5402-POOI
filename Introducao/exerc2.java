import java.util.Scanner;

/*
	Faça um algoritmo que calcule a área de um círculo. A equação que representa este cálculo é: A = π r^2

	**π = 3,1415
*/

public class exerc2{
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		Double area, raio;

		System.out.println("Digite o valor do raio: ");
		raio = entrada.nextDouble();
		if(raio <= 0){
			while (raio <= 0){
				System.out.println("Digite um valor válido para o raio");
				raio = entrada.nextDouble();
			}
		}

		area = 3.1415 * (raio * raio);

		System.out.println("A area calculada é " + area);
	}
}