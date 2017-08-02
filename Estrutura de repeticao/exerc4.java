import java.util.Scanner;

/*
	Utilizando o comando Repita, reescreva o seguinte algoritmo para executar 10 vezes: 
	dada a idade de uma pessoa, informe se esta é criança, adolescente ou adulto. Considere as
	faixas etárias conforme a seguir:

		a) Idade até 12 anos:Criança
		b) Idade maior que 12 e menor que 18 anos:Adolescente
		c) Idade maior ou igual a 18 anos:Adulto
*/

public class exerc4{
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);

		int contador = 0, idade;

		do{
			System.out.println("Digite uma idade");
			idade = entrada.nextInt();

			if(idade <= 0 || idade > 125){
				while(idade <= 0 || idade > 125){
					System.out.println("Digite uma idade válida");
					idade = entrada.nextInt();
				} 
			}
			if(idade <= 12){
				System.out.println("Criança");
			}else
				if(idade >= 18){
					System.out.println("Adulto");
				}else
					System.out.println("Adolescente");

			contador++;

		}while(contador <=10);
	}
	
}