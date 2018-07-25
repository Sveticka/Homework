import java.util.Scanner;

public class Tasks_12th_onwards {

    public static void main(String[] args) {
        System.out.println();


        System.out.println("Задание 12 - UahtoUsd = " + UahtoUsd(10));
        System.out.println("Задание 12 - UsdtoUah = " + UsdtoUah(10));

        System.out.println("Задание 13");
        Earth2();



    }

    public static double UahtoUsd(double Uah) {
        double Usd = Uah * 26;
        return Usd;
    }

    public static double UsdtoUah(double Usd) {
        double Uah = Usd / 26;
        return Uah;
    }

    public static void Earth2() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Рассчитаем количество дней, прошедших с пор колонизации Земля-2");
            System.out.println("День месяца: ");
            int days = scan.nextInt() -1;
            System.out.println("Месяц: ");
            int months = scan.nextInt() - 1;
            System.out.println("Год: ");
            int years = scan.nextInt() - 1;
            System.out.println((days + months * 42 + years * 10 * 42));
        }
    }

    // public static void Tourists(int a, int b, int c) { }


    /*Каждый из трех туристов за час прошел от 1 до 9 миль по пересеченной местности.
    Эти данные сохранились в виде одного трехзначного числа (например 473).
    Напишите функцию, которая по этому числу найдет сколько всего прошли туристы
            (т.е. Задано число 473. По этому числу рассчитывается общий путь: 4+7+3=14 миль).*/


}

