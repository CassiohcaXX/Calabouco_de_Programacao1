import java.util.Scanner;

class Login{

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String realLogin, login;
		int realSenha, senha;
		boolean cont;

		realLogin = "Cassiohca";
		realSenha = 93166539;
		cont = true;
		
		while(cont){

			System.out.println("Digite seu login: ");
			login = ler.next();

			System.out.println("Digite sua senha: ");
			senha = ler.nextInt();

			if(login.equals(realLogin) && senha == realSenha){
				
				System.out.println("Usuário "+ login + " logou com sucesso.");
				cont = false;

			}else{

				System.out.println("Usuário ou senha incorretos. Tente novamente: \n");

			}
		}	

	}
}