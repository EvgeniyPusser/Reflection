package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.lang.reflect.Method;

        public class StringMethods {
            public static void main(String[] args) {
                // Получаем класс String
                Class<String> stringClass = String.class;

                // Получаем все методы класса String
                Method[] methods = stringClass.getDeclaredMethods();

                // Выводим на экран все методы
                for (Method method : methods) {
                    System.out.println("Method: " + method.getName());
                }
            }
        }



