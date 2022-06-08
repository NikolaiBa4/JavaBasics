import java.util.Scanner;

public class trackingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfGroups = Integer.parseInt(scan.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int sum = 0;
        for (int i = 1; i <= numberOfGroups; i++) {
            int members = Integer.parseInt(scan.nextLine());
            if (members <= 5) {
                musala += members;
                sum += members;
            } else if (members <= 12) {
                monblan += members;
                sum += members;
            } else if (members <= 25) {
                kilimanjaro += members;
                sum += members;
            } else if (members <= 40) {
                k2 += members;
                sum += members;
            } else {
                everest += members;
                sum += members;
            }
        }
        double percent1 = musala * 1.0 / sum * 100;
        double percent2 = monblan * 1.0 / sum * 100;
        double percent3 = kilimanjaro * 1.0 / sum * 100;
        double percent4 = k2 * 1.0 / sum * 100;
        double percent5 = everest * 1.0 / sum * 100;
        System.out.printf("%.2f%%\n", percent1);
        System.out.printf("%.2f%%\n", percent2);
        System.out.printf("%.2f%%\n", percent3);
        System.out.printf("%.2f%%\n", percent4);
        System.out.printf("%.2f%%\n", percent5);
    }
}
