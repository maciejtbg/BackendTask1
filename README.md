# Sorting App

This is a simple Java application that allows you to input a list of integers, sorts them in ascending order, and
provides various statistics about the sorted list.

## Usage

1. Run the `SortingApp` class. You can use your preferred Java development environment or compile and run the code from
   the command line.

2. Enter any number of integers one by one. When you are finished, press `Enter`.

3. You can uncomment proper line to input list directly from code.

4. The application will display the following information about the sorted list:
    - List of integers sorted in ascending order.
    - count: Total number of integers in the sorted list.
    - distinct: Number of distinct elements in the sorted list.
    - min: The smallest integer in the sorted list.
    - max: The largest integer in the sorted list.

## Dependencies

The application uses Java's built-in libraries and does not require any external dependencies.

## Notes

- The application sorts the list using the `Collections.sort()` method to keep library usage minimal and avoid using the
  Stream API.
- The sorting algorithm used is based on the default sorting algorithm provided by Java.
- Input validation is performed to ensure that only valid integers are added to the list.

---

Created by Maciej Wyrzykowski for LSN
