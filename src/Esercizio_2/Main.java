package Esercizio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Quanti km hai percorso");
            double km = Double.parseDouble(scanner.nextLine());
            System.out.println("Quanti litri di carburante hai consumato");
            double litri = Double.parseDouble(scanner.nextLine());
            if (litri == 0){
                throw new ArithmeticException ("non puoi dividere per 0");
            }
            double calcolo = km / litri;
            System.out.println("Hai percorso " + calcolo  + " km/l" );
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Si prega di inserire un numero valido.");
        }



    }

}
