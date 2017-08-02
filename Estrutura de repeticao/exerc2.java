import java.util.Scanner;

/*Utilizando o comando enquanto-faça, reescreva o seguinte algoritmo para executar 10 vezes: 
dada a idade de uma pessoa, informe se esta é criança, adolescente ou adulto. Considere as 
faixas etárias conforme a seguir:

a) Idade até 12 anos: Crianca;
b) Idade maior que 12 e menor que 18 anos: Adolescente;
c) Idade maior ou igual a 18 anos:Adulto;
*/

public class exerc2{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in); //declaração do objeto "entrada" da classe padrão Scanner

		int idade, contador = 0;

		while(contador <= 10){
			System.out.println("Digite a idade a ser verificada: ");
			idade = entrada.nextInt();

			if (idade <= 0|| idade > 125){
				while(idade <= 0 || idade > 125){
					System.out.println("Digite uma idade válida");
					idade = entrada.nextInt();
				}
			}else

				if(idade <= 12){
					System.out.println("Crianca");
					System.out.println("");
				}else
					if(idade >= 18){
						System.out.println("Adulto");
						System.out.println("");
					}else
						System.out.println("Adolescente");
						System.out.println("");

			contador++;			
		}


	}
}