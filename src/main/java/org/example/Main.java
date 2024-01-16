package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в наш Зоопарк!");
        // 1. Приветствие и возможность выбора что смотреть.
        // 2. Показать животных из выбронаго отдела.
        // 3. Посмотреть выбранного животного.
        // 4. Предложить посмотреть что-то еще.
        // 5. Выход из зоопарка.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой отдел зоопарка вы хотите посмотреть?");

        Map<Integer, String> departmens = new HashMap<Integer, String>();
        departmens.put(0, "Уйти");
        departmens.put(1, "Хищники");
        departmens.put(2, "Птицы");

        for(Map.Entry<Integer, String> item : departmens.entrySet()){

            System.out.printf("%d - %s \n", item.getKey(), item.getValue());
        }
        // Считываем введенную строку
        int department = Integer.parseInt(scanner.nextLine());
        scanner.close();

        if(department == 0){
            System.out.println("Вы покидаете наш зоопарк, всего доброго!");
        } else{
            // Выводим введенные данные
            System.out.println("Вы выбрали отдел: " + department + " - " + departmens.get(department));
        }


    }
}