package exerc26;

import java.util.Scanner;

public class exerc26 {

	/*
	 * 
	 * Faça um programa que leia uma série de números
	 * inteiros e os armazene em um array. Em seguida, o
	 * programa deve determinar se nessa série de valores
	 * aparece algum valor repetido.
	 *
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

//---------------Declaracao das variaveis-------------------------
		
		int elemento, tamanhoVetor;
		boolean repete = false;
		
//---------------Definiçao do tamanho do array--------------------
		
		System.out.println("Digite o numero de valores a serem colocados: ");

		tamanhoVetor = entrada.nextInt();

		if(tamanhoVetor <= 0){

			while (tamanhoVetor <= 0){

				System.out.println("Digite um número válido");

				tamanhoVetor = entrada.nextInt();
			}
		}

//---------------Declaracao do array-------------------------------
		
		int[] vetorInt = new int[tamanhoVetor];

		for(int i = 0; i < vetorInt.length; i++){
			System.out.println("Digite o valor a ser armazenado: ");

			elemento = entrada.nextInt();

			vetorInt[i] = elemento;

		}

	//Procura se o número atual já existe antes nele mesmo
		for (int i = 0; i < vetorInt.length;i++)
			
			for(int j = 0; j < i; j++){
				
				if (vetorInt[i] == vetorInt[j]){
					repete = true;

				}
			}
//---------------Saída de dados-----------------------------------
		
		if(repete){
			System.out.println("Há repetições");

		}else{
			System.out.println("Não há repetições");
		}
		
		entrada.close();

	}// fim do metodo main

}//fim do programa
