import java.util.Scanner;

import static java.lang.Character.*;

public class String_pract {
    public static void main(String[] args) {
        Scanner zov = new Scanner(System.in);
        /*String s = "ЭТИ лучший институт";
        char x='п',y='л';*/
        String zvz = zov.nextLine();
        char promeshutok = ' ';
        /*    String zoz = zov.next();
            System.out.println("x="+counting(s,x));
            System.out.println("y="+counting(s,y));

        System.out.println(counting(s,x) > counting(s,y)?x:y);*/

        /*System.out.println("ВВедите свое предложение: ");

        int schet = 0;
        for (int j = 0; j < zvz.length(); j++) {
            schet = counting(zvz, zvz.charAt(j));//стартим берем schet как количество повторений первого символа
            for (int i = 0; i < zvz.length(); i++) {
                if (counting(zvz, zvz.charAt(j)) < counting(zvz, zvz.charAt(i))) {
                    schet++;
                    promeshutok = zvz.charAt(i);
                }
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("больше всего встречался символ: "+promeshutok + " повторился: "+ schet + " раз");*/
        //4
        /*for (int i = 0;i < zvz.length();i++){
            if (counting(zvz,zvz.charAt(i)) == 1) {
                System.out.print(zvz.charAt(i) + " ");
            }
        }


        //5
        boolean zhiest = false;
        for (int i = 0;i < zvz.length()-1;i++){
            if (zvz.charAt(i) == zvz.charAt(i + 1)) {
                zhiest = true;
                break;
            }
        }
        System.out.println((zhiest)?"есть":"нету");
        //6
        System.out.println((new StringBuilder(zvz).reverse().toString().equals(zvz))?"палиндром":"не палиндром");
        //7
        int countl = 0;
        for (int i = 0; i < zvz.length(); i++) {
            if (isLetter(zvz.charAt(i))){
                countl++;
            }
        }
        System.out.println(countl);
        //8
        int countd = 0;
        for (int i = 0; i < zvz.length(); i++) {
            if (isDigit(zvz.charAt(i))){
                countd++;
            }
        }
        System.out.println(countd);*/
        //9
        /*int countint = 0;
        for (int i = 0; i < zvz.length(); i++) {
            if (isDigit(zvz.charAt(i))){
                countint = countint + Integer.parseInt(String.valueOf(zvz.charAt(i)));
            }
        }
        System.out.println(countint);*/
        //10
        if (zvz.contains(":")) {
            for (int i = 0; i < zvz.indexOf(":"); i++) {
                System.out.print(zvz.charAt(i));
            }
        }
        System.out.println();
        //11
        if (zvz.contains(":")) {
            for (int i = zvz.indexOf(":")+1; i < zvz.length(); i++) {
                System.out.print(zvz.charAt(i));
            }
        }
        //12
        System.out.println(1);
        if (zvz.contains("(")&&zvz.contains(")")) {
            for (int i = zvz.indexOf("(")+1; i < zvz.indexOf(")"); i++) {
                System.out.print(zvz.charAt(i));
            }
        }

    }
    public static int counting(String str,char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}