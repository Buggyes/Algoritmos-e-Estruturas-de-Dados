package Aula2.Exemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class exemplos {
    public static void main(String[] args) {
        vectorExample();
        arrayListExample();
        linkedListExample();
        hashMapExample();
    }
    private static void vectorExample(){
        System.out.println("\nExemplo de Vector:");

        //Cria um vector que armazena strings, 
        //com o tamanho inicial 10, e que incrementa em 1 
        //cada vez que o limite é excedido
        Vector<String> frutas = new Vector<String>(10, 1);
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        for (String str : frutas) {
            System.out.println(str);
        }
        
        //Irá imprimir a capacidade atual do vector(10)
        System.out.println(frutas.capacity());
    }
    private static void arrayListExample(){
        System.out.println("\nExemplo de ArrayList:");

        //Cria um arraylist que armazena strings
        ArrayList<String> nomes = new ArrayList<String>();

        //Essa função garante que o ArrayList
        //tera no mínimo o valor específicado como tamanho.
        //É a única função de específicação de tamanho que
        //o arraylist possui, e é raramente usada.
        nomes.ensureCapacity(3);

        nomes.add("Lucas");
        nomes.add("Alberto");
        nomes.add("Felipe");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + " = " + nomes.get(i));
        }
    }
    private static void linkedListExample(){
        System.out.println("\nExemplo de LinkedList:");

        //Cria um LinkedList que armazena strings
        LinkedList<String> nomes = new LinkedList<String>();
        nomes.add("Arthur");
        nomes.add("Alice");
        nomes.add("Henrique");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
    private static void hashMapExample(){
        System.out.println("\nExemplo de HashMap:");
        //Cria um hashmap que armazena strings com suas respectivas chaves em string
        HashMap<String, String> cupons = new HashMap<String, String>();

        //Adiciona as strings ao hashmap com suas respectivas chaves
        cupons.put("1234","50% de desconto");
        cupons.put("4321","25% de desconto");
        
        //Acessa e imprime no console o conteúdo de 2 elementos do hashmap
        System.out.println(cupons.get("1234"));
        System.out.println(cupons.get("4321"));
    }
}
