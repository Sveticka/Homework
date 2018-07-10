import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;

public class TasksforJavaIntroduction {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int c = 4;
        int Angle = 90;

        System.out.println("Задание 1" + ": " + (a + b * c / 2));
        System.out.println("Задание 2" + ": " + ((Math.pow(a, 2) + Math.pow(b, 2)) / 2));
        System.out.println("Задание 3" + ": " + ((a + b) / 12 * c / 4 + b));
        System.out.println("Задание 4" + ": " + ((a - b * c) / (a + b) / c));
        System.out.println("Задание 5" + ": " + (Math.abs(a - b) / Math.pow(a + b, 3) - Math.cos(Math.toRadians(Angle))));
// мне кажется здесь ошибка в расчетах, только не понимаю почему

        System.out.println("Задание 6 - плошадь: " + ((Math.abs(a) * Math.abs(b) / 2)));
        System.out.println("Задание 6 - периметр: " + (Math.abs(a) + Math.abs(b) + Math.sqrt(a * a + b * b)));

        double Ax = 2;
        double Ay = 4;
        double Cx = 10;
        double Cy = 12;
        double By = Cy;
        double Bx = Ax;
        System.out.println("Задание 7 - периметр: " + ((Math.abs(By - Ay)) + Math.abs(Cx - Bx)) * 2);
        System.out.println("Задание 7 - плошадь: " + (Math.abs(By - Ay)) * Math.abs(Cx - Bx));

        System.out.println("Задание 8 - cторона: " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b *
                Math.cos(Math.toRadians(Angle))));
        System.out.println("Задание 8 - периметр: " + (a + b + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) -
                2 * a * b * Math.cos(Math.toRadians(Angle))))));
        System.out.println("Задание 8 - плошадь: " + 0.5 * a * b * Math.sin(Math.toRadians(Angle)));

        double r1 = 1;
        double r2 = 0.5;
        double r3 = 0.2;
        double Plotnost = 0.7;
        System.out.println("Задание 9 - масса снеговика: " + ((4 / 3 * Math.PI * Math.pow(r1, 3)) +
                (4 / 3 * Math.PI * Math.pow(r2, 3) + 4 / 3 * Math.PI * Math.pow(r3, 3))) * Plotnost + " кг");


        System.out.println();
        System.out.println("Task 1: " + (Task1(1, 2, 3)));
        System.out.println("Task 2: " + (Task2(4, 2)));
        System.out.println("Task 3: " + Task3(50, 10, 2));
        System.out.println("Task 4: " + Task4(2, 10, 6));
        System.out.println("Task 5: " + Task5(40, 2, 30));
        System.out.println("Task 6 - Perimetr: " + Task6_Perimetr(2, 4));
        System.out.println("Task 6 - Ploshad: " + Task6_Ploshyad(4, 6));
        System.out.println("Task 7 - Perimetr: " + (Task7_Perimetr(2, 4, 10, 12)));
        System.out.println("Task 7 - Plosyad: " + (Task7_Ploshyad(2, 4, 10, 12)));
        System.out.println("Task 8 - Storona: " + Task8_Storona(54.5, 60, 45));
        System.out.println("Task 8 - Perimetr: " + Task8_Perimetr(8, 10, 85));
        System.out.println("Task 8 - Ploshyad: " + Task8_Ploshyad(8, 10, 85));
        System.out.println("Task 9 - масса снеговика: " + Task9_Snegovik(1, 0.5, 0.2, 0.7) + " кг");


    }

// 10-11 задание выполнено ниже:

    public static int Task1(int a, int b, int c) {
        int d = a + b * c / 2;
        return d;
    }

    public static double Task2(double a, double b) {
        double c = (Math.pow(a, 2) + Math.pow(b, 2)) / 2;
        return c;
    }

    public static double Task3(double a, double b, double c) {
        double d = (a + b) / (12 * c / 4) + b;
        return d;
    }

    public static double Task4(double a, double b, double c) {
        double k = ((a - b * c) / (a + b) / c);
        return k;
    }

    public static double Task5(double a, double b, double c) {
        double e = (Math.abs(a - b) / (a + b) * 3 - Math.cos(c));
        return e;
    }
 /*
    6. В переменных a и b лежат положительные длины катетов прямоугольного треугольника. Вычислить и вывести на экран
    площадь треугольника и его периметр.
    */

    public static double Task6_Ploshyad(double a, double b) {
        double c = Math.abs(a) * Math.abs(b) / 2;
        return c;
    }

    public static double Task6_Perimetr(double a, double b) {
        double d = Math.abs(a) + Math.abs(b) + (Math.sqrt(a * a + b * b));
        return d;
    }

    public static double Task7_Perimetr(double Ax, double Ay, double Cx, double Cy) {
        double By = Cy;
        double Bx = Ax;
    /* координаты точки А (Ах, Ау);
                  точки В (Bx, By);
                  точки C (Cx, Cy);
                  точки D (Dx, Dy); */

        double Dlina = Math.abs(By - Ay);
        double Shirina = Math.abs(Cx - Bx);
        double Perimetr = (Dlina + Shirina) * 2;
        return Perimetr;
    }

    public static double Task7_Ploshyad(double Ax, double Ay, double Cx, double Cy) {
        double By = Cy;
        double Bx = Ax;

    /* координаты точки А (Ах, Ау);
                  точки В (Bx, By);
                  точки C (Cx, Cy);
                  точки D (Dx, Dy); */

        double Dlina = Math.abs(By - Ay);
        double Shirina = Math.abs(Cx - Bx);
        double Ploshyad = Dlina * Shirina;
        return Ploshyad;
    }

    public static double Task8_Storona(double a, double b, int Angle) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(Angle)));
        return c;
    }

    public static double Task8_Perimetr(double a, double b, int Angle) {
        double Perimetr = a + b + (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(Angle))));
        return Perimetr;
    }

    public static double Task8_Ploshyad(double a, double b, int Angle) {
        double Ploshyad = 0.5 * a * b * Math.sin(Math.toRadians(Angle));
        return Ploshyad;
    }

    public static double Task9_Snegovik(double r1, double r2, double r3, double Plotnost) {
        double Obyem = (4 / 3 * Math.PI * Math.pow(r1, 3)) + (4 / 3 * Math.PI * Math.pow(r2, 3) + 4 / 3 * Math.PI * Math.pow(r3, 3));
        double Massa = Plotnost * Obyem;
        return Massa;
    }

}
