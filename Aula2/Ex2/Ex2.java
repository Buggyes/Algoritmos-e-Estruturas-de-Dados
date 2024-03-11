package Aula2.Ex2;

import java.util.Scanner;
import java.util.Vector;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean quitApp = false;
        Vector<String> users = new Vector<String>(5, 5);
        while (quitApp != true) {
            System.out.println("\n1- Cadastrar");
            System.out.println("2- Mostrar todos os registros");
            System.out.println("3- Pesquisar");
            System.out.println("4- Modificar");
            System.out.println("5- Remover");
            int opt = scan.nextInt();
            scan.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("\nDigite o nome do usuário"); {
                    String user = scan.nextLine();
                    boolean repeated = false;
                    for (String str : users) {
                        if (str.equals(user)) {
                            repeated = true;
                            break;
                        }
                    }
                    if (repeated) {
                        System.out.println("Este usuário já existe!");
                    } else {
                        users.add(user);
                        System.out.println("Cadastro feito com sucesso!");
                    }
                }
                    break;
                case 2:
                    System.out.println("\nUsuários:");
                    for (int i = 0; i < users.size(); i++) {
                        System.out.println((i + 1) + "- " + users.get(i));
                    }
                    break;
                case 3:
                    System.out.println("\nDigite um termo:"); {
                    String term = scan.nextLine();
                    boolean found = false;
                    for (int i = 0; i < users.size(); i++) {
                        if (users.get(i).contains(term)) {
                            System.out.println((i + 1) + "- " + users.get(i));
                            found = true;
                        }
                    }
                    if (found != true) {
                        System.out.println("Cadastro não encontrado!");
                    }
                }
                    break;
                case 4:
                    System.out.println("\nDigite o índice do cadastro:"); {
                    int index = scan.nextInt();
                    scan.nextLine();
                    index--;
                    if (index >= users.size()) {
                        System.out.println("índice não existe na lista de cadastros!");
                        break;
                    }
                    for (int i = 0; i < users.size(); i++) {
                        if (index == i) {
                            while (true) {
                                System.out.println("Digite o novo cadastro:");
                                String newUser = scan.nextLine();
                                newUser = newUser.trim();
                                if (newUser.isEmpty()) {
                                    System.out.println("Digite um nome válido!");
                                    continue;
                                }
                                users.remove(i);
                                users.add(i ,newUser);
                                break;
                            }
                        }
                    }
                }
                    break;
                case 5:
                    System.out.println("Digite o índice do cadastro:");{
                        int index = scan.nextInt();
                        scan.nextLine();
                        index--;
                        if (index >= users.size()) {
                            System.out.println("índice não existe na lista de cadastros!");
                            break;
                        }
                        for (int i = 0; i < users.size(); i++) {
                            if (index == i) {
                                users.remove(i);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
        scan.close();
    }
}