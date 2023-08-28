package io.lsn;

import java.util.*;

public class SortElements {
    public static void main(String[] args) {
        List<Integer> inputList = getIntegerList();
        sortListAscending(inputList); // sort list without using Stream API to decrease libraries usage

        System.out.println("Input list: "+inputList);
        System.out.println("Sorted list: "+inputList);
        System.out.println("List count: "+inputList.size());
        System.out.println("Distinct: "+getDistinctElements(inputList));
        System.out.println("Min value: "+inputList.get(0));
        System.out.println("Max value: "+inputList.get(inputList.size()-1));
    }

    private static int getDistinctElements(List<Integer> sortedListAscending) {
        Set<Integer> distinctElements = new HashSet<>(sortedListAscending);
        return distinctElements.size();
    }

    private static void sortListAscending(List<Integer> inputList) {
        Collections.sort(inputList);
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