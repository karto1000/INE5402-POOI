import java.util.Scanner;
/*
Elabore um programa que, dada a idade de uma pessoa, informe se esta é criança, adolescente ou adulto. 
Considere as faixas etárias conforme a seguir: 
	A. Idade até 12 anos: Criança 
	B. Idade maior que 12 e menor que 18 anos: Adolescente 
	C. Idade maior ou igual a 18 anos: Adulto
*/

public class exerc1{
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in); //Intanciação do objeto "entrada" da classe padrão Scanner

		int idade ; //declaração das variaveis

		System.out.println("Digite a idade: ");
		idade = entrada.nextInt();

		if(idade <= 0){  //tratamento de excessão da  variavel idade
			while(idade <= 0){
				System.out.println("Digite uma idade válida");
				idade = entrada.nextInt();
			}
		}

		if(idade <= 12 ) ///verificação da idade e posteriormente exibição da classificação da idade dada pelo usuario
			System.out.println("Criança");
		else
			if (idade >= 18)
				System.out.println("Adulto");
			else
				System.out.println("Adolescente");
	}
}