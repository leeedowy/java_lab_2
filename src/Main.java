import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        int [] tabInt = new int[20];
        fillWithValues(tabInt);
        printValues(tabInt);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        String [] tabString = new String[6];
        fillWithValuesFromUser(tabString);
        printValuesReverseOrder(tabString);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        printName("Patryk");
        printName("Patryk", "Zieliński");
        printName("Patryk", "Zieliński", 27);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        int zmiennaA = add(24, 85);
        int zmiennaB = add(5, 2, 95);
        System.out.println(String.format("wynik: %d", zmiennaA + zmiennaB));
    }

    static void fillWithValues(int [] tabInt) {
        Random random = new Random();
        for (int i = 0; i < tabInt.length; i++) {
            tabInt[i] = (Math.abs(random.nextInt()) % 20) + 21;
        }
    }

    static void printValues(int[] tabInt) {
        for (int val : tabInt) {
            System.out.println(val);
        }
    }

    static void fillWithValuesFromUser(String [] tabString) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tabString.length; i++) {
            tabString[i] = scanner.next();
        }
    }

    static void printValuesReverseOrder(String[] tabString) {
        for (int i = tabString.length - 1; i >= 0; i--) {
            System.out.println(tabString[i]);
        }
    }

    static void printName(String firstName) {
        System.out.println(firstName);
    }

    static void printName(String firstName, String lastName) {
        System.out.println(String.format("%s %s", firstName, lastName));
    }

    static void printName(String firstName, String lastName, int age) {
        System.out.println(String.format("%s %s, %d", firstName, lastName, age));
    }

    static int add(int val1, int val2) {
        return val1 + val2;
    }

    static int add(int val1, int val2, int val3) {
        return val1 + val2 + val3;
    }
}
