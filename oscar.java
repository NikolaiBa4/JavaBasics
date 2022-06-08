import java.util.Scanner;

public class oscar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double initialPoints = Double.parseDouble(scan.nextLine());
        int numberOfJudges = Integer.parseInt(scan.nextLine());
        double totalPoints = initialPoints;
        for (int i = 1; i <= numberOfJudges; i++) {
            String nameOfJudge = scan.nextLine();
            double pointsOfJudge = Double.parseDouble(scan.nextLine());
            int pointOfName = nameOfJudge.length();
            double judgeResult = pointsOfJudge * pointOfName / 2;
            totalPoints += judgeResult;
            if (totalPoints > 1250.5) {
                break;
            }
        }
        if (totalPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.01f!", name, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.01f more!", name, 1250.5 - totalPoints);
        }
    }
}
