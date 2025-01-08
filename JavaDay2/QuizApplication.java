package JavaDay2;

import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "What is the capital of France?",
                "What is 2 + 2?",
                "Who wrote 'Hamlet'?"
        };
        String[] answers = { "Paris", "4", "Shakespeare" };
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                score++;
            }
        }

        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
