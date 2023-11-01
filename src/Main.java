import java.util.Arrays;
import java.util.Random;

public class Main {
    //  int[] arr = generateRandomArray(); //Этот метод можно скопировать и использовать далее при решении учебных задач

    public static void main(String[] args) {
//        Random nameRandom = new Random();                    //Random пример.
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println(nameRandom.nextInt(14));
//
//        }

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
        fillAndPrint2DMatrix( 4, 4); // если 4х4=16 выводит
        fillAndPrint2DMatrix(7,7); // если 7х7=49 выводит
//        task9();
//        task10();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    //### Задание 1
    //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
    //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    //в формате: «Сумма трат за месяц составила … рублей».
    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
//        for (int i : arr) { //foreach Новая штука тут она смотрит во всем массиве с лева на права
//            sum += i; // тут береться из массива сначало 0(1) ( рендомное значеник и с кладываеться с 1(2) и т.д. по всему массиву
        for (int j = 0; j < arr.length - 1; j++) {
            sum = sum + arr[j];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    //### Задание 2
    //Cледующая задача — найти минимальную и максимальную трату за день.
    //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
    public static void task2() {
        int[] arr = generateRandomArray();
//        int min = arr[0]; // переменая Int = Масиву [0]
//        int max = arr[0];

        int min = Integer.MAX_VALUE; // весь диапазон чисел переменной int
        int max = Integer.MIN_VALUE;

        for (int i : arr) { //все переменные масивас с лева на право
            if (i < min) { // Тут ищет число с наименьшем значением 2 строки на 2 она проверяеться когда число с наименьшем значением будет равна сомой себе.
                min = i;
            }
            if (i > max) { //тут на оборот большое
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    //### Задание 3
    //А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
    //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
    // и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
    //**Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) { //foreach Новая штука тут она смотрит во всем массиве с лева на права
            sum += i; // тут береться из массива сначало 0(1) ( рендомное значеник и с кладываеться с 1(2) и т.д. по всему массиву
        }
        float sumS = sum / 30f;
        System.out.println("Средняя сумма трат за месяц составила " + sumS + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + sum / (float) arr.length + " рублей"); // другой вариант
//        double d = 32.891457923;  // как вывести только 2 числа после запятой 2 строки
//        System.out.printf("our digit is %.2f", d);

    }
    //### Задание 4
    //Отойдем от подсчетов.
    //В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в обратную сторону.
    // Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
    //Данные с именами сотрудников хранятся в виде массива символов (char[]).
    //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников вкорректном виде.
    // В качестве данных для массива используйте:
    //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    //В результате в консоль должно быть выведено "Ivanov Ivan".

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static void task5() {
        int[][] doubleArray = new int[3][3];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = 1;
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        int[][] doubleArray = new int[3][3];

        int value = 1;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = value;
                value++;
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillAndPrint2DMatrix(int m, int n) {
        int[][] doubleArray = new int[m][n];

        int value = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                doubleArray[i][j] = value;
                value++;
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}