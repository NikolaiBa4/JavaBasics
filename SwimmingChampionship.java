package MidExamRetake;

import java.util.Scanner;

public class SwimmingChampionship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int points = Integer.parseInt(scan.nextLine());
        int countOfSwimmers = Integer.parseInt(scan.nextLine());
        double hotel = Double.parseDouble(scan.nextLine());
        double fee = Double.parseDouble(scan.nextLine());
        double pointsAdded = 0;
        int daysCounter = 0;
        double dayPoints = 0;
        double sum = 0;
        for (int i = 0; i < days; i++) {
            if (daysCounter > 0) {
                pointsAdded += dayPoints * 0.05;
            }
            daysCounter++;
            dayPoints = Double.parseDouble(scan.nextLine());
            pointsAdded += dayPoints;
        }
        double toPayAll = (countOfSwimmers * hotel * days) + (fee * countOfSwimmers);
        double clubFee = toPayAll;
        double sponsorFee = 0;
        if (pointsAdded >= points) {
            sponsorFee = toPayAll * 0.25;
            clubFee -= sponsorFee;
            System.out.printf("Money left to pay: %.2f BGN.%n", clubFee);
            System.out.printf("The championship was successful!");
        } else {
            sponsorFee = toPayAll * 0.10;

            clubFee -= sponsorFee;
            System.out.printf("Money left to pay: %.2f BGN.%n", clubFee);
            System.out.printf("The championship was not successful.");
        }
    }
}
