package com.example;

public class Main {
    public static void main(String[] args) {
        double radius = 5.0; // Задайте радіус, який ви хочете використовувати

        double area = MyArea.areaOfCircle(radius); // Викликаємо статичний метод

        System.out.println("Площа кола з радіусом " + radius + " дорівнює " + area);
    }
}
