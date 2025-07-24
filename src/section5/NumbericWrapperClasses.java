package section5;

public class NumbericWrapperClasses {
    public static void main(String[] args) {

        int num1 = 7;
        Integer num2 = Integer.valueOf(num1);
        Double myDouble = Double.valueOf(123.434);
        Float myFloat = Float.valueOf(123.434f);
        storeDate(num1);

        // Parsing strings to primitive types
        String myAge = "29";

        int age = Integer.parseInt(myAge);
        double amount = Double.parseDouble("123.434");
        boolean flag = Boolean.parseBoolean("true");

        System.out.println(age);

        System.out.printf("You will be %d years old in 15 years.%n", age + 15);

    }

    /**
     * This method is a placeholder for storing date-related information.
     * Currently, it does not perform any operations.
     *
     * @param obj The object to be stored, which could represent a date or other information.
     */
    public static void storeDate(Object obj) {

    }
}
