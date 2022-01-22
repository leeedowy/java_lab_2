import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* Cw.7* Mapy - Tylko dla chętnych */

        /* Zad.1* Napisać program:
            a) Stworzenie mapę: Map<String, String>,
            b) uzupełnić wartościami (dowolność), przynajmniej 5 rekordów,
            c) usunąć 5-tą parę, dodać 2-ie dodatkowe pary i podwienić wartość w 1-ej i 2-giej parze (wartości dowolne),
            d) wyświetlić zawartość mapy i wyświetlić za pomocą pętli
        */

        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put(scanner.next(), scanner.next());
        }

        map.remove(map.keySet().toArray(new String[0])[map.keySet().toArray(new String[0]).length-1]);
        for (int i = 0; i < 2; i++) {
            map.put(map.keySet().toArray(new String[0])[0], scanner.next());
            map.put(map.keySet().toArray(new String[0])[1], scanner.next());
        }

        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.printf("%s=%s%n", key, map.get(key));
        }

        /* zad.2* Napisać program:
            a) Stworzyć mapę Map<Long, String>,
            b) wstawić 5 par klucz-wartość z klawiatury (Klucz wprowadzamy jako indeks za pomocą pętli for),
            c) wykonać dowolne operacje dodawania, usuwania, zamiany wartości,
            d) znaleść parę o wartości z najdłuższą długościa wyrazu (map.getValue().length - jak największy),
            e) przeiterować i wyświetlić wartości w pętli
        */

        Map<Integer, String> map2 = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map2.put(i, scanner.next());
        }

        map2.remove(3);
        map2.put(10, scanner.next());
        map2.put(0, scanner.next());

        Map.Entry<Integer, String> max = map2.entrySet().iterator().next();
        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            if (entry.getValue().length() > max.getValue().length()) {
                max = entry;
            }
        }
        System.out.println(max);
    }
}
