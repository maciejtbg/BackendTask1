package io.lsn;

import java.util.*;

public class SortingApp {
    public static void main(String[] args) {
        List<Integer> inputList = getIntegerList();
        List<Integer> sortedList = sortListAscending(inputList); // sort list without using Stream API to decrease libraries usage

        System.out.println("Input list: " + inputList);
        System.out.println("Sorted list: " + sortedList);
        System.out.println("List count: " + sortedList.size());
        System.out.println("Distinct: " + getDistinctElements(sortedList));
        System.out.println("Min value: " + sortedList.get(0));
        System.out.println("Max value: " + sortedList.get(sortedList.size() - 1));
    }

    static int getDistinctElements(List<Integer> sortedListAscending) {
        Set<Integer> distinctElements = new HashSet<>(sortedListAscending);
        return distinctElements.size();
    }

    static List<Integer> sortListAscending(List<Integer> inputList) {
        List<Integer> sortedList = new ArrayList<>(inputList);
        Collections.sort(sortedList);
        return sortedList;
    }

    private static List<Integer> getIntegerList() {
        System.out.println("Enter any number of integers. When You finish, press Enter...");
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        String userInput;
        int variable;

        while (true) { // while loop can be broken from inside
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