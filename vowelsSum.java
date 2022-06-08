import java.util.Scanner;

public class vowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int value = 0;
        for (int i = 0; i < word.length(); i++) {
            char vowel = word.charAt(i);
            switch (vowel) {
                case 'a':
                    value += 1;
                    break;
                case 'e':
                    value += 2;
                    break;
                case 'i':
                    value += 3;
                    break;
                case 'o':
                    value += 4;
                    break;
                case 'u':
                    value += 5;
            }
        }
        System.out.println(value);
    }
}
