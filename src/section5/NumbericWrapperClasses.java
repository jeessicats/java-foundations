package section5;

public class NumbericWrapperClasses {
    public static void main(String[] args) {

        int num1 = 7;
        Integer num2 = Integer.valueOf(num1);
        Double myDouble = Double.valueOf(123.434);
        Float myFloat = Float.valueOf(123.434f);
        storeDate(num1);

        int age = Integer.parseInt("29");
        double amount = Double.parseDouble("123.434");
        boolean flag = Boolean.parseBoolean("true");

        System.out.println(age);

        System.out.printf("You will be %d years old in 15 years.%n", age + 15);

    }

    public static void storeDate(Object obj) {

    }
}
