import java.util.Scanner;

public class repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int area = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int diluent = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double nylonprice = (area + 2) * 1.50;
        double paintPrice = (paint * 14.50) * 1.10;
        double diluentPrice = diluent * 5.00;
        double TotalWithoutPaiment = nylonprice + paintPrice + diluentPrice + 0.40;
        double worckersPaiment = (TotalWithoutPaiment * 0.30) * hours;
        System.out.println(worckersPaiment + TotalWithoutPaiment);

    }
}
