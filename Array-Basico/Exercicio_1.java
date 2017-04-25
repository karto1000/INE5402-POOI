package exerc25;
import java.util.Scanner;

public class exerc25 {

/*
 *A partir de uma certa quantidade de notas dada, implementar métodos que:
 *a)  Retorna a maior nota;
 *b)  Retorna a menor nota.
 *c)  Retorna a diferença entre a maior e a menor nota.
 *
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
//----------------Decalracao das variaveis------------------------------
		
		float maiorNota = 0, menorNota = 0, diferencaMaiorMenor,nota;
		int numeroNotas;
		
//---------------Definição do tamanho do Array--------------------------
		
		System.out.println("Digite o número de notas: ");
		numeroNotas = entrada.nextInt();
		
		if (numeroNotas <= 0){
			
			while (numeroNotas <= 0){
				System.out.println("Digite um número de notas válido");
				numeroNotas = entrada.nextInt();
			}
		}
		
//---------------Declaração vetorNotas----------------------------------
		
		float [] vetorNotas = new float [numeroNotas];
		
//---------------Instanciacao vetorNotas--------------------------------
		
		for(int i = 0; i < vetorNotas.length; i++){
		
			System.out.println("Digite a nota: ");
			
			nota = entrada.nextFloat();
			
			vetorNotas[i] = nota;
		
			if (nota > maiorNota || i== 0 ){
				maiorNota = nota;
			}
			if (nota < menorNota || i==0){
				menorNota = nota;
			}
		}
		diferencaMaiorMenor = maiorNota - menorNota;
		
//---------------Saida de dados-----------------------------------------
		
		System.out.println("A maior nota é: " + maiorNota);
		
		System.out.println("A menor nota é: " + menorNota);
		
		System.out.println("A diferença da maior e menor nota é: " +diferencaMaiorMenor);
	
		entrada.close();
		
	}//fim do metodo main
	
}//fim so programa
