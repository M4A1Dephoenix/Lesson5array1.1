package ru.skypro;



public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }

        public static void main(String[] args) {
            // Задание №1
            System.out.println("Задание №1");
            System.out.println("Вывод массива");
            int arr1[] = new int[30];
            int n1= 0; // Подсчёт суммы
            int min = 200_000; // Минимальная сумма
            int max = -1; // Максимальная сумма
            int initial = 1; // Для коммита
            double average = 0; // Средняя
            for (int i = 0; i < arr1.length-1; i++) {
                arr1[i] = generateRandomArray()[i];
                n1 = n1+arr1[i];
                System.out.println(arr1[i]);
                // Доп под задание №2
                if (min>arr1[i]){
                    min = arr1[i];
                }
                if (max<arr1[i]){
                    max = arr1[i];
                }

            }
            // Доп под задание №3
            average = n1/ arr1.length;
            // Общий вывод
            System.out.println();
            System.out.println("Задание №1");
            System.out.println(n1);
            System.out.println();
            System.out.println("Задание №2");
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                    "Максимальная сумма трат за день составила " + max + " рублей.");
            System.out.println();
            System.out.println("Задание №3");
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
            // Задание №4
            System.out.println();
            System.out.println("Задание №4");
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int d = 10; d>0-1; d--){
                System.out.print(reverseFullName[d]);
            }
    }

}

