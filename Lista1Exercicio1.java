package lista1exercicio1;

import java.util.Scanner;

public class Lista1Exercicio1 {

    public static void main(String[] args) {
       
        float ladoA, ladoB, area;
        
        System.out.println("Algoritimo para calcular a area de uma sala");
        
        System.out.println("Digite a medida do lado da sala");
        Scanner teclado = new Scanner(System.in);
        ladoA = teclado.nextFloat();
        System.out.println("Digite a medida do comprimento da sala");
        ladoB = teclado.nextFloat();
        
        area=ladoA*ladoB;
        
        System.out.println("A area todal desta sala é de: " + area);
        
    }
    
}
