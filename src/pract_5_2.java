import java.util.Scanner;
public class pract_5_2 {
    public static void main(String[] args){
        Scanner bob  = new Scanner(System.in);
        int ai, bi,ci,di;
        int sum = 0;
        float a, b, c, d;
        double ad, bd, cd;
        System.out.print("введите номер задачи: ");
        switch (bob.nextInt()){
            case 1:
                System.out.println("введите числа а и б");
                a = bob.nextFloat();
                b = bob.nextFloat();
                if (a > b) System.out.println("число а больше числа б");
                if (b > a) System.out.println("число б больше числа а");
                break;
            case 2:
                System.out.println("введите числа а и б");
                a = bob.nextFloat();
                b = bob.nextFloat();
                if (a>b) a = a/2;
                System.out.printf("число а = %f y = %d",a,b);
                break;
            case 3:
                System.out.println("введите числа а и б");
                a = bob.nextFloat();
                bd = bob.nextDouble();
                if (Math.sqrt(bd)<a) bd = bd*5;
                System.out.printf("число а = %f y = %f",a,bd);
                break;
            case 4:
                System.out.println("введите числа x, y и c");
                a = bob.nextFloat();
                b = bob.nextFloat();
                c = bob.nextFloat();
                System.out.println("четные числа");
                if (a%2 == 0) System.out.println(a);
                if (b%2 == 0) System.out.println(b);
                if (c%2 == 0) System.out.println(c);
                break;
            case 5:
                System.out.println("введите числа x, y и c");
                bd = bob.nextDouble();
                ad = bob.nextDouble();
                cd = bob.nextDouble();
                System.out.println("не отрицательные числа возводятся в квадрат");
                if (ad > 0) System.out.println(Math.pow(ad,2));
                if (bd > 0) System.out.println(Math.pow(bd,2));
                if (cd > 0) System.out.println(Math.pow(cd,2));
                break;
            case 6:
                System.out.println("введите числа x, y и c");
                a = bob.nextFloat();
                b = bob.nextFloat();
                c = bob.nextFloat();
                System.out.println("часть а");
                if (a>1.6 || a<3.8) System.out.println(a);
                if (b>1.6 || b<3.8) System.out.println(b);
                if (c>1.6 || c<3.8) System.out.println(c);
                System.out.println("часть б");
                if (a>0.7 || a<5.1) System.out.println(a);
                if (b>0.7 || b<5.1) System.out.println(b);
                if (c>0.7 || c<5.1) System.out.println(c);
                break;
            case 7:
                System.out.println("введите числа x, y, c и d");
                a = bob.nextFloat();
                b = bob.nextFloat();
                c = bob.nextFloat();
                d = bob.nextFloat();
                int neg = 0;
                if (a < 0) neg++;
                if (b < 0) neg++;
                if (c < 0) neg++;
                if (d < 0) neg++;
                System.out.printf("отрицательных чисел: %d",neg);
                break;
            case 8:
                System.out.println("введите числа x, y, c и d");
                ai = bob.nextInt();
                bi = bob.nextInt();
                ci = bob.nextInt();
                di = bob.nextInt();

                if (ai > 5) sum += ai;
                if (bi > 5) sum += bi;
                if (ci > 5) sum += ci;
                if (di > 5) sum += di;
                System.out.printf("сумма чисел больше 5: %d", sum);
                break;
            case 9:
                System.out.println("введите числа x, y, c и d");
                ai = bob.nextInt();
                bi = bob.nextInt();
                ci = bob.nextInt();
                di = bob.nextInt();
                if (ai%3 == 0) sum += ai;
                if (bi%3 == 0) sum += bi;
                if (ci%3 == 0) sum += ci;
                if (di%3 == 0) sum += di;
                System.out.printf("сумма чисел кратных трем: %d", sum);
                break;
            case 10:
                System.out.print("введите вес боксера: ");
                ai = bob.nextInt();
                if (ai > 64 & ai > 69) System.out.println("категория:полусредний");
                if (ai > 64 & ai < 69) System.out.println("категория:первый полусредний");
                if (ai < 64 & ai < 69) System.out.println("категория:легкий ");
                break;
        }

    }
}
