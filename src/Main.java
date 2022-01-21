public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni) 60319
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        int yy = 19;
        int iterator = 1000;
        do {
            if (iterator % yy == 0) {
                System.out.println(String.format("Liczba %d jest podzielna przez %d", iterator, yy));
            } else {
                System.out.println(iterator);
            }
            iterator--;
        } while (iterator >= 0);



        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        int [] tabInt = {1, 2, 3, 4, 5};
        double [] tabDouble = {1.1, 2.2, 3.3, 4.4, 5.5};
        String [] tabString = {"one", "two", "three", "four", "five"};

        for (int i = 0; i < tabInt.length; i++) {
            System.out.println(tabInt[i]);
        }

        for (int i = 0; i < tabDouble.length; i++) {
            System.out.println(tabDouble[i]);
        }

        for (int i = tabString.length - 1; i >= 0; i--) {
            System.out.println(tabString[i]);
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        // gdy damy true w warunku to pętla nigdy się nie skończy,
        // gdy damy false to nigdy się nie rozpocznie

//        while (true);
//        while (false);

    }
}
