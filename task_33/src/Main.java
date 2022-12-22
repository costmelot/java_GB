//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(8);
        arr.add(32);
        arr.add(21);
        arr.add(31);

        int min = arr.get(0);
        int max = arr.get(0);
        double sum = 0;

        int sizeOfArray = arr.size();

        for (int i = 1; i < sizeOfArray; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }

        for (int i = 1; i < sizeOfArray; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        for (Integer integer : arr) {
            sum += integer;
        }
        double average = sum / arr.size();


        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение = " + min);
        System.out.println("Среднее значение = " + average);
    }
}