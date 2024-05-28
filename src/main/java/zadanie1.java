import java.util.ArrayList;
import java.util.List;

public class zadanie1 {

    //Zadanie 1
    //Napisz program, który będzie posiadał tablice słów (obiektów typu String) oraz zmienną
    //typu int expectedNumber. Program powinien wypisać wszystkie kombinacje dwóch słów,
    //które oddzielone spacją będą krótsze niż, wartość w expectedNumber.
    //np. 1
    //String[] words = {„przebranie”, „as”, „auto”, „samochod”}
    //int expectedNumber = 12
    //Wynik zwrócony przez program:
    //String[] result = {„as samochod”} lub {„samochod as”} (oba rozwiązania są
    //poprawne, kolejność nie ma znaczenia)
    //np. 2
    //String[] words = {„przebranie”, „as”, „auto”, „samochod”}
    //int expectedNumber = 14
    //Wynik zwrócony przez program:
    //String[] result = {„as samochod”, „auto samochod”} (tutaj też kolejności
    //połączonych słów nie mają znaczenia)//

    public static void main(String[] args) {
        String[] words = {"przebranie", "as", "auto", "samochod"};
        int expectedNumber = 12;
        String[] result = findCombinations(words, expectedNumber);

        for (String combination : result) {
            System.out.println(combination);
        }
    }

    public static String[] findCombinations(String[] words, int expectedNumber) {
        List<String> combinations = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String combination1 = words[i] + " " + words[j];
                String combination2 = words[j] + " " + words[i];

                if (combination1.length() < expectedNumber) {
                    combinations.add(combination1);
                }
                if (combination2.length() < expectedNumber && !combination1.equals(combination2)) {
                    combinations.add(combination2);
                }
            }
        }

        return combinations.toArray(new String[0]);
    }

}
