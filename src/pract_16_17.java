public class pract_16_17 {
    public static  void  main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,0,0,0,0,0,0,0,0,0,0,0,0};
        /*int[] arr = new int[15];

        for (int i = 0; i<n;i++){
            arr[i]=(i*i);
        }*/
        int key = 0;
        int novielem = 52;
        int n = 8/* n = кол-во заполненных элементов массива*/,a=3,b=7;


        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = "+max);

        System.out.println("штандартен массивен");
        for (int i = 0;i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 1.	удалить из массива все четные числа;

        /*for(int j=0;j<n;j++){
            if (arr[j] % 2 == 0) {
                for (int i = j;i < n;i++) {
                    arr[i] = arr[i + 1];
                }
                n--;
            }
        }*/



        // 3.	удалить из массива максимальный элемент;
        /*for(int j=0;j<n;j++){
            if (arr[j] == max) {
                for (int i = j;i < n;i++) {
                    arr[i] = arr[i + 1];
                }
                n--;
            }
        }*/
        // 5.	удалить из массива все числа, значения которых попадают в данный интервал;
       /* for (int j = 0;j < n +1;j++){
            System.out.println("j"+j);
            if  (y >= arr[j] && x <= arr[j]){
                for (int i = j;i < n;i++) {
                    arr[i] = arr[i + 1];
                }
                n--;
                j--;
            }
        }*/
        // 2.	вставить новый элемент перед первым отрицательным элементом;

        /*for(int j=0;j<n;j++){
            if (arr[j] < 0) {
                key = j;
                break;
            }
        }
        for (int i = n+1;i >= key;i--) {
            arr[i+1] = arr[i];
        }
        n++;
        arr[key] = novielem;*/

        //4.	вставить новый элемент после последнего положительного;
        /* for(int j=n;j>0;j--){
            if (arr[j] > 0) {
                key = j;
                break;
            }
        }
        n++;
        arr[key+1] = novielem;*/
        // 6.	вставить новый элемент перед всеми четными элементами;
         for (int k = n;k >= 0;k--){
            if ((arr[k] % 2 == 0) && (arr[k] != 0)) {
                key = k;
                for (int i = n + 1; i >= key; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[key] = novielem; n++;
            }
        }



        //7.	удалить из массива все элементы, последняя цифра которых равна данной;
        /*for (int i = 0;i < arr.length ;i++){
            if  (arr[i] %10 == x) {
                *//*for (int j = i; j <= n; j++) {*//*
                    arr[i] = arr[i+1];
                    break;
               *//* }*//*
            }n--;
            arr[i] = arr[i+1];
        }*/
        //8.	вставить новый элемент после всех элементов, которые заканчиваются на данную цифру;
        /*for(int j=0;j<n;j++){
            if (arr[j] %10 == x) {
                for (int i = j+1;i < n;i++) {
                    arr[j+1] = arr[j];
                }
                n++;
                arr[j+1] = novielem;
                break;
            }
        }*/
        //9.	удалить из массива элементы с номера k1 по номер k2;
        /*for (int i = 0;i < arr.length ;i++){
            if  (arr[i] >= x && arr[i] <= y){
                for (int j = i;j < n;j++) {
                    arr[i] = arr[i+1];
                }
                n--;
            }
        }*/
        //10.	вставить новый элемент после всех элементов, кратных своему номеру;
        /*for(int j=1;j<n;j++){
            if (arr[j] % j == 0) {
                for (int i = j+1;i < n;i++) {
                    arr[j+1] = arr[j];
                }
                n++;
                arr[j+1] = novielem;

            }
        }*/
        System.out.println("массивен преображенен");
        for (int i = 0;i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
