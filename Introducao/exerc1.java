import java.util.Scanner;

/*Considerando o exemplo da classe Triangulo, escrever um trecho de código que aumenta em duas vezes a área calculada	
*/

public class exerc1{
	public static void main (String args[]){

		Scanner entrada = new Scanner(System.in); //definição do objeto "entrada" da classe padrão Scanner

		double base, altura, area; //declaração das variaveis

		System.out.println("Digite o valor da base: "); //definição e tratamento da variável "base"
		base = entrada.nextDouble();
		if(base <= 0){
			while(base < 0){
				System.out.println("Digite um valor válido para a base");
				base = entrada.nextDouble();
			}
		}

		System.out.println("Digite o valor da altura: "); //definição e tratamento de excessão da variável "altura"
		altura = entrada.nextDouble();
		if(altura <= 0){
			while(altura <= 0){
				System.out.println("Digite um valor válido para a altura");
				altura = entrada.nextDouble();
			}
		}

		area = (base * altura)/2; //calculo da área

		System.out.println("O valor da área é: " + area); //mostra o resultado do calculo da área

	}
}