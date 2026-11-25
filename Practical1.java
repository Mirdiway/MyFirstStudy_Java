//Миронов В.Д. УБСТ-2404 11.11.26 (Mirdiway)

import java.util.Scanner;

public class Practical1 
{
    public static void main(String[] args) // Главный класс, которые запускает дочерние классы
    {
        while (true)
        {
            Scanner supperpuperInput = new  Scanner(System.in, "CP866");

            System.out.println("Миронов В.Д. УБСТ-2404 11.11.26 (Mirdiway)");
            System.out.println("Выберите тип действия:");
            System.out.println("1 = Вывести текстовое сообщение");
            System.out.println("2 = Получение массива чисе и вывод ответа, является ли оно простым или нет");
            System.out.println("3 = Проверка на полиморфность слова");

            int nextdataport = supperpuperInput.nextInt();
            switch (nextdataport)
            {
                case 1:
                    JavaHelloWorldProgram(args);
                    break;
                case 2:
                    Primes(args);
                    break;
                case 3:
                    Palindrome();
                    break;
                default:
                    System.out.println("Что-то пошло не так.");
                    break;
            }
        }
    }


    /*0*/public static void JavaHelloWorldProgram(String[] args) // Вывод тектового сообщения
    {
        System.out.println("Hello, World!   JavaHelloWorldProgram");
        System.out.println("Миронов В.Д. УБСТ-2404 11.11.26 (Mirdiway)");
    }

    /*Задание 1-0*/public static void Primes(String[] args) // Получение массива чисе и вывод ответа. Для работы нужен IsPrime
    {
        Scanner scanner123 = new Scanner(System.in);
        System.out.println("Миронов В.Д. УБСТ-2404 11.11.26 (Mirdiway)");
        System.out.println("Введите число или группу чисел через пробел, которые Вы хотите проверить, после нажмите Enter на клавиатуре");
        String lineScan = scanner123.nextLine(); // Читаем всю строку
        String[] dragons = lineScan.split(" "); // Разбиваем массив чисел через пробел

        for (String part : dragons)
        {
            int num = Integer.parseInt(part); //Превращение каждой строки в число
            if (IsPrime(num))
            {
                System.out.println("Число " + num + " простое");
            }
            else
            {
                System.out.println("----- Число " + num + " не является простым -----");
            }
        }

    }
    /*Задание 1-1*/public static boolean IsPrime (int n) // Определяем простые числа
    {
            if (n < 2) return false; // числа, меньше 2 не простые
            if (n == 2) return true; // число 2 равно простому
            if (n % 2 == 0) return false; // убираем все четные числа
            // проверка только нечетных делителей до квадратного корня
            int limit = (int)Math.sqrt(n);
            for (int furry = 3; furry <= limit; furry += 2){
                if (n % furry == 0){
                    return false; // Число составное, если делитель найден
                }
            }
            return  true; // Делитель не нашёлся - число простое
    }

    /*Задание 2-1*/public static void Palindrome() //Проверка на полиморфность
    {
        System.out.println("Миронов В.Д. УБСТ-2404 11.11.26 (Mirdiway)");
        Scanner inputTextUser = new  Scanner(System.in, "CP866");
        String wdfDogs = "";

        System.out.println("Введите слово, которое хотите проверить на полиморфность");
        String sText = inputTextUser.nextLine();

        for(int q = sText.length() - 1; q >= 0; q--) // Выполняем переворачивание
        {
            wdfDogs = wdfDogs + sText.charAt(q);
        }

        if (sText.equalsIgnoreCase(wdfDogs)) // Проверка на палиндром
        {
            System.out.println("Слово палиндром");
        }
        else
        {
            System.out.println("Слово не палиндром");
        }
    }
}
//Миронов В.Д. УБСТ-2404 11.11.26 (Mirdiway)




