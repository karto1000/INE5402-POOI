import java.util.Scanner;

/*
	Escreva o comando de seleção para cada uma das situações a seguir:

	A. Se X for maior que Y ou se Z for menor ou igual a 30, multiplique X por 2. Caso contrário, divida X por 2 e divida Z por 5;

	B. Se o desconto for menor que 25% e o preço do produto for maior que R$25000,00, então mostre o nome do produto.
*/

public class exerc3A{
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);

		Double numberX, numberY, numberZ;

		System.out.println("Digite o valor de X: ");
		numberX = entrada.nextDouble();
		System.out.println("Digite o valor de Y: ");
		numberY = entrada.nextDouble();
		System.out.println("Digite o valor de Z: ");
		numberZ = entrada.nextDouble();

		if((numberX > numberY) || (numberZ <= 30)){
			numberX = numberX * 2;
		}else{
			numberX = numberX / 2;
			numberZ = numberZ / 5; 
		}
		System.out.println("O valor de X é: " + numberX);
		System.out.println("O valor de Y é: " + numberY);
		System.out.println("O valor de Z é: " + numberZ);

	}

}	