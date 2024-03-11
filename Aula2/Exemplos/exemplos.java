package Aula2.Exemplos;

import java.util.ArrayList;
import java.util.Vector;

public class exemplos {
    public static void main(String[] args) {
        vectorExample();
        arrayListExample();
    }
    private static void vectorExample(){
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
}
