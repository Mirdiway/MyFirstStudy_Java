//Миронов В.Д. УБСТ-2404 11.11.26 (Mirdiway)

import java.util.HashMap;

class Product 
{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void showInfo() 
    {
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Количество: " + quantity);
    }
}

public class Practical3
{
    public static void main(String[] args) // Главный класс, которые запускает дочерние классы
    {
        System.out.println("Миронов В.Д. Вариант-5 УБСТ-2404 11.11.26 (Mirdiway)");

        // Создаем хэш-таблицу
        HashMap<String, Product> warehouse = new HashMap<>();

        // Создаем товары
        Product product1 = new Product("Яблоко", 45, 1000);
        Product product2 = new Product("Мышь белая", 1200, 15);
        Product product3 = new Product("Злой кола", 220, 557);
        Product product4 = new Product("Свежасть снега", 140, 54);
        Product product5 = new Product("Морская кола", 215, 508);
        Product product6 = new Product("Картошкачипс", 94, 51);

        // Вставка товаров
        warehouse.put("111111", product1);
        warehouse.put("222222", product2);
        warehouse.put("333333", product3);
        warehouse.put("444444", product4);
        warehouse.put("555555", product5);
        warehouse.put("666666", product6);

        // Поиск товара по штрихкоду
        String barcode = "111111";

        if (warehouse.containsKey(barcode)) 
        {
            System.out.println("Найден товар:");
            warehouse.get(barcode).showInfo();
        } 
        else 
        {
            System.out.println("Товар не найден.");
        }

        // Удаление товара
        warehouse.remove("111111");

        // Вывод оставшихся товаров
        System.out.println("\nТовары на складе:");

        for (String key : warehouse.keySet()) 
        {
            System.out.println("\nШтрихкод: " + key);
            warehouse.get(key).showInfo();
        }
    }
}

//Миронов В.Д. УБСТ-2404 11.11.26 (Mirdiway)




