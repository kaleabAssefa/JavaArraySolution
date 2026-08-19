//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("The average is: ");
        averageValue();
        findTarget();
        findIndex();
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
                System.out.println("The number is found in the array: "+ target+" on index: "+ i);
                isFound = true;
            }
        }if(isFound != true){
            System.out.println("It is not found in the array.");
        }

    }
    static void findIndex(){
        int[] numbers = {10, 20, 50, 40, 50};
        int target = 40;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("The number is found in the array: " + i);
                isFound = true;
            }
        }

    }


}
