
import java.util.Scanner;

public class Tasks_12th_onwards {

    public static void main(String[] args) {

        int a = 4;
        int b = 9;


        System.out.println("Задание 12 - UahtoUsd = " + UahtoUsd(10));
        System.out.println("Задание 12 - UsdtoUah = " + UsdtoUah(10));

        System.out.println();
        System.out.println("Задание 13");
        Earth2();

        System.out.println();
        System.out.println("Задание 14");
        isNumberEven(2);
        isNumberEven(17);

        System.out.println();
        System.out.println("Задание 15");
        Tourists(473);

        System.out.println();
        System.out.println("Задание 16");
        System.out.print("Case 1: "); Trains(50, 60);
        System.out.print("Case 2: ");Trains(50, 90);

        System.out.println();
        System.out.println("Задание 17");
        System.out.print("Case 1: "); Dron(1, 1, 1, 3, 5, 2);
        System.out.print("Case 2: "); Dron(5,6,2,6,7,8);

        System.out.println("Задание 19");
        Fairytale();


    }

// Task 12 - Конвертер валют
    public static double UahtoUsd(double Uah) {
        double Usd = Uah * 26;
        return Usd;
    }

    public static double UsdtoUah(double Usd) {
        double Uah = Usd / 26;
        return Uah;
    }

//Task 13
    /*На первой колонизированной людьми планете Земля-2 введен календарь, который содержит 10 месяцев в году.
    В каждом месяце 42 дня. Первый день колонизации отмечен датой 01.01.01. Написать функцию, которая по дате,
    заданной тремя числами (число, месяц, год) рассчитывает сколько дней прошло со времени колонизации Земли-2. */

    public static void Earth2() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Рассчитаем количество дней, прошедших с пор колонизации Земля-2");
            System.out.println("День месяца: ");
            int days = scan.nextInt() - 1;
            while (days < 0 || days > 43) {
                System.out.println("В месяце только 42 дня, введи число месяца снова");
                days = scan.nextInt() - 1;
            }
            System.out.println("Номер месяца: ");
            int months = scan.nextInt() - 1;
            while (months < 0 || months > 10) {
                System.out.println("В году всего 10 месяцев, введи снова");
                months = scan.nextInt() - 1;
            }
            System.out.println("Год: ");
            int years = scan.nextInt() - 1;
            System.out.println("Прошло " + (days + months * 42 + years * 10 * 42) + " дней");
        }
    }

// Task 14
    /* Каждый из трех туристов за час прошел от 1 до 9 миль по пересеченной местности.
    Эти данные сохранились в виде одного трехзначного числа (например 473).
    Напишите функцию, которая по этому числу найдет сколько всего прошли туристы
    (т.е. Задано число 473. По этому числу рассчитывается общий путь: 4+7+3=14 миль).*/

    public static void Tourists(int Miles) {
        int sum = 0;
        while (Miles > 0) {
            sum = sum + Miles % 10;
            Miles = Miles / 10;
        }
        System.out.println("Cумма миль, пройденных туристами  равна " + sum);
    }

// Task 15
    /* Написать функцию, которая принимает одно целое число в качестве параметра, и возвращает
    ответ в виде булеановского значения о том четное это число или нет.*/

    public static boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is an even number.");
            return true;
        } else {
            System.out.println("The number " + number + " is not an even number.");
            return false;
        }
    }

// Task 16
    /*Два поезда движутся на скорости V1 и V2 на встречу друг другу.
    Между ними 10 км. пути. Через 4 км пути первый поезд может свернуть на запасной путь.
    При заданных скоростях узнать столкнуться ли поезда.*/

    public static void Trains(double V1, double V2) {
        double time1 = 4 / V1; // время прохождения 4х км первым поездом
        double time2 = 6 / V2; // время прохождения 6ти км вторым поездом

        if (time1 < time2) {
            System.out.println("Первый поезд успеет свернуть на запасной путь через 4 км, т.к. первый поезд" +
                    " пройдет 4 км за " + time1 + " часов, когда второй поезд проедет 6 км через " + time2 + " часов.");
        } else {
            System.out.println("Поезда столнутся, т.к. первый поезд проедет 4 км за " + time1 + " часов, когда " +
                    " второй проедет своих 6 км быстрее - за " + time2 + " часов.");
        }
    }

// Task 17
    /*Для охраны территории завода было запущено два дрона. Путь каждого дрона охватывает территорию,
    которая описывается окружностью с заданными радиусом и координатами центра. Траектории дронов
    находятся в одной плоскости. Написать функцию, которая отвечает на вопрос, могут ли столкнуться дроны. */

    public static void Dron(double x1, double y1, double r1, double x2, double y2, double r2) {
        double distance = Math.sqrt(Math.abs(Math.pow((x2 - x1), 2)) + (Math.abs(Math.pow((y2 - y1), 2))));
        if (distance <= Math.abs(r2 + r1)) {
            System.out.println("Дроны могут столкнуться.");
        } else {
            System.out.println("Дроны не столкнутся.");
        }
    }

// Task 18 - no idea

//Task19
    public static void Fairytale() {
        System.out.println("1. Налево пойдешь, сам умрешь, 2. направо – коня потеряешь, 3. прямо – клад найдешь." +
                " Сделай выбор: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Пошел налево и умер");
                break;
            case 2:
                System.out.println("Пошел направо и потерял коня");
                break;
            case 3:
                System.out.println("Пошел прямо и нашел клад");
                break;
            default:
                System.out.println("Есть только три варианта: 1, 2 или 3, другого не дано");
                break;
        }
    }

}

