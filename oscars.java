import java.util.Scanner;

public class oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actorsName = scan.nextLine();
        int pointsOfAcademy = Integer.parseInt(scan.nextLine());
        int numberOfJudge = Integer.parseInt(scan.nextLine());
        double points = 0.0;
        String judge = "";
        int maxj=Integer.MIN_VALUE;
        double totalPoints= pointsOfAcademy+points+1/2;
        for (int i =0 ; i <numberOfJudge ; i++) {
            String judgesName = scan.nextLine();
            double judgePoints = Double.parseDouble(scan.nextLine());
            judge=judgesName;
            points=points+(judgePoints*(maxj+1))/2;
            for (int j = 0; j <judgesName.length() ; j++) {
                if (j>maxj) {
                    maxj = j;
                }
                }
            if (totalPoints>1250.5) {
                break;
                    }
        }
        if (totalPoints>1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorsName,totalPoints);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!",actorsName,1250.5-totalPoints);
        }
    }
}

