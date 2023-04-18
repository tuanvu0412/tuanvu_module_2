package ss12_linear_search.bai_tap;

public class BinarySearch {
    public int binarySearch(int[] arr, int value, int left, int right) {
        if (left <= right) {
            int middle = (right + left) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (value < arr[middle]) {
                return binarySearch(arr, value, left, middle - 1);
            } else {
                return binarySearch(arr, value, middle + 1, right);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binary = new BinarySearch();
        int[] array = {3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        int value = 5;
        int result = binary.binarySearch(array, value, 0, n - 1);
        if (result == -1) {
            System.out.println("không tìm thấy");
        } else {
            System.out.println("giá trị được tìm thấy là " + result);
        }
    }
}
