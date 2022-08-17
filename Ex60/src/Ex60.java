/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Faça um programa que:
    a) preencha dois vetores A e B de 5 posições, com números inteiros;
    b) atribua a um vetor RES a soma do vetor A com B (a primeira posição de A será somada à primeira posição de B e o
    resultado será atribuído à primeira posição do vetor RES);
    c) mostre os valores do vetor RES.
 */

import java.util.Random;

public class Ex60 {
    public static void main(String[] args) {
        Random random = new Random();
        int A[] = {0,0,0,0,0};
        int B[] = {0,0,0,0,0};
        int RES[] = {0,0,0,0,0};
        for (int i = 0; i < A.length; i++) {
           A[i] = random.nextInt(100);
           B[i] = random.nextInt(100);
        }
        System.out.print("Vetor A: [");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]");
        System.out.print("Vetor B: [");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");

        }
        System.out.println("]");
        System.out.print("Vetor RES: [");
        for (int i = 0; i < RES.length; i++) {
            RES[i] = A[i] + B[i];
            System.out.print(RES[i] + " ");
        }
        System.out.println("]");
    }
}
