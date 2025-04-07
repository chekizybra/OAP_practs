public class recurs {

    public static void main(String args[]) {
        VivodN(1, 50);
        System.out.println();
        System.out.println("-----------------------------------------");
        VivodNnaoborot(50, 1);
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println(recsriya(5, 3, 3));
        System.out.println("-----------------------------------------");
        System.out.println(recsriyanchlen(5, 3, 3));
        System.out.println("-----------------------------------------");
        System.out.println(geomprog(5, 3, 3));
        System.out.println("-----------------------------------------");
        System.out.println(geomprogsum(5, 3, 3));
        System.out.println("-----------------------------------------");
        piramidka(1, 9);
        System.out.println("-----------------------------------------");
        piramidka2(1, 10);
        //System.out.println("стишок");
        // lunatiki(10);
        System.out.println("-----------------------------------------");
        System.out.println(ciferkishet(1488,0));
        System.out.println("-----------------------------------------");
        System.out.println(nod(4,2));
    }


    // n член арифметической прогрессии
    public static int recsriya(int a1, int d, int n) {
        if (n == 1) {
            return a1;
        }
        return recsriya(a1, d, n - 1) + d;
    }

    //  сумма первых n членов арифметической прогрессии
    public static int recsriyanchlen(int a1, int d, int n) {
        if (n == 1) {
            return a1;
        }
        return recsriya(a1, d, n) + recsriyanchlen(a1, d, n - 1);
    }

    static int geomprog(int b1, int q, int n) {
        if (n == 1) return b1;
        else return geomprog(b1, q, n - 1) * q;

    }

    static int geomprogsum(int b1, int q, int n) {
        if (n == 1) return b1;
        return geomprog(b1, q, n) + geomprogsum(b1, q, n - 1);
    }


    static void VivodN(int sechas, int N) {
        if (sechas > N) {
            return;
        }
        System.out.print(sechas + " ");
        VivodN(sechas + 1, N);
    }

    static void VivodNnaoborot(int sechas, int N) {
        if (sechas < N) {
            return;
        }
        System.out.print(sechas + " ");
        VivodNnaoborot(sechas - 1, N);
    }


    static void lunatiki(int lun) {
        if (lun < 1) {
            System.out.println("И больше лунатиков не стало на луне");
            return;
        }
        System.out.println(lun + " лунатиков жили на луне");
        System.out.println(lun + " лунатиков ворочались во сне");
        System.out.println("Один из лунатиков упал с луны во сне");
        System.out.println(lun - 1 + " лунатиков осталось на луне");
        lunatiki(lun - 1);
    }


    static void piramidka2(int n, int g) {
        if (n <= g) {
            for (int i = n; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            piramidka2(n + 1, g);
        }
        return;
    }

    static void piramidka(int n, int g) {
        if (n <= g) {
            for (int i = n; i > 0; i--) {
                System.out.print(n + " ");
            }
            System.out.println();
            piramidka(n + 1, g);
        }
        return;
    }


    public static int ciferkishet(int n, int sheet) {
        if (n == 0) {
            return sheet;
        }
        return ciferkishet(n / 10, sheet + 1);
    }

    static int nod(int a, int b){
       if (b>0){
            int lol = b;
            b = a % b;
            a = lol;
            return nod(a,b);
       }
       return a;

    }

}