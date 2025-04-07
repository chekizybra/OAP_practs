import java.util.Scanner;
public class bobobo { public static void main(String[] args)
{ Scanner in = new Scanner(System.in);
    int[] myArray =new int [10];
    for (int i=0; i< myArray.length;i++)
    { System.out.print("myArray["+i+"]=");
        myArray[i]=in.nextInt();
    } for (int i=0; i< myArray.length;i++)
    {
        System.out.print(myArray[i]);
    }
}
}
