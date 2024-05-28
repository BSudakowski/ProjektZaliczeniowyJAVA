import java.util.Arrays;

public class zadanie2 {
    //Zadanie 2
    //Znajdź wspólne elementy z dwóch tablic elementów typu int. Obie tablice mogą mieć tylko
    //wartości większe lub równe 0. Wspólne elementy zapisz do tablicy (tablica może mieć
    //większą długość, ale pozycje, które nie należą do wartości wspólnych, wypełnij
    //wartościami -1).
    //np.
    //int[] firstTab = {1, 5, 7, 3}
    //int[] secondTab = {5, 14, 0, 21, 7}
    //Wynik zwrócony przez program:
    //int[] result = {5, 7} lub {5, 7, -1, -1}

    public static void main(String[] args) {
        int[] firstTab = {1, 5, 7, 3};
        int[] secondTab = {5, 14, 0, 21, 7};
        int[] result = findCommonElements(firstTab, secondTab);

        System.out.println(Arrays.toString(result));
    }

    public static int[] findCommonElements(int[] firstTab, int[] secondTab) {

        int maxLength = Math.max(firstTab.length, secondTab.length);
        int[] result = new int[maxLength];
        Arrays.fill(result, -1);

        int index = 0;

        for (int i = 0; i < firstTab.length; i++) {
            for (int j = 0; j < secondTab.length; j++) {
                if (firstTab[i] == secondTab[j]) {
                    boolean alreadyAdded = false;
                    for (int k = 0; k < index; k++) {
                        if (result[k] == firstTab[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    if (!alreadyAdded) {
                        result[index++] = firstTab[i];
                    }
                }
            }
        }
        return result;
    }
}
