import java.util.Scanner;
/*
	Considere que o último concurso vestibular apresentou três provas: Português, Matemática e Conhecimentos Gerais.
	Considerando que para um candidato tem-se um registro contendo o seu nome e as notas obtidas em cada uma das provas,
	implementar um programa que forneça: 
	A. O nome e as notas em cada prova do candidato;
	B. A média do candidato;
	C. Uma informação dizendo se o candidato foi aprovado ou não. Considere que o candidato é aprovado se sua média for 
	maior que 5.0 e se não apresentou nenhuma nota abaixo de 4.0
*/
public class exerc7{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in); //instanciação do objeto "entrada" da classe padrão Scanner

		//declaracao das vvariaveis
		Double portugues, matematica, conhecimentosGerais, media;
		String nome;
		boolean aprovado = false;

		//instanciação do atributo "nome"
		System.out.println("Digite o nome do aluno: ");
		nome = entrada.next();

		//instanciação e tratamento de excessão da variavel "portugues"
		System.out.println("Digite a nota de Portugues: ");
		portugues = entrada.nextDouble();
		if(portugues < 0){
			while(portugues < 0){
				System.out.println("Digite uma nota válida: ");
				portugues = entrada.nextDouble();				
			}
		}
		
		//instanciação e tratamento de excessão da variavel "matematica"	
		System.out.println("Digite a nota de Matemática: ");
		matematica = entrada.nextDouble();
		if(matematica < 0 ){
			while(matematica < 0){
				System.out.println("Digite uma nota válida");
				matematica = entrada.nextDouble();
			}
		}

		//instanciação e tratamento de excessão da variavel "conhecimentosGerais"
		System.out.println("Digite a nota de Conhecimentos Gerais: ");
		conhecimentosGerais = entrada.nextDouble();
		if(conhecimentosGerais < 0){
			while(conhecimentosGerais < 0){
				System.out.println("Digite uma nota válida");
				conhecimentosGerais = entrada.nextDouble();

			}
		}

		//calculo da media do aluno
		media = (portugues + matematica + conhecimentosGerais)/3;

		//verificação se foi aprovado ou não
		if((media > 5) && (portugues > 4) && (matematica > 4) && (conhecimentosGerais > 4)){
			System.out.println("O aluno foi aprovado");
		}else{
			System.out.println("O aluno foi reprovado");
		}

		//saida de informações
		System.out.println("O nome do aluno é: " + nome);
		System.out.println("A nota de Português é: " + portugues);
		System.out.println("A nota de Matematica é: " + matematica);
		System.out.println("A nota de Conhecimentos Gerais é: " + conhecimentosGerais);
		System.out.println("A média do aluno é: " + media);

		}
}