//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("The average is: ");
        int[] numbers = {10, 20, 30, 5, 40, 33, 44, 50};
        averageValue();
        findTarget();
        findIndex();
        removedIndex(numbers, 20);
        findMaxMin(numbers);
        separateEvenOdd(numbers);
        findThesecondMinMax(numbers);
    }

    static void averageValue() {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        double average;
        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];
        }
        average = sum / numbers.length;
        System.out.println(average);
    }

    static void findTarget() {
        int[] numbers = {10, 20, 50, 40, 50};
        int target = 40;
        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("The number is found in the array: " + target + " on index: " + i);
                isFound = true;
            }
        }
        if (isFound != true) {
            System.out.println("It is not found in the array.");
        }

    }

    static void findIndex() {
        int[] numbers = {10, 20, 50, 40, 5, 50};
        int target = 40;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("The number is found in the array: " + i);
                isFound = true;
            }
        }

    }

    static int[] removedIndex(int[] numbers, int target) {
        int[] newArray = new int[numbers.length - 1];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != target) {
                newArray[index] = numbers[i];
                index++;

            } else {

                System.out.println("Found target " + target + " - skipping it");
            }
        }

        return newArray;
    }


    static void findMaxMin(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }

        }
        System.out.println("this is the min number");
        System.out.println(min);
        System.out.println("This is the max number");
        System.out.println(max);
    }


    static void separateEvenOdd(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;

            }
        }
        System.out.println(evenCount);
        System.out.println("Odd count " + oddCount);

        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {

                evenNumbers[evenIndex] = numbers[i];
                evenIndex++;

            } else {
                oddNumbers[oddIndex] = numbers[i];
                oddIndex++;
            }
        }
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println("Even Numbers");
            System.out.println(evenNumbers[i]);
        }
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.println("Odd Numbers: ");
            System.out.println(oddNumbers[i]);
        }
    }

    static void findThesecondMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            } else {
                max = numbers[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        int secondMin = numbers[0];
        int secondMax = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > min && numbers[i] < secondMin) {
                secondMin = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] < max) {
                secondMax = numbers[i];
            }
        }
        System.out.println("This is the second min" + secondMin);
        System.out.println("This is the second max" + secondMax);

    }
}



