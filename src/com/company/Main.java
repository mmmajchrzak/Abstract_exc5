package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 10, 20};
        int ele = 30;
        WyszukiwanieRownych search = new WyszukiwanieRownych();
        int index = search.szukaj(a, ele);

        if (index == -1) {
            System.out.println("Nie znaleziono");
        } else {
            System.out.println("Znaleziono w indeksie numer: " + index);
        }
    }
}
abstract class Wyszukiwanie {

    boolean porownaj(int a, int b) {

        return false;
    }
    public int szukaj(int[] a, int ele) {
        for (int i = 0; i < a.length; i++) {

            if (porownaj(a[i], ele)) {
                return i;
            }
        }
        return -1;
    }
}
class WyszukiwanieRownych extends Wyszukiwanie {
    public boolean porownaj(int a, int b) {
        return a == b;
    }
}

class WyszukiwanieNierownych extends Wyszukiwanie {
    public boolean porownaj(int a, int b) {
        return a != b;
    }
}