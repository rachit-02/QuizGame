import java.util.*;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("\u001B[35m" + "╔══════════════════════════════════════╗");
        System.out.println("║       Welcome to the Quiz Game!      ║");
        System.out.println("╚══════════════════════════════════════╝\u001B[0m");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String[][] questions = {
                {"Which is the third Planet in our solar system?", "a) Earth", "b) Pluto", "c) Jupiter", "d) Venus", "a"},
                {"What is 5 + 7?", "a) 10", "b) 12", "c) 14", "d) 15", "b"},
                {"What is the Capital of Maharastra?", "a) Raipur", "b) Mumbai", "c) Dehradun", "d) Delhi", "b"},
                {"What is the largest planet in our solar system?", "a) Earth", "b) Mars", "c) Jupiter", "d) Venus", "c"},
                {"What is the chemical symbol for water?", "a) H2O", "b) O2", "c) CO2", "d) NaCl", "a"},
                {"How many continents are there on Earth?", "a) 5", "b) 6", "c) 7", "d) 8", "c"},
                {"What is the capital of Japan?", "a) Seoul", "b) Beijing", "c) Tokyo", "d) Bangkok", "c"},
                {"What is the full form of DevOps?", "a) Developer Optimization", "b) Development and Operations", "c) Deployment Operations", "d) Digital Optimization", "b"},
                {"What is the powerhouse of the cell?", "a) Nucleus", "b) Ribosome", "c) Mitochondria", "d) Golgi Apparatus", "c"},
                {"Which planet is known as the Red Planet?", "a) Venus", "b) Mars", "c) Mercury", "d) Saturn", "b"}
        };

        // Shuffle the questions
        List<String[]> questionList = Arrays.asList(questions);
        Collections.shuffle(questionList);
        questions = questionList.toArray(new String[0][]);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n\u001B[34mQuestion " + (i + 1) + ": " + questions[i][0] + "\u001B[0m");
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals(questions[i][5])) {
                System.out.println("\u001B[32mCorrect! ✅\u001B[0m");
                score++;
            } else {
                System.out.println("\u001B[31mWrong! ❌ The correct answer is: " + questions[i][5] + "\u001B[0m");
            }
        }

        // Final result with grading
        double percentage = (score / 10.0) * 100;
        String grade;
        if (score == 10) grade = "A+ (Perfect!)";
        else if (score >= 8) grade = "A";
        else if (score >= 6) grade = "B";
        else if (score >= 4) grade = "C";
        else grade = "D";

        System.out.println("\n\u001B[36mThank you, " + name + "!");
        System.out.println("Your final score is: " + score + "/10");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade + "\u001B[0m");

        System.out.println("\n\u001B[35m╔════════════════════════════╗");
        System.out.println("║   🎉 Thanks for playing! 🎉  ║");
        System.out.println("╚════════════════════════════╝\u001B[0m");

        scanner.close();
    }
}
