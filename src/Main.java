//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("The average is: ");
        int[] numbers = {10, 20, 30,5, 40, 50};
        averageValue();
        findTarget();
        findIndex();
        removedIndex(numbers, 20);
        findMaxMin(numbers);
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
        int[] numbers = {10, 20, 50, 40,5, 50};
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


    static void findMaxMin(int[]numbers){
        int min = numbers[0];
        int max = numbers[0];
        for(int i = 0; i< numbers.length;i++){
            System.out.println(numbers[i]);
            if(min > numbers[i]){
                min = numbers[i];
            }
            if(max< numbers[i]){
                max = numbers[i];
            }

        }
        System.out.println("this is the min number");
        System.out.println(min);
        System.out.println("This is the max number");
        System.out.println(max);
    }

    static




}



