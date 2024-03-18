package Aula3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Aval1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<String> tasks = new LinkedList<String>();
        boolean quitApp = false;
        while (quitApp != true) {
            System.out.println("\n1- Adicionar tarefa");
            System.out.println("2- Concluir tarefa");
            System.out.println("3- Vizualizar próxima tarefa");
            System.out.println("4- Finalizar programa");
            String opt = scan.nextLine();
            switch (opt) {
                case "1":
                    System.out.println("Digite o nome da tarefa:");
                    {
                        String taskName = scan.nextLine();
                        if(taskName.trim().isEmpty()){
                            System.out.println("Digite um nome válido!");
                        }
                        else{
                            tasks.add(taskName);
                            System.out.println("Tarefa adicionada com sucesso.");
                        }
                    }
                    break;

                case "2":
                    if(tasks.size() == 0){
                        System.out.println("Não existem tarefas a serem concluídas.");
                    }
                    else{
                        tasks.remove();
                        System.out.println("Tarefa concluída com sucesso");
                    }
                    break;

                case "3":
                    if(tasks.size() == 0){
                        System.out.println("Não existem tarefas a serem concluídas.");
                    }
                    else{
                        System.out.println("Tarefa: "+tasks.peek());
                    }
                    break;

                case "4":
                    quitApp = true;
                    System.out.println("Finalizando sistema...");
                    break;
            
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
        scan.close();
    }
}
