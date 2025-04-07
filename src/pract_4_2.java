import java.util.Scanner;
public class pract_4_2 {
    public static void main(String[] args){
    Scanner bob = new Scanner(System.in);
    switch(bob.nextInt()){
        case 1:
            System.out.print("введите номер масти: ");
            switch (bob.nextInt()){
                case 1:
                    System.out.println("пики");
                    break;
                case 2:
                    System.out.println("трефы");
                    break;
                case 3:
                    System.out.println("бубны");
                    break;
                case 4:
                    System.out.println("червы");
                    break;
            }
            break;
        case 2:
            System.out.print("введите номер месяца: ");
            switch(bob.nextInt()){
                case 1:
                    System.out.println("январь");
                    break;
                case 2:
                    System.out.println("февраль");
                    break;
                case 3:
                    System.out.println("март");
                    break;
                case 4:
                    System.out.println("апрель");
                    break;
                case 5:
                    System.out.println("май");
                    break;
                case 6:
                    System.out.println("июнь");
                    break;
                case 7:
                    System.out.println("июль");
                    break;
                case 8:
                    System.out.println("август");
                    break;
                case 9:
                    System.out.println("сентябрь");
                    break;
                case 10:
                    System.out.println("октябрь");
                    break;
                case 11:
                    System.out.println("ноябрь");
                    break;
                case 12:
                    System.out.println("декабрь");
                    break;
            }
            break;
        case 3:
            System.out.print("введите номер карты от 6 до 14: ");
            switch (bob.nextInt()){
                case 6:
                    System.out.println("достоинство карты 6 - 6");
                    break;
                case 7:
                    System.out.println("достоинство карты 7 - 7");
                    break;
                case 8:
                    System.out.println("достоинство карты 8 - 8");
                    break;
                case 9:
                    System.out.println("достоинство карты 9 - 9");
                    break;
                case 10:
                    System.out.println("достоинство карты 10 - 10");
                    break;
                case 11:
                    System.out.println("достоинство карты валет - 11");
                    break;
                case 12:
                    System.out.println("достоинство карты дама - 12");
                    break;
                case 13:
                    System.out.println("достоинство карты король - 13");
                    break;
                case 14:
                    System.out.println("достоинство карты туз - 14");
                    break;
            }
            break;
        case 4:
            System.out.println("введите признак транспортного средства: ");
            switch (bob.nextLine()) {
                case "x":
                    System.out.println("автомобиль макс.скорость - 532км/ч (ssc tuatara)");
                    break;
                case "в":
                    System.out.println("велосипед макс.скорость - 100км/ч (Donhou 100 mph)");
                    break;
                case "м":
                    System.out.println("мотоцикл макс.скорость - 295км/ч (Kawasaki Ninja ZX-14R)");
                    break;
                case "с":
                    System.out.println("самолет макс.скорость - 8200км/ч (North American X-15)");
                    break;
                case "п":
                    System.out.println("поезд макс.скорость - 460км/ч (Shanghai Maglev)");
                    break;
            }
            break;
        case 5:
            System.out.print("введите номер дня недели: ");
            switch (bob.nextInt()){
                case 1:
                    System.out.println("понедельник");
                    break;
                case 2:
                    System.out.println("вторник");
                    break;
                case 3:
                    System.out.println("среда");
                    break;
                case 4:
                    System.out.println("четверг");
                    break;
                case 5:
                    System.out.println("пятница");
                    break;
                case 6:
                    System.out.println("суббота");
                    break;
                case 7:
                    System.out.println("воскресенье");
                    break;
            }
        case 6:
            System.out.print("введите номер пары: ");
            switch (bob.nextInt()){
                case 1:
                    System.out.println("8:30-10:00");
                    break;
                case 2:
                    System.out.println("10:10-11:40");
                    break;
                case 3:
                    System.out.println("12:10-13:40");
                    break;
                case 4:
                    System.out.println("13:50-15:20");
                    break;
                case 5:
                    System.out.println("15:30-17:00");
                    break;
                case 6:
                    System.out.println("17:10-18:40");
                    break;
                case 7:
                    System.out.println("18:50-20:20");
                    break;
                case 8:
                    System.out.println("20:30-22:00");
                    break;
            }
            break;
        case 7:
            System.out.print("введите номер цвета радуги: ");
            switch (bob.nextInt()){
                case 1:
                    System.out.println("красный");
                    break;
                case 2:
                    System.out.println("оранжевый");
                    break;
                case 3:
                    System.out.println("желтый");
                    break;
                case 4:
                    System.out.println("зеленый");
                    break;
                case 5:
                    System.out.println("голубой");
                    break;
                case 6:
                    System.out.println("синий");
                    break;
                case 7:
                    System.out.println("фиолетовый");
                    break;
            }
            break;
        case 8:
            System.out.print("введите время года: ");
            switch (bob.nextLine()){
                case "лето":
                    System.out.println("июнь,июль,август");
                    break;
                case "осень":
                    System.out.println("сентябрь,октябрь,ноябрь");
                    break;
                case "зима":
                    System.out.println("декабрь,январь,февраль");
                    break;
                case "весна":
                    System.out.println("март,апрель,май");
                    break;
            }
            break;
        case 9:
            System.out.print("введите номер ноты: ");
            switch (bob.nextInt()){
                case 1:
                    System.out.println("до");
                    break;
                case 2:
                    System.out.println("ре");
                    break;
                case 3:
                    System.out.println("ми");
                    break;
                case 4:
                    System.out.println("фа");
                    break;
                case 5:
                    System.out.println("соль");
                    break;
                case 6:
                    System.out.println("ля");
                    break;
                case 7:
                    System.out.println("до");
                    break;
            }
            break;
        case 10:
            System.out.print("введите признак животного: ");
            switch (bob.nextLine()) {
                case "г":
                    System.out.println("гепард макс.скорость - 130км/ч");
                    break;
                case "а":
                    System.out.println("антилопа макс.скорость - 80км/ч");
                    break;
                case "с":
                    System.out.println("страус макс.скорость - 70км/ч");
                    break;
                case "м":
                    System.out.println("медведь макс.скорость - 48км/ч");
                    break;
                case "з":
                    System.out.println("заяц макс.скорость - 72км/ч");
                    break;
            }
            break;
    }
    }
}
