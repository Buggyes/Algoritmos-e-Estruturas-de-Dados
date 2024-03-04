import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		boolean quit = false;
		Scanner scan = new Scanner(System.in);
		String[] nomes = new String[10];
		for(String str : nomes) {
			str = "";
		}
		while(quit == false) {
			int opt = 0;
			System.out.println("1- Cadastrar;");
			System.out.println("2- Listar todos os nomes;");
			System.out.println("3- Alterar");
			System.out.println("4- Remover");
			System.out.println("5- Finalizar");
			opt = scan.nextInt();
			
			switch(opt) {
			case 1:
				break;
			case 2:
				for(int i = 0; i < nomes.length; i++) {
					if(!(nomes[i].equals(""))) {
						System.out.println((i+1)+"- "+nomes[i]);
					}
				}
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				quit = true;
				break;
			default:
				break;
			}
		}
	}
}
