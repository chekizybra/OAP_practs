import java.util.Scanner;
public class pract_4_1 {
    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);
        int a, b;
        float af ,bf ,cf ,df ,resf;
        String result;
        System.out.println("введите номер задания: ");
        switch (bob.nextInt()) {
            case 1:
                System.out.println("в каком году был основан Санкт-Петербург?");
                System.out.print("Введите число : ");
                a = bob.nextInt();
                if (a == 1703) System.out.println("правильно");
                else System.out.println("Вы ошиблись, Санкт-Петербург был основан в 1703 году");
                break;
            case 2:
                System.out.println("введите трехзначное число : ");
                a = bob.nextInt();
                if (a%3 == 0) System.out.printf("%d число делится на 3",a);
                else System.out.printf("%d число не делится на 3",a);
                break;
            case 3:
                System.out.print("введите вес: ");
                a = bob.nextInt();
                System.out.print("введите рост: ");
                b = bob.nextInt();
                if (a > (b-100)) System.out.println("вес больше идеального");
                else System.out.println("вес меньше идеального");
                break;
            case 4:
                System.out.println("введите число");
                a = bob.nextInt();
                if (a%2 == 0) System.out.printf("число %d - четное",a);
                else System.out.printf("число %d - нечетное",a);
                break;
            case 5:
                System.out.print("введите первое число : ");
                a = bob.nextInt();
                System.out.print("введите второе число : ");
                b = bob.nextInt();
                if (a == b) result = "равно второму";
                else if ((a > b) ) result = "больше второго";
                else result = "меньше второго";
                System.out.printf("первое число %s",result);
                break;
            case 6:
                System.out.print("введите сумму вклада: ");
                af = bob.nextFloat();
                if (af >= 5000) bf = 13;
                else bf = 10;
                cf = af * (bf/100);
                df = af + cf;
                System.out.printf("Сумма: %.2f руб. %nПроцент годовой: %.0f %nДоход:%.2f руб. %nСумма в конце срока вклада:%.2f руб",af,bf,cf,df);
                break;
            case 7:
                System.out.print("введите сумму вклада: ");
                af = bob.nextFloat();
                if (af >= 10000) bf = 13;
                else if (af >= 5000 & af < 10000) {
                bf = 11;
                } else bf = 9;
                cf = af * (bf/100);
                df = af - cf;
                System.out.printf("Сумма: %.2f руб. %nПроцент годовой: %.0f %nДоход:%.2f руб. %nСумма в конце срока вклада:%.2f руб",af,bf,cf,df);
                break;
            case 8:
                System.out.print("введите количество фото: ");
                a = bob.nextInt();
                System.out.println("выберите формат фото 9х12 - 1, 10х15 - 2");
                switch (bob.nextInt()) {
                    case 1:
                        af = 2.10f;
                        bf = af * a;
                        if (a >= 10) cf = bf * 0.05f;
                        else cf = 0;
                        resf = bf - cf;
                        System.out.printf("цена: %.2f руб. " +
                                "%nКоличество: %d шт. " +
                                "%nСумма:%.2f руб. " +
                                "%nСкидка:%.2f руб. " +
                                "%nК оплате: %.2f руб.",af,a,bf,cf,resf);

                        break;
                    case 2:
                        af = 3.10f;
                        bf = af * a;
                        if (a >= 10) cf = bf * 0.05f;
                        else cf = 0;
                        resf = bf - cf;
                        System.out.printf("цена: %.2f руб. " +
                                "%nКоличество: %d шт. " +
                                "%nСумма:%.2f руб. " +
                                "%nСкидка:%.2f руб. " +
                                "%nК оплате: %.2f руб.",af,a,bf,cf,resf);
                        break;
                }
                break;
            case 9:
                System.out.println("вычисление стоимости покупки с учетом скидки");
                System.out.print("введите сумму покупки: ");
                a = bob.nextInt();
                float percent = 0;
                if (a < 500) System.out.println("вам не предоставляется скидка ");
                else  percent = (a < 1000)?3:5;
                af = a * (percent/100);
                bf = a - af;
                System.out.printf("вам предоставляется скидка: %.0f%% %nсумма с учетом скидки: %.2f руб.",percent,bf);
                break;
        }
}
}
