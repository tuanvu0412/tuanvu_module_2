package ss3_array.bai_tap;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] array = {5, 6, 3, 4, 5, 6, 7};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("phần tử nhỏ nhất trong mảng là: " + min);
    }
}
