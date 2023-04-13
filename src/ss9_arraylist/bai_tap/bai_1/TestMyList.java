package ss9_arraylist.bai_tap.bai_1;

import ss9_arraylist.bai_tap.bai_1.MyList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<String> list = new MyList<String>();
        list.add("one ", 0);
        list.add("true", 1);
        list.add("three", 2);
        list.add("four", 3);
        list.add("five", 4);
        System.out.println("phần tử bị xóa : " + list.get(3));
        String Remove = (String) list.remove(3);
        System.out.println("danh sách mảng sau khi bị xóa : " + list);


    }
}
