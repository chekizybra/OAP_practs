import java.util.Scanner;
public class pract_5_1 {
    public static void main(String[] args){
        int a ,b ,c ,d;
        Scanner bob = new Scanner(System.in);
        System.out.print("введите номер задачи: ");
        switch (bob.nextInt()){
            case 1:
                System.out.print("введите число: ");
                a = bob.nextInt();
                if ((a>-5)&(a<3)) System.out.println("число принадлежит интервалу (-5,3)");
                else System.out.println("число не принадлежит интервалу (-5,3)");
                break;
            case 2:
                System.out.println("введите числа x, y, c");
                a = bob.nextInt();
                b = bob.nextInt();
                c = bob.nextInt();
                if ((a<b)&(b<c)) System.out.println("неравенство а выполняется");
                else System.out.println("неравенство а не выполняется");
                if ((b>a)&(a>c)) System.out.println("неравенство б выполняется");
                else System.out.println("неравенство б не выполняется");
                break;
            case 3:
                System.out.println("введите числа x, y");
                a = bob.nextInt();
                b = bob.nextInt();
                if ((a%b == 0) || (b%a == 0)) System.out.println("«Да, одно из чисел является делителем другого");
                else System.out.println("Нет, ни одно из чисел не является делителем другого");
                break;
            case 4:
                System.out.println("введите числа x, y, c, d");
                a = bob.nextInt();
                b = bob.nextInt();
                c = bob.nextInt();
                d = bob.nextInt();
                if (((a%b) == c) || ((a%b) == d)) System.out.println("верно");
                else System.out.println("неверено");
                break;
            case 5:
                System.out.println("введите числа x, y, c");
                a = bob.nextInt();
                b = bob.nextInt();
                c = bob.nextInt();
                if ((a == b)||(a == c)||(b == c)) System.out.println("среди чисел есть одинаковые");
                else System.out.println("сред чисел нет одинаковых");
                break;
            case 6:
                System.out.println("введите длинны сторон x, y, c");
                a = bob.nextInt();
                b = bob.nextInt();
                c = bob.nextInt();
                if ((a == b)&(b == c)) System.out.println("треугольник равносторонний");
                System.out.println("треугольник не равносторонний");
                break;
            case 7:
                System.out.println("введите размеры конверта ширина и высота в мм");
                a = bob.nextInt();
                b = bob.nextInt();
                System.out.println("введите размеры открытки ширина и высота в мм");
                c = bob.nextInt()+1;
                d = bob.nextInt()+1;
                if ((a*b) >= (c*d)) System.out.println("открытка поместится");
                else System.out.println("открытка не поместится");
                break;
            case 8:
                System.out.println("введите размеры  форточки в см");
                a = bob.nextInt();
                b = bob.nextInt();
                System.out.print("введите диаметр головы васи : ");
                d = bob.nextInt()+2;
                if ((a >= d)||(b >= d)) System.out.println("вася сможет просунуть голову в форточку");
                else System.out.println("вася не сможет просунуть голову в форточку");
                break;
            case 9:
                System.out.print("введите двузначное число: ");
                b = bob.nextInt();
                if (((b/10) == 3)||((b%10) == 3)) System.out.println("В числе есть цифра 3");
                else System.out.println("В числе нет цифры 3");
                System.out.print("введите число x: ");
                a = bob.nextInt();
                if (((b/10) == a)||((b%10) == a)) System.out.printf("В числе есть цифра %d",a);
                else System.out.printf("В числе нет цифры %d",a);
                break;
        }
    }
}
