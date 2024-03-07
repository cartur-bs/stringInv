package org.example;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite uma palavra: ");
            String stringScan = sc.nextLine();
            System.out.println("String original: " + stringScan);

            char[] caracteres = stringScan.toCharArray();
            int left = 0;
            int right = caracteres.length - 1;

            while (left < right) {
                // Troca os caracteres da esquerda com os da direita
                char temp = caracteres[left];
                caracteres[left] = caracteres[right];
                caracteres[right] = temp;
                // Move a posição
                left++;
                right--;
            }

            String invertida = new String(caracteres);
            System.out.println("String invertida: " + invertida);
            sc.close();
        }
}