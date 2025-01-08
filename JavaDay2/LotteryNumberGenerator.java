package JavaDay2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> lotteryNumbers = new HashSet<>();
        int numberOfNumbers = 7;

        while (lotteryNumbers.size() < numberOfNumbers) {
            lotteryNumbers.add(random.nextInt(100) + 1);
        }

        System.out.println("Lottery Numbers: " + lotteryNumbers);
    }
}
