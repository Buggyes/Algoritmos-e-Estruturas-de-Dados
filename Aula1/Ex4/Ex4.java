package Ex4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        boolean quit = false;
        Scanner scan = new Scanner(System.in);
        Queue<String> atendimentos = new LinkedList<String>();// inicializando fila
        while (quit == false) {
            System.out.println("\n1- Cadastrar atendimento;");
            System.out.println("2- Remover atendimento;");
            System.out.println("3- Encerrar o sistema.");
            int opt = scan.nextInt();
            scan.nextLine();
            switch (opt) {
                case 1:
                    System.out.println("Informe o nome da pessoa:");
                    String nome = scan.nextLine();
                    atendimentos.add(nome);
                    System.out.println(nome + " foi adicionado(a) na fila de atendimento.");
                    break;
                case 2:
                    if(atendimentos.size() == 0){
                        System.out.println("Não existem pessoas na fila de atendimento!");
                        break;
                    }
                    System.out.println(atendimentos.remove() + " foi removido(a) da fila de atendimento.");
                    break;
                case 3:
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
