package MidExamRetake;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpiceShelf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] data = line.split(", ");
        List<String> spices = new LinkedList<>();
        for (int i = 0; i < data.length; i++) {
            spices.add(i, data[i]);
        }
        line = scan.nextLine();
        while (!line.equals("done")) {
            data = line.split("\\s+");
            String command = data[0];
            switch (command) {
                case "AddSpice":
                    if (!spices.contains(data[1])) {
                        spices.add(data[1]);
                    }
                    break;
                case "AddManySpices":
                    int startIndex = Integer.parseInt(data[1]);
                    String[] spicesToAdd = data[2].split("\\|");
                    for (int i = startIndex; i < startIndex + spicesToAdd.length; i++) {
                        spices.add(i, spicesToAdd[i - startIndex]);
                    }
                    break;
                case "SwapSpices":
                    String firstSpiceToSwap = data[1];
                    String secondSpiceToSwap = data[2];
                    if (spices.contains(firstSpiceToSwap) && spices.contains(secondSpiceToSwap)) {
                        for (int i = 0; i < spices.size(); i++) {
                            if (spices.get(i).equals(firstSpiceToSwap)) {
                                spices.set(i, secondSpiceToSwap);
                            } else if (spices.get(i).equals(secondSpiceToSwap)) {
                                spices.set(i, firstSpiceToSwap);
                            }
                        }
                    }
                    break;
                case "ThrowAwaySpices":
                    String start = data[1];
                    int spicesToRemove = Integer.parseInt(data[2]);
                    int startNumber = 0;
                    if (spices.contains(start)) {
                        startNumber = spices.indexOf(start);
                        for (int i = startNumber + spicesToRemove - 1; i >= startNumber; i--) {
                            spices.remove(i);
                        }
                    }
                    break;
                case "Arrange":
                    spices = spices.stream().sorted((s, s1) -> s.compareTo(s1)).collect(Collectors.toList());
                    break;
            }
            line = scan.nextLine();
        }
        for (int i = 0; i < spices.size(); i++) {
            if (i < spices.size() - 1) {
                System.out.printf("%s ", spices.get(i));
            } else {
                System.out.printf("%s", spices.get(i));
            }

        }
    }
}
//coriander, cloves, paprika, allspice, turmeric, anise, cumin
//AddSpice nutmeg
//ThrowAwaySpices cloves 3
//AddManySpices 3 cayenne|cardamom|mace
//done

//coriander, cloves, paprika, cumin
//AddSpice nutmeg
//AddSpice anise
//AddSpice turmeric
//AddSpice cumin
//SwapSpices coriander paprika
//ThrowAwaySpices cumin 4
//done

//coriander, cloves, paprika, cumin
//AddSpice nutmeg
//AddSpice anise
//AddSpice turmeric
//AddSpice cumin
//SwapSpices coriander paprika
//ThrowAwaySpices cumin 4
//Arrange
//done