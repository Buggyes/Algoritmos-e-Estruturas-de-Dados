package Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
    private static void printArray(List<Produto> arr) {
        System.out.println("\n===============================");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Produto: " + arr.get(i).getNome());
            System.out.println("Preço (R$): " + arr.get(i).getValor());
            System.out.println("===============================");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        List<Produto> produtos = new ArrayList<Produto>();
        while (quit == false) {
            System.out.println("\n1- Cadastro");
            System.out.println("2- Listagem");
            System.out.println("3- Pesquisa");
            System.out.println("4- Alterar");
            System.out.println("5- Remover");
            System.out.println("6- Finalizar");
            int opt = scan.nextInt();
            scan.nextLine();

            switch (opt) {
                case 1: {
                    System.out.println("\nDigite o nome do produto:");
                    String nome = scan.nextLine();
                    System.out.println("Digite o preço do produto:");
                    double valor = scan.nextDouble();
                    scan.nextLine();
                    produtos.add(new Produto(nome, valor));
                }
                    break;
                case 2:
                    printArray(produtos);
                    break;
                case 3: {
                    boolean found = false;
                    System.out.println("Digite um termo:");
                    String termo = scan.nextLine();
                    for (Produto produto : produtos) {
                        if (produto.getNome().contains(termo)) {
                            System.out.println("Produto: " + produto.getNome());
                            System.out.println("Preço (R$): " + produto.getValor());
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Não foi possível encontrar um produto com este termo.");
                    }
                }
                    break;
                case 4: {
                    boolean found = false;
                    System.out.println("Digite o nome do produto");
                    String nome = scan.nextLine();
                    for (int i = 0; i < produtos.size(); i++) {
                        if (produtos.get(i).getNome().equals(nome)) {
                            found = true;
                            System.out.println("Digite o novo nome do produto:");
                            String novoNome = scan.nextLine();
                            System.out.println("Digito o novo preço do produto:");
                            double novoPreco = scan.nextDouble();
                            scan.nextLine();
                            produtos.get(i).setNome(novoNome);
                            produtos.get(i).setValor(novoPreco);
                            break;
                        }
                    }
                    if (found == false) {
                        System.out.println("Não foi encontrado nenhum produto \"" + nome + "\"");
                    }
                }
                    break;
                case 5:
                    boolean found = false;
                    System.out.println("Digite o nome do produto");
                    String nome = scan.nextLine();
                    for (int i = 0; i < produtos.size(); i++) {
                        if (produtos.get(i).getNome().equals(nome)) {
                            found = true;
                            produtos.remove(i);
                            System.out.println("Remoção efetuada com sucesso!");
                            break;
                        }
                    }
                    if (found == false) {
                        System.out.println("Não foi encontrado nenhum produto \"" + nome + "\"");
                    }
                    break;
                case 6:
                    System.out.println("Finalizando a aplicação...");
                    quit = true;
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
        scan.close();
    }
}
