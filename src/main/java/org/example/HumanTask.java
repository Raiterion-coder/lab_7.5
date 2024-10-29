package org.example;

import java.util.*;

// Класс Human для хранения данных о человеке
class Human implements Comparable<Human> {
    String firstName; // Имя человека
    String lastName; // Фамилия человека
    int age; // Возраст человека

    // Конструктор для инициализации объекта
    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Метод для сравнения объектов по фамилии
    @Override
    public int compareTo(Human other) {
        return this.lastName.compareTo(other.lastName);
    }

    // Метод для вывода информации об объекте
    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age;
    }
}

// Компаратор для сортировки объектов Human по фамилии
class HumanComparatorByLastName implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h1.lastName.compareTo(h2.lastName); // Сравнение только по фамилии
    }
}

// Класс для выполнения заданий с классом Human
public class HumanTask {
    // Метод для выполнения заданий по сортировке и выводу данных о людях
    public void execute(List<Human> humans) {
        Set<Human> hashSet = new HashSet<>(humans); // HashSet для уникальных значений
        System.out.println("HashSet: " + hashSet);

        Set<Human> linkedHashSet = new LinkedHashSet<>(humans); // LinkedHashSet для сохранения порядка
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<Human> treeSet = new TreeSet<>(humans); // TreeSet для сортировки по фамилии
        System.out.println("TreeSet (Comparable): " + treeSet);

        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans); // TreeSet с компаратором по фамилии
        System.out.println("TreeSet (Comparator by LastName): " + treeSetByLastName);

        Set<Human> treeSetByAge = new TreeSet<>(Comparator.comparingInt(h -> h.age));
        treeSetByAge.addAll(humans); // TreeSet с сортировкой по возрасту
        System.out.println("TreeSet (Comparator by Age): " + treeSetByAge);
    }
}