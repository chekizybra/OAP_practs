import java.util.Objects;

public class lublu_kogda_class_stroki_kak_bi_chut_chut_sdvinut_v_storonu {


    public static void main(String[] args){
        StringBuilder zbuilder = new StringBuilder("гойда zzz ZVO ааааа ещкерее 1488 524255");
        char x = 'z';
        char y = 'v';
        String sx = "zv";
        String sy = "гой";

        //1 вставляет в строку символ x после каждого вхождения символа y

        for (int i = 0; i < zbuilder.length(); i++) {
            if (zbuilder.charAt(i) == x && zbuilder.charAt(i) != y){
                zbuilder.insert(i+1,y);
            }
        }
        System.out.println(zbuilder);

        //2 вставляет в строку подстроку x после каждого вхождения подстроки y

        /*for (int i = 0; i < zbuilder.length()-sx.length(); i++) {
            if (Objects.equals(zbuilder.substring(i ,i+sx.length()), sx) && !Objects.equals(zbuilder.substring(i), sy)){
                zbuilder.insert(i+1,sy);
            }
        }
        System.out.println(zbuilder);*/

        //3 удваивает каждое вхождение заданного символа x

        /*for (int i = 0; i < zbuilder.length(); i=i+2) {
            if(zbuilder.charAt(i) == x){
                zbuilder.insert(i, x);
            }
        }
        System.out.println(zbuilder);*/

        //4 удваивает каждое вхождение заданной подстроки x

        /*for (int i = 0; i < zbuilder.length()-sx.length(); i++) {
            if (Objects.equals(zbuilder.substring(i ,i+sx.length()), sx)){
                zbuilder.insert(i+sx.length(),sx);
                i = i+sx.length();
            }
        }
        System.out.println(zbuilder);*/

        //5 Удаляет среднюю букву, если длина строки нечетная, и две средних, если длина строки четная

        /*int len = zbuilder.length();
        if (len % 2 == 0) {
            zbuilder.delete(len / 2 - 1, len / 2 + 1);
        }
        else {
            zbuilder.deleteCharAt(len / 2);
        }*/

        //6 Удаляет все символы x

        /*for (int i = 0; i < zbuilder.length(); i++) {
            if (zbuilder.charAt(i) == x) {
                zbuilder.replace(i, i + 1, "");
                i--;
            }
        }
        System.out.println(zbuilder);
        */
        //7 Удаляет из строки все цифры
        /*for (int i = 0; i < zbuilder.length(); i++) {
            if (Character.isDigit(zbuilder.charAt(i))) {
                zbuilder.replace(i, i + 1, "");
                i--;
            }
        }
        System.out.println(zbuilder);
        */
        //8 Удаляет все подстроки substr
        /*

        for (int i = 0; i <= zbuilder.length() - zsub.length(); i++) {
            if (zbuilder.substring(i, i + zsub.length()).equals(zsub)) {
                zbuilder.replace(i, i + zsub.length(), "");
                i--;
            }
        }
        System.out.println(zbuilder);*/

        //9 Заменяет все вхождения подстроки str1 на подстроку str2
        /*String zsub = "ZVO";//ну типа str2
        for (int i = 0; i <= zbuilder.length() - zsub.length(); i++) {
            if (zbuilder.substring(i, i + zsub.length()).equals(zsub)) {
                zbuilder.replace(i, i + zsub.length(), "");
                i--;
            }
        }
        System.out.println(zbuilder);
        */
        //10 Меняет местами первую букву со второй, третью с четвертой и т.д.

        /*
        for (int i = 0; i < zbuilder.length() - 1; i += 2) {
            char temp = zbuilder.charAt(i);
            zbuilder.setCharAt(i, zbuilder.charAt(i + 1));
            zbuilder.setCharAt(i + 1, temp);
        }
        System.out.println(zbuilder);
        */

        //11 Меняет местами первую букву с последней, вторую с предпоследней и т.д.

        /*for (int i = 0; i <= zbuilder.length()/2; i++) {
            char temp = zbuilder.charAt(i);
            zbuilder.setCharAt(i, zbuilder.charAt((zbuilder.length()-1) - i));
            zbuilder.setCharAt((zbuilder.length()-1) - i, temp);
        }
        System.out.println(zbuilder);*/
    }
}
