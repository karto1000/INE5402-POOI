package exerc9;
import java.util.Scanner;
public class exerc9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
//---------------Declaracao da variaveis------------------------
		float idade;
		
//---------------Entrada de dados--------------------------------

		idade = entrada.nextInt();
		
//---------------Processamento-----------------------------------

		if(idade <= 0){
			System.out.println("Digite uma idade válida");
		}
		else{ 
			if(idade <= 12){
			System.out.println("Criança");
			}
			else{	
				if(18 <= idade){
				System.out.println("Adulto");
				}
				else { 
					System.out.println("Adolescente");
				}
			}
		}
		
		entrada.close();
		
	}//fim do metodo main
	
}//fim do programa

