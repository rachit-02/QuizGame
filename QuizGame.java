import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");
        
        String[][] questions = {
            {"Which is the third Planet in our solar system?", "a) Earth", "b) Pluto", "c) Jupiter", "d) Venus", "a"},
            {"What is 5 + 7?", "a) 10", "b) 12", "c) 14", "d) 15", "b"},
            {"What is the Capital of Maharastra?", "a) Raipur", "b) Mumbai", "c) Dehradun", "d) Delhi", "b"},
            {"What is the largest planet in our solar system?", "a) Earth", "b) Mars", "c) Jupiter", "d) Venus", "c"},
            {"What is the chemical symbol for water?", "a) H2O", "b) O2", "c) CO2", "d) NaCl", "a"},
            {"How many continents are there on Earth?", "a) 5", "b) 6", "c) 7", "d) 8", "c"},
            {"What is the capital of Japan?", "a) Seoul", "b) Beijing", "c) Tokyo", "d) Bangkok", "c"},
            {"What is the full form of DevOps?", "a) Developer Optimization", "b)  Development and Operations", "c) Deployment Operations", "d) Digital Optimization", "b"},
            {"What is the powerhouse of the cell?", "a) Nucleus", "b) Ribosome", "c) Mitochondria", "d) Golgi Apparatus", "c"},
            {"Which planet is known as the Red Planet?", "a) Venus", "b) Mars", "c) Mercury", "d) Saturn", "b"}
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals(questions[i][5])) {
                score++;
            }
        }

        System.out.println("Your final score is: " + score + "/10");
        scanner.close();
    }
}

