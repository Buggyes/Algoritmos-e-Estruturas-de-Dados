package Aula2.Ex5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
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
                        boolean found = false;
                        for (Map.Entry<String, User> element : users.entrySet()) {
                            User u = element.getValue();
                            if (u.name.equals(name)) {
                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            System.out.println("Já existe um usuário com esse nome!");
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
                        leaveLoop = true;
                        System.out.println("\nSelecione o nível de permissão do usuário:");
                        System.out.println("1- Cliente");
                        System.out.println("2- Empregado");
                        System.out.println("3- Administrador");
                        String permissionSelect = scan.nextLine();
                        switch (permissionSelect) {
                            case "1":
                                permission = Permission.commonUser;
                                break;
                            case "2":
                                permission = Permission.employee;
                                break;
                            case "3":
                                permission = Permission.admin;
                                break;
                            default:
                                System.out.println("Digite uma opção válida!");
                                leaveLoop = false;
                                break;
                        }
                    }
                    User newUser = new User(name, password, permission);
                    users.put(newUser.name, newUser);
                }
                    break;
                case "2": {
                    users.forEach((k, u) -> System.out.println(k + ": " + u.password));
                }
                    break;
                case "3":
                    System.out.println("Cliente: ");
                    for (Map.Entry<String, User> element : users.entrySet()) {
                        User u = element.getValue();
                        if (u.permission == Permission.commonUser) {
                            System.out.println(u.name + ": " + u.password);
                        }
                    }
                    System.out.println("Funcionários: ");
                    for (Map.Entry<String, User> element : users.entrySet()) {
                        User u = element.getValue();
                        if (u.permission == Permission.employee) {
                            System.out.println(u.name + ": " + u.password);
                        }
                    }
                    System.out.println("Administradores: ");
                    for (Map.Entry<String, User> element : users.entrySet()) {
                        User u = element.getValue();
                        if (u.permission == Permission.admin) {
                            System.out.println(u.name + ": " + u.password);
                        }
                    }
                    break;
                case "4": {
                    while (true) {
                        System.out.println("\nDigite o nome do usuário");
                        String nameS = scan.nextLine();
                        if (nameS.trim().isEmpty()) {
                            System.out.println("Digite um nome válido!");
                            continue;
                        }
                        boolean found = false;
                        for (Map.Entry<String, User> element : users.entrySet()) {
                            User u = element.getValue();
                            if (u.name.equals(nameS)) {
                                found = true;
                                String name;
                                String password;
                                Permission permission = null;
                                while (true) {
                                    System.out.println("\nDigite o novo nome do usuário:");
                                    name = scan.nextLine();
                                    if (name.trim().isEmpty()) {
                                        System.out.println("Digite um nome válido!");
                                        continue;
                                    }
                                    boolean foundR = false;
                                    for (Map.Entry<String, User> element1 : users.entrySet()) {
                                        User u1 = element1.getValue();
                                        if (u1.name.equals(name)) {
                                            foundR = true;
                                            break;
                                        }
                                    }
                                    if (foundR) {
                                        System.out.println("Já existe um usuário com esse nome!");
                                        continue;
                                    }
                                    break;
                                }
                                while (true) {
                                    System.out.println("\nDigite a nova senha do usuário:");
                                    password = scan.nextLine();
                                    if (password.trim().isEmpty()) {
                                        System.out.println("Digite uma senha válida!");
                                        continue;
                                    }
                                    break;
                                }
                                boolean leaveLoop = false;
                                while (leaveLoop != true) {
                                    leaveLoop = true;
                                    System.out.println("\nSelecione o novo nível de permissão do usuário:");
                                    System.out.println("1- Cliente");
                                    System.out.println("2- Empregado");
                                    System.out.println("3- Administrador");
                                    String permissionSelect = scan.nextLine();
                                    switch (permissionSelect) {
                                        case "1":
                                            permission = Permission.commonUser;
                                            break;
                                        case "2":
                                            permission = Permission.employee;
                                            break;
                                        case "3":
                                            permission = Permission.admin;
                                            break;
                                        default:
                                            System.out.println("Digite uma opção válida!");
                                            leaveLoop = false;
                                            break;
                                    }
                                }
                                users.remove(nameS);
                                User newUser = new User(name, password, permission);
                                users.put(newUser.name, newUser);
                                System.out.println("Alteração feita com sucesso.");
                                break;
                            }
                        }
                        if (found != true) {
                            System.out.println("Usuário não encontrado.");
                        }
                        break;
                    }
                }
                    break;
                case "5":
                    while (true) {
                        System.out.println("\nDigite o nome do usuário");
                        String nameS = scan.nextLine();
                        if (nameS.trim().isEmpty()) {
                            System.out.println("Digite um nome válido!");
                            continue;
                        }
                        boolean found = false;
                        for (Map.Entry<String, User> element : users.entrySet()) {
                            User u = element.getValue();
                            if (u.name.equals(nameS)) {
                                found = true;
                                users.remove(nameS);
                                System.out.println("Usuário deletado com sucesso.");
                                break;
                            }
                        }
                        if(found != true){
                            System.out.println("Usuário não encontrado.");
                        }
                        break;
                    }
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
    }
}
