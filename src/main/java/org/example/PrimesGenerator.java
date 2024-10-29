package org.example;

import java.util.*;

// Класс для генерации простых чисел
public class PrimesGenerator {
    // Метод для генерации списка из N простых чисел
    public List<Integer> generatePrimes(int N) {
        List<Integer> primes = new ArrayList<>(); // Список для хранения простых чисел
        int num = 2; // Начинаем проверку простоты с числа 2

        // Продолжаем генерацию, пока список не заполнится N числами
        while (primes.size() < N) {
            if (isPrime(num)) { // Проверяем, является ли число простым
                primes.add(num); // Если простое, добавляем в список
            }
            num++; // Переходим к следующему числу
        }
        return primes; // Возвращаем список простых чисел
    }

    // Вспомогательный метод для проверки простоты числа
    private boolean isPrime(int num) {
        if (num < 2) return false; // Числа меньше 2 не являются простыми
        for (int i = 2; i * i <= num; i++) { // Проверяем делимость на числа от 2 до корня из num
            if (num % i == 0) return false; // Если число делится, оно не простое
        }
        return true; // Если делителей нет, число простое
    }
}