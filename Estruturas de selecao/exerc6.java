import java.util.Scanner;

/*
	Um vendedor tem seu salário calculado em função do valor total de suas vendas. Esse cálculo é feito de acordo com o 
	seguinte critério: se o valor total de suas vendas for maior que R$20.000,00, o vendedor receberá como salário 10% do 
	valor das vendas. Caso contrário, receberá apenas 7,5% do valor das vendas. Escrever um programa que determine o valor 
	ganho pelo vendedor.
*/

public class exerc6{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in); //instanciação do objeto "entrada" da classe padrão Scanner

		//declaracao das variaveis
		Double vendas, salario;	

		//definiçao e tratamento de excessao da variavel "vendas"
		System.out.println("Digite o valor das vendas");
		vendas = entrada.nextDouble();
		if(vendas < 0){
			while(vendas < 0){
				System.out.println("Digite um valor válido de vendas");
				vendas = entrada.nextDouble();
			}
		}
		
		//definicao do valor do salario de acordo com a escessao
		if(vendas > 20000){
			salario = (vendas * 10)/100;
		}else
			salario = (vendas * 7.5)/100;

		//saida de dados	
		System.out.println(salario);	
	}
}