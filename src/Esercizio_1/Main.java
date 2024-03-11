package Esercizio_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1 , 11);
        }
        System.out.println(Arrays.toString(array));



        int position = 0;
        int number ;
        do {
            try {
                System.out.println("Digita un numero che indichi in quale posizione dell'array vuoi inserire il numero da (1 a 5) ");
                position = Integer.parseInt(scanner.nextLine());

                if (position == 0){
                    break;
                }

                System.out.println("Digita un numero che vuoi inserire nell'array da (1 a 10)");
                number = Integer.parseInt(scanner.nextLine());

                if (number > 0 && number <= 10){
                if (position > 0 && position <= 5){
                    array[position - 1 ] = number;
                    System.out.println(Arrays.toString(array));
                } else {
                    System.out.println("Posizione non valida");
                }
                }else {
                    System.out.println("Inserisci un numero compreso tra 1 a 10");
                    System.out.println(Arrays.toString(array));
                }

            } catch (NumberFormatException e) {
                System.out.println("Errore: input non valido. Inserisci un numero intero.");
            }


        } while (position != 0);


    }
}
