package org.example;

import java.util.*;

// Класс для выполнения задач с коллекциями
public class CollectionsTask {
    // Метод для выполнения заданий с коллекциями
    public void execute(int N) {
        Random rand = new Random(); // Создаем объект Random для генерации случайных чисел
        Integer[] array = new Integer[N]; // Создаем массив для хранения N случайных чисел

        // Заполняем массив случайными числами от 0 до 100
        for (int i = 0; i < N; i++) {
            array[i] = rand.nextInt(101);
        }
        System.out.println("Массив: " + Arrays.toString(array)); // Выводим массив

        List<Integer> list = new ArrayList<>(Arrays.asList(array)); // Преобразуем массив в список
        System.out.println("Список: " + list); // Выводим список

        Collections.sort(list); // Сортируем список по возрастанию
        System.out.println("Отсортированный список по возрастанию: " + list);

        Collections.sort(list, Collections.reverseOrder()); // Сортируем список в обратном порядке
        System.out.println("Сортировка в обратном порядке: " + list);

        Collections.shuffle(list); // Перемешиваем элементы списка
        System.out.println("Перемешанный список: " + list);

        Collections.rotate(list, 1); // Выполняем циклический сдвиг на 1 элемент
        System.out.println("Циклический сдвиг: " + list);

        Set<Integer> unique = new HashSet<>(list); // Создаем множество для уникальных элементов
        System.out.println("Уникальные элементы: " + unique);

        Set<Integer> duplicates = new HashSet<>(); // Множество для хранения дублирующихся элементов
        Set<Integer> tempSet = new HashSet<>(); // Временное множество для проверки дубликатов
        // Определяем дублирующиеся элементы
        for (Integer i : list) {
            if (!tempSet.add(i)) { // Если элемент не добавляется, он дублируется
                duplicates.add(i);
            }
        }
        System.out.println("Дублирующиеся элементы: " + duplicates);

        Integer[] newArray = list.toArray(new Integer[0]); // Преобразуем список обратно в массив
        System.out.println("Массив из списка: " + Arrays.toString(newArray));

        // Подсчет количества вхождений каждого числа
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer num : newArray) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1); // Увеличиваем счетчик
        }
        System.out.println("Количество вхождений: " + countMap);
    }
}