public class m2 { static Boolean dd;
    public static void main(String args[]){
        int AA=19,a = 0,b=100,shet = 0,uuuxshet=0,ab = 4,bb = 3,c=2,d=8;
        int promezhutochek = 0;
        //1 задание
        /*for (int i = a;i<=b;i++){
            if (zd1(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        for (int i = a;i<=b;i++){
            if (zd1(i)){
                shet++;
            }
        }
        System.out.println( "количество:"+shet);

        for (int i = a;i<=b;i++){
            if (!zd1(i)){
                uuuxshet=uuuxshet+i;
            }
        }
        System.out.println( "сумма составных чисел:"+uuuxshet);

        for (int i = a;i<AA;i++){
            if (!zd1(i)){
                promezhutochek = i;
            }
        }
        System.out.println( "ближайшее составное к числу: "+AA+" это: "+promezhutochek);*/
        //конец первого
        //2 задание

        /*for (int i = a;i <= b;i++){
            System.out.println("для числа "+i +"количество делителей: "+zd2(i));
        }
        *//*for (int i = a;i <= b;i++){
            if (zd2(i) == AA){
                System.out.println(i);}
        }*//*

        System.out.println();

        for (int i = a;i <= b;i++){
            if (zd2(i) == zd2max(a,b)){
                System.out.println(i);}
        }*/
        /*for (int i = b;i >= a;i--){
            if (zd2(i) == zd2(AA) & i > AA){
            shet = i;
            }
        }
        System.out.println("ближайшее следующее число с таким же количеством делителей как и "+AA+"это:"+shet);*/
        //конец второго

        //начало третьего
        //1
        /* for (int i = a;i <= b;i++){
            System.out.print(zd3(i)+" ");
        }*/
        //2
        /*for (int i = a;i <= b;i++){
            if (zd3(i)==AA){
                System.out.print(zd3(i)+" ");
            }
        }*/
        //3
        /*shet = zd3max(a,b);
        for (int i = a;i <= b;i++){
            if (zd3(i)==shet){
                System.out.print(i+" ");
            }
        }*/
        //4
        /*for (int i = a;i < AA;i++){
            if (zd3(i)==zd3(AA)){
                promezhutochek = i;
            }System.out.print(promezhutochek);
        }*/
        //конец третьего
        //начало четвертого
        //1
        /*for (int i = a;i <= b;i++){
            System.out.print(zd4(i)+" ");
        }*/
        //2
        /*for (int i = a;i <= b;i++){
            if (zd4(i)==AA)System.out.print(i+" ");
        }*/
        //3
        /*for (int i = a;i <= b;i++){
            if (zd4(i)%2 != 0)System.out.print(i+" ");
        }*/
        //4
        /*for (int i = a;i < AA;i++){
            if (zd4(i) == zd4(AA)) promezhutochek = i;
        }
        System.out.print(promezhutochek);*/
        //конец четвертого
        //начало пятого
        //1
        /*System.out.println(ab+"/"+bb);
        System.out.println("сокращаем4");
        System.out.println(ab/zd5(ab,bb)+"/"+bb/zd5(ab,bb));*/
        //2
        System.out.println("нок "+zd5nok(ab,bb));
        //3
        System.out.print(ab+"+"+d+"/"+zd5nok(bb,c) + "=" + (ab+d)+"/"+zd5nok(bb,c));//вычислить 5 методом в после = перекинуть на второй sout
        //4

        //конец пятого

    }

    //к первому
    public static boolean zd1(int n) {
        if (n < 2) return false; // лесом идут 0 и 1
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Число сложное
            }
        }
        return true; //  число простое
    }
    //к второму
    public static int zd2(int a){
        int delchet = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                delchet++;
            }
        }
        return (delchet * 2)+3;//+3 это -1,0,1
    }
    public static int zd2max(int a, int b ){
        int shet = 0;
        for (int i = a;i<b;i++){
            if (zd2(i)>shet){
                shet = zd2(i);
            }
        }
        return shet;
    }
    //к третьему
    public static int zd3(int a){
        int sumdel = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                sumdel=sumdel+i;
            }
        }
        return sumdel+1;
    }
    //макс сумма джелителей
    public static int zd3max(int a, int b ){
        int shet = 0;
        for (int i = a;i<b;i++){
            if (zd3(i)>shet){
                shet = zd3(i);
            }
        }
        return shet;
    }
    //к четвертому
    static int zd4(int a){
        return (a % 10) + (a%100 / 10) + (a%1000 / 100) + (a / 1000);
    }
    //к пятому
    //нод
    static int zd5(int a, int b){
        while (b != 0) {
            int lol = b;
            b = a % b;
            a = lol;
        }
        return a;
    }
    //нок
    static int zd5nok(int a, int b){
        return a / zd5(a,b) * b;
    }

}
