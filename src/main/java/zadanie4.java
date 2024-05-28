import java.util.Arrays;

public class zadanie4 {
    //Zadanie 4
    //Napisz program, który zamienia numery z tablicy na tekst. Ma działać podobnie do
    //wpisywania tekstu na starych telefonach komórkowych. Poniżej jest rysunek klawiatury,
    //gdzie są przypisane litery do cyfr (dla przykładu pojedyncze naciśnięcie przycisku z
    //numerem 5. jest zamieniane na literę J. Trzykrotne naciśnięcie cyfry 3, zamieniane jest na
    //literę F). Założenie w programie jest takie, że litery z tej samej cyfry nie mogą się po
    //sobie powtarzać (czyli nie jest możliwe wpisanie słowa np. PRO - litery P i R są z tej
    //samej cyfry 7). Po wykonaniu programu uzyskujemy tablicę z literami po zamianie. Jeżeli
    //tablica będzie dłuższa niż słowo, to pozostałe pozycje powinny być wypełnione znakiem _.
    //np.
    //int[] numbers = {4,4,3,3,5,5,5,6,6,6,6}
    //Wynik zwrócony przez program:
    //char[] result = {H,E,L,O} lub {H,E,L,O,_,_,_,_,_}

    private static final char[][] KEYPAD = {
            {},
            {},
            {'A', 'B', 'C'}, // 2
            {'D', 'E', 'F'}, // 3
            {'G', 'H', 'I'}, // 4
            {'J', 'K', 'L'}, // 5
            {'M', 'N', 'O'}, // 6
            {'P', 'Q', 'R', 'S'}, // 7
            {'T', 'U', 'V'}, // 8
            {'W', 'X', 'Y', 'Z'} // 9
    };

    public static void main(String[] args) {
        int[] numbers = {4, 4, 3, 3, 5, 5, 5, 6, 6, 6, 6};
        char[] result = convertNumbersToText(numbers);

        System.out.println(Arrays.toString(result));
    }

    public static char[] convertNumbersToText(int[] numbers) {
        char[] result = new char[numbers.length];
        Arrays.fill(result, '_');

        int resultIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            while (i + 1 < numbers.length && numbers[i] == numbers[i + 1]) {
                count++;
                i++;
            }

            int digit = numbers[i];
            if (digit >= 2 && digit <= 9) {
                int letterIndex = (count - 1) % KEYPAD[digit].length;
                result[resultIndex++] = KEYPAD[digit][letterIndex];
            }
        }

        return result;
    }
}
