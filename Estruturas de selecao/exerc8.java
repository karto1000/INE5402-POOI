import java.util.Scanner;

/*
	A empresa local de abastecimento de água, a Saneamento Básico da Cidade (SBC), está promovendo uma campanha de conservação de água,
	distribuindo cartilhas e promovendo ações demonstrando a importância da água para a vida e para o meio ambiente. Para incentivar 
	mais ainda a economia de água, a SBC alterou os preços de seu fornecimento de forma que, proporcionalmente, aqueles clientes que 
	consumirem menos água paguem menos pelo metro cúbico. Todo cliente paga mensalmente uma assinatura de R$7,00, que inclui uma 
	franquia de 10 m 3 de água. Isto é, para qualquer consumo entre 0 e 10 m 3 , o consumidor paga a mesma quantia de R$7,00 reais
	(note que o valor da assinatura deve ser pago mesmo que o consumidor não tenha consumido água). Acima de 10 m 3 , cada metro cúbico
	 subsequente tem um valor diferente, dependendo da faixa de consumo. A SBC cobra apenas por quantidades inteiras de metros cúbicos 
	 consumidos. A tabela abaixo especifica o preço por metro cúbico para cada faixa de consumo:

	Faixa de consumo(m3)-------------------Preço(por m3)
	até 10----------------------------incluído na franquia;
	11 a 30---------------------------R$ 1,00;
	31 a 100--------------------------R$ 2,00;
	101 em diante---------------------R$ 5,00;

	Assim, por exemplo, se o consumo foi de 120 m3 , o valor da conta é:

	7 reais da assinatura básica;
	20 reais pelo consumo no intervalo 11 a 30 m 3 ;
	140 reais pelo consumo no intervalo 31 a 100 m 3 ;
	100 reais pelo consumo no intervalo 101 a 120 m 3 .
	Logo o valor total da conta de água é R$ 267,00.

	Escreva um programa que, dado o consumo de uma residência em m^3 , calcula o valor da conta de água daquela residência.
	Entrada: A única linha da entrada contém um único inteiro N,indicando o consumo de água da residência, em m3 (0 ≤ N ≤ 103).
	Saída: Seu programa deve escrever uma única linha, contendo o valor da conta de água da residência.

	Restrições: 0 ≤ N ≤ 1000
	

*/

public class exerc8{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in); //instanciação do objeto "entrada" da classe padrao Scanner

		//declaracao das variaveis
		Double N, contaAgua;	

		//instanciação da variavel "N" e tratamento de excessão dela
		System.out.println("Digite o valor do N de água");
		N = entrada.nextDouble(); 
		if(N < 0 || N > 1000){
			while(N < 0 || N > 1000){
				System.out.println("Digite um valor válido de N");
				N = entrada.nextDouble();
			}
		}

		//Definicao do valor da conta de agua de acordo com a tabela de N definida pelo exercicio
		if(N <= 10){
			contaAgua = 7.0;
		}else 
			if(10 < N && N <= 30){
				contaAgua = 7 + (N - 10);
			}else
				if(30 < N && N <= 100){
					contaAgua = 7 + 20 + ((N - 30) * 2);
				}else{
					contaAgua = 7 + 20 + 140 + ((N - 100) * 5);
				}
				
		//saida de dados
		System.out.println("O valor da conta de água é: " + contaAgua);		

	}
}


