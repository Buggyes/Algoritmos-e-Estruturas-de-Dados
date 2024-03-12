package Aula2.Ex4;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> names = new LinkedList<String>();
        boolean quitApp = false;
        while (quitApp != true) {
            System.out.println("\n1- Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3- Finalizar");
            String option = scan.nextLine();
            switch (option) {
                case "1":
                    while (true) {
                        System.out.println("\nDigite o nome:");
                        String name = scan.nextLine();
                        if (name.trim().isEmpty()) {
                            System.out.println("Digite um nome válido!");
                            continue;
                        }
                        names.add(name);
                        System.out.println("Nome adicionado com sucesso.");
                        break;
                    }
                    break;
                case "2":
                    if(names.size() == 0){
                        System.out.println("Não existem nomes cadastrados.");
                        break;
                    }
                    System.out.println("Nomes cadastrados:");
                    for (int i = 0; i < names.size(); i++) {
                        System.out.println((i+1)+"- "+names.get(i));
                    }
                    break;
                case "3":
                    quitApp = true;
                    System.out.println("Finalizando aplicação...");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
        scan.close();
    }
}
