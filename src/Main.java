import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* Przyklad_7* Mapy - Tylko dla chętnych */

        /* mapy są strukturami które przyjmują klucz i wartość */
        Map<Integer, String> shapes = new HashMap<Integer, String>();
        shapes.put(1, "Kwadrat"); // dodawanie pary klucz - wartość
        shapes.put(2, "Koło");
        shapes.put(4, "Trójkąt");
        shapes.put(8, "Ośmiobok");

        System.out.println("Kształty: " + shapes);
        System.out.println("Wyświetl wartość dla klucza nr2: " + shapes.get(2)); // get - pobranie wartości dla klucza

        /* Podmienianie wartości dla danego klucza */
        shapes.replace(2, "Trapez");
        System.out.println("Wyświetl wartość dla klucza nr2: " + shapes.get(2) + "\n");
        wyswietlMape(shapes);

        /* usówanie wartości */
        shapes.remove(4);
        shapes.put(7, "Siedmiobok");
        System.out.println();
        wyswietlMape(shapes);

        /* kluczem i wartością mogą być dowolne typy Objektowe np. <Character, Integer>, <Object, Object>, <String, String>, <Long, Set<String>> */
        Map<Character, Integer> numbers = new HashMap<Character, Integer>();
        numbers.put('Z', 2); // dodawanie pary klucz - wartość
        numbers.put('Y', 76);
        numbers.put('C', 28);
        numbers.put('A', 6);
        System.out.println();
        wyswietlMape(numbers);
//        wyswietlMape2(numbers); // jeśli nie chcemy używać metody generycznej
    }

    /* Map<?, ?> map - znaki zapytania informują nas że jest to metoda generyczna (taka która może przyjąć dowolne typy),
     * można oczywiście wytypować tą metodę według potrzeby np. wyswietlMape(Map<Integer, String> map) */
//    public static void wyswietlMape(Map<Integer, String> map) {  // jeśli nie chcemy używać metody generycznej
    public static void wyswietlMape(Map<?, ?> map) {
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.print("entry: " + entry + ", "); // klucz - wartość
            System.out.print(" Key: " + entry.getKey() + ", "); // klucz
            System.out.print(" Value: " + entry.getValue() + "; \n"); // wartość
        }
        System.out.print("\nTylko wartości: " + map.values() + ", "); // Wszystkie wartości
    }

//    public static void wyswietlMape2(Map<Character, Integer> map) {
//        for (Map.Entry<?, ?> entry : map.entrySet()) {
//            System.out.print("entry: " + entry + ", "); // klucz - wartość
//            System.out.print(" Key: " + entry.getKey() + ", "); // klucz
//            System.out.print(" Value: " + entry.getValue() + "; \n"); // wartość
//        }
//        System.out.print("\nTylko wartości: " + map.values() + ", "); // Wszystkie wartości
//    }

}
