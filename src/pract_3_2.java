import java.util.Scanner;
public class pract_3_2 {
    public static void  main(String[] args) {
        System.out.print("введите номер задания : ");
        Scanner bob = new Scanner(System.in);
        int a, b, c, A;
        double ad, bd, cd, resd;
        String result;
        switch (bob.nextInt()) {
            case 1:
                System.out.print("введите двузначное число = ");
                ad = bob.nextDouble();
                resd = Math.max(ad/10 , ad%10);
                System.out.printf("наибольшая цифра  = %f",resd);
                break;
            case 2:
                System.out.print("введите двузначное число = ");
                ad = bob.nextDouble();
                resd = Math.min(ad/10 , ad%10);
                System.out.printf("наименьшая цифра  = %f",resd);
                break;
            case 3:
                System.out.print("введите число = ");
                a = bob.nextInt();
                result = (a % 2 ==0)?"четное":"нечетное";
                System.out.printf("введенное число : %s",result);
                break;
            case 4:
                System.out.print("введите число = ");
                a = bob.nextInt();
                result = (a % 2 !=0)?"нечетное":"четное";
                System.out.printf("введенное число : %s",result);
                break;
            case 5:
                System.out.print("введите число = ");
                a = bob.nextInt();
                result = (a % 10 == 7)?"оканчивается":"не оканчивается";
                System.out.printf("число %s на 7",result);
                break;
            case 6:
                System.out.print("введите число x: ");
                a = bob.nextInt();
                System.out.print("введите число y: ");
                b = bob.nextInt();
                System.out.print("введите число c: ");
                c = bob.nextInt();
                result = ((b*b)-(4*a)*c < 0)?"есть":"нет";
                System.out.printf("решение %s",result);
                break;
            case 7:
                System.out.print("введите число = ");
                a = bob.nextInt();
                result = (a/10 == a%10)?"равны":"не равны";
                System.out.printf("цифры в числе %s",result);
                break;
            case 8:
                System.out.print("введите двузначное число = ");
                a = bob.nextInt();
                result = ((a/10 + a%10)%2 != 0)?"нечетная":"четная";
                System.out.printf("сумма цифр в числе %s",result);
                break;
            case 9:
                System.out.print("введите двузначное число = ");
                a = bob.nextInt();
                result = ((a/10 + a%10)%10 == 0)?"заканчивается" :"не заканчивается";
                System.out.printf("сумма цифр в числе %s на 0",result);
                break;
            case 10:
                System.out.print("введите двузначное число = ");
                a = bob.nextInt();
                result = ((a/10 + a%10)%3 == 0)?"кратно":"не кратно";
                System.out.printf("сумма цифр в числе %s 3",result);
            break;
            case 11:
                System.out.print("введите двузначное число = ");
                a = bob.nextInt();
                System.out.print("введите число кратным которому должна быть сумма чисел: ");
                A = bob.nextInt();
                result = ((a/10 + a%10)%A == 0)?"кратно":"не кратно";
                System.out.printf("сумма цифр в числе %d %s числу %d",a, result, A);
                break;
            case 12:
                System.out.print("введите трехзначное число : ");
                a = bob.nextInt();
                if (a/100 == a%10) result = "равна";
                else if ((a/100 > a%10) ) result = "больше";
                else result = "меньше";
                System.out.printf("первая цифра числа %d %s последней",a,result);
                break;
            case 13:
                System.out.print("введите трехзначное число : ");
                a = bob.nextInt();
                if (a/100 == a%10) result = "равна";
                else if ((a/100 > a%10) ) result = "больше";
                else result = "меньше";
                System.out.printf("первая цифра числа %d %s последней",a,result);
                break;
            case 14:
                System.out.print("введите трехзначное число : ");
                a = bob.nextInt();
                if (a/100 == a/10) result = "равна";
                else if ((a/100 > a/10) ) result = "больше";
                else result = "меньше";
                System.out.printf("первая цифра числа %d %s второй",a,result);
                break;
            case 15:
                System.out.print("введите трехзначное число : ");
                a = bob.nextInt();
                if (a/10 == a%10) result = "равна";
                else if ((a/10 > a%10) ) result = "больше";
                else result = "меньше";
                System.out.printf("вторая цифра числа %d %s последней",a,result);
                break;
            case 16:
                System.out.print("введите трехзначное число : ");
                a = bob.nextInt();
                result = (a%111 == 0)?"равны":"не равны";
                System.out.printf("цифры в числе %s",result);
                break;
            case 17:
                System.out.print("введите длину стороны x : ");
                a = bob.nextInt();
                System.out.print("введите длину стороны y : ");
                b = bob.nextInt();
                System.out.print("введите длину стороны c : ");
                c = bob.nextInt();
                result = ((a+b)>c)?"существует":"не существует";
                System.out.printf("треугольник со сторонами %d %d %d %s",a,b,c,result);
                break;
            case 18:
                System.out.print("введите гипотинузу : ");
                c = bob.nextInt();
                System.out.print("введите длину стороны y : ");
                b = bob.nextInt();
                System.out.print("введите длину стороны x : ");
                a = bob.nextInt();
                result =((c*c) == ((a*a) + (b*b)))?"является":"не является";
                System.out.printf("треугольник со сторонами %d %d %d %s прямоугольным",a,b,c,result);
            case 19:
                System.out.print("введите боковую сторону : ");
                a = bob.nextInt();
                System.out.print("введите вторую боковую строну : ");
                b = bob.nextInt();
                System.out.print("введите основание : ");
                c = bob.nextInt();
                result =(a == b)?"является":"не является";
                System.out.printf("треугольник со сторонами %d %d %d %s равнобедренным",a,b,c,result);
                break;
            case 20:
                System.out.print("введите длину стороны x : ");
                a = bob.nextInt();
                System.out.print("введите длину стороны y : ");
                b = bob.nextInt();
                System.out.print("введите длину стороны c : ");
                c = bob.nextInt();
                result =(a == b && b == c)?"является":"не является";
                System.out.printf("треугольник со сторонами %d %d %d %s равносторонним",a,b,c,result);
                break;
        }
        bob.close();
    }
}
