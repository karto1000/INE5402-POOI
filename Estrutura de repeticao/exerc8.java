import java.util.Scanner;

/*
	Reescreva o algoritmo para determinar o melhor aluno da turma (Usar o comando Para-Faça). 
	Será informado pelo usuário:

		a) Número de alunos;
		b) Nome de cada aluno;
		c) Nota do aluno (entre 0 e 10).
		
*/
public class exerc8{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		//declaração das variaveis
		int numeroAlunos, contador = 0;
		double nota, maiorNota = 0;
		String nome, nomeMelhorAluno = " ";
	
		//definição do numero de alunos a serem verificados
		System.out.println("Digite o numero de alunos: ");
		numeroAlunos = entrada.nextInt();
		
		//controle para que o numero de alunos não seja um valor inválido
		if(numeroAlunos < 0){
			while (numeroAlunos < 0){
				System.out.println("Digite um numero válido de alunos");
				numeroAlunos = entrada.nextInt();
			}
		}

		//laço para comparar os valores e definir o aluno com a maior nota
		for(int i = 0; i < numeroAlunos; i++){

			contador ++;

			System.out.println("Digite o nome do aluno: ");
			nome = entrada.next();
			System.out.println("Digite a nota do aluno: ");
			nota = entrada.nextDouble();

			if(nota > maiorNota || contador == 0){ //compara a maior nota com a nota dada
				maiorNota = nota;
				nomeMelhorAluno = nome;
			}

		}
		
		//saida de dados
		System.out.println("O melhor aluno foi " + nomeMelhorAluno + " com a nota " + maiorNota);

	}
}
