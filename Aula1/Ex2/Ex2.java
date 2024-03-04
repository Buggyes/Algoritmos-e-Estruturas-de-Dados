package Ex2;
import java.util.Scanner;

public class Ex2 {

	private static void printStringArray(String[] arr) {
		System.out.println("=====================================================");
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i].equals(""))) {
				System.out.println((i + 1) + "- " + arr[i]);
			}
		}
		System.out.println("=====================================================");
	}

	public static void main(String[] args) {
		boolean quit = false;
		Scanner scan = new Scanner(System.in);
		String[] nomes = new String[10];
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = "";
		}
		while (quit == false) {
			int opt = 0;
			System.out.println("\n1- Cadastrar;");
			System.out.println("2- Listar todos os nomes;");
			System.out.println("3- Alterar");
			System.out.println("4- Remover");
			System.out.println("5- Finalizar");
			opt = scan.nextInt();
			scan.nextLine();

			switch (opt) {
				case 1:
					System.out.println("Digite o nome a ser cadastrado:"); {
					String input = scan.nextLine();
					boolean written = false;
					for (int i = 0; i < nomes.length; i++) {
						if (nomes[i].equals("")) {
							nomes[i] = input;
							written = true;
							break;
						}
					}
					if(written){
						System.out.println("Cadastro efetuado com sucesso!");
						break;
					}
					System.out.println("Não foi possível cadastrar o nome.");
					System.out.println("O array está cheio!");
				}
					break;
				case 2:
					printStringArray(nomes);
					break;
				case 3:
					printStringArray(nomes);
					System.out.println("Digite o número do nome que deseja alterar:"); {
					do {
						int num = scan.nextInt();
						if (num >= 1 && num <= 10) {
							num--;
							System.out.println("Digite o novo nome:");
							String novoNome = scan.nextLine();
							nomes[num] = novoNome;
							System.out.println("Alteração concluída!");
							break;
						} else {
							System.out.println("Opção inválida!");
							continue;
						}
					} while (true);
				}
					break;
				case 4:
					printStringArray(nomes);
					System.out.println("Digite o número do nome que deseja remover:"); {
					do {
						int num = scan.nextInt();
						if (num >= 1 && num <= 10) {
							num--;
							nomes[num] = "";
							System.out.println("Remoção concluída!");
							break;
						} else {
							System.out.println("Opção inválida!");
							continue;
						}
					} while (true);
				}
					break;
				case 5:
					quit = true;
					break;
				default:
				System.out.println("Opção inválida!");
					break;
			}
		}
		scan.close();
	}
}
