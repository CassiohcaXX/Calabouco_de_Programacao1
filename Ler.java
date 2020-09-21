import java.util.Scanner;
class Ler{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;

		System.out.println("Escreva seu nome: ");
		nome = ler.next();

		System.out.println("Escreva sua idade: ");
		idade = ler.nextInt();

		System.out.println(nome+" tem "+ idade+ " anos.");

	}
}