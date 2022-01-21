public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (i == 1 || i == 3) {
                continue;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                return;
            }
        }
    }
}
