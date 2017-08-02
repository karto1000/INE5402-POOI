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

		
		int numeroAlunos, contador = 0;
		double nota, maiorNota = 0;
		String nome, nomeMelhorAluno = " ";
	
		System.out.println("Digite o numero de alunos: ");
		numeroAlunos = entrada.nextInt();

		if(numeroAlunos < 0){
			while (numeroAlunos < 0){
				System.out.println("Digite um numero válido de alunos");
				numeroAlunos = entrada.nextInt();
			}
		}

		for(int i = 0; i < numeroAlunos; i++){

			contador ++;

			System.out.println("Digite o nome do aluno: ");
			nome = entrada.next();
			System.out.println("Digite a nota do aluno: ");
			nota = entrada.nextDouble();

			if(nota > maiorNota || contador == 0){
				maiorNota = nota;
				nomeMelhorAluno = nome;
			}

		}

		System.out.println("O melhor aluno foi " + nomeMelhorAluno + " com a nota " + maiorNota);

	}
}