package JavaDay2;

import java.util.*;

class Question {
    String questionText;
    String[] options;
    String correctAnswer;

    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

class Quiz {
    List<Question> questions;
    int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.questionText);
            for (int i = 0; i < question.options.length; i++) {
                System.out.println((i + 1) + ". " + question.options[i]);
            }

            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (question.options[answer - 1].equals(question.correctAnswer)) {
                score++;
            }
        }
        System.out.println("Quiz finished! Your score: " + score + "/" + questions.size());
    }
}

public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Quiz quiz = new Quiz();

        // Add questions
        String[] options1 = { "Java", "Python", "C++", "Ruby" };
        Question question1 = new Question("Which programming language is used for Android development?", options1,
                "Java");
        quiz.addQuestion(question1);

        String[] options2 = { "HTML", "CSS", "JavaScript", "SQL" };
        Question question2 = new Question("Which language is used for web development?", options2, "JavaScript");
        quiz.addQuestion(question2);

        String[] options3 = { "Eclipse", "NetBeans", "IntelliJ IDEA", "Xcode" };
        Question question3 = new Question("Which is a popular Java IDE?", options3, "IntelliJ IDEA");
        quiz.addQuestion(question3);

        // Start quiz
        System.out.println("Welcome to the Online Examination System!");
        quiz.startQuiz();
    }
}
