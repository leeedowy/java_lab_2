import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 Napisać program który 
                a) stworzy listę ArrayList<String> (lista tablicowa),
                  Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                  elementów i elementami mają być nazwy zwierząt (niech niektóre wartości dublują się).
                  -- podpowiedź: List<String> nazwaListy = new ArrayList<>();
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                  -- podpowiedź: for(String zmienna : List<String>) { }
                c) proszę usunąć 2 ostatnie elementy listy i drugi element, następnie dodać do niej 4 inne elementy,
                  następnie wyświetlić listę i wielkość listy,
                d) proszę wyświetlić posortowną listę, oraz odwrotniee posortowaną i znów użyć metody z punktu b) do wyświetlenia
                  elementów listy
          */

        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            names.add(scanner.next());
        }

        printValues(names);

        names.remove(names.size() - 1);
        names.remove(names.size() - 1);
        names.remove(1);

        for (int i = 0; i < 4; i++) {
            names.add(scanner.next());
        }

        printValues(names);
        System.out.println(names.size());

        Collections.sort(names);
        printValues(names);
        Collections.reverse(names);
        printValues(names);

         /* zad.2 Napisać program który :
                a) stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury, liczby mają się powtarzać,
                b) następnie wyświetlić zawartość set-a w konsoli,
                c) następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(scanner.nextInt());
        }

        System.out.println(set);
        for (int val : set) {
            System.out.println(val);
        }
        
        /* zad.3* Dla chętnych, nie będzie oceniane:
                Napisać podobny program jak w zad.1 zamiast zwierząt wprowadzć dowolne dane 
                np. imiona, nazwiska, miasta, samochody ... . (dowolność),
                Wykonać na TreeSet 
                -- podpowiedź: Set<String> nazwaSeta = new TreeSet<>();
        */

        Set<String> namesSet = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            namesSet.add(scanner.next());
        }

        printValues(namesSet);

        namesSet.remove(namesSet.size() - 1);
        namesSet.remove(namesSet.size() - 1);
        namesSet.remove(1);

        for (int i = 0; i < 4; i++) {
            namesSet.add(scanner.next());
        }

        printValues(namesSet);
        System.out.println(namesSet.size());
    }

    static void printValues(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    static void printValues(Set<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
