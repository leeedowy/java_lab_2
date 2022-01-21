import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */ //60319

        int y = 9;
        for (int i = 100; i >= 0; i--) {
            if (i % y == 0) {
                System.out.println(i);
            }
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        Scanner scanner = new Scanner(System.in);
        int [] tab = new int[5];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
        }

        for (int val : tab) {
            System.out.println(val + 11);
        }


    }
}
