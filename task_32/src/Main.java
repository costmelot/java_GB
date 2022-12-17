//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();

        list.add(1);
        list.add(11);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(6);

        list.removeIf(number -> number % 2 == 0);
        System.out.println("Нечетные числа массива = "+list);
    }
}