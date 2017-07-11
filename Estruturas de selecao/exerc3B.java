import java.util.Scanner;

/*Se o desconto for menor que 25% e o preço do produto for
maior que R$25000,00, então mostre o nome do produto.
*/

public class exerc3B{
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);  //definicao do objeto "entrada" na classe padra Scanner

		//declaracao das variaveis
		double preco;
		String nomeDoProduto;
		int desconto;

		System.out.println("Digite o valor do produto: ");
		preco = entrada.nextDouble();

		System.out.println("Digite o valor do desconto a ser aplicado");
		desconto = entrada.nextInt();

		System.out.println("Digite o nome do produto: ");
		nomeDoProduto = entrada.next();

		
		//teste da condição de validade das variaveis
		if((desconto < 25) && (preco > 2500)){
			System.out.println("O nome do produto é: "nomeDoProduto);
		}
	}
}