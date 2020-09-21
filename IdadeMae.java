import java.util.Scanner;
class IdadeMae{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade, idadeMae, dif;

		System.out.println("Escreva a sua idade: ");
		idade = ler.nextInt();

		System.out.println("Escreva a idade de sua Mãe: ");
		idadeMae = ler.nextInt();

		dif = (idadeMae - idade);

		System.out.println("Sua mãe é "+ dif + " anos luz mais velha do que você.");


	}
}
