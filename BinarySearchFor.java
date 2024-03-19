package hw_13032024;
//Реализовать бинарный поиск с помощью итеративного подхода(через циклы)
public class BinarySearchFor {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 14, 24, 26, 31, 45};
        int target = 31;
        int index = binarySearch(array, target);
        System.out.println(array.length);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int leftIdx = 0;
        int rightIdx = array.length - 1;
        while (leftIdx <= rightIdx) {
            int midIdx = leftIdx + (rightIdx - leftIdx) / 2;
            System.out.println("midIdx: " + midIdx);
            if (array[midIdx] == target) {
                return midIdx;
            } else if (array[midIdx] < target) {
                leftIdx = midIdx + 1;
            } else {
                rightIdx = midIdx - 1;
            }
        }

        return -1; // Element not found
    }
}