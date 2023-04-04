package ss2_loop.bai_tap;

class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int num;
        String Numbers = "";
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                Numbers = Numbers + i + " ";
            }
        }
        System.out.println("Các số nguyên tố từ 1 đến 100 là:" + Numbers);
    }
}
