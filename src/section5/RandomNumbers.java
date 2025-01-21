package section5;

import java.security.SecureRandom;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random(394573945); //Seed

        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));
        System.out.println(random.nextInt(10));

        SecureRandom secureRandom = new SecureRandom();

        System.out.println(secureRandom.nextInt(10));
        System.out.println(secureRandom.nextInt(10));
        System.out.println(secureRandom.nextInt(10));
        System.out.println(secureRandom.nextInt(10));
        System.out.println(secureRandom.nextInt(10));
    }
}
