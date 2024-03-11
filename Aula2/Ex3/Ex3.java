package Aula2.Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean quitApp = false;
        ArrayList<Product> products = new ArrayList<Product>();
        while (quitApp != true) {
            System.out.println("\n1- Cadastrar");
            System.out.println("2- Mostrar todos os produtos");
            System.out.println("3- Mostrar quantidade de segmentos");
            System.out.println("4- Modificar");
            System.out.println("5- Remover");
            int opt = scan.nextInt();
            scan.nextLine();

            switch (opt) {
                case 1:
                    System.out.println("\nDigite o nome do produto"); {
                    Product product = new Product();
                    product.name = scan.nextLine();
                    System.out.println("\nDigite o segmento do produto");
                    product.segment = scan.nextLine();
                    boolean repeated = false;
                    for (Product prod : products) {
                        if (prod.name.equals(product.name)) {
                            repeated = true;
                            break;
                        }
                    }
                    if (repeated) {
                        System.out.println("Este produto já existe!");
                    } else {
                        products.add(product);
                        System.out.println("Cadastro feito com sucesso!");
                    }
                }
                    break;
                case 2:
                    if (products.size() == 0) {
                        System.out.println("Não existem registros no sistema.");
                        break;
                    }
                    System.out.println("\nRegistros:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + "- " + products.get(i).name);
                        System.out.println("    "+products.get(i).segment);
                    }
                    break;
                case 3: {
                    if (products.size() == 0) {
                        System.out.println("Não existem registros no sistema.");
                        break;
                    }
                    ArrayList<String> segments = new ArrayList<String>();
                    for (int i = 0; i < products.size(); i++) {
                        String segment = products.get(i).segment.toLowerCase();
                        boolean found = false;
                        for (int j = 0; j < segments.size(); j++) {
                            if (segments.get(j).toLowerCase().equals(segment)) {
                                found = true;
                                break;
                            }
                        }
                        if (found != true) {
                            segments.add(segment);
                        }
                    }
                    for (String segment : segments) {
                        int prodCount = 0;
                        System.out.println("\n" + segment + ":");
                        for (int i = 0; i < products.size(); i++) {
                            if (segment.equals(products.get(i).segment)) {
                                prodCount++;
                                System.out.println(prodCount + "- " + products.get(i).name);
                            }
                        }
                        System.out.println("Total: " + prodCount);
                    }
                }
                    break;
                case 4:
                    if (products.size() == 0) {
                        System.out.println("Não existem registros no sistema.");
                        break;
                    }
                    System.out.println("Digite o índice do produto:"); {
                    int prodIndex = scan.nextInt();
                    scan.nextLine();
                    if (prodIndex >= products.size() || prodIndex < 0) {
                        System.out.println("Índice inválido!");
                        break;
                    }

                    for (int i = 0; i < products.size(); i++) {
                        if (i == prodIndex) {
                            while (true) {
                                System.out.println("Digite o novo nome do produto:");
                                String newName = scan.nextLine();
                                if (newName.trim().isEmpty()) {
                                    System.out.println("Insira um nome válido!");
                                    continue;
                                }

                                System.out.println("Digite o novo segmento do produto:");
                                String newSegment = scan.nextLine();
                                if (newSegment.trim().isEmpty()) {
                                    System.out.println("Insira um segmento válido!");
                                    continue;
                                }
                                boolean leaveLoop = false;
                                while (leaveLoop != true) {
                                    System.out.println("Novo nome: " + newName);
                                    System.out.println("Novo segmento: " + newSegment);
                                    System.out.println("Confirmar alterações? (0 = Não, 1 = Sim)");
                                    String confirm = scan.nextLine();

                                    switch (confirm) {
                                        case "0":
                                            leaveLoop = true;
                                            break;
                                        case "1":
                                            products.get(i).name = newName;
                                            products.get(i).segment = newSegment;
                                            leaveLoop = true;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                    }
                }
                    break;
                case 5:
                    if (products.size() == 0) {
                        System.out.println("Não existem registros no sistema.");
                        break;
                    }
                    System.out.println("Digite o índice do produto:"); {
                    int index = scan.nextInt();
                    scan.nextLine();
                    index--;
                    if (index >= products.size()) {
                        System.out.println("índice não existe na lista de produtos!");
                        break;
                    }
                    for (int i = 0; i < products.size(); i++) {
                        if (index == i) {
                            boolean leaveLoop = false;
                            boolean delete = false;
                            while (leaveLoop != true) {
                                System.out.println("Tem certeza?(0 = Não, 1 = Sim)");
                                String answer = scan.nextLine();
                                switch (answer) {
                                    case "0":
                                        leaveLoop = true;
                                        break;
                                    case "1":
                                        delete = true;
                                        leaveLoop = true;
                                        break;

                                    default:
                                        System.out.println("Digite uma opção válida");
                                        break;
                                }
                            }
                            if (delete) {
                                products.remove(i);
                                System.out.println("Produto removido com sucesso!");
                                break;
                            }
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
