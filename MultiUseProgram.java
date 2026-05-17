public class MultiUseProgram {

    public static void main(String[] args) {

        System.out.println("Method Overloading Assignment");
        System.out.println();

        System.out.println("Calling multiUse with one integer parameter:");
        multiUse(5);

        System.out.println();

        System.out.println("Calling multiUse with two integer values:");
        System.out.println("This shows argument promotion because the integer values are promoted to double values.");
        double average = multiUse(10, 20);
        System.out.println("The average is " + average);

        System.out.println();

        double decimalValue = 17.8;
        int castedValue = (int) decimalValue;

        System.out.println("Casting example:");
        System.out.println(decimalValue + " was cast to " + castedValue);

        System.out.println();

        System.out.println("Calling multiUse with three integer parameters:");
        int maximum = multiUse(castedValue, 25, 12);
        System.out.println("The maximum is " + maximum);
    }

    public static void multiUse(int number) {

        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static double multiUse(double firstNumber, double secondNumber) {

        double average = (firstNumber + secondNumber) / 2;

        return average;
    }

    public static int multiUse(int firstNumber, int secondNumber, int thirdNumber) {

        int maximum = firstNumber;

        if (secondNumber > maximum) {
            maximum = secondNumber;
        }

        if (thirdNumber > maximum) {
            maximum = thirdNumber;
        }

        return maximum;
    }
}