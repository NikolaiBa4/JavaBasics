import java.util.Scanner;

public class tennis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tournaments = Integer.parseInt(scan.nextLine());
        int initialPoints = Integer.parseInt(scan.nextLine());
        int points = 0;
        int wins = 0;
        for (int i = 0; i < tournaments; i++) {
            String result = scan.nextLine();
            switch (result) {
                case "W":
                    points += 2000;
                    wins++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;

            }
        }
        System.out.printf("Final points: %d%nAverage points: %d%n%.2f%%", initialPoints + points, points / tournaments
                , wins * 1.0 / tournaments * 100);
    }
}
