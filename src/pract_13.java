/*

public class pract_13 {
    public static void main(String[] args) {
        int[] array = {7, 3, 4, 5, 1, 6};
        int zchislo = 4, x = 3, y = 5;
        int max = array[0];
        int max_index = 0, min_index = 0;


        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max_index = i;
            }
        }



        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                min_index = i;
            }
        }


for (int i = 0;i < array.length;i++){
            if (array[i]<zchislo){
                array[i]=zchislo;
            }
        }



for (int i = 0;i < array.length;i++) {
            if ((array[i] <= y) & (array[i] >= x)) {
                array[i] = 0;
            }
        }



for (int i = 0; i < array.length; i++) {
            if (array[i] < zchislo) {
                array[i] *= 2;
            }
        }



for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] = -1 * array[i];
            }
        }


for (int i = 0; i < array.length; i++) {

            if (array[i] == max) {
                array[i] = 0;
            }
        }



for (int i = 0; i < array.length; i++) {

            if (array[i] == min_otricat) {
                array[i] = 0;
            }
        }



        int xoba = array[0];


 array[0] = array[array.length - 1];
        array[array.length - 1] = xoba;



array[0] = max;
        max = xoba;



        int count = 0;

for (int i = 0; i < array.length; i++) {
            if (array[i]==max) {
                count++;
            }
        }



for (int i = 0; i < array.length; i++) {
            if (array[i]==max) {
                System.out.print(array[i]+" , ");
            }
        }



for (int i = array.length-1; i >=0; i--) {
            if (array[i]==max) {
                System.out.println(i);
            }
        }



for (int i = 0;i < array.length;i++) {
            if ((array[i] <= y) & (array[i] >= x)) {
                xoba += array[i];
            }
        }



if (max_index > min_index){
            System.out.println("максимальное позже минимального");
        }



int min_otricat = array[0];
        for (int i = 1; i < array.length; i++) {
            if ((array[i]<0)&&(array[i] < min_otricat)) {
                min_otricat = array[i];
            }
        }



        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] - array[i] == zchislo) {
                count++;
            }
        }
        System.out.println(count);
    }
}
*/
