package JavaDay2;

import java.util.Random;

public class SensorDataMonitoring {
    public static void main(String[] args) {
        Random random = new Random();
        int readingCount = 0;
        int maxValue = Integer.MIN_VALUE;
        int threshold = 75;

        while (true) {
            int sensorValue = random.nextInt(100);
            readingCount++;
            System.out.println("Reading " + readingCount + ": " + sensorValue);
            if (sensorValue > maxValue) {
                maxValue = sensorValue;
            }
            if (sensorValue > threshold) {
                break;
            }
        }

        System.out.println("Total readings: " + readingCount);
        System.out.println("Highest value recorded: " + maxValue);
    }
}
