package org.example;

import java.util.*;

// Класс для перестановки ключей и значений в Map
public class ReverseMap {
    // Метод для перестановки ключей и значений в переданном Map
    public <K, V> Map<V, K> reverse(Map<K, V> map) {
        Map<V, K> reversed = new HashMap<>(); // Создаем новый Map для хранения перевернутых значений
        for (Map.Entry<K, V> entry : map.entrySet()) {
            reversed.put(entry.getValue(), entry.getKey()); // Меняем местами ключ и значение
        }
        return reversed; // Возвращаем перевернутый Map
    }
}