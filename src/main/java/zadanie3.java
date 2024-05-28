public class zadanie3 {
//Napisz kod, który zwróci (wypisze) największą liczbę, przez którą można podzielić bez
//reszty wszystkie liczby z tablicy wejściowej elementów typu int.
//np. 1
//int[] inputTable = {10, 5, 20}
//int result = 5 (5 jest największą liczbą, przez którą można bez reszty podzielić 10, 5
//i 20)
//np. 2
//int[] inputTable = {7, 8}
//int result = 1 (1 jest największą liczbą, przez którą można bez reszty podzielić 7 i 8)

    public static void main(String[] args) {
        int[] inputTable = {10, 5, 20};

        int result1 = findGCD(inputTable);

        System.out.println("Result for inputTable1: " + result1);
    }
    public static int findGCD(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
