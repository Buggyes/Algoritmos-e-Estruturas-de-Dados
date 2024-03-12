package Aula2.Ex5;

import java.util.HashMap;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, User> users = new HashMap<String, User>();
        while (true) {
            System.out.println("\n1- Cadastrar usuário");
            System.out.println("2- Listar todos os usuários");
            System.out.println("3- Listar usuários por permissão");
            System.out.println("4- Alterar usuário");
            System.out.println("5- Deletar usuário");
            String option = scan.nextLine();
            switch (option) {
                case "1": {
                    String name;
                    String password;
                    Permission permission = null;
                    while (true) {
                        System.out.println("\nDigite o nome do usuário:");
                        name = scan.nextLine();
                        if (name.trim().isEmpty()) {
                            System.out.println("Digite um nome válido!");
                            continue;
                        }
                        break;
                    }
                    while (true) {
                        System.out.println("\nDigite a senha do usuário:");
                        password = scan.nextLine();
                        if (password.trim().isEmpty()) {
                            System.out.println("Digite uma senha válida!");
                            continue;
                        }
                        break;
                    }
                    boolean leaveLoop = false;
                    while (leaveLoop != true) {
                        System.out.println("\nSelecione o nível de permissão do usuário:");
                        System.out.println("1- Usuário");
                        System.out.println("2- Empregado");
                        System.out.println("3- Administrador");
                        String permissionSelect = scan.nextLine();
                        switch (permissionSelect) {
                            case "1":
                                permission = Permission.commonUser;
                                leaveLoop = true;
                                break;
                            case "2":
                                permission = Permission.employee;
                                leaveLoop = true;
                                break;
                            case "3":
                                permission = Permission.admin;
                                leaveLoop = true;
                                break;
                            default:
                                System.out.println("Digite uma opção válida!");
                                break;
                        }
                    }
                    User newUser = new User(name, password, permission);
                    users.put(newUser.name, newUser);
                }
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
    }
}
