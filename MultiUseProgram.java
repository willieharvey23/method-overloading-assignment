public class MultiUseProgram {

    public static void main(String[] args) {

        // display the program title
        System.out.println("Method Overloading Assignment");
        System.out.println();

        // call the multiUse method with one integer parameter
        System.out.println("Calling multiUse with one integer parameter:");
        multiUse(5);

        System.out.println();

        // call the multiUse method with two integer values
        System.out.println("Calling multiUse with two integer values:");

        // the integer values are promoted to double values
        System.out.println("This shows argument promotion because the integer values are promoted to double values.");

        // store the average returned from the method
        double average = multiUse(10, 20);

        // display the average
        System.out.println("The average is " + average);

        System.out.println();

        // create a double value for casting
        double decimalValue = 17.8;

        // cast the double value to an integer
        int castedValue = (int) decimalValue;

        // display the casting example
        System.out.println("Casting example:");
        System.out.println(decimalValue + " was cast to " + castedValue);

        System.out.println();

        // call the multiUse method with three integer parameters
        System.out.println("Calling multiUse with three integer parameters:");

        // store the maximum value returned from the method
        int maximum = multiUse(castedValue, 25, 12);

        // display the maximum value
        System.out.println("The maximum is " + maximum);
    }

    // this method prints numbers from 1 to the number given
    public static void multiUse(int number) {

        // loop from 1 to the number
        for (int i = 1; i <= number; i++) {

            // print each number
            System.out.print(i + " ");
        }

        // move to the next line
        System.out.println();
    }

    // this method finds the average of two numbers
    public static double multiUse(double firstNumber, double secondNumber) {

        // calculate the average
        double average = (firstNumber + secondNumber) / 2;

        // return the average
        return average;
    }

    // this method finds the maximum of three numbers
    public static int multiUse(int firstNumber, int secondNumber, int thirdNumber) {

        // start by making the first number the maximum
        int maximum = firstNumber;

        // check if the second number is larger
        if (secondNumber > maximum) {
            maximum = secondNumber;
        }

        // check if the third number is larger
        if (thirdNumber > maximum) {
            maximum = thirdNumber;
        }

        // return the largest number
        return maximum;
    }
}