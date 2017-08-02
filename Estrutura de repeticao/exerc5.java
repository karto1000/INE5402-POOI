import java.util.Scanner;
/*
	Escreva um algoritmo para determinar o melhor aluno da turma. Será informado pelo usuário:

	a) Número de alunos;
	b) Nome de cada aluno;
	c) Nota do aluno (entre 0 e 10).

*/
public class exerc5{
	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);

		String nome, nomeMelhorAluno = " ";
		int numeroAlunos, contador = 0;
		double nota, maiorNota = 0;


		System.out.println("Digite o número de alunos: ");
			numeroAlunos = entrada.nextInt();
			if(numeroAlunos < 0){
				while(numeroAlunos < 0){
					System.out.println("Digite um número de alunos válido: ");
					numeroAlunos = entrada.nextInt();
				}
			}

		do{
			contador ++;

			System.out.println("Digite o nome do aluno: ");
			nome = entrada.next();
			System.out.println("Digite a nota do aluno: ");
			nota = entrada.nextDouble();

			if(nota > maiorNota || contador == 0){
				maiorNota = nota;
				nomeMelhorAluno = nome;
			}

		}while(contador < numeroAlunos);

		System.out.println("O melhor aluno foi " + nomeMelhorAluno + " com a nota " + maiorNota);
	
	}

}