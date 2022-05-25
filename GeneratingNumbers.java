package MidExamRetake;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GeneratingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] data = line.split("\\s+");
        List<Integer> inputs = new LinkedList<>();
        for (int i = 0; i < data.length; i++) {
            inputs.add(Integer.parseInt(data[i]));
        }
        line = scan.nextLine();
        while (!line.equals("END")) {
            data = line.split("\\s+");
            String command = data[0];
            switch (command) {
                case "add":
                    for (int i = 3; i < data.length; i++) {
                        int toAdd = Integer.parseInt(data[i]);
                        inputs.add(i - 3, toAdd);
                    }
                    break;
                case "remove":
                    if (data[1].equals("greater")) {
                        int number = Integer.parseInt(data[3]);
                        inputs = inputs.stream().filter(s -> s <= number).collect(Collectors.toList());
                    } else if (data[1].equals("at")) {
                        int index = Integer.parseInt(data[3]);
                        if (index >= 0 && index < inputs.size()) {
                            inputs.remove(index);
                        }
                    }
                    break;
                case "replace":
                    int value = Integer.parseInt(data[1]);
                    int replacement = Integer.parseInt(data[2]);
                    for (int i = 0; i < inputs.size(); i++) {
                        if (inputs.get(i) == value) {
                            inputs.set(i, replacement);
                            break;
                        }
                    }
                    break;
                case "find":
                    for (int i = 0; i < inputs.size(); i++) {
                        if (data[1].equals("even")) {
                            if (i < inputs.size() - 1 && inputs.get(i) % 2 == 0) {
                                System.out.printf("%d ", inputs.get(i));
                            } else if (i < inputs.size() && inputs.get(i) % 2 == 0) {
                                System.out.printf("%d", inputs.get(i));
                            }
                        } else if (data[1].equals("odd")) {
                            if (i < inputs.size() - 1 && inputs.get(i) % 2 != 0) {
                                System.out.printf("%d ", inputs.get(i));
                            } else if (i < inputs.size() && inputs.get(i) % 2 != 0) {
                                System.out.printf("%d", inputs.get(i));
                            }
                        }
                    }
                    break;
            }
            line = scan.nextLine();
        }
        System.out.println();
        for (int i = 0; i < inputs.size(); i++) {
            if (i < inputs.size() - 1) {
                System.out.printf("%d, ", inputs.get(i));
            } else {
                System.out.printf("%d", inputs.get(i));
            }
        }
    }
}
//1 2 3 10 10 6 4 10
//add to start 1 2 3
//remove greater than 5
//find even
//END

//1 2 3 10 10 6 4 10
//replace 10 1
//remove at index 0
//add to start 4 2
//END

//1 2 3 10 10 6 4 10
//find odd
//replace 4 1
//remove greater than 5
//END