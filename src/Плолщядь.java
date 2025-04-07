import java.util.Scanner;

public class Плолщядь {
    public static void main(String[] args) {
        float a, b, c,res;
        int amount1, amount2, A, B, C, D;
        Scanner in=new Scanner(System.in);
        System.out.print("введите номер задачи " ) ;
        switch(in.nextInt()){
            case 1:
                System.out.println("Вычисление площади прямоугольника");
                System.out.println("Введите исходные данные");
                System.out.print("Длина (см)=");
                a = in.nextFloat();
                System.out.print("Ширина (см)=");
                b = in.nextFloat();
                res= a*b;
                System.out.printf("Площадь %.2f", res);
            case 2:
                System.out.println("вычисления объема параллелепипеда");
                System.out.println("входные данные");
                System.out.print("введите длинну (см)= ");
                a = in.nextFloat();
                System.out.print("введите ширину (см)= ");
                b = in.nextFloat();
                System.out.print("введите высоту (см)= ");
                c = in.nextFloat();
                res=a*b*c;
                System.out.printf("объем параллелепипеда равен %.2f", res);
            case 3:
                System.out.println("вычисление обьема куба");
                System.out.print("введите длину ребра (см)= ");
                a = in.nextFloat();
                res = a*a*a;
                System.out.printf("обьема куба = %.2f", res);

            case 4:
                System.out.println("вычисления стоимости покупки");
                System.out.println("Введите исходные данные: ");
                System.out.print("Цена тетради (руб.) =  ");
                a = in.nextFloat();
                System.out.print("Количество тетрадей - ");
                amount1 = in.nextInt();
                System.out.print("Цена карандаша (руб.) = ");
                b = in.nextFloat();
                System.out.print("Количество карандашей - ");
                amount2 = in.nextInt();
                res = (a*amount1)+(b*amount2);
                System.out.printf("Стоимость покупки: %.2f", res);
            case 5:
                System.out.println("вычисления стоимости покупки");
                System.out.println("Введите исходные данные: ");
                System.out.print("Цена тетради (руб.) =  ");
                a = in.nextFloat();
                System.out.print("Цена обложки (руб.) =  ");
                b = in.nextFloat();
                System.out.print("Количество комплектов - ");
                amount1 = in.nextInt();
                res = (a+b)*amount1;
                System.out.printf("Стоимость покупки: %.2f", res);
            case 6:
                System.out.println("Вычисление стоимости покупки");
                System.out.print("введите исходные данные");
                System.out.print("Цена за килограмм (руб.)  = ");
                a = in.nextFloat();
                System.out.print("Вес яблок (кг) = ");
                b = in.nextFloat();
                res = a*b;
                System.out.printf("Стоимость покупки: %.2f руб.", res);
            case 7:
                System.out.println("Вычисление сопротивления электрической цепи при параллельном соединении элементов. ");
                System.out.println("Введите исходные данные: ");
                System.out.print("Величина первого сопротивления (Ом) = ");
                a = in.nextFloat();
                System.out.print("Величина второго сопротивления (Ом) = ");
                b = in.nextFloat();
                res = (a*b)/(a+b);
                System.out.printf("Сопротивление цепи: %.2f Ом", res);
            case 8:
                System.out.println("Вычисление силы тока в электрической цепи");
                System.out.println("Введите исходные данные: ");
                System.out.print("Напряжение (Вольт) = ");
                a = in.nextFloat();
                System.out.print("сопротивления (Ом) = ");
                b = in.nextFloat();
                res = a*b;
                System.out.printf("Сила тока: %.2f Ампер", res);
            case 9:
                System.out.print("Введите A: ");
                A = in.nextInt();
                System.out.print("Введите B: ");
                B = in.nextInt();
                System.out.print("Введите C: ");
                C = in.nextInt();
                D=A;
                A=B;
                B=C;
                C=D;
                System.out.printf("A= %d,B= %d,C= %d", A, B, C);
            case 10:
                System.out.print("Введите A: ");
                A = in.nextInt();
                System.out.print("Введите B: ");
                B = in.nextInt();
                System.out.print("Введите C: ");
                C = in.nextInt();
                System.out.print("Введите D: ");
                D = in.nextInt();
                D=C;
                C=B;
                B=A;
                System.out.printf("A= %d,B= %d,C= %d,D= %d", A, B, C, D);
        };
        in.close();
    }
}