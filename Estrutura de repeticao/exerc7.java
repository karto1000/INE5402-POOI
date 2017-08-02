import java.util.Scanner;

/*
	Revisitar o algoritmo que, a partir de uma idade digitada
	pelo usuário, informa se a pessoa é “criança”, “adolescente” ou “adulta”. 
	Usar o comando Para-Faça.

*/

public class exerc7 {
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);

		int numeroPessoas, idade;

		System.out.println("Digite o numero de pessoas");
		numeroPessoas = entrada.nextInt();
		if(numeroPessoas < 0){
			while(numeroPessoas < 0){
				System.out.println("Digite um numero válido de pessoa: ");
				numeroPessoas = entrada.nextInt();
			}
		}

		for(int i = 0; i < numeroPessoas; i++){
			System.out.println("Digite o valor da idade: ");
			idade = entrada.nextInt();
			if(idade < 0 || idade > 125){
				while(idade < 0 || idade > 125){
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
		}

	}
}