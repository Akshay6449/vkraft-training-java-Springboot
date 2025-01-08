package JavaDay2;

public class OnlineExamTimer {
    public static void main(String[] args) throws InterruptedException {
        int timeRemaining = 60;
        while (timeRemaining > 0) {
            System.out.println("Time remaining: " + timeRemaining + " minutes");
            Thread.sleep(60000);
            timeRemaining--;
        }
        System.out.println("Time's up!");
    }
}
