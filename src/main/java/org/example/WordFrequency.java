package org.example;
import java.util.*;

// Класс для подсчета частоты уникальных слов в строке
public class WordFrequency {
    // Метод для подсчета и вывода частоты слов
    public void countFrequency(String text) {
        text = text.toLowerCase().replaceAll("[^a-z ]", ""); // Приводим текст к нижнему регистру и удаляем знаки препинания
        String[] words = text.split("\\s+"); // Разделяем текст на слова

        Map<String, Integer> wordCount = new HashMap<>(); // Map для хранения частоты слов
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); // Увеличиваем счетчик для каждого слова
        }

        System.out.println("Частота встречаемости слов: " + wordCount);
    }
}