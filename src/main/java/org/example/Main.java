package org.example;
import java.util.*;

// Основной класс для тестирования всех заданий
public class Main {
    public static void main(String[] args) {
        // 1. Тестирование работы с коллекциями
        System.out.println("Задание 1: Работа с коллекциями");
        CollectionsTask collectionsTask = new CollectionsTask(); // Создаем экземпляр CollectionsTask
        collectionsTask.execute(10); // Выполняем задачу с коллекциями
        System.out.println();

        // 2. Тестирование генератора простых чисел
        System.out.println("Задание 2: Генератор простых чисел");
        PrimesGenerator primesGenerator = new PrimesGenerator(); // Создаем экземпляр PrimesGenerator
        List<Integer> primes = primesGenerator.generatePrimes(10); // Генерируем список из 10 простых чисел
        System.out.println("Первые 10 простых чисел: " + primes); // Выводим простые числа
        Collections.reverse(primes); // Обратный порядок чисел
        System.out.println("Простые числа в обратном порядке: " + primes);
        System.out.println();

        // 3. Тестирование класса Human и компараторов
        System.out.println("Задание 3: Класс Human и компараторы");
        List<Human> humans = Arrays.asList(
                new Human("John", "Smith", 25), // Создаем объект Human
                new Human("Jane", "Doe", 30),
                new Human("Alice", "Johnson", 22)
        );
        HumanTask humanTask = new HumanTask(); // Создаем экземпляр HumanTask
        humanTask.execute(humans); // Выполняем задачу с объектами Human
        System.out.println();

        // 4. Тестирование подсчета уникальных слов
        System.out.println("Задание 4: Подсчет уникальных слов");
        WordFrequency wordFrequency = new WordFrequency(); // Создаем экземпляр WordFrequency
        wordFrequency.countFrequency("This is a test. This test is only a test."); // Выполняем задачу с подсчетом слов
        System.out.println();

        // 5. Тестирование перестановки ключей и значений в Map
        System.out.println("Задание 5: Перестановка ключей и значений в Map");
        ReverseMap reverseMap = new ReverseMap(); // Создаем экземпляр ReverseMap
        Map<String, Integer> map = new HashMap<>(); // Инициализируем Map с данными
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        Map<Integer, String> reversed = reverseMap.reverse(map); // Переставляем ключи и значения
        System.out.println("Перевернутая Map: " + reversed);
        System.out.println();
    }
}