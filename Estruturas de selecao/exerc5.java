import java.util.Scanner;

/*
	Uma empresa de vendas oferece para seus clientes um desconto que é função do valor da compra do cliente.
	Esse desconto é de 20% se o valor da compra for maior ou igual a R$ 5000,00 e 15% se for menor. 
	Faça um programa para imprimir o valor da compra e o desconto obtido por um determinado cliente.
*/

public class exerc5{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in); //instanciação do objeto entrada da classe padrão Scanner

		//declaração das variáveis
		Double valorCompra;
		boolean desconto20 = false;
		boolean desconto15 = false;

		System.out.println("Digite o valor da compra: ");
		valorCompra = entrada.nextDouble();

		//verificação do valor da compra e aplicação do desconto
		if(valorCompra >= 5000){
			valorCompra = valorCompra - ((valorCompra * 20)/100);
			desconto20 = true;
		}else{
			valorCompra = valorCompra - ((valorCompra * 15)/100);
			desconto15 = true;
		}

		//saida do valor da compra com a aplicação do desconto
		System.out.println(valorCompra);

		if(desconto20 == true)
			System.out.println("O valor do desconto foi de 20%");
		if(desconto15 == true)
			System.out.println("O valor do desconto foi de 15%");
	}
}
