//Пусть дан список сотрудников. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности.

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        String str = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел " +
                "Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна " +
                "Владимирова Иван Мечников Петр Петин Иван Ежов";
        String[] words = str.trim().split(" ");
        Map<String, Integer> duplicateString = new HashMap<>();
        int count = 1;
        for (String x : words) {
            if (duplicateString.containsKey(x)) {
                duplicateString.put(x, duplicateString.get(x) + 1);
            } else {
                duplicateString.put(x, count);
            }
        }
        System.out.println("Повторяющиеся имена : ");
        for (Map.Entry a : duplicateString.entrySet()) {
            int val = (Integer) a.getValue();
            if (val > 1) {
                System.out.println(a);
            }
        }
    }
}