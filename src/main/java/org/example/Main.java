package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в наш Зоопарк!");
        // 1. Приветствие и возможность выбора что смотреть.
        // 2. Показать животных из выбронаго отдела.
        // 3. Посмотреть выбранного животного.
        // 4. Предложить посмотреть что-то еще.
        // 5. Выход из зоопарка.

        System.out.println("Какой отдел зоопарка вы хотите посмотреть?");
        Scanner scanner = new Scanner(System.in);

        // Считываем введенную строку
        int department = Integer.parseInt(scanner.nextLine());

        // Выводим введенные данные
        System.out.println("Вы выбрали отдел: " + department);
        // Не забывайте закрывать Scanner, когда он больше не нужен
        scanner.close();
    }
}