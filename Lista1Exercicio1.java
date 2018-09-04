package lista1exercicio1;

import java.util.Scanner;

public class Lista1Exercicio1 {

    public static void main(String[] args) {
       
        float ladoA, ladoB,ladoC, ladoD, area;
        
        System.out.println("Algoritimo para calcular a area de uma sala");
        
            System.out.println("Digite a medida do ladoA da sala");
            Scanner teclado = new Scanner(System.in);
            ladoA = teclado.nextFloat();
            System.out.println("Digite a medida do ladoB da sala");
            Scanner teclado = new Scanner(System.in);
            ladoB = teclado.nextFloat();
            System.out.println("Digite a medida do ladoC da sala");
            Scanner teclado = new Scanner(System.in);
            ladoC = teclado.nextFloat();
            System.out.println("Digite a medida do ladoD da sala");
            Scanner teclado = new Scanner(System.in);
            ladoD = teclado.nextFloat();
            System.out.println("Digite a medida da altura da sala");
            AlturaA = teclado.nextFloat();
        
        area=(ladoA+ladoB+ladoC+ladoD)*AlturaA;
        
        System.out.println("A area todal desta sala é de: " + area);
        
    }
    
}
