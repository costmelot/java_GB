import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        List<Product> productList = new ArrayList<Product>();

        // Adding Products
        productList.add(new Product("Lenovo", 4, "Windows", 2,
                "blue", 80000));
        productList.add(new Product("Mac", 16, "MacOS", 1,
                "white", 140000));
        productList.add(new Product("Dell", 32, "Linux", 2,
                "grey", 99000));
        productList.add(new Product("Mac", 12, "MacOS", 1,
                "silver", 100000));
        productList.add(new Product("Acer", 16, "MacOS", 1,
                "silver", 130000));
        productList.add(new Product("Mac", 4, "MacOS", 1,
                "silver", 90000));
        productList.add(new Product("HP", 12, "NoOS", 1,
                "black", 100000));
        productList.add(new Product("Asus", 16, "NoOS", 1,
                "silver", 80000));
        productList.add(new Product("Mac", 16, "MacOS", 2,
                "white", 180000));
        productList.add(new Product("Mac", 4, "MacOS", 1,
                "silver", 100000));

        System.out.println("Весь ассортимент:");
        System.out.println(productList);
        System.out.println();

        String act;

        System.out.println("Выберите фильтр: (1) Фильтровать по размеру оперативной памяти, " +
                "(2) Фильтровать по размеру жесткого диска, (3) Фильтровать по цене, (4) Фильтровать по операционной " +
                "системе, (5) Фильтровать по бренду, (exit)выход");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while (!act.equals("exit")) {

            if (act.equals("1")) {
                System.out.println("Введите 4, 12, 16, 32:");
                Integer opMemory = Integer.valueOf(bf.readLine());
                List<Product> filteredByMemory = productList.stream()
                        .filter(p -> p.getRandomAccessMemory() >= opMemory)
                        .toList(); // collecting as list

                filteredByMemory.forEach(System.out::println);

            } else {

                if (act.equals("2")) {
                    System.out.println("Введите минимальный размер диска 1, 2 :");
                    Integer diskSize = Integer.valueOf(bf.readLine());
                    List<Product> filteredByDiskSize = productList.stream()
                            .filter(p -> p.getHardDiskSize() >= diskSize)
                            .toList(); // collecting as list
                    filteredByDiskSize.forEach(System.out::println);

                } else {
                    if (act.equals("3")) {
                        System.out.println("Введите максимальную цену:");
                        Integer ourPrice = Integer.valueOf(bf.readLine());
                        List<Product> filteredByPrice = productList.stream()
                                .filter(p -> p.getPrice() <= ourPrice)
                                .toList();
                        filteredByPrice.forEach(System.out::println);// collecting as list

                    } else {

                        if (act.equals("4")) {
                            System.out.println("Введите операционную систему Windows, MacOS, Linux, NoOS");
                            String opSystem = bf.readLine();
                            List<Product> filteredByOpSystem = productList.stream()
                                    .filter(p -> p.getOperatingSystem().equals(opSystem))
                                    .toList();
                            filteredByOpSystem.forEach(System.out::println);
                        } else {

                            if (act.equals("5")) {
                                System.out.println("Введите бренд Lenovo, Mac, Acer, HP, Dell");
                                String ourBrands = bf.readLine();
                                List<Product> filteredByourBrands = productList.stream()
                                        .filter(p -> p.getNameOfBrand().equals(ourBrands))
                                        .toList();
                                filteredByourBrands.forEach(System.out::println);

                            }
                        }
                    }
                }
            }
            System.out.println("Выберите фильтр: (1) Фильтровать по размеру оперативной памяти, " +
                    "(2) Фильтровать по размеру жесткого диска, (3) Фильтровать по цене, (4) Фильтровать по операционной " +
                    "системе, (5) Фильтровать по бренду, (exit)выход");
            act = bf.readLine();
        }
    }
}