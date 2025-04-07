import java.util.Arrays;

public class m1 {
    static int x = 2;
    static int y = 5;
    static int z = 7;
    static int v = 4;
    static int[] arr={1,2,3,4,5,6,7,8,9,10};
    public static void main(String args[]){
        //1
        System.out.println("1 zd:"+min((3*x),2*y)+min(x-y,x+y));
        System.out.println("2 zd:"+min(min(x,y),min(z,v)));
        System.out.println("3 zd:"+max(x,(2*y-x))+max((5*x)+(3*y),y));
        System.out.println("4 zd:"+Math.max(znpf(x),znpf(y)));
        System.out.println("5 zd:"+max(znpf5(x),znpf5(y)));
        System.out.println("6 zd:"+znpf6(x)+znpf6(y));
        System.out.println("7 zd:"+znpf7(x)+znpf7(y)+(-1*znpf7(z)));
        System.out.println("8 zd:"+(znpf8(x)/2)+(znpf8(y)/2)+(znpf8(z)/2));
        System.out.println("9 zd:"+znpf9(x,v)+znpf9(y,v)+znpf9(z,v));
        System.out.println("10 zd:"+ Arrays.toString(arr));
        System.out.println("хоб хоб хоб");
        for (int i = 0;i < arr.length; i++){
            System.out.print(znpf10(arr[i]) + " ");
        }
        System.out.println();
        System.out.println("11 zd:"+ Arrays.toString(arr));
        System.out.println("хоб хоб хоб");
        for (int i = 0;i < arr.length; i++){
            System.out.print(znpf11(arr[i]) + " ");
        }
        System.out.println();
        System.out.println("12 zd:"+ Arrays.toString(arr));
        System.out.println("хоб хоб хоб");
        for (int i = 0;i < arr.length; i++){
            System.out.print(znpf12(arr[i]) + " ");
        }

    }

    //1,2
    static int min(int a,int b){
        return Math.min(a,b);
    }
    //3
    static int max(int a,int b){
        return Math.max(a,b);
    }
    //4
    static int znpf(int a){
        return (int) ((a*3)-Math.sin(a));
    }
    //5
    static int znpf5(int a){
        return (int) (Math.cos(2*a)-Math.sin(a-3));
    }
    //6
    static int znpf6(int a){
        return a*10;
    }
    //7
    static int znpf7(int a){
        return a/10;
    }
    //8
    static int znpf8(int a){
        return (int) Math.sqrt(a)+a;
    }
    //9
    static int znpf9(int a,int v){
        return (int) Math.pow(v,a)/a;
    }
    //10
    static int znpf10(int a){
        if (a%2 != 0) return 0;
        else return a/2 ;
    }
    //11
    static int znpf11(int a){
        if (a%5 != 0) return a+1;
        else return a/5 ;
    }
    //12
    static int znpf12(int a){
        if(a >= 10 && a <= 99) return a % 10 * 10 + a / 10;
        return a;
    }

}
