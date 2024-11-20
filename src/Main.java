// Алгоритмы и структуры данных. Модуль 3

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Тестирование методов Arrays.binarySearch

        System.out.println("Тестирование методов Arrays.binarySearch:");

        // Создаем массив byte и вызываем метод binarySearch с ключом 3
        byte[] byteArray = {1, 2, 3, 4, 5};
        System.out.println("Создаем массив byte: {1, 2, 3, 4, 5}");
        System.out.println("Поиск 3 в byteArray: " + Arrays.binarySearch(byteArray, (byte) 3)); // должен вывести 2
        // Вызываем метод binarySearch с ключом 3 и интервалом [1, 4)
        System.out.println("Поиск 3 в интервале [1, 4) byteArray: " + Arrays.binarySearch(byteArray, 1, 4, (byte) 3)); // должен вывести 2

        // Создаем массив char и вызываем метод binarySearch с ключом 'e'
        char[] charArray = {'a', 'c', 'e', 'g'};
        System.out.println("Создаем массив char: {'a', 'c', 'e', 'g'}");
        System.out.println("Поиск 'e' в charArray: " + Arrays.binarySearch(charArray, 'e')); // должен вывести 2
        // Вызываем метод binarySearch с ключом 'c' и интервалом [1, 3)
        System.out.println("Поиск 'c' в интервале [1, 3) charArray: " + Arrays.binarySearch(charArray, 1, 3, 'c')); // должен вывести 1

        // Создаем массив double и вызываем метод binarySearch с ключом 0.3
        double[] doubleArray = {0.1, 0.2, 0.3, 0.4, 0.5};
        System.out.println("Создаем массив double: {0.1, 0.2, 0.3, 0.4, 0.5}");
        System.out.println("Поиск 0.3 в doubleArray: " + Arrays.binarySearch(doubleArray, 0.3)); // должен вывести 2
        // Вызываем метод binarySearch с ключом 0.4 и интервалом [1, 4)
        System.out.println("Поиск 0.4 в интервале [1, 4) doubleArray: " + Arrays.binarySearch(doubleArray, 1, 4, 0.4)); // должен вывести 3

        // Создаем массив float и вызываем метод binarySearch с ключом 2.2f
        float[] floatArray = {1.1f, 2.2f, 3.3f};
        System.out.println("Создаем массив float: {1.1f, 2.2f, 3.3f}");
        System.out.println("Поиск 2.2f в floatArray: " + Arrays.binarySearch(floatArray, 2.2f)); // должен вывести 1
        // Вызываем метод binarySearch с ключом 3.3f и интервалом [0, 2)
        System.out.println("Поиск 3.3f в интервале [0, 2) floatArray: " + Arrays.binarySearch(floatArray, 0, 2, 3.3f)); // должен вывести -3 ( -(должен быть индекс + 1) )

        // Создаем массив int и вызываем метод binarySearch с ключом 30
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println("Создаем массив int: {10, 20, 30, 40, 50}");
        System.out.println("Поиск 30 в intArray: " + Arrays.binarySearch(intArray, 30)); // должен вывести 2
        // Вызываем метод binarySearch с ключом 40 и интервалом [1, 4)
        System.out.println("Поиск 40 в интервале [1, 4) intArray: " + Arrays.binarySearch(intArray, 1, 4, 40)); // должен вывести 3

        // Создаем массив long и вызываем метод binarySearch с ключом 200L
        long[] longArray = {100L, 200L, 300L};
        System.out.println("Создаем массив long: {100L, 200L, 300L}");
        System.out.println("Поиск 200L в longArray: " + Arrays.binarySearch(longArray, 200L)); // должен вывести 1
        // Вызываем метод binarySearch с ключом 200L и интервалом [0, 2)
        System.out.println("Поиск 200L в интервале [0, 2) longArray: " + Arrays.binarySearch(longArray, 0, 2, 200L)); // должен вывести 1

        // Создаем массив short и вызываем метод binarySearch с ключом 6
        short[] shortArray = {3, 6, 9};
        System.out.println("Создаем массив short: {3, 6, 9}");
        System.out.println("Поиск 6 в shortArray: " + Arrays.binarySearch(shortArray, (short) 6)); // должен вывести 1
        // Вызываем метод binarySearch с ключом 9 и интервалом [0, 2)
        System.out.println("Поиск 9 в интервале [0, 2) shortArray: " + Arrays.binarySearch(shortArray, 0, 2, (short) 9)); // должен вывести -3 ( -(должен быть индекс + 1) )

        // Создаем массив Integer и вызываем метод binarySearch с ключом 4 и натуральным компаратором
        Integer[] integerArray = {1, 2, 3, 4, 5};
        System.out.println("Создаем массив Integer: {1, 2, 3, 4, 5}");
        System.out.println("Поиск 4 в integerArray с натуральным компаратором: " + Arrays.binarySearch(integerArray, 4, Comparator.naturalOrder())); // должен вывести 3
        // Вызываем метод binarySearch с ключом 3, интервалом [1, 4) и натуральным компаратором
        System.out.println("Поиск 3 в интервале [1, 4) integerArray с натуральным компаратором: " + Arrays.binarySearch(integerArray, 1, 4, 3, Comparator.naturalOrder())); // должен вывести 2

        // Тестирование методов Collections.binarySearch
        System.out.println("\nТестирование методов Collections.binarySearch:");

        // Создаем список Integer и вызываем метод binarySearch с ключом 20
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        System.out.println("Создаем список Integer: [10, 20, 30]");
        System.out.println("Поиск 20 в integerList: " + Collections.binarySearch(integerList, 20)); // должен вывести 1

        // Создаем список String и вызываем метод binarySearch с ключом "banana" и натуральным компаратором
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        System.out.println("Создаем список String: [apple, banana, cherry]");
        System.out.println("Поиск 'banana' в stringList с натуральным компаратором: " + Collections.binarySearch(stringList, "banana", Comparator.naturalOrder())); // должен вывести 1
    }
}

