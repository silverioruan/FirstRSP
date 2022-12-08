/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 182120044
 */
public class ArrayInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Array existe? " + nomes.isEmpty());//isEmpty verificar se ele está vazio ou não
        System.out.println("Quantos registro: " + nomes.size()); //size é igual a tamanho
        
        nomes.add("Ruan"); //adicionar nome direto no código
        System.out.println("Depois de add valor");
        System.out.println("Array está vazio? " + nomes.isEmpty());
        System.out.println("Quantos registro: " + nomes.size());
        
        System.out.println("Digite um nome:");
        nomes.add(leia.next());
        System.out.println("Depois de add valor");
        System.out.println("Quantos registro: " + nomes.size());//size é igual a tamanho
        System.out.println("Nomes: " + nomes.toString()); //transforma todos os valores em um único texto
        
        nomes.add(0, "Guest");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registro: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        
        nomes.add(2, "Caiu");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registro: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());
        
        System.out.println("index de Ruan: " + nomes.indexOf("Ruan"));
    }

}
