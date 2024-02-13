public class Methods {

    int[] numbers;

    Methods(int[] numbers) {this.numbers = numbers;}

    void checkMax() {
        int max = 0;

        int i;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);
        System.out.println("this implementation is O(n)");
    }

    void fibonacci(int length) {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < length; i++) {
            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
        System.out.println("this implementation is O(n)");

    }

    void checkInt() {
        int i;
        boolean containsZeroAndOne = false;


        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0 && numbers[i] == -1) {
                containsZeroAndOne = true;
                }
            }

        if (containsZeroAndOne) {
            System.out.println("this array contains 0 and -1");
        }
        else {
            System.out.println("this array does not contain 0 and -1");
        }
        System.out.println("this implementation is O(n)");
    }
}
