//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<String, String>();

        phonebook.put("+79152356588", "Иванов Петр");
        phonebook.put("+79235689785", "Петров Ивн");
        phonebook.put("+74956875235", "Сидоров Василий");
        phonebook.put("+74954587589", "Иванов Петр");

        Set<String> phoneNumbers = phonebook.keySet();

        for (String phoneNumber : phoneNumbers) {
            String name = phonebook.get(phoneNumber);

            System.out.println("Номер телефона: " + phoneNumber + " ==> Имя: " + name);
        }
    }
}