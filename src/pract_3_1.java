import java.util.Scanner;

public class pract_3_1 {
    public static void main(String[] args){
        float a, b, c, d, P, res;
        double ad, bd, cd, Sd, Vd, resd;
        Scanner bob = new Scanner(System.in);
        System.out.print("выберите номер задания = ");
        switch(bob.nextInt()){
            case 1:
                System.out.print("введите длинну ребра = ");
                a = bob.nextFloat();
                res = a*4;
                System.out.printf("периметр квадрата со стророной %.2f равна  %.2f",a ,res);
                break;
            case 2:
                System.out.print("периметр равен = ");
                P = bob.nextFloat();
                a = P/3;
                resd =(((a*a)*Math.sqrt(3))/4);
                res = (float) resd;
                System.out.printf("площадь треугольника равна: %.2f",res);
                break;
            case 3:
                System.out.println("расстояние между двумя точками");
                System.out.println("координаты первой точки");
                System.out.print("а = ");
                a = bob.nextFloat();
                System.out.print("б = ");
                b = bob.nextFloat();
                System.out.println("координаты второй точки");
                System.out.print("а = ");
                c = bob.nextFloat();
                System.out.print("б = ");
                d = bob.nextFloat();
                resd = Math.sqrt(((a-b)*(a-b))+((c-d)*(c-d)));
                System.out.printf("расстояние между точками = %.2f", resd);
                break;
            case 4:
                System.out.print("введите превое число:");
                ad = Math.pow(bob.nextDouble(), 3);
                System.out.print("введите второе число:");
                bd = Math.pow(bob.nextDouble(), 3);
                resd = ((ad+bd)/2);
                System.out.printf("среднее арифметическое:%.2f",resd);
                break;
            case 5:
                System.out.print("введите первое число:");
                ad = Math.abs(bob.nextDouble());
                System.out.print("введите второе число:");
                bd = Math.abs(bob.nextDouble());
                resd = Math.sqrt(ad*bd);
                System.out.printf("среднее геометрическое: %.2f",resd);
                break;
            case 6:
                System.out.print("катет а = ");
                ad = Math.pow(bob.nextFloat(), 2);
                System.out.print("катет y = ");
                bd = Math.pow(bob.nextFloat(), 2);
                resd = Math.sqrt(ad+bd);
                System.out.printf("гипотинуза = %.2f",resd);
                break;
            case 7:
                System.out.print("катет а = ");
                a = bob.nextFloat();
                System.out.print("катет y = ");
                b = bob.nextFloat();
                res = (a*b)/2;
                System.out.printf("площадь = %.2f",res);
                break;
            case 8:
                System.out.print("катет а = ");
                ad = Math.pow(bob.nextFloat(), 2);
                System.out.print("катет y = ");
                bd = Math.pow(bob.nextFloat(), 2);
                cd = Math.sqrt(ad+bd);
                resd = ad + bd +cd;
                System.out.printf("периметр = %.2f",resd);
                break;
            case 9:
                System.out.print("площадь полной поверхности = ");
                Sd = bob.nextDouble();
                ad = Math.sqrt(Sd/6);
                System.out.printf("ребро = %.2f",ad);
                break;
            case 10:
                System.out.print("обЪем куба= ");
                Vd = bob.nextDouble();
                ad = Math.pow(Vd,1/3);
                System.out.printf("ребро = %.2f",ad);
                break;
        }
        bob.close();

    }

}
