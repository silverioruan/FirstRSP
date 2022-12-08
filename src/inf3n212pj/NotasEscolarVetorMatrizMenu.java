/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 182120044
 */
public class NotasEscolarVetorMatrizMenu {

    //declaração global
    static Scanner leia = new Scanner(System.in);
    static String alunos[]; //texto para armazenar textor
    static float notas[][]; // float são números com casas decimais
    static int nAlunos, nNotas, contAlunos; // int é o número inteiro // contadores das matrizes

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sistema de notas :.");
        System.out.print("Informe o núm. de alunos: ");
        nAlunos = (int) leiaFloat();
        System.out.print("Quantas notas por aluno:");
        nNotas = (int) leiaFloat();

        //inicializar vetor e matriz de aluno e notas
        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1]; //mais +1 é pra criar o espaço para o cálculo de média

        int opM;
        do { // " do " é o FAÇA
            menu();
            opM = (int) leiaFloat();
            switch (opM) {
                case 1:
                    inserirAlunosNotas();
                    break;
                case 2:
                    imprimirAlunosNotas();
                    break;
                case 0:
                    System.out.print("Aplicação Encerrada pelo Usuário!");
                    break;
                default:
                    System.out.print("Opção inválida, tente novamente!");
                    break;
                //sim switch
            }
        } while (opM != 0); // While É O enquanto
    }//Fim main

    public static float leiaFloat() {
        try {
            Scanner leia = new Scanner(System.in);
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Erro: ");
            System.out.println("Corrija o valor inserido: ");
            return leiaFloat();
        }
    }//fim do leiafloat

    public static void menu() {

        System.out.println("1 - Inserir Alunos e notas");
        System.out.println("2 - Imprimir Alunos e notas");
        System.out.println("0 - Sair");
        System.out.println("Digite aqui: ");
    }

    private static void inserirAlunosNotas() {
        if (contAlunos < nAlunos) {
            System.out.print("Informe o nome do aluno: ");
            alunos[contAlunos] = leia.next();
            for (int i = 0; i < nNotas; i++) { //Contador
                System.out.print("Informe a" + (i + 1) + "ª nota: "); // " + " pra adicionar variavel no print
                notas[contAlunos][i] = leiaFloat(); //lendo alunos e notas
                notas[contAlunos][nNotas] += notas[contAlunos][i]; // acumulando notas e alunos
                //fim do for
            }
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;
            contAlunos++; //( + + ) ADICIONA +1 NA VARIÁVEL
        } else {
            System.out.println("Não é possível mais digitar alunos. "
                    + "\nNúm. máximo de posições obtidos.");
        }
    }

    private static void imprimirAlunosNotas() {
        for (int i = 0; i < contAlunos; i++) {
            if (notas[i][nNotas] >= 7);
        }
        {
            System.out.println("Você foi aprovado!" + alunos);
           
        }

    }
}
