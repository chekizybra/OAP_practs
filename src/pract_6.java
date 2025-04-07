import java.util.Scanner;
public class pract_6 {
    public static void  main(String[] args){
        System.out.println("введите номер задания (нечетные): ");
        Scanner bob = new Scanner(System.in);
        switch(bob.nextInt()){
            case 1:
                for (int i=1; 21>=i; i = i + 2){
                    System.out.print(i+" ");
                }
                break;
            case 3:
                int i = 10;
                while (i <= 25) {
                    System.out.print(i + " " + (i + 0.4) + " ");
                    i++;
                }
                break;
            case 5:
                double kg = 1;
                System.out.println("килограммы|фунты");
                for (int pou = 1;pou <= 10; pou++){
                    kg = pou * 0.453;
                    System.out.printf("%d  %.3f%n",pou,kg);
                }
                break;
            case 7:
                System.out.print("Введите цену товара: ");
                float price = bob.nextFloat();
                System.out.println("Кол-во | Цена");
                int pou = 10;
                do {
                    double schet = pou * price;
                    System.out.printf("%d  %.2f руб.%n", pou, schet);
                    pou += 10;
                } while (pou <= 100);
                break;
        }
    }
}
