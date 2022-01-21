import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Oczywiście moża by tutaj użyć default jako przypadek Nieparzystego i Niepodzielnego przez 7
        // ale traci się wtedy możliwość używania deafault jako przypadku nieprzewidzianego
        switch (number % 2) {
            case 0:
                System.out.println("Parzysta");
                break;
            case 1:
                System.out.println("Nieparzysta");
                break;
            default:
                break;
        }

/*        switch (number % 2) {
            case 0:
                System.out.println("Parzysta");
                break;
            default:
                System.out.println("Nieparzysta");
                break;
        }*/

        switch (number % 7) {
            case 0:
                System.out.println("Podzielna przez 7");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Niepodzielna przez 7");
                break;
            default:
                break;
        }

/*        switch (number % 7) {
            case 0:
                System.out.println("Podzielna przez 7");
                break;
            default:
                System.out.println("Niepodzielna przez 7");
                break;
        }*/

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

        // Pewnie miałem użyć switcha ale nie mogłem się oprzeć
        String word = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : word.toCharArray()) {
            counts.compute(ch, (key, val) -> val == null ? 1 : val + 1);
        }

        String important = "opxzq";
        int sum = 0;
        for (char ch : counts.keySet()) {
            if (important.contains(ch+"")) {
                System.out.println(String.format("%s=%d", ch+"", counts.get(ch)));
            } else {
                sum += counts.get(ch);
            }
        }

        System.out.println(String.format("Nie należące do %s=%d", important, sum));
    }
}
