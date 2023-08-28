package io.lsn;

import java.util.*;

public class SortElements {
    public static void main(String[] args) {
        List<Integer> inputList = getIntegerList();
        List<Integer> sortedListAscending = sortListAscending(inputList);

        System.out.println(inputList);
        System.out.println(sortedListAscending);
    }

    private static List<Integer> sortListAscending(List<Integer> inputList) {
        List<Integer> sortedList = new ArrayList<>();
        return sortedList;
    }

    private static List<Integer> getIntegerList() {
        System.out.println("Enter any number of integers. When You finish, press Enter...");
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        String userInput;
        Integer variable;

        while (true) {
            userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            try {
                variable = Integer.parseInt(userInput);
                inputList.add(variable);
            } catch (NumberFormatException e) {
                System.err.println("Invalid format. Ignoring: " + userInput);
            }
        }
        return inputList;
    }
}