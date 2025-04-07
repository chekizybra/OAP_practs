public class pract_18_present {
    public static void main(String[] args) {
        int x = 45, y = 42, c=52;
        //далее вызовы методов в выводе
        System.out.println("z= " + nahodMax(x, (2 * y) - x) + nahodMax((5 * x) + (3 * y), y));
        System.out.println("4zd: " + zd4(x, y));
        System.out.println("zd5: " + zd5(x, y));
        System.out.println("zd6: " + zd6(x, y));
        System.out.println("zd7: " + zd7(x, y, c));
    }

    static int nahodMax(int x, int y) {//находит максимальный
        return Math.max(x, y);
    }

    static int zd4(int x, int y) {//задание
        if ((3 * x) - Math.sin(x) > ((3 * y) - Math.sin(y))) {
            return x;
        } else {
            return y;
        }
    }

    static int zd5(int x, int y) {//5 задание
        if (Math.cos(2 * x) - Math.sin(x - 3) < Math.cos(2 * x) - Math.sin(x - 3)) {
            return x;
        } else {
            return y;
        }
    }
    static  int zd6(int x,int y){//задание 6

        return x%10+y%10;
    }
    static  int zd7(int x,int y, int c){//задание 7
        return x/10+y/10-c/10;
    }
}

