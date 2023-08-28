package io.lsn;

import java.util.*;

public class SortingApp {
    public static void main(String[] args) {
        List<Integer> inputList = getIntegerList();
//        List<Integer> inputList = Arrays.asList(5, 2, 1, 4, 4, 3); //uncomment this code to pass input list from here
        List<Integer> sortedList = sortListAscending(inputList); // sort list without using Stream API to decrease libraries usage

        System.out.println(adjustFormat(sortedList));
        System.out.println("count: " + sortedList.size());
        System.out.println("distinct: " + getDistinctElements(sortedList));
        System.out.println("min: " + sortedList.get(0));
        System.out.println("max: " + sortedList.get(sortedList.size() - 1));
    }

    private static String adjustFormat(List<Integer> sortedList) {
        String output = sortedList.toString();
        return output.replace("[","").replace("]","").replaceAll(",","");

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